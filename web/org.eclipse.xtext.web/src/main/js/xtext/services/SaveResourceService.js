/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

define(['xtext/services/AbstractXtextService', 'jquery'], function(AbstractXtextService, jQuery) {
	
	/**
	 * Service class for saving resources.
	 */
	function SaveResourceService(serverUrl, resourceId) {
		this.initialize(serverUrl, resourceId, 'save');
	};

	SaveResourceService.prototype = new AbstractXtextService();

	SaveResourceService.prototype.saveResource = function(editorContext, params, deferred) {
		if (deferred === undefined) {
			deferred = jQuery.Deferred();
		}
		var serverData = {
			contentType: params.contentType
		};
		if (params.sendFullText) {
			serverData.fullText = editorContext.getText();
		} else {
			if (editorContext.getClientServiceState().update == 'started') {
				var self = this;
				this._updateService.addCompletionCallback(function() {
					self.saveResource(editorContext, params, deferred);
				});
				return deferred.promise();
			}
			var knownServerState = editorContext.getServerState();
			if (knownServerState.stateId !== undefined) {
				serverData.requiredStateId = knownServerState.stateId;
			}
		}
		
		var self = this;
		self.sendRequest(editorContext, {
			type: 'POST',
			data: serverData,
			
			success: function(result) {
				if (result.conflict) {
					if (self.increaseRecursionCount(editorContext)) {
						if (!params.sendFullText && result.conflict == 'invalidStateId') {
							self._updateService.addCompletionCallback(function() {
								self.saveResource(editorContext, params, deferred);
							});
							var newParams = {};
							for (var p in params) {
								if (params.hasOwnProperty(p))
									newParams[p] = params[p];
							}
							newParams.sendFullText = true;
							delete editorContext.getServerState().stateId;
							self._updateService.update(editorContext, newParams);
						} else {
							self.saveResource(editorContext, params, deferred);
						}
					}
					deferred.reject();
					return false;
				}
				editorContext.markClean(true);
				deferred.resolve();
			},
			
			error: function(xhr, textStatus, errorThrown) {
				deferred.reject(errorThrown);
			}
		});
		return deferred.promise();
	};
	
	return SaveResourceService;
});