/*
* generated by Xtext
*/
grammar InternalRebotinol;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package edu.upb.lp.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package edu.upb.lp.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.upb.lp.services.RebotinolGrammarAccess;

}

@parser::members {

 	private RebotinolGrammarAccess grammarAccess;
 	
    public InternalRebotinolParser(TokenStream input, RebotinolGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "RebotinolProgram";	
   	}
   	
   	@Override
   	protected RebotinolGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleRebotinolProgram
entryRuleRebotinolProgram returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRebotinolProgramRule()); }
	 iv_ruleRebotinolProgram=ruleRebotinolProgram 
	 { $current=$iv_ruleRebotinolProgram.current; } 
	 EOF 
;

// Rule RebotinolProgram
ruleRebotinolProgram returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getRebotinolProgramAccess().getInstructionsInstructionParserRuleCall_0()); 
	    }
		lv_instructions_0_0=ruleInstruction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRebotinolProgramRule());
	        }
       		add(
       			$current, 
       			"instructions",
        		lv_instructions_0_0, 
        		"Instruction");
	        afterParserOrEnumRuleCall();
	    }

)
)+
;





// Entry rule entryRuleInstruction
entryRuleInstruction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInstructionRule()); }
	 iv_ruleInstruction=ruleInstruction 
	 { $current=$iv_ruleInstruction.current; } 
	 EOF 
;

// Rule Instruction
ruleInstruction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getInstructionAccess().getEmptyInstructionParserRuleCall_0()); 
    }
    this_EmptyInstruction_0=ruleEmptyInstruction
    { 
        $current = $this_EmptyInstruction_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getInstructionAccess().getNonEmptyInstructionParserRuleCall_1()); 
    }
    this_NonEmptyInstruction_1=ruleNonEmptyInstruction
    { 
        $current = $this_NonEmptyInstruction_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEmptyInstruction
entryRuleEmptyInstruction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEmptyInstructionRule()); }
	 iv_ruleEmptyInstruction=ruleEmptyInstruction 
	 { $current=$iv_ruleEmptyInstruction.current; } 
	 EOF 
;

// Rule EmptyInstruction
ruleEmptyInstruction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getEmptyInstructionAccess().getTypeEmptyInstructionTypeEnumRuleCall_0()); 
	    }
		lv_type_0_0=ruleEmptyInstructionType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEmptyInstructionRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"EmptyInstructionType");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleNonEmptyInstruction
entryRuleNonEmptyInstruction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNonEmptyInstructionRule()); }
	 iv_ruleNonEmptyInstruction=ruleNonEmptyInstruction 
	 { $current=$iv_ruleNonEmptyInstruction.current; } 
	 EOF 
;

// Rule NonEmptyInstruction
ruleNonEmptyInstruction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getNonEmptyInstructionAccess().getSumakParserRuleCall_0()); 
    }
    this_Sumak_0=ruleSumak
    { 
        $current = $this_Sumak_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getNonEmptyInstructionAccess().getMultkParserRuleCall_1()); 
    }
    this_Multk_1=ruleMultk
    { 
        $current = $this_Multk_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getNonEmptyInstructionAccess().getComplexInstructionParserRuleCall_2()); 
    }
    this_ComplexInstruction_2=ruleComplexInstruction
    { 
        $current = $this_ComplexInstruction_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleComplexInstruction
entryRuleComplexInstruction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getComplexInstructionRule()); }
	 iv_ruleComplexInstruction=ruleComplexInstruction 
	 { $current=$iv_ruleComplexInstruction.current; } 
	 EOF 
;

// Rule ComplexInstruction
ruleComplexInstruction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getComplexInstructionAccess().getIgualParserRuleCall_0()); 
    }
    this_Igual_0=ruleIgual
    { 
        $current = $this_Igual_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getComplexInstructionAccess().getIgualkParserRuleCall_1()); 
    }
    this_Igualk_1=ruleIgualk
    { 
        $current = $this_Igualk_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getComplexInstructionAccess().getDiferParserRuleCall_2()); 
    }
    this_Difer_2=ruleDifer
    { 
        $current = $this_Difer_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getComplexInstructionAccess().getDiferkParserRuleCall_3()); 
    }
    this_Diferk_3=ruleDiferk
    { 
        $current = $this_Diferk_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getComplexInstructionAccess().getMayorParserRuleCall_4()); 
    }
    this_Mayor_4=ruleMayor
    { 
        $current = $this_Mayor_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getComplexInstructionAccess().getMayorkParserRuleCall_5()); 
    }
    this_Mayork_5=ruleMayork
    { 
        $current = $this_Mayork_5.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getComplexInstructionAccess().getMenorParserRuleCall_6()); 
    }
    this_Menor_6=ruleMenor
    { 
        $current = $this_Menor_6.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getComplexInstructionAccess().getMenorkParserRuleCall_7()); 
    }
    this_Menork_7=ruleMenork
    { 
        $current = $this_Menork_7.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getComplexInstructionAccess().getRepetirnParserRuleCall_8()); 
    }
    this_Repetirn_8=ruleRepetirn
    { 
        $current = $this_Repetirn_8.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleNumber
entryRuleNumber returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNumberRule()); }
	 iv_ruleNumber=ruleNumber 
	 { $current=$iv_ruleNumber.current; } 
	 EOF 
