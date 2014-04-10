/*
* generated by Xtext
*/
package edu.upb.lp.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class RebotinolGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class RebotinolProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RebotinolProgram");
		private final Assignment cInstructionsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cInstructionsInstructionParserRuleCall_0 = (RuleCall)cInstructionsAssignment.eContents().get(0);
		
		//RebotinolProgram:
		//	instructions+=Instruction+;
		public ParserRule getRule() { return rule; }

		//instructions+=Instruction+
		public Assignment getInstructionsAssignment() { return cInstructionsAssignment; }

		//Instruction
		public RuleCall getInstructionsInstructionParserRuleCall_0() { return cInstructionsInstructionParserRuleCall_0; }
	}

	public class InstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Instruction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEmptyInstructionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNonEmptyInstructionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Instruction:
		//	EmptyInstruction | NonEmptyInstruction;
		public ParserRule getRule() { return rule; }

		//EmptyInstruction | NonEmptyInstruction
		public Alternatives getAlternatives() { return cAlternatives; }

		//EmptyInstruction
		public RuleCall getEmptyInstructionParserRuleCall_0() { return cEmptyInstructionParserRuleCall_0; }

		//NonEmptyInstruction
		public RuleCall getNonEmptyInstructionParserRuleCall_1() { return cNonEmptyInstructionParserRuleCall_1; }
	}

	public class EmptyInstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EmptyInstruction");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTypeEmptyInstructionTypeEnumRuleCall_0 = (RuleCall)cTypeAssignment.eContents().get(0);
		
		//EmptyInstruction:
		//	type=EmptyInstructionType;
		public ParserRule getRule() { return rule; }

		//type=EmptyInstructionType
		public Assignment getTypeAssignment() { return cTypeAssignment; }

		//EmptyInstructionType
		public RuleCall getTypeEmptyInstructionTypeEnumRuleCall_0() { return cTypeEmptyInstructionTypeEnumRuleCall_0; }
	}

	public class NonEmptyInstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NonEmptyInstruction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSumakParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMultkParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cComplexInstructionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//NonEmptyInstruction:
		//	Sumak | Multk | ComplexInstruction;
		public ParserRule getRule() { return rule; }

		//Sumak | Multk | ComplexInstruction
		public Alternatives getAlternatives() { return cAlternatives; }

		//Sumak
		public RuleCall getSumakParserRuleCall_0() { return cSumakParserRuleCall_0; }

		//Multk
		public RuleCall getMultkParserRuleCall_1() { return cMultkParserRuleCall_1; }

		//ComplexInstruction
		public RuleCall getComplexInstructionParserRuleCall_2() { return cComplexInstructionParserRuleCall_2; }
	}

	public class ComplexInstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ComplexInstruction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIgualParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIgualkParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDiferParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDiferkParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cMayorParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cMayorkParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cMenorParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cMenorkParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cRepetirnParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		
		//ComplexInstruction:
		//	Igual | Igualk | Difer | Diferk | Mayor | Mayork | Menor | Menork | Repetirn;
		public ParserRule getRule() { return rule; }

		//Igual | Igualk | Difer | Diferk | Mayor | Mayork | Menor | Menork | Repetirn
		public Alternatives getAlternatives() { return cAlternatives; }

		//Igual
		public RuleCall getIgualParserRuleCall_0() { return cIgualParserRuleCall_0; }

		//Igualk
		public RuleCall getIgualkParserRuleCall_1() { return cIgualkParserRuleCall_1; }

		//Difer
		public RuleCall getDiferParserRuleCall_2() { return cDiferParserRuleCall_2; }

		//Diferk
		public RuleCall getDiferkParserRuleCall_3() { return cDiferkParserRuleCall_3; }

		//Mayor
		public RuleCall getMayorParserRuleCall_4() { return cMayorParserRuleCall_4; }

		//Mayork
		public RuleCall getMayorkParserRuleCall_5() { return cMayorkParserRuleCall_5; }

		//Menor
		public RuleCall getMenorParserRuleCall_6() { return cMenorParserRuleCall_6; }

		//Menork
		public RuleCall getMenorkParserRuleCall_7() { return cMenorkParserRuleCall_7; }

		//Repetirn
		public RuleCall getRepetirnParserRuleCall_8() { return cRepetirnParserRuleCall_8; }
	}

	public class SumakElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Sumak");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSUMAKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		
		//Sumak:
		//	"SUMA" val=INT;
		public ParserRule getRule() { return rule; }

		//"SUMA" val=INT
		public Group getGroup() { return cGroup; }

		//"SUMA"
		public Keyword getSUMAKeyword_0() { return cSUMAKeyword_0; }

		//val=INT
		public Assignment getValAssignment_1() { return cValAssignment_1; }

		//INT
		public RuleCall getValINTTerminalRuleCall_1_0() { return cValINTTerminalRuleCall_1_0; }
	}

	public class MultkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Multk");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMULTKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		
		//Multk:
		//	"MULT" val=INT;
		public ParserRule getRule() { return rule; }

		//"MULT" val=INT
		public Group getGroup() { return cGroup; }

		//"MULT"
		public Keyword getMULTKeyword_0() { return cMULTKeyword_0; }

		//val=INT
		public Assignment getValAssignment_1() { return cValAssignment_1; }

		//INT
		public RuleCall getValINTTerminalRuleCall_1_0() { return cValINTTerminalRuleCall_1_0; }
	}

	public class IgualElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Igual");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIGUALKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSubInstructionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSubInstructionsInstructionParserRuleCall_2_0 = (RuleCall)cSubInstructionsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Igual:
		//	"IGUAL" "{" subInstructions+=Instruction+ "}";
		public ParserRule getRule() { return rule; }

		//"IGUAL" "{" subInstructions+=Instruction+ "}"
		public Group getGroup() { return cGroup; }

		//"IGUAL"
		public Keyword getIGUALKeyword_0() { return cIGUALKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//subInstructions+=Instruction+
		public Assignment getSubInstructionsAssignment_2() { return cSubInstructionsAssignment_2; }

		//Instruction
		public RuleCall getSubInstructionsInstructionParserRuleCall_2_0() { return cSubInstructionsInstructionParserRuleCall_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class IgualkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Igualk");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIGUALKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSubInstructionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSubInstructionsInstructionParserRuleCall_3_0 = (RuleCall)cSubInstructionsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Igualk:
		//	"IGUAL" val=INT "{" subInstructions+=Instruction+ "}";
		public ParserRule getRule() { return rule; }

		//"IGUAL" val=INT "{" subInstructions+=Instruction+ "}"
		public Group getGroup() { return cGroup; }

		//"IGUAL"
		public Keyword getIGUALKeyword_0() { return cIGUALKeyword_0; }

		//val=INT
		public Assignment getValAssignment_1() { return cValAssignment_1; }

		//INT
		public RuleCall getValINTTerminalRuleCall_1_0() { return cValINTTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//subInstructions+=Instruction+
		public Assignment getSubInstructionsAssignment_3() { return cSubInstructionsAssignment_3; }

		//Instruction
		public RuleCall getSubInstructionsInstructionParserRuleCall_3_0() { return cSubInstructionsInstructionParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class DiferElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Difer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDIFERKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSubInstructionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSubInstructionsInstructionParserRuleCall_2_0 = (RuleCall)cSubInstructionsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Difer:
		//	"DIFER" "{" subInstructions+=Instruction+ "}";
		public ParserRule getRule() { return rule; }

		//"DIFER" "{" subInstructions+=Instruction+ "}"
		public Group getGroup() { return cGroup; }

		//"DIFER"
		public Keyword getDIFERKeyword_0() { return cDIFERKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//subInstructions+=Instruction+
		public Assignment getSubInstructionsAssignment_2() { return cSubInstructionsAssignment_2; }

		//Instruction
		public RuleCall getSubInstructionsInstructionParserRuleCall_2_0() { return cSubInstructionsInstructionParserRuleCall_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class DiferkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Diferk");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDIFERKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSubInstructionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSubInstructionsInstructionParserRuleCall_3_0 = (RuleCall)cSubInstructionsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Diferk:
		//	"DIFER" val=INT "{" subInstructions+=Instruction+ "}";
		public ParserRule getRule() { return rule; }

		//"DIFER" val=INT "{" subInstructions+=Instruction+ "}"
		public Group getGroup() { return cGroup; }

		//"DIFER"
		public Keyword getDIFERKeyword_0() { return cDIFERKeyword_0; }

		//val=INT
		public Assignment getValAssignment_1() { return cValAssignment_1; }

		//INT
		public RuleCall getValINTTerminalRuleCall_1_0() { return cValINTTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//subInstructions+=Instruction+
		public Assignment getSubInstructionsAssignment_3() { return cSubInstructionsAssignment_3; }

		//Instruction
		public RuleCall getSubInstructionsInstructionParserRuleCall_3_0() { return cSubInstructionsInstructionParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class MayorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Mayor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMAYORKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSubInstructionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSubInstructionsInstructionParserRuleCall_2_0 = (RuleCall)cSubInstructionsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Mayor:
		//	"MAYOR" "{" subInstructions+=Instruction+ "}";
		public ParserRule getRule() { return rule; }

		//"MAYOR" "{" subInstructions+=Instruction+ "}"
		public Group getGroup() { return cGroup; }

		//"MAYOR"
		public Keyword getMAYORKeyword_0() { return cMAYORKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//subInstructions+=Instruction+
		public Assignment getSubInstructionsAssignment_2() { return cSubInstructionsAssignment_2; }

		//Instruction
		public RuleCall getSubInstructionsInstructionParserRuleCall_2_0() { return cSubInstructionsInstructionParserRuleCall_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class MayorkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Mayork");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMAYORKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSubInstructionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSubInstructionsInstructionParserRuleCall_3_0 = (RuleCall)cSubInstructionsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Mayork:
		//	"MAYOR" val=INT "{" subInstructions+=Instruction+ "}";
		public ParserRule getRule() { return rule; }

		//"MAYOR" val=INT "{" subInstructions+=Instruction+ "}"
		public Group getGroup() { return cGroup; }

		//"MAYOR"
		public Keyword getMAYORKeyword_0() { return cMAYORKeyword_0; }

		//val=INT
		public Assignment getValAssignment_1() { return cValAssignment_1; }

		//INT
		public RuleCall getValINTTerminalRuleCall_1_0() { return cValINTTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//subInstructions+=Instruction+
		public Assignment getSubInstructionsAssignment_3() { return cSubInstructionsAssignment_3; }

		//Instruction
		public RuleCall getSubInstructionsInstructionParserRuleCall_3_0() { return cSubInstructionsInstructionParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class MenorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Menor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMENORKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSubInstructionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSubInstructionsInstructionParserRuleCall_2_0 = (RuleCall)cSubInstructionsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Menor:
		//	"MENOR" "{" subInstructions+=Instruction+ "}";
		public ParserRule getRule() { return rule; }

		//"MENOR" "{" subInstructions+=Instruction+ "}"
		public Group getGroup() { return cGroup; }

		//"MENOR"
		public Keyword getMENORKeyword_0() { return cMENORKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//subInstructions+=Instruction+
		public Assignment getSubInstructionsAssignment_2() { return cSubInstructionsAssignment_2; }

		//Instruction
		public RuleCall getSubInstructionsInstructionParserRuleCall_2_0() { return cSubInstructionsInstructionParserRuleCall_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class MenorkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Menork");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMENORKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSubInstructionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSubInstructionsInstructionParserRuleCall_3_0 = (RuleCall)cSubInstructionsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Menork:
		//	"MENOR" val=INT "{" subInstructions+=Instruction+ "}";
		public ParserRule getRule() { return rule; }

		//"MENOR" val=INT "{" subInstructions+=Instruction+ "}"
		public Group getGroup() { return cGroup; }

		//"MENOR"
		public Keyword getMENORKeyword_0() { return cMENORKeyword_0; }

		//val=INT
		public Assignment getValAssignment_1() { return cValAssignment_1; }

		//INT
		public RuleCall getValINTTerminalRuleCall_1_0() { return cValINTTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//subInstructions+=Instruction+
		public Assignment getSubInstructionsAssignment_3() { return cSubInstructionsAssignment_3; }

		//Instruction
		public RuleCall getSubInstructionsInstructionParserRuleCall_3_0() { return cSubInstructionsInstructionParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class RepetirnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Repetirn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cREPKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSubInstructionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSubInstructionsInstructionParserRuleCall_3_0 = (RuleCall)cSubInstructionsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Repetirn:
		//	"REP" val=INT "{" subInstructions+=Instruction+ "}";
		public ParserRule getRule() { return rule; }

		//"REP" val=INT "{" subInstructions+=Instruction+ "}"
		public Group getGroup() { return cGroup; }

		//"REP"
		public Keyword getREPKeyword_0() { return cREPKeyword_0; }

		//val=INT
		public Assignment getValAssignment_1() { return cValAssignment_1; }

		//INT
		public RuleCall getValINTTerminalRuleCall_1_0() { return cValINTTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//subInstructions+=Instruction+
		public Assignment getSubInstructionsAssignment_3() { return cSubInstructionsAssignment_3; }

		//Instruction
		public RuleCall getSubInstructionsInstructionParserRuleCall_3_0() { return cSubInstructionsInstructionParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	
	public class EmptyInstructionTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "EmptyInstructionType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDerEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDerDERKeyword_0_0 = (Keyword)cDerEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cIzqEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cIzqIZQKeyword_1_0 = (Keyword)cIzqEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cArrEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cArrARRKeyword_2_0 = (Keyword)cArrEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cAbaEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cAbaABAKeyword_3_0 = (Keyword)cAbaEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cMemoEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cMemoMEMOKeyword_4_0 = (Keyword)cMemoEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cEscriEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cEscriESCRIKeyword_5_0 = (Keyword)cEscriEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cSumaEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cSumaSUMAKeyword_6_0 = (Keyword)cSumaEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cSignoEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cSignoSIGNOKeyword_7_0 = (Keyword)cSignoEnumLiteralDeclaration_7.eContents().get(0);
		private final EnumLiteralDeclaration cMultEnumLiteralDeclaration_8 = (EnumLiteralDeclaration)cAlternatives.eContents().get(8);
		private final Keyword cMultMULTKeyword_8_0 = (Keyword)cMultEnumLiteralDeclaration_8.eContents().get(0);
		private final EnumLiteralDeclaration cInverEnumLiteralDeclaration_9 = (EnumLiteralDeclaration)cAlternatives.eContents().get(9);
		private final Keyword cInverINVERKeyword_9_0 = (Keyword)cInverEnumLiteralDeclaration_9.eContents().get(0);
		private final EnumLiteralDeclaration cEnviarEnumLiteralDeclaration_10 = (EnumLiteralDeclaration)cAlternatives.eContents().get(10);
		private final Keyword cEnviarENVIARKeyword_10_0 = (Keyword)cEnviarEnumLiteralDeclaration_10.eContents().get(0);
		private final EnumLiteralDeclaration cEnviarMatrizEnumLiteralDeclaration_11 = (EnumLiteralDeclaration)cAlternatives.eContents().get(11);
		private final Keyword cEnviarMatrizENVIARMATRIZKeyword_11_0 = (Keyword)cEnviarMatrizEnumLiteralDeclaration_11.eContents().get(0);
		
		//enum EmptyInstructionType:
		//	der="DER" | izq="IZQ" | arr="ARR" | aba="ABA" | memo="MEMO" | escri="ESCRI" | suma="SUMA" | signo="SIGNO" |
		//	Mult="MULT" | Inver="INVER" | Enviar="ENVIAR" | EnviarMatriz="ENVIAR MATRIZ";
		public EnumRule getRule() { return rule; }

		//der="DER" | izq="IZQ" | arr="ARR" | aba="ABA" | memo="MEMO" | escri="ESCRI" | suma="SUMA" | signo="SIGNO" | Mult="MULT"
		//| Inver="INVER" | Enviar="ENVIAR" | EnviarMatriz="ENVIAR MATRIZ"
		public Alternatives getAlternatives() { return cAlternatives; }

		//der="DER"
		public EnumLiteralDeclaration getDerEnumLiteralDeclaration_0() { return cDerEnumLiteralDeclaration_0; }

		//"DER"
		public Keyword getDerDERKeyword_0_0() { return cDerDERKeyword_0_0; }

		//izq="IZQ"
		public EnumLiteralDeclaration getIzqEnumLiteralDeclaration_1() { return cIzqEnumLiteralDeclaration_1; }

		//"IZQ"
		public Keyword getIzqIZQKeyword_1_0() { return cIzqIZQKeyword_1_0; }

		//arr="ARR"
		public EnumLiteralDeclaration getArrEnumLiteralDeclaration_2() { return cArrEnumLiteralDeclaration_2; }

		//"ARR"
		public Keyword getArrARRKeyword_2_0() { return cArrARRKeyword_2_0; }

		//aba="ABA"
		public EnumLiteralDeclaration getAbaEnumLiteralDeclaration_3() { return cAbaEnumLiteralDeclaration_3; }

		//"ABA"
		public Keyword getAbaABAKeyword_3_0() { return cAbaABAKeyword_3_0; }

		//memo="MEMO"
		public EnumLiteralDeclaration getMemoEnumLiteralDeclaration_4() { return cMemoEnumLiteralDeclaration_4; }

		//"MEMO"
		public Keyword getMemoMEMOKeyword_4_0() { return cMemoMEMOKeyword_4_0; }

		//escri="ESCRI"
		public EnumLiteralDeclaration getEscriEnumLiteralDeclaration_5() { return cEscriEnumLiteralDeclaration_5; }

		//"ESCRI"
		public Keyword getEscriESCRIKeyword_5_0() { return cEscriESCRIKeyword_5_0; }

		//suma="SUMA"
		public EnumLiteralDeclaration getSumaEnumLiteralDeclaration_6() { return cSumaEnumLiteralDeclaration_6; }

		//"SUMA"
		public Keyword getSumaSUMAKeyword_6_0() { return cSumaSUMAKeyword_6_0; }

		//signo="SIGNO"
		public EnumLiteralDeclaration getSignoEnumLiteralDeclaration_7() { return cSignoEnumLiteralDeclaration_7; }

		//"SIGNO"
		public Keyword getSignoSIGNOKeyword_7_0() { return cSignoSIGNOKeyword_7_0; }

		//Mult="MULT"
		public EnumLiteralDeclaration getMultEnumLiteralDeclaration_8() { return cMultEnumLiteralDeclaration_8; }

		//"MULT"
		public Keyword getMultMULTKeyword_8_0() { return cMultMULTKeyword_8_0; }

		//Inver="INVER"
		public EnumLiteralDeclaration getInverEnumLiteralDeclaration_9() { return cInverEnumLiteralDeclaration_9; }

		//"INVER"
		public Keyword getInverINVERKeyword_9_0() { return cInverINVERKeyword_9_0; }

		//Enviar="ENVIAR"
		public EnumLiteralDeclaration getEnviarEnumLiteralDeclaration_10() { return cEnviarEnumLiteralDeclaration_10; }

		//"ENVIAR"
		public Keyword getEnviarENVIARKeyword_10_0() { return cEnviarENVIARKeyword_10_0; }

		//EnviarMatriz="ENVIAR MATRIZ"
		public EnumLiteralDeclaration getEnviarMatrizEnumLiteralDeclaration_11() { return cEnviarMatrizEnumLiteralDeclaration_11; }

		//"ENVIAR MATRIZ"
		public Keyword getEnviarMatrizENVIARMATRIZKeyword_11_0() { return cEnviarMatrizENVIARMATRIZKeyword_11_0; }
	}
	
	private RebotinolProgramElements pRebotinolProgram;
	private InstructionElements pInstruction;
	private EmptyInstructionElements pEmptyInstruction;
	private EmptyInstructionTypeElements unknownRuleEmptyInstructionType;
	private NonEmptyInstructionElements pNonEmptyInstruction;
	private ComplexInstructionElements pComplexInstruction;
	private SumakElements pSumak;
	private MultkElements pMultk;
	private IgualElements pIgual;
	private IgualkElements pIgualk;
	private DiferElements pDifer;
	private DiferkElements pDiferk;
	private MayorElements pMayor;
	private MayorkElements pMayork;
	private MenorElements pMenor;
	private MenorkElements pMenork;
	private RepetirnElements pRepetirn;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public RebotinolGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("edu.upb.lp.Rebotinol".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//RebotinolProgram:
	//	instructions+=Instruction+;
	public RebotinolProgramElements getRebotinolProgramAccess() {
		return (pRebotinolProgram != null) ? pRebotinolProgram : (pRebotinolProgram = new RebotinolProgramElements());
	}
	
	public ParserRule getRebotinolProgramRule() {
		return getRebotinolProgramAccess().getRule();
	}

	//Instruction:
	//	EmptyInstruction | NonEmptyInstruction;
	public InstructionElements getInstructionAccess() {
		return (pInstruction != null) ? pInstruction : (pInstruction = new InstructionElements());
	}
	
	public ParserRule getInstructionRule() {
		return getInstructionAccess().getRule();
	}

	//EmptyInstruction:
	//	type=EmptyInstructionType;
	public EmptyInstructionElements getEmptyInstructionAccess() {
		return (pEmptyInstruction != null) ? pEmptyInstruction : (pEmptyInstruction = new EmptyInstructionElements());
	}
	
	public ParserRule getEmptyInstructionRule() {
		return getEmptyInstructionAccess().getRule();
	}

	//enum EmptyInstructionType:
	//	der="DER" | izq="IZQ" | arr="ARR" | aba="ABA" | memo="MEMO" | escri="ESCRI" | suma="SUMA" | signo="SIGNO" |
	//	Mult="MULT" | Inver="INVER" | Enviar="ENVIAR" | EnviarMatriz="ENVIAR MATRIZ";
	public EmptyInstructionTypeElements getEmptyInstructionTypeAccess() {
		return (unknownRuleEmptyInstructionType != null) ? unknownRuleEmptyInstructionType : (unknownRuleEmptyInstructionType = new EmptyInstructionTypeElements());
	}
	
	public EnumRule getEmptyInstructionTypeRule() {
		return getEmptyInstructionTypeAccess().getRule();
	}

	//NonEmptyInstruction:
	//	Sumak | Multk | ComplexInstruction;
	public NonEmptyInstructionElements getNonEmptyInstructionAccess() {
		return (pNonEmptyInstruction != null) ? pNonEmptyInstruction : (pNonEmptyInstruction = new NonEmptyInstructionElements());
	}
	
	public ParserRule getNonEmptyInstructionRule() {
		return getNonEmptyInstructionAccess().getRule();
	}

	//ComplexInstruction:
	//	Igual | Igualk | Difer | Diferk | Mayor | Mayork | Menor | Menork | Repetirn;
	public ComplexInstructionElements getComplexInstructionAccess() {
		return (pComplexInstruction != null) ? pComplexInstruction : (pComplexInstruction = new ComplexInstructionElements());
	}
	
	public ParserRule getComplexInstructionRule() {
		return getComplexInstructionAccess().getRule();
	}

	//Sumak:
	//	"SUMA" val=INT;
	public SumakElements getSumakAccess() {
		return (pSumak != null) ? pSumak : (pSumak = new SumakElements());
	}
	
	public ParserRule getSumakRule() {
		return getSumakAccess().getRule();
	}

	//Multk:
	//	"MULT" val=INT;
	public MultkElements getMultkAccess() {
		return (pMultk != null) ? pMultk : (pMultk = new MultkElements());
	}
	
	public ParserRule getMultkRule() {
		return getMultkAccess().getRule();
	}

	//Igual:
	//	"IGUAL" "{" subInstructions+=Instruction+ "}";
	public IgualElements getIgualAccess() {
		return (pIgual != null) ? pIgual : (pIgual = new IgualElements());
	}
	
	public ParserRule getIgualRule() {
		return getIgualAccess().getRule();
	}

	//Igualk:
	//	"IGUAL" val=INT "{" subInstructions+=Instruction+ "}";
	public IgualkElements getIgualkAccess() {
		return (pIgualk != null) ? pIgualk : (pIgualk = new IgualkElements());
	}
	
	public ParserRule getIgualkRule() {
		return getIgualkAccess().getRule();
	}

	//Difer:
	//	"DIFER" "{" subInstructions+=Instruction+ "}";
	public DiferElements getDiferAccess() {
		return (pDifer != null) ? pDifer : (pDifer = new DiferElements());
	}
	
	public ParserRule getDiferRule() {
		return getDiferAccess().getRule();
	}

	//Diferk:
	//	"DIFER" val=INT "{" subInstructions+=Instruction+ "}";
	public DiferkElements getDiferkAccess() {
		return (pDiferk != null) ? pDiferk : (pDiferk = new DiferkElements());
	}
	
	public ParserRule getDiferkRule() {
		return getDiferkAccess().getRule();
	}

	//Mayor:
	//	"MAYOR" "{" subInstructions+=Instruction+ "}";
	public MayorElements getMayorAccess() {
		return (pMayor != null) ? pMayor : (pMayor = new MayorElements());
	}
	
	public ParserRule getMayorRule() {
		return getMayorAccess().getRule();
	}

	//Mayork:
	//	"MAYOR" val=INT "{" subInstructions+=Instruction+ "}";
	public MayorkElements getMayorkAccess() {
		return (pMayork != null) ? pMayork : (pMayork = new MayorkElements());
	}
	
	public ParserRule getMayorkRule() {
		return getMayorkAccess().getRule();
	}

	//Menor:
	//	"MENOR" "{" subInstructions+=Instruction+ "}";
	public MenorElements getMenorAccess() {
		return (pMenor != null) ? pMenor : (pMenor = new MenorElements());
	}
	
	public ParserRule getMenorRule() {
		return getMenorAccess().getRule();
	}

	//Menork:
	//	"MENOR" val=INT "{" subInstructions+=Instruction+ "}";
	public MenorkElements getMenorkAccess() {
		return (pMenork != null) ? pMenork : (pMenork = new MenorkElements());
	}
	
	public ParserRule getMenorkRule() {
		return getMenorkAccess().getRule();
	}

	//Repetirn:
	//	"REP" val=INT "{" subInstructions+=Instruction+ "}";
	public RepetirnElements getRepetirnAccess() {
		return (pRepetirn != null) ? pRepetirn : (pRepetirn = new RepetirnElements());
	}
	
	public ParserRule getRepetirnRule() {
		return getRepetirnAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
