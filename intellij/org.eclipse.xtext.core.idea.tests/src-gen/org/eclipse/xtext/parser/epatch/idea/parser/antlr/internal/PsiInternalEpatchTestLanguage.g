/*
 * generated by Xtext
 */
grammar PsiInternalEpatchTestLanguage;

options {
	superClass=AbstractPsiAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.epatch.idea.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.epatch.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.parser.epatch.idea.lang.EpatchTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.epatch.services.EpatchTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

	protected EpatchTestLanguageGrammarAccess grammarAccess;

	protected EpatchTestLanguageElementTypeProvider elementTypeProvider;

	public PsiInternalEpatchTestLanguageParser(PsiBuilder builder, TokenStream input, EpatchTestLanguageElementTypeProvider elementTypeProvider, EpatchTestLanguageGrammarAccess grammarAccess) {
		this(input);
		setPsiBuilder(builder);
    	this.grammarAccess = grammarAccess;
		this.elementTypeProvider = elementTypeProvider;
	}

	@Override
	protected String getFirstRuleName() {
		return "EPatch";
	}

}

//Entry rule entryRuleEPatch
entryRuleEPatch:
	{ markComposite(elementTypeProvider.getEPatchElementType()); }
	ruleEPatch
	EOF;

// Rule EPatch
ruleEPatch:
	(
		{
			markLeaf(elementTypeProvider.getEPatch_EpatchKeyword_0ElementType());
		}
		otherlv_0='epatch'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getEPatch_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEPatch_LeftCurlyBracketKeyword_2ElementType());
		}
		otherlv_2='{'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					markComposite(elementTypeProvider.getEPatch_ImportsImportParserRuleCall_3_0ElementType());
				}
				lv_imports_3_0=ruleImport
				{
					doneComposite();
				}
			)
		)*
		(
			(
				{
					markComposite(elementTypeProvider.getEPatch_ResourcesNamedResourceParserRuleCall_4_0ElementType());
				}
				lv_resources_4_0=ruleNamedResource
				{
					doneComposite();
				}
			)
		)*
		(
			(
				{
					markComposite(elementTypeProvider.getEPatch_ObjectsObjectRefParserRuleCall_5_0ElementType());
				}
				lv_objects_5_0=ruleObjectRef
				{
					doneComposite();
				}
			)
		)*
		{
			markLeaf(elementTypeProvider.getEPatch_RightCurlyBracketKeyword_6ElementType());
		}
		otherlv_6='}'
		{
			doneLeaf(otherlv_6);
		}
	)
;

//Entry rule entryRuleImport
entryRuleImport:
	{ markComposite(elementTypeProvider.getImportElementType()); }
	ruleImport
	EOF;

// Rule Import
ruleImport:
	(
		{
			markComposite(elementTypeProvider.getImport_ModelImportParserRuleCall_0ElementType());
		}
		ruleModelImport
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getImport_JavaImportParserRuleCall_1ElementType());
		}
		ruleJavaImport
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getImport_ExtensionImportParserRuleCall_2ElementType());
		}
		ruleExtensionImport
		{
			doneComposite();
		}
	)
;

//Entry rule entryRuleModelImport
entryRuleModelImport:
	{ markComposite(elementTypeProvider.getModelImportElementType()); }
	ruleModelImport
	EOF;

// Rule ModelImport
ruleModelImport:
	(
		{
			markComposite(elementTypeProvider.getModelImport_ResourceImportParserRuleCall_0ElementType());
		}
		ruleResourceImport
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getModelImport_EPackageImportParserRuleCall_1ElementType());
		}
		ruleEPackageImport
		{
			doneComposite();
		}
	)
;

//Entry rule entryRuleResourceImport
entryRuleResourceImport:
	{ markComposite(elementTypeProvider.getResourceImportElementType()); }
	ruleResourceImport
	EOF;

// Rule ResourceImport
ruleResourceImport:
	(
		{
			markLeaf(elementTypeProvider.getResourceImport_ImportKeyword_0ElementType());
		}
		otherlv_0='import'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getResourceImport_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getResourceImport_UriKeyword_2ElementType());
		}
		otherlv_2='uri'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getResourceImport_UriSTRINGTerminalRuleCall_3_0ElementType());
				}
				lv_uri_3_0=RULE_STRING
				{
					doneLeaf(lv_uri_3_0);
				}
			)
		)
	)
;

//Entry rule entryRuleEPackageImport
entryRuleEPackageImport:
	{ markComposite(elementTypeProvider.getEPackageImportElementType()); }
	ruleEPackageImport
	EOF;

// Rule EPackageImport
ruleEPackageImport:
	(
		{
			markLeaf(elementTypeProvider.getEPackageImport_ImportKeyword_0ElementType());
		}
		otherlv_0='import'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getEPackageImport_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEPackageImport_NsKeyword_2ElementType());
		}
		otherlv_2='ns'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getEPackageImport_NsURISTRINGTerminalRuleCall_3_0ElementType());
				}
				lv_nsURI_3_0=RULE_STRING
				{
					doneLeaf(lv_nsURI_3_0);
				}
			)
		)
	)
;

//Entry rule entryRuleJavaImport
entryRuleJavaImport:
	{ markComposite(elementTypeProvider.getJavaImportElementType()); }
	ruleJavaImport
	EOF;