;

// Rule Number
ruleNumber returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getNumberAccess().getPositiveNumberParserRuleCall_0()); 
    }
    this_PositiveNumber_0=rulePositiveNumber
    { 
        $current = $this_PositiveNumber_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getNumberAccess().getNegativeNumberParserRuleCall_1()); 
    }
    this_NegativeNumber_1=ruleNegativeNumber
    { 
        $current = $this_NegativeNumber_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRulePositiveNumber
entryRulePositiveNumber returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPositiveNumberRule()); }
	 iv_rulePositiveNumber=rulePositiveNumber 
	 { $current=$iv_rulePositiveNumber.current; } 
	 EOF 
;

// Rule PositiveNumber
rulePositiveNumber returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPositiveNumberAccess().getIntegerParserRuleCall_0()); 
    }
    this_Integer_0=ruleInteger
    { 
        $current = $this_Integer_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getPositiveNumberAccess().getFractionNumeratorAction_1_0(),
            $current);
    }
)	otherlv_2='/' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPositiveNumberAccess().getSolidusKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPositiveNumberAccess().getDenominatorIntegerParserRuleCall_1_2_0()); 
	    }
		lv_denominator_3_0=ruleInteger		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPositiveNumberRule());
	        }
       		set(
       			$current, 
       			"denominator",
        		lv_denominator_3_0, 
        		"Integer");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleInteger
entryRuleInteger returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntegerRule()); }
	 iv_ruleInteger=ruleInteger 
	 { $current=$iv_ruleInteger.current; } 
	 EOF 
;

// Rule Integer
ruleInteger returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_INT
		{
			newLeafNode(lv_value_0_0, grammarAccess.getIntegerAccess().getValueINTTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntegerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"INT");
	    }

)
)
;





// Entry rule entryRuleNegativeNumber
entryRuleNegativeNumber returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNegativeNumberRule()); }
	 iv_ruleNegativeNumber=ruleNegativeNumber 
	 { $current=$iv_ruleNegativeNumber.current; } 
	 EOF 
;

// Rule NegativeNumber
ruleNegativeNumber returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='-' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getNegativeNumberAccess().getHyphenMinusKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNegativeNumberAccess().getValPositiveNumberParserRuleCall_1_0()); 
	    }
		lv_val_1_0=rulePositiveNumber		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNegativeNumberRule());
	        }
       		set(
       			$current, 
       			"val",
        		lv_val_1_0, 
        		"PositiveNumber");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleSumak
entryRuleSumak returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSumakRule()); }
	 iv_ruleSumak=ruleSumak 
	 { $current=$iv_ruleSumak.current; } 
	 EOF 
;

// Rule Sumak
ruleSumak returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='SUMA' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSumakAccess().getSUMAKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSumakAccess().getValNumberParserRuleCall_1_0()); 
	    }
		lv_val_1_0=ruleNumber		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSumakRule());
	        }
       		set(
       			$current, 
       			"val",
        		lv_val_1_0, 
        		"Number");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMultk
entryRuleMultk returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMultkRule()); }
	 iv_ruleMultk=ruleMultk 
	 { $current=$iv_ruleMultk.current; } 
	 EOF 
;

// Rule Multk
ruleMultk returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='MULT' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMultkAccess().getMULTKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMultkAccess().getValNumberParserRuleCall_1_0()); 
	    }
		lv_val_1_0=ruleNumber		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMultkRule());
	        }
       		set(
       			$current, 
       			"val",
        		lv_val_1_0, 
        		"Number");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleIgual
entryRuleIgual returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIgualRule()); }
	 iv_ruleIgual=ruleIgual 
	 { $current=$iv_ruleIgual.current; } 
	 EOF 
;

// Rule Igual
ruleIgual returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='IGUAL' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIgualAccess().getIGUALKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getIgualAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIgualAccess().getSubInstructionsInstructionParserRuleCall_2_0()); 
	    }
		lv_subInstructions_2_0=ruleInstruction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIgualRule());
	        }
       		add(
       			$current, 
       			"subInstructions",
        		lv_subInstructions_2_0, 
        		"Instruction");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_3='}' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getIgualAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRuleIgualk
