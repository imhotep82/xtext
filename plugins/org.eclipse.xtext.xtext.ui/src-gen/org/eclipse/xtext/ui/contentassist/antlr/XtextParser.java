/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.xtext.services.XtextGrammarAccess;

public class XtextParser extends AbstractContentAssistParser {
	
	@Inject
	private XtextGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.xtext.ui.contentassist.antlr.internal.InternalXtextParser createParser() {
		org.eclipse.xtext.ui.contentassist.antlr.internal.InternalXtextParser result = new org.eclipse.xtext.ui.contentassist.antlr.internal.InternalXtextParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractRuleAccess().getAlternatives(), "rule__AbstractRule__Alternatives");
					put(grammarAccess.getAbstractMetamodelDeclarationAccess().getAlternatives(), "rule__AbstractMetamodelDeclaration__Alternatives");
					put(grammarAccess.getAbstractTokenAccess().getAlternatives(), "rule__AbstractToken__Alternatives");
					put(grammarAccess.getAbstractTokenWithCardinalityAccess().getAlternatives_0(), "rule__AbstractTokenWithCardinality__Alternatives_0");
					put(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAlternatives_1_0(), "rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0");
					put(grammarAccess.getActionAccess().getOperatorAlternatives_2_2_0(), "rule__Action__OperatorAlternatives_2_2_0");
					put(grammarAccess.getAbstractTerminalAccess().getAlternatives(), "rule__AbstractTerminal__Alternatives");
					put(grammarAccess.getPredicatedKeywordAccess().getAlternatives_0(), "rule__PredicatedKeyword__Alternatives_0");
					put(grammarAccess.getPredicatedRuleCallAccess().getAlternatives_0(), "rule__PredicatedRuleCall__Alternatives_0");
					put(grammarAccess.getAssignmentAccess().getAlternatives_0(), "rule__Assignment__Alternatives_0");
					put(grammarAccess.getAssignmentAccess().getOperatorAlternatives_2_0(), "rule__Assignment__OperatorAlternatives_2_0");
					put(grammarAccess.getAssignableTerminalAccess().getAlternatives(), "rule__AssignableTerminal__Alternatives");
					put(grammarAccess.getCrossReferenceableTerminalAccess().getAlternatives(), "rule__CrossReferenceableTerminal__Alternatives");
					put(grammarAccess.getPredicatedGroupAccess().getAlternatives_0(), "rule__PredicatedGroup__Alternatives_0");
					put(grammarAccess.getTerminalRuleAccess().getAlternatives_1(), "rule__TerminalRule__Alternatives_1");
					put(grammarAccess.getTerminalTokenAccess().getCardinalityAlternatives_1_0(), "rule__TerminalToken__CardinalityAlternatives_1_0");
					put(grammarAccess.getTerminalTokenElementAccess().getAlternatives(), "rule__TerminalTokenElement__Alternatives");
					put(grammarAccess.getAbstractNegatedTokenAccess().getAlternatives(), "rule__AbstractNegatedToken__Alternatives");
					put(grammarAccess.getGrammarAccess().getGroup(), "rule__Grammar__Group__0");
					put(grammarAccess.getGrammarAccess().getGroup_2(), "rule__Grammar__Group_2__0");
					put(grammarAccess.getGrammarAccess().getGroup_2_2(), "rule__Grammar__Group_2_2__0");
					put(grammarAccess.getGrammarAccess().getGroup_3(), "rule__Grammar__Group_3__0");
					put(grammarAccess.getGrammarAccess().getGroup_3_2(), "rule__Grammar__Group_3_2__0");
					put(grammarAccess.getGrammarAccess().getGroup_3_2_1(), "rule__Grammar__Group_3_2_1__0");
					put(grammarAccess.getGrammarIDAccess().getGroup(), "rule__GrammarID__Group__0");
					put(grammarAccess.getGrammarIDAccess().getGroup_1(), "rule__GrammarID__Group_1__0");
					put(grammarAccess.getGeneratedMetamodelAccess().getGroup(), "rule__GeneratedMetamodel__Group__0");
					put(grammarAccess.getGeneratedMetamodelAccess().getGroup_3(), "rule__GeneratedMetamodel__Group_3__0");
					put(grammarAccess.getReferencedMetamodelAccess().getGroup(), "rule__ReferencedMetamodel__Group__0");
					put(grammarAccess.getReferencedMetamodelAccess().getGroup_2(), "rule__ReferencedMetamodel__Group_2__0");
					put(grammarAccess.getParserRuleAccess().getGroup(), "rule__ParserRule__Group__0");
					put(grammarAccess.getParserRuleAccess().getGroup_1(), "rule__ParserRule__Group_1__0");
					put(grammarAccess.getParserRuleAccess().getGroup_2(), "rule__ParserRule__Group_2__0");
					put(grammarAccess.getParserRuleAccess().getGroup_2_2(), "rule__ParserRule__Group_2_2__0");
					put(grammarAccess.getParserRuleAccess().getGroup_2_2_1(), "rule__ParserRule__Group_2_2_1__0");
					put(grammarAccess.getTypeRefAccess().getGroup(), "rule__TypeRef__Group__0");
					put(grammarAccess.getTypeRefAccess().getGroup_0(), "rule__TypeRef__Group_0__0");
					put(grammarAccess.getAlternativesAccess().getGroup(), "rule__Alternatives__Group__0");
					put(grammarAccess.getAlternativesAccess().getGroup_1(), "rule__Alternatives__Group_1__0");
					put(grammarAccess.getAlternativesAccess().getGroup_1_1(), "rule__Alternatives__Group_1_1__0");
					put(grammarAccess.getUnorderedGroupAccess().getGroup(), "rule__UnorderedGroup__Group__0");
					put(grammarAccess.getUnorderedGroupAccess().getGroup_1(), "rule__UnorderedGroup__Group_1__0");
					put(grammarAccess.getUnorderedGroupAccess().getGroup_1_1(), "rule__UnorderedGroup__Group_1_1__0");
					put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
					put(grammarAccess.getGroupAccess().getGroup_1(), "rule__Group__Group_1__0");
					put(grammarAccess.getAbstractTokenWithCardinalityAccess().getGroup(), "rule__AbstractTokenWithCardinality__Group__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getActionAccess().getGroup_2(), "rule__Action__Group_2__0");
					put(grammarAccess.getPredicatedKeywordAccess().getGroup(), "rule__PredicatedKeyword__Group__0");
					put(grammarAccess.getPredicatedRuleCallAccess().getGroup(), "rule__PredicatedRuleCall__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getParenthesizedAssignableElementAccess().getGroup(), "rule__ParenthesizedAssignableElement__Group__0");
					put(grammarAccess.getAssignableAlternativesAccess().getGroup(), "rule__AssignableAlternatives__Group__0");
					put(grammarAccess.getAssignableAlternativesAccess().getGroup_1(), "rule__AssignableAlternatives__Group_1__0");
					put(grammarAccess.getAssignableAlternativesAccess().getGroup_1_1(), "rule__AssignableAlternatives__Group_1_1__0");
					put(grammarAccess.getCrossReferenceAccess().getGroup(), "rule__CrossReference__Group__0");
					put(grammarAccess.getCrossReferenceAccess().getGroup_2(), "rule__CrossReference__Group_2__0");
					put(grammarAccess.getParenthesizedElementAccess().getGroup(), "rule__ParenthesizedElement__Group__0");
					put(grammarAccess.getPredicatedGroupAccess().getGroup(), "rule__PredicatedGroup__Group__0");
					put(grammarAccess.getTerminalRuleAccess().getGroup(), "rule__TerminalRule__Group__0");
					put(grammarAccess.getTerminalRuleAccess().getGroup_1_0(), "rule__TerminalRule__Group_1_0__0");
					put(grammarAccess.getTerminalRuleAccess().getGroup_1_1(), "rule__TerminalRule__Group_1_1__0");
					put(grammarAccess.getTerminalRuleAccess().getGroup_1_1_1(), "rule__TerminalRule__Group_1_1_1__0");
					put(grammarAccess.getTerminalAlternativesAccess().getGroup(), "rule__TerminalAlternatives__Group__0");
					put(grammarAccess.getTerminalAlternativesAccess().getGroup_1(), "rule__TerminalAlternatives__Group_1__0");
					put(grammarAccess.getTerminalAlternativesAccess().getGroup_1_1(), "rule__TerminalAlternatives__Group_1_1__0");
					put(grammarAccess.getTerminalGroupAccess().getGroup(), "rule__TerminalGroup__Group__0");
					put(grammarAccess.getTerminalGroupAccess().getGroup_1(), "rule__TerminalGroup__Group_1__0");
					put(grammarAccess.getTerminalTokenAccess().getGroup(), "rule__TerminalToken__Group__0");
					put(grammarAccess.getParenthesizedTerminalElementAccess().getGroup(), "rule__ParenthesizedTerminalElement__Group__0");
					put(grammarAccess.getNegatedTokenAccess().getGroup(), "rule__NegatedToken__Group__0");
					put(grammarAccess.getUntilTokenAccess().getGroup(), "rule__UntilToken__Group__0");
					put(grammarAccess.getWildcardAccess().getGroup(), "rule__Wildcard__Group__0");
					put(grammarAccess.getEOFAccess().getGroup(), "rule__EOF__Group__0");
					put(grammarAccess.getCharacterRangeAccess().getGroup(), "rule__CharacterRange__Group__0");
					put(grammarAccess.getCharacterRangeAccess().getGroup_1(), "rule__CharacterRange__Group_1__0");
					put(grammarAccess.getEnumRuleAccess().getGroup(), "rule__EnumRule__Group__0");
					put(grammarAccess.getEnumRuleAccess().getGroup_2(), "rule__EnumRule__Group_2__0");
					put(grammarAccess.getEnumLiteralsAccess().getGroup(), "rule__EnumLiterals__Group__0");
					put(grammarAccess.getEnumLiteralsAccess().getGroup_1(), "rule__EnumLiterals__Group_1__0");
					put(grammarAccess.getEnumLiteralsAccess().getGroup_1_1(), "rule__EnumLiterals__Group_1_1__0");
					put(grammarAccess.getEnumLiteralDeclarationAccess().getGroup(), "rule__EnumLiteralDeclaration__Group__0");
					put(grammarAccess.getEnumLiteralDeclarationAccess().getGroup_1(), "rule__EnumLiteralDeclaration__Group_1__0");
					put(grammarAccess.getGrammarAccess().getNameAssignment_1(), "rule__Grammar__NameAssignment_1");
					put(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_1(), "rule__Grammar__UsedGrammarsAssignment_2_1");
					put(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_2_1(), "rule__Grammar__UsedGrammarsAssignment_2_2_1");
					put(grammarAccess.getGrammarAccess().getDefinesHiddenTokensAssignment_3_0(), "rule__Grammar__DefinesHiddenTokensAssignment_3_0");
					put(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_0(), "rule__Grammar__HiddenTokensAssignment_3_2_0");
					put(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_1_1(), "rule__Grammar__HiddenTokensAssignment_3_2_1_1");
					put(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAssignment_4(), "rule__Grammar__MetamodelDeclarationsAssignment_4");
					put(grammarAccess.getGrammarAccess().getRulesAssignment_5(), "rule__Grammar__RulesAssignment_5");
					put(grammarAccess.getGeneratedMetamodelAccess().getNameAssignment_1(), "rule__GeneratedMetamodel__NameAssignment_1");
					put(grammarAccess.getGeneratedMetamodelAccess().getEPackageAssignment_2(), "rule__GeneratedMetamodel__EPackageAssignment_2");
					put(grammarAccess.getGeneratedMetamodelAccess().getAliasAssignment_3_1(), "rule__GeneratedMetamodel__AliasAssignment_3_1");
					put(grammarAccess.getReferencedMetamodelAccess().getEPackageAssignment_1(), "rule__ReferencedMetamodel__EPackageAssignment_1");
					put(grammarAccess.getReferencedMetamodelAccess().getAliasAssignment_2_1(), "rule__ReferencedMetamodel__AliasAssignment_2_1");
					put(grammarAccess.getParserRuleAccess().getNameAssignment_0(), "rule__ParserRule__NameAssignment_0");
					put(grammarAccess.getParserRuleAccess().getTypeAssignment_1_1(), "rule__ParserRule__TypeAssignment_1_1");
					put(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensAssignment_2_0(), "rule__ParserRule__DefinesHiddenTokensAssignment_2_0");
					put(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_0(), "rule__ParserRule__HiddenTokensAssignment_2_2_0");
					put(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_1_1(), "rule__ParserRule__HiddenTokensAssignment_2_2_1_1");
					put(grammarAccess.getParserRuleAccess().getAlternativesAssignment_4(), "rule__ParserRule__AlternativesAssignment_4");
					put(grammarAccess.getTypeRefAccess().getMetamodelAssignment_0_0(), "rule__TypeRef__MetamodelAssignment_0_0");
					put(grammarAccess.getTypeRefAccess().getClassifierAssignment_1(), "rule__TypeRef__ClassifierAssignment_1");
					put(grammarAccess.getAlternativesAccess().getElementsAssignment_1_1_1(), "rule__Alternatives__ElementsAssignment_1_1_1");
					put(grammarAccess.getUnorderedGroupAccess().getElementsAssignment_1_1_1(), "rule__UnorderedGroup__ElementsAssignment_1_1_1");
					put(grammarAccess.getGroupAccess().getElementsAssignment_1_1(), "rule__Group__ElementsAssignment_1_1");
					put(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAssignment_1(), "rule__AbstractTokenWithCardinality__CardinalityAssignment_1");
					put(grammarAccess.getActionAccess().getTypeAssignment_1(), "rule__Action__TypeAssignment_1");
					put(grammarAccess.getActionAccess().getFeatureAssignment_2_1(), "rule__Action__FeatureAssignment_2_1");
					put(grammarAccess.getActionAccess().getOperatorAssignment_2_2(), "rule__Action__OperatorAssignment_2_2");
					put(grammarAccess.getKeywordAccess().getValueAssignment(), "rule__Keyword__ValueAssignment");
					put(grammarAccess.getRuleCallAccess().getRuleAssignment(), "rule__RuleCall__RuleAssignment");
					put(grammarAccess.getPredicatedKeywordAccess().getPredicatedAssignment_0_0(), "rule__PredicatedKeyword__PredicatedAssignment_0_0");
					put(grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedAssignment_0_1(), "rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1");
					put(grammarAccess.getPredicatedKeywordAccess().getValueAssignment_1(), "rule__PredicatedKeyword__ValueAssignment_1");
					put(grammarAccess.getPredicatedRuleCallAccess().getPredicatedAssignment_0_0(), "rule__PredicatedRuleCall__PredicatedAssignment_0_0");
					put(grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedAssignment_0_1(), "rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1");
					put(grammarAccess.getPredicatedRuleCallAccess().getRuleAssignment_1(), "rule__PredicatedRuleCall__RuleAssignment_1");
					put(grammarAccess.getAssignmentAccess().getPredicatedAssignment_0_0(), "rule__Assignment__PredicatedAssignment_0_0");
					put(grammarAccess.getAssignmentAccess().getFirstSetPredicatedAssignment_0_1(), "rule__Assignment__FirstSetPredicatedAssignment_0_1");
					put(grammarAccess.getAssignmentAccess().getFeatureAssignment_1(), "rule__Assignment__FeatureAssignment_1");
					put(grammarAccess.getAssignmentAccess().getOperatorAssignment_2(), "rule__Assignment__OperatorAssignment_2");
					put(grammarAccess.getAssignmentAccess().getTerminalAssignment_3(), "rule__Assignment__TerminalAssignment_3");
					put(grammarAccess.getAssignableAlternativesAccess().getElementsAssignment_1_1_1(), "rule__AssignableAlternatives__ElementsAssignment_1_1_1");
					put(grammarAccess.getCrossReferenceAccess().getTypeAssignment_1(), "rule__CrossReference__TypeAssignment_1");
					put(grammarAccess.getCrossReferenceAccess().getTerminalAssignment_2_1(), "rule__CrossReference__TerminalAssignment_2_1");
					put(grammarAccess.getPredicatedGroupAccess().getPredicatedAssignment_0_0(), "rule__PredicatedGroup__PredicatedAssignment_0_0");
					put(grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedAssignment_0_1(), "rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1");
					put(grammarAccess.getPredicatedGroupAccess().getElementsAssignment_2(), "rule__PredicatedGroup__ElementsAssignment_2");
					put(grammarAccess.getTerminalRuleAccess().getFragmentAssignment_1_0_0(), "rule__TerminalRule__FragmentAssignment_1_0_0");
					put(grammarAccess.getTerminalRuleAccess().getNameAssignment_1_0_1(), "rule__TerminalRule__NameAssignment_1_0_1");
					put(grammarAccess.getTerminalRuleAccess().getNameAssignment_1_1_0(), "rule__TerminalRule__NameAssignment_1_1_0");
					put(grammarAccess.getTerminalRuleAccess().getTypeAssignment_1_1_1_1(), "rule__TerminalRule__TypeAssignment_1_1_1_1");
					put(grammarAccess.getTerminalRuleAccess().getAlternativesAssignment_3(), "rule__TerminalRule__AlternativesAssignment_3");
					put(grammarAccess.getTerminalAlternativesAccess().getElementsAssignment_1_1_1(), "rule__TerminalAlternatives__ElementsAssignment_1_1_1");
					put(grammarAccess.getTerminalGroupAccess().getElementsAssignment_1_1(), "rule__TerminalGroup__ElementsAssignment_1_1");
					put(grammarAccess.getTerminalTokenAccess().getCardinalityAssignment_1(), "rule__TerminalToken__CardinalityAssignment_1");
					put(grammarAccess.getNegatedTokenAccess().getTerminalAssignment_1(), "rule__NegatedToken__TerminalAssignment_1");
					put(grammarAccess.getUntilTokenAccess().getTerminalAssignment_1(), "rule__UntilToken__TerminalAssignment_1");
					put(grammarAccess.getCharacterRangeAccess().getRightAssignment_1_2(), "rule__CharacterRange__RightAssignment_1_2");
					put(grammarAccess.getEnumRuleAccess().getNameAssignment_1(), "rule__EnumRule__NameAssignment_1");
					put(grammarAccess.getEnumRuleAccess().getTypeAssignment_2_1(), "rule__EnumRule__TypeAssignment_2_1");
					put(grammarAccess.getEnumRuleAccess().getAlternativesAssignment_4(), "rule__EnumRule__AlternativesAssignment_4");
					put(grammarAccess.getEnumLiteralsAccess().getElementsAssignment_1_1_1(), "rule__EnumLiterals__ElementsAssignment_1_1_1");
					put(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralAssignment_0(), "rule__EnumLiteralDeclaration__EnumLiteralAssignment_0");
					put(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralAssignment_1_1(), "rule__EnumLiteralDeclaration__LiteralAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.xtext.ui.contentassist.antlr.internal.InternalXtextParser typedParser = (org.eclipse.xtext.ui.contentassist.antlr.internal.InternalXtextParser) parser;
			typedParser.entryRuleGrammar();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public XtextGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XtextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}