// Rule JavaImport
ruleJavaImport:
	(
		{
			markLeaf(elementTypeProvider.getJavaImport_ImportKeyword_0ElementType());
		}
		otherlv_0='import'
		{
			doneLeaf(otherlv_0);
		}
		{
			markLeaf(elementTypeProvider.getJavaImport_JavaKeyword_1ElementType());
		}
		otherlv_1='java'
		{
			doneLeaf(otherlv_1);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getJavaImport_PathIDTerminalRuleCall_2_0ElementType());
				}
				lv_path_2_0=RULE_ID
				{
					doneLeaf(lv_path_2_0);
				}
			)
		)
		(
			{
				markLeaf(elementTypeProvider.getJavaImport_FullStopKeyword_3_0ElementType());
			}
			otherlv_3='.'
			{
				doneLeaf(otherlv_3);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getJavaImport_PathIDTerminalRuleCall_3_1_0ElementType());
					}
					lv_path_4_0=RULE_ID
					{
						doneLeaf(lv_path_4_0);
					}
				)
			)
		)*
	)
;

//Entry rule entryRuleExtensionImport
entryRuleExtensionImport:
	{ markComposite(elementTypeProvider.getExtensionImportElementType()); }
	ruleExtensionImport
	EOF;

// Rule ExtensionImport
ruleExtensionImport:
	(
		{
			markLeaf(elementTypeProvider.getExtensionImport_ImportKeyword_0ElementType());
		}
		otherlv_0='import'
		{
			doneLeaf(otherlv_0);
		}
		{
			markLeaf(elementTypeProvider.getExtensionImport_ExtensionKeyword_1ElementType());
		}
		otherlv_1='extension'
		{
			doneLeaf(otherlv_1);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getExtensionImport_PathIDTerminalRuleCall_2_0ElementType());
				}
				lv_path_2_0=RULE_ID
				{
					doneLeaf(lv_path_2_0);
				}
			)
		)
		(
			{
				markLeaf(elementTypeProvider.getExtensionImport_ColonColonKeyword_3_0ElementType());
			}
			otherlv_3='::'
			{
				doneLeaf(otherlv_3);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getExtensionImport_PathIDTerminalRuleCall_3_1_0ElementType());
					}
					lv_path_4_0=RULE_ID
					{
						doneLeaf(lv_path_4_0);
					}
				)
			)
		)*
	)
;

//Entry rule entryRuleNamedResource
entryRuleNamedResource:
	{ markComposite(elementTypeProvider.getNamedResourceElementType()); }
	ruleNamedResource
	EOF;

// Rule NamedResource
ruleNamedResource:
	(
		{
			markLeaf(elementTypeProvider.getNamedResource_ResourceKeyword_0ElementType());
		}
		otherlv_0='resource'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getNamedResource_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getNamedResource_LeftCurlyBracketKeyword_2ElementType());
		}
		otherlv_2='{'
		{
			doneLeaf(otherlv_2);
		}
		{
			markLeaf(elementTypeProvider.getNamedResource_LeftKeyword_3ElementType());
		}
		otherlv_3='left'
		{
			doneLeaf(otherlv_3);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getNamedResource_UriKeyword_4_0_0ElementType());
				}
				otherlv_4='uri'
				{
					doneLeaf(otherlv_4);
				}
				(
					(
						{
							markLeaf(elementTypeProvider.getNamedResource_LeftUriSTRINGTerminalRuleCall_4_0_1_0ElementType());
						}
						lv_leftUri_5_0=RULE_STRING
						{
							doneLeaf(lv_leftUri_5_0);
						}
					)
				)
			)
			    |
			(
				(
					{
						markComposite(elementTypeProvider.getNamedResource_LeftRootCreatedObjectParserRuleCall_4_1_0ElementType());
					}
					lv_leftRoot_6_0=ruleCreatedObject
					{
						doneComposite();
					}
				)
			)
		)
		{
			markLeaf(elementTypeProvider.getNamedResource_SemicolonKeyword_5ElementType());
		}
		otherlv_7=';'
		{
			doneLeaf(otherlv_7);
		}
		{
			markLeaf(elementTypeProvider.getNamedResource_RightKeyword_6ElementType());
		}
		otherlv_8='right'
		{
			doneLeaf(otherlv_8);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getNamedResource_UriKeyword_7_0_0ElementType());
				}
				otherlv_9='uri'
				{
					doneLeaf(otherlv_9);
				}
				(
					(
						{
							markLeaf(elementTypeProvider.getNamedResource_RightUriSTRINGTerminalRuleCall_7_0_1_0ElementType());
						}
						lv_rightUri_10_0=RULE_STRING
						{
							doneLeaf(lv_rightUri_10_0);
						}
					)
				)
			)
			    |
			(
				(
					{
						markComposite(elementTypeProvider.getNamedResource_RightRootCreatedObjectParserRuleCall_7_1_0ElementType());
					}
					lv_rightRoot_11_0=ruleCreatedObject
					{
						doneComposite();
					}
				)
			)
		)
		{
			markLeaf(elementTypeProvider.getNamedResource_SemicolonKeyword_8ElementType());
		}
		otherlv_12=';'
		{
			doneLeaf(otherlv_12);
		}
		{
			markLeaf(elementTypeProvider.getNamedResource_RightCurlyBracketKeyword_9ElementType());
		}
		otherlv_13='}'
		{
			doneLeaf(otherlv_13);
		}
	)