entryRuleIgualk returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIgualkRule()); }
	 iv_ruleIgualk=ruleIgualk 
	 { $current=$iv_ruleIgualk.current; } 
	 EOF 
;

// Rule Igualk
ruleIgualk returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='IGUAL' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIgualkAccess().getIGUALKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIgualkAccess().getValNumberParserRuleCall_1_0()); 
	    }
		lv_val_1_0=ruleNumber		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIgualkRule());
	        }
       		set(
       			$current, 
       			"val",
        		lv_val_1_0, 
        		"Number");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getIgualkAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIgualkAccess().getSubInstructionsInstructionParserRuleCall_3_0()); 
	    }
		lv_subInstructions_3_0=ruleInstruction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIgualkRule());
	        }
       		add(
       			$current, 
       			"subInstructions",
        		lv_subInstructions_3_0, 
        		"Instruction");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getIgualkAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleDifer
entryRuleDifer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDiferRule()); }
	 iv_ruleDifer=ruleDifer 
	 { $current=$iv_ruleDifer.current; } 
	 EOF 
;

// Rule Difer
ruleDifer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='DIFER' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDiferAccess().getDIFERKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDiferAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDiferAccess().getSubInstructionsInstructionParserRuleCall_2_0()); 
	    }
		lv_subInstructions_2_0=ruleInstruction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDiferRule());
	        }
       		add(
       			$current, 
       			"subInstructions",
        		lv_subInstructions_2_0, 
        		"Instruction");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_3='}' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDiferAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRuleDiferk
entryRuleDiferk returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDiferkRule()); }
	 iv_ruleDiferk=ruleDiferk 
	 { $current=$iv_ruleDiferk.current; } 
	 EOF 
;

// Rule Diferk
ruleDiferk returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='DIFER' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDiferkAccess().getDIFERKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDiferkAccess().getValNumberParserRuleCall_1_0()); 
	    }
		lv_val_1_0=ruleNumber		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDiferkRule());
	        }
       		set(
       			$current, 
       			"val",
        		lv_val_1_0, 
        		"Number");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDiferkAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDiferkAccess().getSubInstructionsInstructionParserRuleCall_3_0()); 
	    }
		lv_subInstructions_3_0=ruleInstruction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDiferkRule());
	        }
       		add(
       			$current, 
       			"subInstructions",
        		lv_subInstructions_3_0, 
        		"Instruction");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDiferkAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleMayor
entryRuleMayor returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMayorRule()); }
	 iv_ruleMayor=ruleMayor 
	 { $current=$iv_ruleMayor.current; } 
	 EOF 
;

// Rule Mayor
ruleMayor returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='MAYOR' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMayorAccess().getMAYORKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMayorAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMayorAccess().getSubInstructionsInstructionParserRuleCall_2_0()); 
	    }
		lv_subInstructions_2_0=ruleInstruction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMayorRule());
	        }
       		add(
       			$current, 
       			"subInstructions",
        		lv_subInstructions_2_0, 
        		"Instruction");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_3='}' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMayorAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRuleMayork
entryRuleMayork returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMayorkRule()); }
	 iv_ruleMayork=ruleMayork 
	 { $current=$iv_ruleMayork.current; } 
	 EOF 
;

// Rule Mayork
ruleMayork returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='MAYOR' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMayorkAccess().getMAYORKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMayorkAccess().getValNumberParserRuleCall_1_0()); 
	    }
		lv_val_1_0=ruleNumber		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMayorkRule());
	        }
       		set(
       			$current, 
       			"val",
        		lv_val_1_0, 
        		"Number");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMayorkAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMayorkAccess().getSubInstructionsInstructionParserRuleCall_3_0()); 
	    }
		lv_subInstructions_3_0=ruleInstruction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMayorkRule());
	        }
       		add(
       			$current, 
       			"subInstructions",
        		lv_subInstructions_3_0, 
        		"Instruction");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMayorkAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleMenor
entryRuleMenor returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMenorRule()); }
	 iv_ruleMenor=ruleMenor 
	 { $current=$iv_ruleMenor.current; } 
	 EOF 
;

// Rule Menor
ruleMenor returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='MENOR' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMenorAccess().getMENORKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMenorAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMenorAccess().getSubInstructionsInstructionParserRuleCall_2_0()); 
	    }
		lv_subInstructions_2_0=ruleInstruction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMenorRule());
	        }
       		add(
       			$current, 
       			"subInstructions",
        		lv_subInstructions_2_0, 
        		"Instruction");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_3='}' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMenorAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRuleMenork
