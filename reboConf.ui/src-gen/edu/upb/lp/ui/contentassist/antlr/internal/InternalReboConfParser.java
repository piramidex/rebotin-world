package edu.upb.lp.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import edu.upb.lp.services.ReboConfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReboConfParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Matriz inicial:'", "'Matriz esperada:'", "'Correo esperado:'", "','", "'_'", "'/'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalReboConfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReboConfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReboConfParser.tokenNames; }
    public String getGrammarFileName() { return "../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g"; }


     
     	private ReboConfGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ReboConfGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleConfiguration"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:60:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:61:1: ( ruleConfiguration EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:62:1: ruleConfiguration EOF
            {
             before(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_ruleConfiguration_in_entryRuleConfiguration61);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getConfigurationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfiguration68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:69:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:73:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:74:1: ( ( rule__Configuration__Group__0 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:74:1: ( ( rule__Configuration__Group__0 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:75:1: ( rule__Configuration__Group__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:76:1: ( rule__Configuration__Group__0 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:76:2: rule__Configuration__Group__0
            {
            pushFollow(FOLLOW_rule__Configuration__Group__0_in_ruleConfiguration94);
            rule__Configuration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleMatrix"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:88:1: entryRuleMatrix : ruleMatrix EOF ;
    public final void entryRuleMatrix() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:89:1: ( ruleMatrix EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:90:1: ruleMatrix EOF
            {
             before(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_ruleMatrix_in_entryRuleMatrix121);
            ruleMatrix();

            state._fsp--;

             after(grammarAccess.getMatrixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatrix"


    // $ANTLR start "ruleMatrix"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:97:1: ruleMatrix : ( ( ( rule__Matrix__LinesAssignment ) ) ( ( rule__Matrix__LinesAssignment )* ) ) ;
    public final void ruleMatrix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:101:2: ( ( ( ( rule__Matrix__LinesAssignment ) ) ( ( rule__Matrix__LinesAssignment )* ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:102:1: ( ( ( rule__Matrix__LinesAssignment ) ) ( ( rule__Matrix__LinesAssignment )* ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:102:1: ( ( ( rule__Matrix__LinesAssignment ) ) ( ( rule__Matrix__LinesAssignment )* ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:103:1: ( ( rule__Matrix__LinesAssignment ) ) ( ( rule__Matrix__LinesAssignment )* )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:103:1: ( ( rule__Matrix__LinesAssignment ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:104:1: ( rule__Matrix__LinesAssignment )
            {
             before(grammarAccess.getMatrixAccess().getLinesAssignment()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:105:1: ( rule__Matrix__LinesAssignment )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:105:2: rule__Matrix__LinesAssignment
            {
            pushFollow(FOLLOW_rule__Matrix__LinesAssignment_in_ruleMatrix156);
            rule__Matrix__LinesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMatrixAccess().getLinesAssignment()); 

            }

            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:108:1: ( ( rule__Matrix__LinesAssignment )* )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:109:1: ( rule__Matrix__LinesAssignment )*
            {
             before(grammarAccess.getMatrixAccess().getLinesAssignment()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:110:1: ( rule__Matrix__LinesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||LA1_0==15||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:110:2: rule__Matrix__LinesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Matrix__LinesAssignment_in_ruleMatrix168);
            	    rule__Matrix__LinesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMatrixAccess().getLinesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatrix"


    // $ANTLR start "entryRuleLine"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:123:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:124:1: ( ruleLine EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:125:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_ruleLine_in_entryRuleLine198);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getLineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLine205); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:132:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:136:2: ( ( ( rule__Line__Group__0 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:137:1: ( ( rule__Line__Group__0 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:137:1: ( ( rule__Line__Group__0 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:138:1: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:139:1: ( rule__Line__Group__0 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:139:2: rule__Line__Group__0
            {
            pushFollow(FOLLOW_rule__Line__Group__0_in_ruleLine231);
            rule__Line__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleElement"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:151:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:152:1: ( ruleElement EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:153:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement258);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement265); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:160:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:164:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:165:1: ( ( rule__Element__Alternatives ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:165:1: ( ( rule__Element__Alternatives ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:166:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:167:1: ( rule__Element__Alternatives )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:167:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement291);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleEmpty"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:179:1: entryRuleEmpty : ruleEmpty EOF ;
    public final void entryRuleEmpty() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:180:1: ( ruleEmpty EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:181:1: ruleEmpty EOF
            {
             before(grammarAccess.getEmptyRule()); 
            pushFollow(FOLLOW_ruleEmpty_in_entryRuleEmpty318);
            ruleEmpty();

            state._fsp--;

             after(grammarAccess.getEmptyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmpty325); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmpty"


    // $ANTLR start "ruleEmpty"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:188:1: ruleEmpty : ( ( rule__Empty__Group__0 ) ) ;
    public final void ruleEmpty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:192:2: ( ( ( rule__Empty__Group__0 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:193:1: ( ( rule__Empty__Group__0 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:193:1: ( ( rule__Empty__Group__0 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:194:1: ( rule__Empty__Group__0 )
            {
             before(grammarAccess.getEmptyAccess().getGroup()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:195:1: ( rule__Empty__Group__0 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:195:2: rule__Empty__Group__0
            {
            pushFollow(FOLLOW_rule__Empty__Group__0_in_ruleEmpty351);
            rule__Empty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmptyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmpty"


    // $ANTLR start "entryRuleNumber"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:207:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:208:1: ( ruleNumber EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:209:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber378);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber385); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:216:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:220:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:221:1: ( ( rule__Number__Alternatives ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:221:1: ( ( rule__Number__Alternatives ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:222:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:223:1: ( rule__Number__Alternatives )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:223:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_ruleNumber411);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRulePositiveNumber"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:235:1: entryRulePositiveNumber : rulePositiveNumber EOF ;
    public final void entryRulePositiveNumber() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:236:1: ( rulePositiveNumber EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:237:1: rulePositiveNumber EOF
            {
             before(grammarAccess.getPositiveNumberRule()); 
            pushFollow(FOLLOW_rulePositiveNumber_in_entryRulePositiveNumber438);
            rulePositiveNumber();

            state._fsp--;

             after(grammarAccess.getPositiveNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePositiveNumber445); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePositiveNumber"


    // $ANTLR start "rulePositiveNumber"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:244:1: rulePositiveNumber : ( ( rule__PositiveNumber__Group__0 ) ) ;
    public final void rulePositiveNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:248:2: ( ( ( rule__PositiveNumber__Group__0 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:249:1: ( ( rule__PositiveNumber__Group__0 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:249:1: ( ( rule__PositiveNumber__Group__0 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:250:1: ( rule__PositiveNumber__Group__0 )
            {
             before(grammarAccess.getPositiveNumberAccess().getGroup()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:251:1: ( rule__PositiveNumber__Group__0 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:251:2: rule__PositiveNumber__Group__0
            {
            pushFollow(FOLLOW_rule__PositiveNumber__Group__0_in_rulePositiveNumber471);
            rule__PositiveNumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositiveNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePositiveNumber"


    // $ANTLR start "entryRuleInteger"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:263:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:264:1: ( ruleInteger EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:265:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger498);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger505); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:272:1: ruleInteger : ( ( rule__Integer__ValueAssignment ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:276:2: ( ( ( rule__Integer__ValueAssignment ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:277:1: ( ( rule__Integer__ValueAssignment ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:277:1: ( ( rule__Integer__ValueAssignment ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:278:1: ( rule__Integer__ValueAssignment )
            {
             before(grammarAccess.getIntegerAccess().getValueAssignment()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:279:1: ( rule__Integer__ValueAssignment )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:279:2: rule__Integer__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Integer__ValueAssignment_in_ruleInteger531);
            rule__Integer__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleNegativeNumber"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:291:1: entryRuleNegativeNumber : ruleNegativeNumber EOF ;
    public final void entryRuleNegativeNumber() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:292:1: ( ruleNegativeNumber EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:293:1: ruleNegativeNumber EOF
            {
             before(grammarAccess.getNegativeNumberRule()); 
            pushFollow(FOLLOW_ruleNegativeNumber_in_entryRuleNegativeNumber558);
            ruleNegativeNumber();

            state._fsp--;

             after(grammarAccess.getNegativeNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegativeNumber565); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegativeNumber"


    // $ANTLR start "ruleNegativeNumber"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:300:1: ruleNegativeNumber : ( ( rule__NegativeNumber__Group__0 ) ) ;
    public final void ruleNegativeNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:304:2: ( ( ( rule__NegativeNumber__Group__0 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:305:1: ( ( rule__NegativeNumber__Group__0 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:305:1: ( ( rule__NegativeNumber__Group__0 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:306:1: ( rule__NegativeNumber__Group__0 )
            {
             before(grammarAccess.getNegativeNumberAccess().getGroup()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:307:1: ( rule__NegativeNumber__Group__0 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:307:2: rule__NegativeNumber__Group__0
            {
            pushFollow(FOLLOW_rule__NegativeNumber__Group__0_in_ruleNegativeNumber591);
            rule__NegativeNumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegativeNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegativeNumber"


    // $ANTLR start "entryRuleNInteger"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:319:1: entryRuleNInteger : ruleNInteger EOF ;
    public final void entryRuleNInteger() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:320:1: ( ruleNInteger EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:321:1: ruleNInteger EOF
            {
             before(grammarAccess.getNIntegerRule()); 
            pushFollow(FOLLOW_ruleNInteger_in_entryRuleNInteger618);
            ruleNInteger();

            state._fsp--;

             after(grammarAccess.getNIntegerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNInteger625); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNInteger"


    // $ANTLR start "ruleNInteger"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:328:1: ruleNInteger : ( ( rule__NInteger__ValueAssignment ) ) ;
    public final void ruleNInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:332:2: ( ( ( rule__NInteger__ValueAssignment ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:333:1: ( ( rule__NInteger__ValueAssignment ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:333:1: ( ( rule__NInteger__ValueAssignment ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:334:1: ( rule__NInteger__ValueAssignment )
            {
             before(grammarAccess.getNIntegerAccess().getValueAssignment()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:335:1: ( rule__NInteger__ValueAssignment )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:335:2: rule__NInteger__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NInteger__ValueAssignment_in_ruleNInteger651);
            rule__NInteger__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNIntegerAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNInteger"


    // $ANTLR start "rule__Configuration__Alternatives_2"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:347:1: rule__Configuration__Alternatives_2 : ( ( ( rule__Configuration__Group_2_0__0 ) ) | ( ( rule__Configuration__Group_2_1__0 ) ) );
    public final void rule__Configuration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:351:1: ( ( ( rule__Configuration__Group_2_0__0 ) ) | ( ( rule__Configuration__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:352:1: ( ( rule__Configuration__Group_2_0__0 ) )
                    {
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:352:1: ( ( rule__Configuration__Group_2_0__0 ) )
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:353:1: ( rule__Configuration__Group_2_0__0 )
                    {
                     before(grammarAccess.getConfigurationAccess().getGroup_2_0()); 
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:354:1: ( rule__Configuration__Group_2_0__0 )
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:354:2: rule__Configuration__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Configuration__Group_2_0__0_in_rule__Configuration__Alternatives_2687);
                    rule__Configuration__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConfigurationAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:358:6: ( ( rule__Configuration__Group_2_1__0 ) )
                    {
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:358:6: ( ( rule__Configuration__Group_2_1__0 ) )
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:359:1: ( rule__Configuration__Group_2_1__0 )
                    {
                     before(grammarAccess.getConfigurationAccess().getGroup_2_1()); 
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:360:1: ( rule__Configuration__Group_2_1__0 )
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:360:2: rule__Configuration__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Configuration__Group_2_1__0_in_rule__Configuration__Alternatives_2705);
                    rule__Configuration__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConfigurationAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Alternatives_2"


    // $ANTLR start "rule__Element__Alternatives"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:369:1: rule__Element__Alternatives : ( ( ruleNumber ) | ( ruleEmpty ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:373:1: ( ( ruleNumber ) | ( ruleEmpty ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:374:1: ( ruleNumber )
                    {
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:374:1: ( ruleNumber )
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:375:1: ruleNumber
                    {
                     before(grammarAccess.getElementAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumber_in_rule__Element__Alternatives738);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:380:6: ( ruleEmpty )
                    {
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:380:6: ( ruleEmpty )
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:381:1: ruleEmpty
                    {
                     before(grammarAccess.getElementAccess().getEmptyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEmpty_in_rule__Element__Alternatives755);
                    ruleEmpty();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getEmptyParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Number__Alternatives"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:391:1: rule__Number__Alternatives : ( ( rulePositiveNumber ) | ( ruleNegativeNumber ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:395:1: ( ( rulePositiveNumber ) | ( ruleNegativeNumber ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:396:1: ( rulePositiveNumber )
                    {
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:396:1: ( rulePositiveNumber )
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:397:1: rulePositiveNumber
                    {
                     before(grammarAccess.getNumberAccess().getPositiveNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePositiveNumber_in_rule__Number__Alternatives787);
                    rulePositiveNumber();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getPositiveNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:402:6: ( ruleNegativeNumber )
                    {
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:402:6: ( ruleNegativeNumber )
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:403:1: ruleNegativeNumber
                    {
                     before(grammarAccess.getNumberAccess().getNegativeNumberParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNegativeNumber_in_rule__Number__Alternatives804);
                    ruleNegativeNumber();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getNegativeNumberParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__Configuration__Group__0"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:415:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:419:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:420:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__0834);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__0837);
            rule__Configuration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0"


    // $ANTLR start "rule__Configuration__Group__0__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:427:1: rule__Configuration__Group__0__Impl : ( 'Matriz inicial:' ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:431:1: ( ( 'Matriz inicial:' ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:432:1: ( 'Matriz inicial:' )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:432:1: ( 'Matriz inicial:' )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:433:1: 'Matriz inicial:'
            {
             before(grammarAccess.getConfigurationAccess().getMatrizInicialKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Configuration__Group__0__Impl865); 
             after(grammarAccess.getConfigurationAccess().getMatrizInicialKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0__Impl"


    // $ANTLR start "rule__Configuration__Group__1"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:446:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:450:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:451:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__1896);
            rule__Configuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__1899);
            rule__Configuration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1"


    // $ANTLR start "rule__Configuration__Group__1__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:458:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__InitialAssignment_1 ) ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:462:1: ( ( ( rule__Configuration__InitialAssignment_1 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:463:1: ( ( rule__Configuration__InitialAssignment_1 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:463:1: ( ( rule__Configuration__InitialAssignment_1 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:464:1: ( rule__Configuration__InitialAssignment_1 )
            {
             before(grammarAccess.getConfigurationAccess().getInitialAssignment_1()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:465:1: ( rule__Configuration__InitialAssignment_1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:465:2: rule__Configuration__InitialAssignment_1
            {
            pushFollow(FOLLOW_rule__Configuration__InitialAssignment_1_in_rule__Configuration__Group__1__Impl926);
            rule__Configuration__InitialAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getInitialAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1__Impl"


    // $ANTLR start "rule__Configuration__Group__2"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:475:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:479:1: ( rule__Configuration__Group__2__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:480:2: rule__Configuration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__2956);
            rule__Configuration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2"


    // $ANTLR start "rule__Configuration__Group__2__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:486:1: rule__Configuration__Group__2__Impl : ( ( rule__Configuration__Alternatives_2 )? ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:490:1: ( ( ( rule__Configuration__Alternatives_2 )? ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:491:1: ( ( rule__Configuration__Alternatives_2 )? )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:491:1: ( ( rule__Configuration__Alternatives_2 )? )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:492:1: ( rule__Configuration__Alternatives_2 )?
            {
             before(grammarAccess.getConfigurationAccess().getAlternatives_2()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:493:1: ( rule__Configuration__Alternatives_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=12 && LA5_0<=13)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:493:2: rule__Configuration__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__Configuration__Alternatives_2_in_rule__Configuration__Group__2__Impl983);
                    rule__Configuration__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigurationAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2__Impl"


    // $ANTLR start "rule__Configuration__Group_2_0__0"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:509:1: rule__Configuration__Group_2_0__0 : rule__Configuration__Group_2_0__0__Impl rule__Configuration__Group_2_0__1 ;
    public final void rule__Configuration__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:513:1: ( rule__Configuration__Group_2_0__0__Impl rule__Configuration__Group_2_0__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:514:2: rule__Configuration__Group_2_0__0__Impl rule__Configuration__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group_2_0__0__Impl_in_rule__Configuration__Group_2_0__01020);
            rule__Configuration__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group_2_0__1_in_rule__Configuration__Group_2_0__01023);
            rule__Configuration__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2_0__0"


    // $ANTLR start "rule__Configuration__Group_2_0__0__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:521:1: rule__Configuration__Group_2_0__0__Impl : ( 'Matriz esperada:' ) ;
    public final void rule__Configuration__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:525:1: ( ( 'Matriz esperada:' ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:526:1: ( 'Matriz esperada:' )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:526:1: ( 'Matriz esperada:' )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:527:1: 'Matriz esperada:'
            {
             before(grammarAccess.getConfigurationAccess().getMatrizEsperadaKeyword_2_0_0()); 
            match(input,12,FOLLOW_12_in_rule__Configuration__Group_2_0__0__Impl1051); 
             after(grammarAccess.getConfigurationAccess().getMatrizEsperadaKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2_0__0__Impl"


    // $ANTLR start "rule__Configuration__Group_2_0__1"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:540:1: rule__Configuration__Group_2_0__1 : rule__Configuration__Group_2_0__1__Impl ;
    public final void rule__Configuration__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:544:1: ( rule__Configuration__Group_2_0__1__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:545:2: rule__Configuration__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group_2_0__1__Impl_in_rule__Configuration__Group_2_0__11082);
            rule__Configuration__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2_0__1"


    // $ANTLR start "rule__Configuration__Group_2_0__1__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:551:1: rule__Configuration__Group_2_0__1__Impl : ( ( rule__Configuration__ExpectedAssignment_2_0_1 ) ) ;
    public final void rule__Configuration__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:555:1: ( ( ( rule__Configuration__ExpectedAssignment_2_0_1 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:556:1: ( ( rule__Configuration__ExpectedAssignment_2_0_1 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:556:1: ( ( rule__Configuration__ExpectedAssignment_2_0_1 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:557:1: ( rule__Configuration__ExpectedAssignment_2_0_1 )
            {
             before(grammarAccess.getConfigurationAccess().getExpectedAssignment_2_0_1()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:558:1: ( rule__Configuration__ExpectedAssignment_2_0_1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:558:2: rule__Configuration__ExpectedAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__Configuration__ExpectedAssignment_2_0_1_in_rule__Configuration__Group_2_0__1__Impl1109);
            rule__Configuration__ExpectedAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getExpectedAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2_0__1__Impl"


    // $ANTLR start "rule__Configuration__Group_2_1__0"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:572:1: rule__Configuration__Group_2_1__0 : rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1 ;
    public final void rule__Configuration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:576:1: ( rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:577:2: rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group_2_1__0__Impl_in_rule__Configuration__Group_2_1__01143);
            rule__Configuration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group_2_1__1_in_rule__Configuration__Group_2_1__01146);
            rule__Configuration__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2_1__0"


    // $ANTLR start "rule__Configuration__Group_2_1__0__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:584:1: rule__Configuration__Group_2_1__0__Impl : ( 'Correo esperado:' ) ;
    public final void rule__Configuration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:588:1: ( ( 'Correo esperado:' ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:589:1: ( 'Correo esperado:' )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:589:1: ( 'Correo esperado:' )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:590:1: 'Correo esperado:'
            {
             before(grammarAccess.getConfigurationAccess().getCorreoEsperadoKeyword_2_1_0()); 
            match(input,13,FOLLOW_13_in_rule__Configuration__Group_2_1__0__Impl1174); 
             after(grammarAccess.getConfigurationAccess().getCorreoEsperadoKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2_1__0__Impl"


    // $ANTLR start "rule__Configuration__Group_2_1__1"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:603:1: rule__Configuration__Group_2_1__1 : rule__Configuration__Group_2_1__1__Impl ;
    public final void rule__Configuration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:607:1: ( rule__Configuration__Group_2_1__1__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:608:2: rule__Configuration__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group_2_1__1__Impl_in_rule__Configuration__Group_2_1__11205);
            rule__Configuration__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2_1__1"


    // $ANTLR start "rule__Configuration__Group_2_1__1__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:614:1: rule__Configuration__Group_2_1__1__Impl : ( ( rule__Configuration__MailAssignment_2_1_1 ) ) ;
    public final void rule__Configuration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:618:1: ( ( ( rule__Configuration__MailAssignment_2_1_1 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:619:1: ( ( rule__Configuration__MailAssignment_2_1_1 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:619:1: ( ( rule__Configuration__MailAssignment_2_1_1 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:620:1: ( rule__Configuration__MailAssignment_2_1_1 )
            {
             before(grammarAccess.getConfigurationAccess().getMailAssignment_2_1_1()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:621:1: ( rule__Configuration__MailAssignment_2_1_1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:621:2: rule__Configuration__MailAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Configuration__MailAssignment_2_1_1_in_rule__Configuration__Group_2_1__1__Impl1232);
            rule__Configuration__MailAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getMailAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2_1__1__Impl"


    // $ANTLR start "rule__Line__Group__0"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:635:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:639:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:640:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_rule__Line__Group__0__Impl_in_rule__Line__Group__01266);
            rule__Line__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Line__Group__1_in_rule__Line__Group__01269);
            rule__Line__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__0"


    // $ANTLR start "rule__Line__Group__0__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:647:1: rule__Line__Group__0__Impl : ( ( rule__Line__ElsAssignment_0 ) ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:651:1: ( ( ( rule__Line__ElsAssignment_0 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:652:1: ( ( rule__Line__ElsAssignment_0 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:652:1: ( ( rule__Line__ElsAssignment_0 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:653:1: ( rule__Line__ElsAssignment_0 )
            {
             before(grammarAccess.getLineAccess().getElsAssignment_0()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:654:1: ( rule__Line__ElsAssignment_0 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:654:2: rule__Line__ElsAssignment_0
            {
            pushFollow(FOLLOW_rule__Line__ElsAssignment_0_in_rule__Line__Group__0__Impl1296);
            rule__Line__ElsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getElsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__0__Impl"


    // $ANTLR start "rule__Line__Group__1"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:664:1: rule__Line__Group__1 : rule__Line__Group__1__Impl ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:668:1: ( rule__Line__Group__1__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:669:2: rule__Line__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Line__Group__1__Impl_in_rule__Line__Group__11326);
            rule__Line__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__1"


    // $ANTLR start "rule__Line__Group__1__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:675:1: rule__Line__Group__1__Impl : ( ( rule__Line__Group_1__0 )* ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:679:1: ( ( ( rule__Line__Group_1__0 )* ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:680:1: ( ( rule__Line__Group_1__0 )* )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:680:1: ( ( rule__Line__Group_1__0 )* )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:681:1: ( rule__Line__Group_1__0 )*
            {
             before(grammarAccess.getLineAccess().getGroup_1()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:682:1: ( rule__Line__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:682:2: rule__Line__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Line__Group_1__0_in_rule__Line__Group__1__Impl1353);
            	    rule__Line__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getLineAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__1__Impl"


    // $ANTLR start "rule__Line__Group_1__0"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:696:1: rule__Line__Group_1__0 : rule__Line__Group_1__0__Impl rule__Line__Group_1__1 ;
    public final void rule__Line__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:700:1: ( rule__Line__Group_1__0__Impl rule__Line__Group_1__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:701:2: rule__Line__Group_1__0__Impl rule__Line__Group_1__1
            {
            pushFollow(FOLLOW_rule__Line__Group_1__0__Impl_in_rule__Line__Group_1__01388);
            rule__Line__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Line__Group_1__1_in_rule__Line__Group_1__01391);
            rule__Line__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_1__0"


    // $ANTLR start "rule__Line__Group_1__0__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:708:1: rule__Line__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Line__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:712:1: ( ( ',' ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:713:1: ( ',' )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:713:1: ( ',' )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:714:1: ','
            {
             before(grammarAccess.getLineAccess().getCommaKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__Line__Group_1__0__Impl1419); 
             after(grammarAccess.getLineAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_1__0__Impl"


    // $ANTLR start "rule__Line__Group_1__1"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:727:1: rule__Line__Group_1__1 : rule__Line__Group_1__1__Impl ;
    public final void rule__Line__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:731:1: ( rule__Line__Group_1__1__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:732:2: rule__Line__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Line__Group_1__1__Impl_in_rule__Line__Group_1__11450);
            rule__Line__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_1__1"


    // $ANTLR start "rule__Line__Group_1__1__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:738:1: rule__Line__Group_1__1__Impl : ( ( rule__Line__ElsAssignment_1_1 ) ) ;
    public final void rule__Line__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:742:1: ( ( ( rule__Line__ElsAssignment_1_1 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:743:1: ( ( rule__Line__ElsAssignment_1_1 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:743:1: ( ( rule__Line__ElsAssignment_1_1 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:744:1: ( rule__Line__ElsAssignment_1_1 )
            {
             before(grammarAccess.getLineAccess().getElsAssignment_1_1()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:745:1: ( rule__Line__ElsAssignment_1_1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:745:2: rule__Line__ElsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Line__ElsAssignment_1_1_in_rule__Line__Group_1__1__Impl1477);
            rule__Line__ElsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getElsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_1__1__Impl"


    // $ANTLR start "rule__Empty__Group__0"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:759:1: rule__Empty__Group__0 : rule__Empty__Group__0__Impl rule__Empty__Group__1 ;
    public final void rule__Empty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:763:1: ( rule__Empty__Group__0__Impl rule__Empty__Group__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:764:2: rule__Empty__Group__0__Impl rule__Empty__Group__1
            {
            pushFollow(FOLLOW_rule__Empty__Group__0__Impl_in_rule__Empty__Group__01511);
            rule__Empty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Empty__Group__1_in_rule__Empty__Group__01514);
            rule__Empty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empty__Group__0"


    // $ANTLR start "rule__Empty__Group__0__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:771:1: rule__Empty__Group__0__Impl : ( () ) ;
    public final void rule__Empty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:775:1: ( ( () ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:776:1: ( () )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:776:1: ( () )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:777:1: ()
            {
             before(grammarAccess.getEmptyAccess().getEmptyAction_0()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:778:1: ()
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:780:1: 
            {
            }

             after(grammarAccess.getEmptyAccess().getEmptyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empty__Group__0__Impl"


    // $ANTLR start "rule__Empty__Group__1"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:790:1: rule__Empty__Group__1 : rule__Empty__Group__1__Impl ;
    public final void rule__Empty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:794:1: ( rule__Empty__Group__1__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:795:2: rule__Empty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Empty__Group__1__Impl_in_rule__Empty__Group__11572);
            rule__Empty__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empty__Group__1"


    // $ANTLR start "rule__Empty__Group__1__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:801:1: rule__Empty__Group__1__Impl : ( '_' ) ;
    public final void rule__Empty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:805:1: ( ( '_' ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:806:1: ( '_' )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:806:1: ( '_' )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:807:1: '_'
            {
             before(grammarAccess.getEmptyAccess().get_Keyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Empty__Group__1__Impl1600); 
             after(grammarAccess.getEmptyAccess().get_Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Empty__Group__1__Impl"


    // $ANTLR start "rule__PositiveNumber__Group__0"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:824:1: rule__PositiveNumber__Group__0 : rule__PositiveNumber__Group__0__Impl rule__PositiveNumber__Group__1 ;
    public final void rule__PositiveNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:828:1: ( rule__PositiveNumber__Group__0__Impl rule__PositiveNumber__Group__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:829:2: rule__PositiveNumber__Group__0__Impl rule__PositiveNumber__Group__1
            {
            pushFollow(FOLLOW_rule__PositiveNumber__Group__0__Impl_in_rule__PositiveNumber__Group__01635);
            rule__PositiveNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PositiveNumber__Group__1_in_rule__PositiveNumber__Group__01638);
            rule__PositiveNumber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveNumber__Group__0"


    // $ANTLR start "rule__PositiveNumber__Group__0__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:836:1: rule__PositiveNumber__Group__0__Impl : ( ruleInteger ) ;
    public final void rule__PositiveNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:840:1: ( ( ruleInteger ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:841:1: ( ruleInteger )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:841:1: ( ruleInteger )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:842:1: ruleInteger
            {
             before(grammarAccess.getPositiveNumberAccess().getIntegerParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleInteger_in_rule__PositiveNumber__Group__0__Impl1665);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getPositiveNumberAccess().getIntegerParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveNumber__Group__0__Impl"


    // $ANTLR start "rule__PositiveNumber__Group__1"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:853:1: rule__PositiveNumber__Group__1 : rule__PositiveNumber__Group__1__Impl ;
    public final void rule__PositiveNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:857:1: ( rule__PositiveNumber__Group__1__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:858:2: rule__PositiveNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PositiveNumber__Group__1__Impl_in_rule__PositiveNumber__Group__11694);
            rule__PositiveNumber__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveNumber__Group__1"


    // $ANTLR start "rule__PositiveNumber__Group__1__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:864:1: rule__PositiveNumber__Group__1__Impl : ( ( rule__PositiveNumber__Group_1__0 )? ) ;
    public final void rule__PositiveNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:868:1: ( ( ( rule__PositiveNumber__Group_1__0 )? ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:869:1: ( ( rule__PositiveNumber__Group_1__0 )? )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:869:1: ( ( rule__PositiveNumber__Group_1__0 )? )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:870:1: ( rule__PositiveNumber__Group_1__0 )?
            {
             before(grammarAccess.getPositiveNumberAccess().getGroup_1()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:871:1: ( rule__PositiveNumber__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:871:2: rule__PositiveNumber__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PositiveNumber__Group_1__0_in_rule__PositiveNumber__Group__1__Impl1721);
                    rule__PositiveNumber__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPositiveNumberAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveNumber__Group__1__Impl"


    // $ANTLR start "rule__PositiveNumber__Group_1__0"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:885:1: rule__PositiveNumber__Group_1__0 : rule__PositiveNumber__Group_1__0__Impl rule__PositiveNumber__Group_1__1 ;
    public final void rule__PositiveNumber__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:889:1: ( rule__PositiveNumber__Group_1__0__Impl rule__PositiveNumber__Group_1__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:890:2: rule__PositiveNumber__Group_1__0__Impl rule__PositiveNumber__Group_1__1
            {
            pushFollow(FOLLOW_rule__PositiveNumber__Group_1__0__Impl_in_rule__PositiveNumber__Group_1__01756);
            rule__PositiveNumber__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PositiveNumber__Group_1__1_in_rule__PositiveNumber__Group_1__01759);
            rule__PositiveNumber__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveNumber__Group_1__0"


    // $ANTLR start "rule__PositiveNumber__Group_1__0__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:897:1: rule__PositiveNumber__Group_1__0__Impl : ( () ) ;
    public final void rule__PositiveNumber__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:901:1: ( ( () ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:902:1: ( () )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:902:1: ( () )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:903:1: ()
            {
             before(grammarAccess.getPositiveNumberAccess().getFractionNumeratorAction_1_0()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:904:1: ()
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:906:1: 
            {
            }

             after(grammarAccess.getPositiveNumberAccess().getFractionNumeratorAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveNumber__Group_1__0__Impl"


    // $ANTLR start "rule__PositiveNumber__Group_1__1"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:916:1: rule__PositiveNumber__Group_1__1 : rule__PositiveNumber__Group_1__1__Impl rule__PositiveNumber__Group_1__2 ;
    public final void rule__PositiveNumber__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:920:1: ( rule__PositiveNumber__Group_1__1__Impl rule__PositiveNumber__Group_1__2 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:921:2: rule__PositiveNumber__Group_1__1__Impl rule__PositiveNumber__Group_1__2
            {
            pushFollow(FOLLOW_rule__PositiveNumber__Group_1__1__Impl_in_rule__PositiveNumber__Group_1__11817);
            rule__PositiveNumber__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PositiveNumber__Group_1__2_in_rule__PositiveNumber__Group_1__11820);
            rule__PositiveNumber__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveNumber__Group_1__1"


    // $ANTLR start "rule__PositiveNumber__Group_1__1__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:928:1: rule__PositiveNumber__Group_1__1__Impl : ( '/' ) ;
    public final void rule__PositiveNumber__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:932:1: ( ( '/' ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:933:1: ( '/' )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:933:1: ( '/' )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:934:1: '/'
            {
             before(grammarAccess.getPositiveNumberAccess().getSolidusKeyword_1_1()); 
            match(input,16,FOLLOW_16_in_rule__PositiveNumber__Group_1__1__Impl1848); 
             after(grammarAccess.getPositiveNumberAccess().getSolidusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveNumber__Group_1__1__Impl"


    // $ANTLR start "rule__PositiveNumber__Group_1__2"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:947:1: rule__PositiveNumber__Group_1__2 : rule__PositiveNumber__Group_1__2__Impl ;
    public final void rule__PositiveNumber__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:951:1: ( rule__PositiveNumber__Group_1__2__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:952:2: rule__PositiveNumber__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PositiveNumber__Group_1__2__Impl_in_rule__PositiveNumber__Group_1__21879);
            rule__PositiveNumber__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveNumber__Group_1__2"


    // $ANTLR start "rule__PositiveNumber__Group_1__2__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:958:1: rule__PositiveNumber__Group_1__2__Impl : ( ( rule__PositiveNumber__DenominatorAssignment_1_2 ) ) ;
    public final void rule__PositiveNumber__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:962:1: ( ( ( rule__PositiveNumber__DenominatorAssignment_1_2 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:963:1: ( ( rule__PositiveNumber__DenominatorAssignment_1_2 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:963:1: ( ( rule__PositiveNumber__DenominatorAssignment_1_2 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:964:1: ( rule__PositiveNumber__DenominatorAssignment_1_2 )
            {
             before(grammarAccess.getPositiveNumberAccess().getDenominatorAssignment_1_2()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:965:1: ( rule__PositiveNumber__DenominatorAssignment_1_2 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:965:2: rule__PositiveNumber__DenominatorAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PositiveNumber__DenominatorAssignment_1_2_in_rule__PositiveNumber__Group_1__2__Impl1906);
            rule__PositiveNumber__DenominatorAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPositiveNumberAccess().getDenominatorAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveNumber__Group_1__2__Impl"


    // $ANTLR start "rule__NegativeNumber__Group__0"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:981:1: rule__NegativeNumber__Group__0 : rule__NegativeNumber__Group__0__Impl rule__NegativeNumber__Group__1 ;
    public final void rule__NegativeNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:985:1: ( rule__NegativeNumber__Group__0__Impl rule__NegativeNumber__Group__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:986:2: rule__NegativeNumber__Group__0__Impl rule__NegativeNumber__Group__1
            {
            pushFollow(FOLLOW_rule__NegativeNumber__Group__0__Impl_in_rule__NegativeNumber__Group__01942);
            rule__NegativeNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NegativeNumber__Group__1_in_rule__NegativeNumber__Group__01945);
            rule__NegativeNumber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeNumber__Group__0"


    // $ANTLR start "rule__NegativeNumber__Group__0__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:993:1: rule__NegativeNumber__Group__0__Impl : ( '-' ) ;
    public final void rule__NegativeNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:997:1: ( ( '-' ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:998:1: ( '-' )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:998:1: ( '-' )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:999:1: '-'
            {
             before(grammarAccess.getNegativeNumberAccess().getHyphenMinusKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__NegativeNumber__Group__0__Impl1973); 
             after(grammarAccess.getNegativeNumberAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeNumber__Group__0__Impl"


    // $ANTLR start "rule__NegativeNumber__Group__1"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1012:1: rule__NegativeNumber__Group__1 : rule__NegativeNumber__Group__1__Impl rule__NegativeNumber__Group__2 ;
    public final void rule__NegativeNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1016:1: ( rule__NegativeNumber__Group__1__Impl rule__NegativeNumber__Group__2 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1017:2: rule__NegativeNumber__Group__1__Impl rule__NegativeNumber__Group__2
            {
            pushFollow(FOLLOW_rule__NegativeNumber__Group__1__Impl_in_rule__NegativeNumber__Group__12004);
            rule__NegativeNumber__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NegativeNumber__Group__2_in_rule__NegativeNumber__Group__12007);
            rule__NegativeNumber__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeNumber__Group__1"


    // $ANTLR start "rule__NegativeNumber__Group__1__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1024:1: rule__NegativeNumber__Group__1__Impl : ( ruleNInteger ) ;
    public final void rule__NegativeNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1028:1: ( ( ruleNInteger ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1029:1: ( ruleNInteger )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1029:1: ( ruleNInteger )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1030:1: ruleNInteger
            {
             before(grammarAccess.getNegativeNumberAccess().getNIntegerParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleNInteger_in_rule__NegativeNumber__Group__1__Impl2034);
            ruleNInteger();

            state._fsp--;

             after(grammarAccess.getNegativeNumberAccess().getNIntegerParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeNumber__Group__1__Impl"


    // $ANTLR start "rule__NegativeNumber__Group__2"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1041:1: rule__NegativeNumber__Group__2 : rule__NegativeNumber__Group__2__Impl ;
    public final void rule__NegativeNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1045:1: ( rule__NegativeNumber__Group__2__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1046:2: rule__NegativeNumber__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NegativeNumber__Group__2__Impl_in_rule__NegativeNumber__Group__22063);
            rule__NegativeNumber__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeNumber__Group__2"


    // $ANTLR start "rule__NegativeNumber__Group__2__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1052:1: rule__NegativeNumber__Group__2__Impl : ( ( rule__NegativeNumber__Group_2__0 )? ) ;
    public final void rule__NegativeNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1056:1: ( ( ( rule__NegativeNumber__Group_2__0 )? ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1057:1: ( ( rule__NegativeNumber__Group_2__0 )? )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1057:1: ( ( rule__NegativeNumber__Group_2__0 )? )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1058:1: ( rule__NegativeNumber__Group_2__0 )?
            {
             before(grammarAccess.getNegativeNumberAccess().getGroup_2()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1059:1: ( rule__NegativeNumber__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1059:2: rule__NegativeNumber__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NegativeNumber__Group_2__0_in_rule__NegativeNumber__Group__2__Impl2090);
                    rule__NegativeNumber__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNegativeNumberAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeNumber__Group__2__Impl"


    // $ANTLR start "rule__NegativeNumber__Group_2__0"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1075:1: rule__NegativeNumber__Group_2__0 : rule__NegativeNumber__Group_2__0__Impl rule__NegativeNumber__Group_2__1 ;
    public final void rule__NegativeNumber__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1079:1: ( rule__NegativeNumber__Group_2__0__Impl rule__NegativeNumber__Group_2__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1080:2: rule__NegativeNumber__Group_2__0__Impl rule__NegativeNumber__Group_2__1
            {
            pushFollow(FOLLOW_rule__NegativeNumber__Group_2__0__Impl_in_rule__NegativeNumber__Group_2__02127);
            rule__NegativeNumber__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NegativeNumber__Group_2__1_in_rule__NegativeNumber__Group_2__02130);
            rule__NegativeNumber__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeNumber__Group_2__0"


    // $ANTLR start "rule__NegativeNumber__Group_2__0__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1087:1: rule__NegativeNumber__Group_2__0__Impl : ( () ) ;
    public final void rule__NegativeNumber__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1091:1: ( ( () ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1092:1: ( () )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1092:1: ( () )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1093:1: ()
            {
             before(grammarAccess.getNegativeNumberAccess().getNFractionNumeratorAction_2_0()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1094:1: ()
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1096:1: 
            {
            }

             after(grammarAccess.getNegativeNumberAccess().getNFractionNumeratorAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeNumber__Group_2__0__Impl"


    // $ANTLR start "rule__NegativeNumber__Group_2__1"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1106:1: rule__NegativeNumber__Group_2__1 : rule__NegativeNumber__Group_2__1__Impl rule__NegativeNumber__Group_2__2 ;
    public final void rule__NegativeNumber__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1110:1: ( rule__NegativeNumber__Group_2__1__Impl rule__NegativeNumber__Group_2__2 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1111:2: rule__NegativeNumber__Group_2__1__Impl rule__NegativeNumber__Group_2__2
            {
            pushFollow(FOLLOW_rule__NegativeNumber__Group_2__1__Impl_in_rule__NegativeNumber__Group_2__12188);
            rule__NegativeNumber__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NegativeNumber__Group_2__2_in_rule__NegativeNumber__Group_2__12191);
            rule__NegativeNumber__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeNumber__Group_2__1"


    // $ANTLR start "rule__NegativeNumber__Group_2__1__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1118:1: rule__NegativeNumber__Group_2__1__Impl : ( '/' ) ;
    public final void rule__NegativeNumber__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1122:1: ( ( '/' ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1123:1: ( '/' )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1123:1: ( '/' )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1124:1: '/'
            {
             before(grammarAccess.getNegativeNumberAccess().getSolidusKeyword_2_1()); 
            match(input,16,FOLLOW_16_in_rule__NegativeNumber__Group_2__1__Impl2219); 
             after(grammarAccess.getNegativeNumberAccess().getSolidusKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeNumber__Group_2__1__Impl"


    // $ANTLR start "rule__NegativeNumber__Group_2__2"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1137:1: rule__NegativeNumber__Group_2__2 : rule__NegativeNumber__Group_2__2__Impl ;
    public final void rule__NegativeNumber__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1141:1: ( rule__NegativeNumber__Group_2__2__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1142:2: rule__NegativeNumber__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__NegativeNumber__Group_2__2__Impl_in_rule__NegativeNumber__Group_2__22250);
            rule__NegativeNumber__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeNumber__Group_2__2"


    // $ANTLR start "rule__NegativeNumber__Group_2__2__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1148:1: rule__NegativeNumber__Group_2__2__Impl : ( ( rule__NegativeNumber__DenominatorAssignment_2_2 ) ) ;
    public final void rule__NegativeNumber__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1152:1: ( ( ( rule__NegativeNumber__DenominatorAssignment_2_2 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1153:1: ( ( rule__NegativeNumber__DenominatorAssignment_2_2 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1153:1: ( ( rule__NegativeNumber__DenominatorAssignment_2_2 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1154:1: ( rule__NegativeNumber__DenominatorAssignment_2_2 )
            {
             before(grammarAccess.getNegativeNumberAccess().getDenominatorAssignment_2_2()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1155:1: ( rule__NegativeNumber__DenominatorAssignment_2_2 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1155:2: rule__NegativeNumber__DenominatorAssignment_2_2
            {
            pushFollow(FOLLOW_rule__NegativeNumber__DenominatorAssignment_2_2_in_rule__NegativeNumber__Group_2__2__Impl2277);
            rule__NegativeNumber__DenominatorAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getNegativeNumberAccess().getDenominatorAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeNumber__Group_2__2__Impl"


    // $ANTLR start "rule__Configuration__InitialAssignment_1"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1172:1: rule__Configuration__InitialAssignment_1 : ( ruleMatrix ) ;
    public final void rule__Configuration__InitialAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1176:1: ( ( ruleMatrix ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1177:1: ( ruleMatrix )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1177:1: ( ruleMatrix )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1178:1: ruleMatrix
            {
             before(grammarAccess.getConfigurationAccess().getInitialMatrixParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__Configuration__InitialAssignment_12318);
            ruleMatrix();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getInitialMatrixParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__InitialAssignment_1"


    // $ANTLR start "rule__Configuration__ExpectedAssignment_2_0_1"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1187:1: rule__Configuration__ExpectedAssignment_2_0_1 : ( ruleMatrix ) ;
    public final void rule__Configuration__ExpectedAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1191:1: ( ( ruleMatrix ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1192:1: ( ruleMatrix )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1192:1: ( ruleMatrix )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1193:1: ruleMatrix
            {
             before(grammarAccess.getConfigurationAccess().getExpectedMatrixParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__Configuration__ExpectedAssignment_2_0_12349);
            ruleMatrix();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getExpectedMatrixParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__ExpectedAssignment_2_0_1"


    // $ANTLR start "rule__Configuration__MailAssignment_2_1_1"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1202:1: rule__Configuration__MailAssignment_2_1_1 : ( ruleNumber ) ;
    public final void rule__Configuration__MailAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1206:1: ( ( ruleNumber ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1207:1: ( ruleNumber )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1207:1: ( ruleNumber )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1208:1: ruleNumber
            {
             before(grammarAccess.getConfigurationAccess().getMailNumberParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__Configuration__MailAssignment_2_1_12380);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getMailNumberParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__MailAssignment_2_1_1"


    // $ANTLR start "rule__Matrix__LinesAssignment"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1217:1: rule__Matrix__LinesAssignment : ( ruleLine ) ;
    public final void rule__Matrix__LinesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1221:1: ( ( ruleLine ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1222:1: ( ruleLine )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1222:1: ( ruleLine )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1223:1: ruleLine
            {
             before(grammarAccess.getMatrixAccess().getLinesLineParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleLine_in_rule__Matrix__LinesAssignment2411);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getMatrixAccess().getLinesLineParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__LinesAssignment"


    // $ANTLR start "rule__Line__ElsAssignment_0"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1232:1: rule__Line__ElsAssignment_0 : ( ruleElement ) ;
    public final void rule__Line__ElsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1236:1: ( ( ruleElement ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1237:1: ( ruleElement )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1237:1: ( ruleElement )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1238:1: ruleElement
            {
             before(grammarAccess.getLineAccess().getElsElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Line__ElsAssignment_02442);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getLineAccess().getElsElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__ElsAssignment_0"


    // $ANTLR start "rule__Line__ElsAssignment_1_1"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1247:1: rule__Line__ElsAssignment_1_1 : ( ruleElement ) ;
    public final void rule__Line__ElsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1251:1: ( ( ruleElement ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1252:1: ( ruleElement )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1252:1: ( ruleElement )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1253:1: ruleElement
            {
             before(grammarAccess.getLineAccess().getElsElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Line__ElsAssignment_1_12473);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getLineAccess().getElsElementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__ElsAssignment_1_1"


    // $ANTLR start "rule__PositiveNumber__DenominatorAssignment_1_2"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1262:1: rule__PositiveNumber__DenominatorAssignment_1_2 : ( ruleInteger ) ;
    public final void rule__PositiveNumber__DenominatorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1266:1: ( ( ruleInteger ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1267:1: ( ruleInteger )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1267:1: ( ruleInteger )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1268:1: ruleInteger
            {
             before(grammarAccess.getPositiveNumberAccess().getDenominatorIntegerParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleInteger_in_rule__PositiveNumber__DenominatorAssignment_1_22504);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getPositiveNumberAccess().getDenominatorIntegerParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositiveNumber__DenominatorAssignment_1_2"


    // $ANTLR start "rule__Integer__ValueAssignment"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1277:1: rule__Integer__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Integer__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1281:1: ( ( RULE_INT ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1282:1: ( RULE_INT )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1282:1: ( RULE_INT )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1283:1: RULE_INT
            {
             before(grammarAccess.getIntegerAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Integer__ValueAssignment2535); 
             after(grammarAccess.getIntegerAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__ValueAssignment"


    // $ANTLR start "rule__NegativeNumber__DenominatorAssignment_2_2"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1292:1: rule__NegativeNumber__DenominatorAssignment_2_2 : ( ruleNInteger ) ;
    public final void rule__NegativeNumber__DenominatorAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1296:1: ( ( ruleNInteger ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1297:1: ( ruleNInteger )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1297:1: ( ruleNInteger )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1298:1: ruleNInteger
            {
             before(grammarAccess.getNegativeNumberAccess().getDenominatorNIntegerParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleNInteger_in_rule__NegativeNumber__DenominatorAssignment_2_22566);
            ruleNInteger();

            state._fsp--;

             after(grammarAccess.getNegativeNumberAccess().getDenominatorNIntegerParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeNumber__DenominatorAssignment_2_2"


    // $ANTLR start "rule__NInteger__ValueAssignment"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1307:1: rule__NInteger__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NInteger__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1311:1: ( ( RULE_INT ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1312:1: ( RULE_INT )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1312:1: ( RULE_INT )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1313:1: RULE_INT
            {
             before(grammarAccess.getNIntegerAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NInteger__ValueAssignment2597); 
             after(grammarAccess.getNIntegerAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NInteger__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleConfiguration_in_entryRuleConfiguration61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfiguration68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0_in_ruleConfiguration94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_entryRuleMatrix121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__LinesAssignment_in_ruleMatrix156 = new BitSet(new long[]{0x0000000000028012L});
    public static final BitSet FOLLOW_rule__Matrix__LinesAssignment_in_ruleMatrix168 = new BitSet(new long[]{0x0000000000028012L});
    public static final BitSet FOLLOW_ruleLine_in_entryRuleLine198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLine205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__Group__0_in_ruleLine231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmpty_in_entryRuleEmpty318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmpty325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Empty__Group__0_in_ruleEmpty351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositiveNumber_in_entryRulePositiveNumber438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePositiveNumber445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group__0_in_rulePositiveNumber471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__ValueAssignment_in_ruleInteger531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegativeNumber_in_entryRuleNegativeNumber558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegativeNumber565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeNumber__Group__0_in_ruleNegativeNumber591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNInteger_in_entryRuleNInteger618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNInteger625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NInteger__ValueAssignment_in_ruleNInteger651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_2_0__0_in_rule__Configuration__Alternatives_2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_2_1__0_in_rule__Configuration__Alternatives_2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Element__Alternatives738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmpty_in_rule__Element__Alternatives755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositiveNumber_in_rule__Number__Alternatives787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegativeNumber_in_rule__Number__Alternatives804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__0834 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__0837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Configuration__Group__0__Impl865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__1896 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__InitialAssignment_1_in_rule__Configuration__Group__1__Impl926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Alternatives_2_in_rule__Configuration__Group__2__Impl983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_2_0__0__Impl_in_rule__Configuration__Group_2_0__01020 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_rule__Configuration__Group_2_0__1_in_rule__Configuration__Group_2_0__01023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Configuration__Group_2_0__0__Impl1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_2_0__1__Impl_in_rule__Configuration__Group_2_0__11082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__ExpectedAssignment_2_0_1_in_rule__Configuration__Group_2_0__1__Impl1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_2_1__0__Impl_in_rule__Configuration__Group_2_1__01143 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Configuration__Group_2_1__1_in_rule__Configuration__Group_2_1__01146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Configuration__Group_2_1__0__Impl1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_2_1__1__Impl_in_rule__Configuration__Group_2_1__11205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__MailAssignment_2_1_1_in_rule__Configuration__Group_2_1__1__Impl1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__Group__0__Impl_in_rule__Line__Group__01266 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Line__Group__1_in_rule__Line__Group__01269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__ElsAssignment_0_in_rule__Line__Group__0__Impl1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__Group__1__Impl_in_rule__Line__Group__11326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__Group_1__0_in_rule__Line__Group__1__Impl1353 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Line__Group_1__0__Impl_in_rule__Line__Group_1__01388 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_rule__Line__Group_1__1_in_rule__Line__Group_1__01391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Line__Group_1__0__Impl1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__Group_1__1__Impl_in_rule__Line__Group_1__11450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__ElsAssignment_1_1_in_rule__Line__Group_1__1__Impl1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Empty__Group__0__Impl_in_rule__Empty__Group__01511 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_rule__Empty__Group__1_in_rule__Empty__Group__01514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Empty__Group__1__Impl_in_rule__Empty__Group__11572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Empty__Group__1__Impl1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group__0__Impl_in_rule__PositiveNumber__Group__01635 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group__1_in_rule__PositiveNumber__Group__01638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__PositiveNumber__Group__0__Impl1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group__1__Impl_in_rule__PositiveNumber__Group__11694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group_1__0_in_rule__PositiveNumber__Group__1__Impl1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group_1__0__Impl_in_rule__PositiveNumber__Group_1__01756 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group_1__1_in_rule__PositiveNumber__Group_1__01759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group_1__1__Impl_in_rule__PositiveNumber__Group_1__11817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group_1__2_in_rule__PositiveNumber__Group_1__11820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PositiveNumber__Group_1__1__Impl1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group_1__2__Impl_in_rule__PositiveNumber__Group_1__21879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositiveNumber__DenominatorAssignment_1_2_in_rule__PositiveNumber__Group_1__2__Impl1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeNumber__Group__0__Impl_in_rule__NegativeNumber__Group__01942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NegativeNumber__Group__1_in_rule__NegativeNumber__Group__01945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NegativeNumber__Group__0__Impl1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeNumber__Group__1__Impl_in_rule__NegativeNumber__Group__12004 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__NegativeNumber__Group__2_in_rule__NegativeNumber__Group__12007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNInteger_in_rule__NegativeNumber__Group__1__Impl2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeNumber__Group__2__Impl_in_rule__NegativeNumber__Group__22063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeNumber__Group_2__0_in_rule__NegativeNumber__Group__2__Impl2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeNumber__Group_2__0__Impl_in_rule__NegativeNumber__Group_2__02127 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__NegativeNumber__Group_2__1_in_rule__NegativeNumber__Group_2__02130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeNumber__Group_2__1__Impl_in_rule__NegativeNumber__Group_2__12188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NegativeNumber__Group_2__2_in_rule__NegativeNumber__Group_2__12191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NegativeNumber__Group_2__1__Impl2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeNumber__Group_2__2__Impl_in_rule__NegativeNumber__Group_2__22250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeNumber__DenominatorAssignment_2_2_in_rule__NegativeNumber__Group_2__2__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__Configuration__InitialAssignment_12318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__Configuration__ExpectedAssignment_2_0_12349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Configuration__MailAssignment_2_1_12380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_rule__Matrix__LinesAssignment2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Line__ElsAssignment_02442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Line__ElsAssignment_1_12473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__PositiveNumber__DenominatorAssignment_1_22504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Integer__ValueAssignment2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNInteger_in_rule__NegativeNumber__DenominatorAssignment_2_22566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NInteger__ValueAssignment2597 = new BitSet(new long[]{0x0000000000000002L});

}