;

//Entry rule entryRuleObjectRef
entryRuleObjectRef:
	{ markComposite(elementTypeProvider.getObjectRefElementType()); }
	ruleObjectRef
	EOF;

// Rule ObjectRef
ruleObjectRef:
	(
		{
			markLeaf(elementTypeProvider.getObjectRef_ObjectKeyword_0ElementType());
		}
		otherlv_0='object'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getObjectRef_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)?
		(
			(
				(
					(
						{
							markLeaf(elementTypeProvider.getObjectRef_LeftResNamedResourceCrossReference_2_0_0_0ElementType());
						}
						otherlv_2=RULE_ID
						{
							doneLeaf(otherlv_2);
						}
					)
				)
				(
					(
						{
							markLeaf(elementTypeProvider.getObjectRef_LeftFragFRAGMENTTerminalRuleCall_2_0_1_0ElementType());
						}
						lv_leftFrag_3_0=RULE_FRAGMENT
						{
							doneLeaf(lv_leftFrag_3_0);
						}
					)
				)
			)
			    |
			(
				{
					markLeaf(elementTypeProvider.getObjectRef_LeftKeyword_2_1_0ElementType());
				}
				otherlv_4='left'
				{
					doneLeaf(otherlv_4);
				}
				(
					(
						{
							markLeaf(elementTypeProvider.getObjectRef_LeftResNamedResourceCrossReference_2_1_1_0ElementType());
						}
						otherlv_5=RULE_ID
						{
							doneLeaf(otherlv_5);
						}
					)
				)
				(
					(
						{
							markLeaf(elementTypeProvider.getObjectRef_LeftFragFRAGMENTTerminalRuleCall_2_1_2_0ElementType());
						}
						lv_leftFrag_6_0=RULE_FRAGMENT
						{
							doneLeaf(lv_leftFrag_6_0);
						}
					)
				)
				{
					markLeaf(elementTypeProvider.getObjectRef_RightKeyword_2_1_3ElementType());
				}
				otherlv_7='right'
				{
					doneLeaf(otherlv_7);
				}
				(
					(
						{
							markLeaf(elementTypeProvider.getObjectRef_RightResNamedResourceCrossReference_2_1_4_0ElementType());
						}
						otherlv_8=RULE_ID
						{
							doneLeaf(otherlv_8);
						}
					)
				)
				(
					(
						{
							markLeaf(elementTypeProvider.getObjectRef_RightFragFRAGMENTTerminalRuleCall_2_1_5_0ElementType());
						}
						lv_rightFrag_9_0=RULE_FRAGMENT
						{
							doneLeaf(lv_rightFrag_9_0);
						}
					)
				)
			)
		)
		(
			{
				markLeaf(elementTypeProvider.getObjectRef_LeftCurlyBracketKeyword_3_0ElementType());
			}
			otherlv_10='{'
			{
				doneLeaf(otherlv_10);
			}
			(
				(
					(
						{
							markComposite(elementTypeProvider.getObjectRef_AssignmentsBiSingleAssignmentParserRuleCall_3_1_0_0ElementType());
						}
						lv_assignments_11_0=ruleBiSingleAssignment
						{
							doneComposite();
						}
					)
				)
				    |
				(
					(
						{
							markComposite(elementTypeProvider.getObjectRef_AssignmentsBiListAssignmentParserRuleCall_3_1_1_0ElementType());
						}
						lv_assignments_12_0=ruleBiListAssignment
						{
							doneComposite();
						}
					)
				)
			)+
			(
				{
					markLeaf(elementTypeProvider.getObjectRef_LeftKeyword_3_2_0ElementType());
				}
				otherlv_13='left'
				{
					doneLeaf(otherlv_13);
				}
				(
					(
						{
							markComposite(elementTypeProvider.getObjectRef_LeftMigMigrationParserRuleCall_3_2_1_0ElementType());
						}
						lv_leftMig_14_0=ruleMigration
						{
							doneComposite();
						}
					)
				)
			)?
			(
				{
					markLeaf(elementTypeProvider.getObjectRef_RightKeyword_3_3_0ElementType());
				}
				otherlv_15='right'
				{
					doneLeaf(otherlv_15);
				}
				(
					(
						{
							markComposite(elementTypeProvider.getObjectRef_RightMigMigrationParserRuleCall_3_3_1_0ElementType());
						}
						lv_rightMig_16_0=ruleMigration
						{
							doneComposite();
						}
					)
				)
			)?
			{
				markLeaf(elementTypeProvider.getObjectRef_RightCurlyBracketKeyword_3_4ElementType());
			}
			otherlv_17='}'
			{
				doneLeaf(otherlv_17);
			}
		)?
	)
;

//Entry rule entryRuleBiSingleAssignment
entryRuleBiSingleAssignment:
	{ markComposite(elementTypeProvider.getBiSingleAssignmentElementType()); }
	ruleBiSingleAssignment
	EOF;