entryRuleMenork returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMenorkRule()); }
	 iv_ruleMenork=ruleMenork 
	 { $current=$iv_ruleMenork.current; } 
	 EOF 
;

// Rule Menork
ruleMenork returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='MENOR' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMenorkAccess().getMENORKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMenorkAccess().getValNumberParserRuleCall_1_0()); 
	    }
		lv_val_1_0=ruleNumber		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMenorkRule());
	        }
       		set(
       			$current, 
       			"val",
        		lv_val_1_0, 
        		"Number");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMenorkAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMenorkAccess().getSubInstructionsInstructionParserRuleCall_3_0()); 
	    }
		lv_subInstructions_3_0=ruleInstruction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMenorkRule());
	        }
       		add(
       			$current, 
       			"subInstructions",
        		lv_subInstructions_3_0, 
        		"Instruction");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMenorkAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleRepetirn
entryRuleRepetirn returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRepetirnRule()); }
	 iv_ruleRepetirn=ruleRepetirn 
	 { $current=$iv_ruleRepetirn.current; } 
	 EOF 
;

// Rule Repetirn
ruleRepetirn returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='REP' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRepetirnAccess().getREPKeyword_0());
    }
(
(
		lv_val_1_0=RULE_INT
		{
			newLeafNode(lv_val_1_0, grammarAccess.getRepetirnAccess().getValINTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRepetirnRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"val",
        		lv_val_1_0, 
        		"INT");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRepetirnAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRepetirnAccess().getSubInstructionsInstructionParserRuleCall_3_0()); 
	    }
		lv_subInstructions_3_0=ruleInstruction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRepetirnRule());
	        }
       		add(
       			$current, 
       			"subInstructions",
        		lv_subInstructions_3_0, 
        		"Instruction");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRepetirnAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Rule EmptyInstructionType
ruleEmptyInstructionType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='DER' 
	{
        $current = grammarAccess.getEmptyInstructionTypeAccess().getDerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getEmptyInstructionTypeAccess().getDerEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='IZQ' 
	{
        $current = grammarAccess.getEmptyInstructionTypeAccess().getIzqEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getEmptyInstructionTypeAccess().getIzqEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='ARR' 
	{
        $current = grammarAccess.getEmptyInstructionTypeAccess().getArrEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getEmptyInstructionTypeAccess().getArrEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='ABA' 
	{
        $current = grammarAccess.getEmptyInstructionTypeAccess().getAbaEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getEmptyInstructionTypeAccess().getAbaEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='MEMO' 
	{
        $current = grammarAccess.getEmptyInstructionTypeAccess().getMemoEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getEmptyInstructionTypeAccess().getMemoEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='ESCRI' 
	{
        $current = grammarAccess.getEmptyInstructionTypeAccess().getEscriEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getEmptyInstructionTypeAccess().getEscriEnumLiteralDeclaration_5()); 
    }
)
    |(	enumLiteral_6='SUMA' 
	{
        $current = grammarAccess.getEmptyInstructionTypeAccess().getSumaEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_6, grammarAccess.getEmptyInstructionTypeAccess().getSumaEnumLiteralDeclaration_6()); 
    }
)
    |(	enumLiteral_7='SIGNO' 
	{
        $current = grammarAccess.getEmptyInstructionTypeAccess().getSignoEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_7, grammarAccess.getEmptyInstructionTypeAccess().getSignoEnumLiteralDeclaration_7()); 
    }
)
    |(	enumLiteral_8='MULT' 
	{
        $current = grammarAccess.getEmptyInstructionTypeAccess().getMultEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_8, grammarAccess.getEmptyInstructionTypeAccess().getMultEnumLiteralDeclaration_8()); 
    }
)
    |(	enumLiteral_9='INVER' 
	{
        $current = grammarAccess.getEmptyInstructionTypeAccess().getInverEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_9, grammarAccess.getEmptyInstructionTypeAccess().getInverEnumLiteralDeclaration_9()); 
    }
)
    |(	enumLiteral_10='ENVIAR' 
	{
        $current = grammarAccess.getEmptyInstructionTypeAccess().getEnviarEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_10, grammarAccess.getEmptyInstructionTypeAccess().getEnviarEnumLiteralDeclaration_10()); 
    }
)
    |(	enumLiteral_11='ENVIAR MATRIZ' 
	{
        $current = grammarAccess.getEmptyInstructionTypeAccess().getEnviarMatrizEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_11, grammarAccess.getEmptyInstructionTypeAccess().getEnviarMatrizEnumLiteralDeclaration_11()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