// Rule BiSingleAssignment
ruleBiSingleAssignment:
	(
		(
			(
				{
					markLeaf(elementTypeProvider.getBiSingleAssignment_FeatureIDTerminalRuleCall_0_0ElementType());
				}
				lv_feature_0_0=RULE_ID
				{
					doneLeaf(lv_feature_0_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getBiSingleAssignment_EqualsSignKeyword_1ElementType());
		}
		otherlv_1='='
		{
			doneLeaf(otherlv_1);
		}
		(
			(
				{
					markComposite(elementTypeProvider.getBiSingleAssignment_LeftValueSingleAssignmentValueParserRuleCall_2_0ElementType());
				}
				lv_leftValue_2_0=ruleSingleAssignmentValue
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getBiSingleAssignment_VerticalLineKeyword_3ElementType());
		}
		otherlv_3='|'
		{
			doneLeaf(otherlv_3);
		}
		(
			(
				{
					markComposite(elementTypeProvider.getBiSingleAssignment_RightValueSingleAssignmentValueParserRuleCall_4_0ElementType());
				}
				lv_rightValue_4_0=ruleSingleAssignmentValue
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getBiSingleAssignment_SemicolonKeyword_5ElementType());
		}
		otherlv_5=';'
		{
			doneLeaf(otherlv_5);
		}
	)
;

//Entry rule entryRuleBiListAssignment
entryRuleBiListAssignment:
	{ markComposite(elementTypeProvider.getBiListAssignmentElementType()); }
	ruleBiListAssignment
	EOF;

// Rule BiListAssignment
ruleBiListAssignment:
	(
		(
			(
				{
					markLeaf(elementTypeProvider.getBiListAssignment_FeatureIDTerminalRuleCall_0_0ElementType());
				}
				lv_feature_0_0=RULE_ID
				{
					doneLeaf(lv_feature_0_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getBiListAssignment_EqualsSignKeyword_1ElementType());
		}
		otherlv_1='='
		{
			doneLeaf(otherlv_1);
		}
		{
			markLeaf(elementTypeProvider.getBiListAssignment_LeftSquareBracketKeyword_2ElementType());
		}
		otherlv_2='['
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				(
					{
						markComposite(elementTypeProvider.getBiListAssignment_LeftValuesListAssignmentValueParserRuleCall_3_0_0ElementType());
					}
					lv_leftValues_3_0=ruleListAssignmentValue
					{
						doneComposite();
					}
				)
			)
			(
				{
					markLeaf(elementTypeProvider.getBiListAssignment_CommaKeyword_3_1_0ElementType());
				}
				otherlv_4=','
				{
					doneLeaf(otherlv_4);
				}
				(
					(
						{
							markComposite(elementTypeProvider.getBiListAssignment_LeftValuesListAssignmentValueParserRuleCall_3_1_1_0ElementType());
						}
						lv_leftValues_5_0=ruleListAssignmentValue
						{
							doneComposite();
						}
					)
				)
			)*
		)?
		{
			markLeaf(elementTypeProvider.getBiListAssignment_VerticalLineKeyword_4ElementType());
		}
		otherlv_6='|'
		{
			doneLeaf(otherlv_6);
		}
		(
			(
				(
					{
						markComposite(elementTypeProvider.getBiListAssignment_RightValuesListAssignmentValueParserRuleCall_5_0_0ElementType());
					}
					lv_rightValues_7_0=ruleListAssignmentValue
					{
						doneComposite();
					}
				)
			)
			(
				{
					markLeaf(elementTypeProvider.getBiListAssignment_CommaKeyword_5_1_0ElementType());
				}
				otherlv_8=','
				{
					doneLeaf(otherlv_8);
				}
				(
					(
						{
							markComposite(elementTypeProvider.getBiListAssignment_RightValuesListAssignmentValueParserRuleCall_5_1_1_0ElementType());
						}
						lv_rightValues_9_0=ruleListAssignmentValue
						{
							doneComposite();
						}
					)
				)
			)*
		)?
		{
			markLeaf(elementTypeProvider.getBiListAssignment_RightSquareBracketKeyword_6ElementType());
		}
		otherlv_10=']'
		{
			doneLeaf(otherlv_10);
		}
		{
			markLeaf(elementTypeProvider.getBiListAssignment_SemicolonKeyword_7ElementType());
		}
		otherlv_11=';'
		{
			doneLeaf(otherlv_11);
		}
	)
;

//Entry rule entryRuleMonoSingleAssignment
entryRuleMonoSingleAssignment:
	{ markComposite(elementTypeProvider.getMonoSingleAssignmentElementType()); }
	ruleMonoSingleAssignment
	EOF;

// Rule MonoSingleAssignment
ruleMonoSingleAssignment:
	(
		(
			(
				{
					markLeaf(elementTypeProvider.getMonoSingleAssignment_FeatureIDTerminalRuleCall_0_0ElementType());
				}
				lv_feature_0_0=RULE_ID
				{
					doneLeaf(lv_feature_0_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getMonoSingleAssignment_EqualsSignKeyword_1ElementType());
		}
		otherlv_1='='
		{
			doneLeaf(otherlv_1);
		}
		(
			(
				{
					markComposite(elementTypeProvider.getMonoSingleAssignment_LeftValueSingleAssignmentValueParserRuleCall_2_0ElementType());
				}
				lv_leftValue_2_0=ruleSingleAssignmentValue
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getMonoSingleAssignment_SemicolonKeyword_3ElementType());
		}
		otherlv_3=';'
		{
			doneLeaf(otherlv_3);
		}
	)
;

//Entry rule entryRuleMonoListAssignment
entryRuleMonoListAssignment:
	{ markComposite(elementTypeProvider.getMonoListAssignmentElementType()); }
	ruleMonoListAssignment
	EOF;

// Rule MonoListAssignment
ruleMonoListAssignment:
	(
		(
			(
				{
					markLeaf(elementTypeProvider.getMonoListAssignment_FeatureIDTerminalRuleCall_0_0ElementType());
				}
				lv_feature_0_0=RULE_ID
				{
					doneLeaf(lv_feature_0_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getMonoListAssignment_EqualsSignKeyword_1ElementType());
		}
		otherlv_1='='
		{
			doneLeaf(otherlv_1);
		}
		{
			markLeaf(elementTypeProvider.getMonoListAssignment_LeftSquareBracketKeyword_2ElementType());
		}
		otherlv_2='['
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				(
					{
						markComposite(elementTypeProvider.getMonoListAssignment_LeftValuesAssignmentValueParserRuleCall_3_0_0ElementType());
					}
					lv_leftValues_3_0=ruleAssignmentValue
					{
						doneComposite();
					}
				)
			)
			(
				{
					markLeaf(elementTypeProvider.getMonoListAssignment_CommaKeyword_3_1_0ElementType());
				}
				otherlv_4=','
				{
					doneLeaf(otherlv_4);
				}
				(
					(
						{
							markComposite(elementTypeProvider.getMonoListAssignment_LeftValuesAssignmentValueParserRuleCall_3_1_1_0ElementType());
						}
						lv_leftValues_5_0=ruleAssignmentValue
						{
							doneComposite();
						}
					)
				)
			)*
		)?
		{
			markLeaf(elementTypeProvider.getMonoListAssignment_RightSquareBracketKeyword_4ElementType());
		}
		otherlv_6=']'
		{
			doneLeaf(otherlv_6);
		}
		{
			markLeaf(elementTypeProvider.getMonoListAssignment_SemicolonKeyword_5ElementType());
		}
		otherlv_7=';'
		{
			doneLeaf(otherlv_7);
		}
	)
;

//Entry rule entryRuleAssignmentValue
entryRuleAssignmentValue:
	{ markComposite(elementTypeProvider.getAssignmentValueElementType()); }
	ruleAssignmentValue
	EOF;

// Rule AssignmentValue
ruleAssignmentValue:
	(
		(
			(
				{
					markLeaf(elementTypeProvider.getAssignmentValue_ValueSTRINGTerminalRuleCall_0_0ElementType());
				}
				lv_value_0_0=RULE_STRING
				{
					doneLeaf(lv_value_0_0);
				}
			)
		)
		    |
		(
			(
				(
					{
						markLeaf(elementTypeProvider.getAssignmentValue_RefObjectNamedObjectCrossReference_1_0_0ElementType());
					}
					otherlv_1=RULE_ID
					{
						doneLeaf(otherlv_1);
					}
				)
			)
			(
				{
					markLeaf(elementTypeProvider.getAssignmentValue_FullStopKeyword_1_1_0ElementType());
				}
				otherlv_2='.'
				{
					doneLeaf(otherlv_2);
				}
				(
					(
						{
							markLeaf(elementTypeProvider.getAssignmentValue_RefFeatureIDTerminalRuleCall_1_1_1_0ElementType());
						}
						lv_refFeature_3_0=RULE_ID
						{
							doneLeaf(lv_refFeature_3_0);
						}
					)
				)
				(
					{
						markLeaf(elementTypeProvider.getAssignmentValue_LeftSquareBracketKeyword_1_1_2_0ElementType());
					}
					otherlv_4='['
					{
						doneLeaf(otherlv_4);
					}
					(
						(
							{
								markLeaf(elementTypeProvider.getAssignmentValue_RefIndexINTTerminalRuleCall_1_1_2_1_0ElementType());
							}
							lv_refIndex_5_0=RULE_INT
							{
								doneLeaf(lv_refIndex_5_0);
							}
						)
					)
					{
						markLeaf(elementTypeProvider.getAssignmentValue_RightSquareBracketKeyword_1_1_2_2ElementType());
					}
					otherlv_6=']'
					{
						doneLeaf(otherlv_6);
					}
				)?
			)?
		)
		    |
		(
			(
				{
					markComposite(elementTypeProvider.getAssignmentValue_NewObjectCreatedObjectParserRuleCall_2_0ElementType());
				}
				lv_newObject_7_0=ruleCreatedObject
				{
					doneComposite();
				}
			)
		)
		    |
		(
			(
				(
					{
						markLeaf(elementTypeProvider.getAssignmentValue_ImportImportCrossReference_3_0_0ElementType());
					}
					otherlv_8=RULE_ID
					{
						doneLeaf(otherlv_8);
					}
				)
			)
			(
				(
					{
						markLeaf(elementTypeProvider.getAssignmentValue_ImpFragFRAGMENTTerminalRuleCall_3_1_0ElementType());
					}
					lv_impFrag_9_0=RULE_FRAGMENT
					{
						doneLeaf(lv_impFrag_9_0);
					}
				)
			)
		)
	)
;

//Entry rule entryRuleListAssignmentValue
entryRuleListAssignmentValue:
	{ markComposite(elementTypeProvider.getListAssignmentValueElementType()); }
	ruleListAssignmentValue
	EOF;

// Rule ListAssignmentValue
ruleListAssignmentValue:
	(
		(
			(
				{
					markLeaf(elementTypeProvider.getListAssignmentValue_IndexINTTerminalRuleCall_0_0ElementType());
				}
				lv_index_0_0=RULE_INT
				{
					doneLeaf(lv_index_0_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getListAssignmentValue_ColonKeyword_1ElementType());
		}
		otherlv_1=':'
		{
			doneLeaf(otherlv_1);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getListAssignmentValue_LeftSquareBracketKeyword_2_0_0ElementType());
				}
				otherlv_2='['
				{
					doneLeaf(otherlv_2);
				}
				(
					(
						{
							markLeaf(elementTypeProvider.getListAssignmentValue_RefIndexINTTerminalRuleCall_2_0_1_0ElementType());
						}
						lv_refIndex_3_0=RULE_INT
						{
							doneLeaf(lv_refIndex_3_0);
						}
					)
				)
				{
					markLeaf(elementTypeProvider.getListAssignmentValue_RightSquareBracketKeyword_2_0_2ElementType());
				}
				otherlv_4=']'
				{
					doneLeaf(otherlv_4);
				}
			)
			    |
			(
				(
					{
						markLeaf(elementTypeProvider.getListAssignmentValue_ValueSTRINGTerminalRuleCall_2_1_0ElementType());
					}
					lv_value_5_0=RULE_STRING
					{
						doneLeaf(lv_value_5_0);
					}
				)
			)
			    |
			(
				(
					(
						{
							markLeaf(elementTypeProvider.getListAssignmentValue_RefObjectNamedObjectCrossReference_2_2_0_0ElementType());
						}
						otherlv_6=RULE_ID
						{
							doneLeaf(otherlv_6);
						}
					)
				)
				(
					{
						markLeaf(elementTypeProvider.getListAssignmentValue_FullStopKeyword_2_2_1_0ElementType());
					}
					otherlv_7='.'
					{
						doneLeaf(otherlv_7);
					}
					(
						(
							{
								markLeaf(elementTypeProvider.getListAssignmentValue_RefFeatureIDTerminalRuleCall_2_2_1_1_0ElementType());
							}
							lv_refFeature_8_0=RULE_ID
							{
								doneLeaf(lv_refFeature_8_0);
							}
						)
					)
					(
						{
							markLeaf(elementTypeProvider.getListAssignmentValue_LeftSquareBracketKeyword_2_2_1_2_0ElementType());
						}
						otherlv_9='['
						{
							doneLeaf(otherlv_9);
						}
						(
							(
								{
									markLeaf(elementTypeProvider.getListAssignmentValue_RefIndexINTTerminalRuleCall_2_2_1_2_1_0ElementType());
								}
								lv_refIndex_10_0=RULE_INT
								{
									doneLeaf(lv_refIndex_10_0);
								}
							)
						)
						{
							markLeaf(elementTypeProvider.getListAssignmentValue_RightSquareBracketKeyword_2_2_1_2_2ElementType());
						}
						otherlv_11=']'
						{
							doneLeaf(otherlv_11);
						}
					)?
				)?
			)
			    |
			(
				(
					{
						markComposite(elementTypeProvider.getListAssignmentValue_NewObjectCreatedObjectParserRuleCall_2_3_0ElementType());
					}
					lv_newObject_12_0=ruleCreatedObject
					{
						doneComposite();
					}
				)
			)
			    |
			(
				(
					(
						{
							markLeaf(elementTypeProvider.getListAssignmentValue_ImportImportCrossReference_2_4_0_0ElementType());
						}
						otherlv_13=RULE_ID
						{
							doneLeaf(otherlv_13);
						}
					)
				)
				(
					(
						{
							markLeaf(elementTypeProvider.getListAssignmentValue_ImpFragFRAGMENTTerminalRuleCall_2_4_1_0ElementType());
						}
						lv_impFrag_14_0=RULE_FRAGMENT
						{
							doneLeaf(lv_impFrag_14_0);
						}
					)
				)
			)
		)
	)
;

//Entry rule entryRuleSingleAssignmentValue
entryRuleSingleAssignmentValue:
	{ markComposite(elementTypeProvider.getSingleAssignmentValueElementType()); }
	ruleSingleAssignmentValue
	EOF;

// Rule SingleAssignmentValue
ruleSingleAssignmentValue:
	(
		(
			(
				{
					markLeaf(elementTypeProvider.getSingleAssignmentValue_KeywordNullKeyword_0_0ElementType());
				}
				lv_keyword_0_0='null'
				{
					doneLeaf(lv_keyword_0_0);
				}
			)
		)
		    |
		(
			(
				{
					markLeaf(elementTypeProvider.getSingleAssignmentValue_ValueSTRINGTerminalRuleCall_1_0ElementType());
				}
				lv_value_1_0=RULE_STRING
				{
					doneLeaf(lv_value_1_0);
				}
			)
		)
		    |
		(
			(
				(
					{
						markLeaf(elementTypeProvider.getSingleAssignmentValue_RefObjectNamedObjectCrossReference_2_0_0ElementType());
					}
					otherlv_2=RULE_ID
					{
						doneLeaf(otherlv_2);
					}
				)
			)
			(
				{
					markLeaf(elementTypeProvider.getSingleAssignmentValue_FullStopKeyword_2_1_0ElementType());
				}
				otherlv_3='.'
				{
					doneLeaf(otherlv_3);
				}
				(
					(
						{
							markLeaf(elementTypeProvider.getSingleAssignmentValue_RefFeatureIDTerminalRuleCall_2_1_1_0ElementType());
						}
						lv_refFeature_4_0=RULE_ID
						{
							doneLeaf(lv_refFeature_4_0);
						}
					)
				)
				(
					{
						markLeaf(elementTypeProvider.getSingleAssignmentValue_LeftSquareBracketKeyword_2_1_2_0ElementType());
					}
					otherlv_5='['
					{
						doneLeaf(otherlv_5);
					}
					(
						(
							{
								markLeaf(elementTypeProvider.getSingleAssignmentValue_RefIndexINTTerminalRuleCall_2_1_2_1_0ElementType());
							}
							lv_refIndex_6_0=RULE_INT
							{
								doneLeaf(lv_refIndex_6_0);
							}
						)
					)
					{
						markLeaf(elementTypeProvider.getSingleAssignmentValue_RightSquareBracketKeyword_2_1_2_2ElementType());
					}
					otherlv_7=']'
					{
						doneLeaf(otherlv_7);
					}
				)?
			)?
		)
		    |
		(
			(
				{
					markComposite(elementTypeProvider.getSingleAssignmentValue_NewObjectCreatedObjectParserRuleCall_3_0ElementType());
				}
				lv_newObject_8_0=ruleCreatedObject
				{
					doneComposite();
				}
			)
		)
		    |
		(
			(
				(
					{
						markLeaf(elementTypeProvider.getSingleAssignmentValue_ImportImportCrossReference_4_0_0ElementType());
					}
					otherlv_9=RULE_ID
					{
						doneLeaf(otherlv_9);
					}
				)
			)
			(
				(
					{
						markLeaf(elementTypeProvider.getSingleAssignmentValue_ImpFragFRAGMENTTerminalRuleCall_4_1_0ElementType());
					}
					lv_impFrag_10_0=RULE_FRAGMENT
					{
						doneLeaf(lv_impFrag_10_0);
					}
				)
			)
		)
	)
;

//Entry rule entryRuleCreatedObject
entryRuleCreatedObject:
	{ markComposite(elementTypeProvider.getCreatedObjectElementType()); }
	ruleCreatedObject
	EOF;

// Rule CreatedObject
ruleCreatedObject:
	(
		(
			{
				markComposite(elementTypeProvider.getCreatedObject_ObjectNewParserRuleCall_0_0ElementType());
			}
			ruleObjectNew
			{
				doneComposite();
			}
			    |
			{
				markComposite(elementTypeProvider.getCreatedObject_ObjectCopyParserRuleCall_0_1ElementType());
			}
			ruleObjectCopy
			{
				doneComposite();
			}
		)
		(
			(
				{
					markLeaf(elementTypeProvider.getCreatedObject_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_2_0=RULE_ID
				{
					doneLeaf(lv_name_2_0);
				}
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getCreatedObject_LeftCurlyBracketKeyword_2_0ElementType());
			}
			otherlv_3='{'
			{
				doneLeaf(otherlv_3);
			}
			(
				(
					(
						{
							markComposite(elementTypeProvider.getCreatedObject_AssignmentsMonoSingleAssignmentParserRuleCall_2_1_0_0ElementType());
						}
						lv_assignments_4_0=ruleMonoSingleAssignment
						{
							doneComposite();
						}
					)
				)
				    |
				(
					(
						{
							markComposite(elementTypeProvider.getCreatedObject_AssignmentsMonoListAssignmentParserRuleCall_2_1_1_0ElementType());
						}
						lv_assignments_5_0=ruleMonoListAssignment
						{
							doneComposite();
						}
					)
				)
			)+
			(
				(
					{
						markComposite(elementTypeProvider.getCreatedObject_LeftMigMigrationParserRuleCall_2_2_0ElementType());
					}
					lv_leftMig_6_0=ruleMigration
					{
						doneComposite();
					}
				)
			)?
			{
				markLeaf(elementTypeProvider.getCreatedObject_RightCurlyBracketKeyword_2_3ElementType());
			}
			otherlv_7='}'
			{
				doneLeaf(otherlv_7);
			}
		)?
	)
;

//Entry rule entryRuleObjectNew
entryRuleObjectNew:
	{ markComposite(elementTypeProvider.getObjectNewElementType()); }
	ruleObjectNew
	EOF;

// Rule ObjectNew
ruleObjectNew:
	(
		{
			markLeaf(elementTypeProvider.getObjectNew_NewKeyword_0ElementType());
		}
		otherlv_0='new'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getObjectNew_ImportImportCrossReference_1_0ElementType());
				}
				otherlv_1=RULE_ID
				{
					doneLeaf(otherlv_1);
				}
			)
		)
		(
			(
				{
					markLeaf(elementTypeProvider.getObjectNew_ImpFragFRAGMENTTerminalRuleCall_2_0ElementType());
				}
				lv_impFrag_2_0=RULE_FRAGMENT
				{
					doneLeaf(lv_impFrag_2_0);
				}
			)
		)
	)
;

//Entry rule entryRuleObjectCopy
entryRuleObjectCopy:
	{ markComposite(elementTypeProvider.getObjectCopyElementType()); }
	ruleObjectCopy
	EOF;

// Rule ObjectCopy
ruleObjectCopy:
	(
		{
			markLeaf(elementTypeProvider.getObjectCopy_CopyKeyword_0ElementType());
		}
		otherlv_0='copy'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getObjectCopy_ResourceNamedResourceCrossReference_1_0ElementType());
				}
				otherlv_1=RULE_ID
				{
					doneLeaf(otherlv_1);
				}
			)
		)
		(
			(
				{
					markLeaf(elementTypeProvider.getObjectCopy_FragmentFRAGMENTTerminalRuleCall_2_0ElementType());
				}
				lv_fragment_2_0=RULE_FRAGMENT
				{
					doneLeaf(lv_fragment_2_0);
				}
			)
		)
	)
;

//Entry rule entryRuleMigration
entryRuleMigration:
	{ markComposite(elementTypeProvider.getMigrationElementType()); }
	ruleMigration
	EOF;

// Rule Migration
ruleMigration:
	(
		(
			{
				precedeComposite(elementTypeProvider.getMigration_MigrationAction_0ElementType());
				doneComposite();
			}
		)
		{
			markLeaf(elementTypeProvider.getMigration_MigrateKeyword_1ElementType());
		}
		otherlv_1='migrate'
		{
			doneLeaf(otherlv_1);
		}
		(
			(
				{
					markComposite(elementTypeProvider.getMigration_FirstExecutableParserRuleCall_2_0ElementType());
				}
				lv_first_2_0=ruleExecutable
				{
					doneComposite();
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getMigration_AsKeyword_3_0_0ElementType());
				}
				otherlv_3='as'
				{
					doneLeaf(otherlv_3);
				}
				(
					(
						{
							markComposite(elementTypeProvider.getMigration_AsOpExecutableParserRuleCall_3_0_1_0ElementType());
						}
						lv_asOp_4_0=ruleExecutable
						{
							doneComposite();
						}
					)
				)
			)
			    |
			(
				{
					markLeaf(elementTypeProvider.getMigration_EachKeyword_3_1_0ElementType());
				}
				otherlv_5='each'
				{
					doneLeaf(otherlv_5);
				}
				(
					(
						{
							markComposite(elementTypeProvider.getMigration_EachOpExecutableParserRuleCall_3_1_1_0ElementType());
						}
						lv_eachOp_6_0=ruleExecutable
						{
							doneComposite();
						}
					)
				)
			)
		)?
		{
			markLeaf(elementTypeProvider.getMigration_SemicolonKeyword_4ElementType());
		}
		otherlv_7=';'
		{
			doneLeaf(otherlv_7);
		}
	)
;

//Entry rule entryRuleExecutable
entryRuleExecutable:
	{ markComposite(elementTypeProvider.getExecutableElementType()); }
	ruleExecutable
	EOF;

// Rule Executable
ruleExecutable:
	(
		{
			markComposite(elementTypeProvider.getExecutable_JavaExecutableParserRuleCall_0ElementType());
		}
		ruleJavaExecutable
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getExecutable_ExpressionExecutableParserRuleCall_1ElementType());
		}
		ruleExpressionExecutable
		{
			doneComposite();
		}
	)
;

//Entry rule entryRuleJavaExecutable
entryRuleJavaExecutable:
	{ markComposite(elementTypeProvider.getJavaExecutableElementType()); }
	ruleJavaExecutable
	EOF;

// Rule JavaExecutable
ruleJavaExecutable:
	(
		{
			markLeaf(elementTypeProvider.getJavaExecutable_JavaKeyword_0ElementType());
		}
		otherlv_0='java'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getJavaExecutable_MethodIDTerminalRuleCall_1_0ElementType());
				}
				lv_method_1_0=RULE_ID
				{
					doneLeaf(lv_method_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getJavaExecutable_LeftParenthesisKeyword_2ElementType());
		}
		otherlv_2='('
		{
			doneLeaf(otherlv_2);
		}
		{
			markLeaf(elementTypeProvider.getJavaExecutable_RightParenthesisKeyword_3ElementType());
		}
		otherlv_3=')'
		{
			doneLeaf(otherlv_3);
		}
	)
;

//Entry rule entryRuleExpressionExecutable
entryRuleExpressionExecutable:
	{ markComposite(elementTypeProvider.getExpressionExecutableElementType()); }
	ruleExpressionExecutable
	EOF;

// Rule ExpressionExecutable
ruleExpressionExecutable:
	(
		(
			{
				markLeaf(elementTypeProvider.getExpressionExecutable_ExprstrSTRINGTerminalRuleCall_0ElementType());
			}
			lv_exprstr_0_0=RULE_STRING
			{
				doneLeaf(lv_exprstr_0_0);
			}
		)
	)
;

RULE_FRAGMENT : '#' ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'/'|'['|']'|'{'|'}'|'.'|'@')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;