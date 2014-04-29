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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Matriz inicial:'", "'Matriz esperada: '", "'Correo esperado: '", "'x'", "','", "'_'", "'/'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:97:1: ruleMatrix : ( ( rule__Matrix__Group__0 ) ) ;
    public final void ruleMatrix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:101:2: ( ( ( rule__Matrix__Group__0 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:102:1: ( ( rule__Matrix__Group__0 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:102:1: ( ( rule__Matrix__Group__0 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:103:1: ( rule__Matrix__Group__0 )
            {
             before(grammarAccess.getMatrixAccess().getGroup()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:104:1: ( rule__Matrix__Group__0 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:104:2: rule__Matrix__Group__0
            {
            pushFollow(FOLLOW_rule__Matrix__Group__0_in_ruleMatrix154);
            rule__Matrix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixAccess().getGroup()); 

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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:116:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:117:1: ( ruleLine EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:118:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_ruleLine_in_entryRuleLine181);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getLineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLine188); 

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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:125:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:129:2: ( ( ( rule__Line__Group__0 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:130:1: ( ( rule__Line__Group__0 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:130:1: ( ( rule__Line__Group__0 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:131:1: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:132:1: ( rule__Line__Group__0 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:132:2: rule__Line__Group__0
            {
            pushFollow(FOLLOW_rule__Line__Group__0_in_ruleLine214);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:144:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:145:1: ( ruleElement EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:146:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement241);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement248); 

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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:153:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:157:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:158:1: ( ( rule__Element__Alternatives ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:158:1: ( ( rule__Element__Alternatives ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:159:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:160:1: ( rule__Element__Alternatives )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:160:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement274);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:172:1: entryRuleEmpty : ruleEmpty EOF ;
    public final void entryRuleEmpty() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:173:1: ( ruleEmpty EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:174:1: ruleEmpty EOF
            {
             before(grammarAccess.getEmptyRule()); 
            pushFollow(FOLLOW_ruleEmpty_in_entryRuleEmpty301);
            ruleEmpty();

            state._fsp--;

             after(grammarAccess.getEmptyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmpty308); 

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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:181:1: ruleEmpty : ( ( rule__Empty__Group__0 ) ) ;
    public final void ruleEmpty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:185:2: ( ( ( rule__Empty__Group__0 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:186:1: ( ( rule__Empty__Group__0 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:186:1: ( ( rule__Empty__Group__0 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:187:1: ( rule__Empty__Group__0 )
            {
             before(grammarAccess.getEmptyAccess().getGroup()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:188:1: ( rule__Empty__Group__0 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:188:2: rule__Empty__Group__0
            {
            pushFollow(FOLLOW_rule__Empty__Group__0_in_ruleEmpty334);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:200:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:201:1: ( ruleNumber EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:202:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber361);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber368); 

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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:209:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:213:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:214:1: ( ( rule__Number__Alternatives ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:214:1: ( ( rule__Number__Alternatives ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:215:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:216:1: ( rule__Number__Alternatives )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:216:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_ruleNumber394);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:228:1: entryRulePositiveNumber : rulePositiveNumber EOF ;
    public final void entryRulePositiveNumber() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:229:1: ( rulePositiveNumber EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:230:1: rulePositiveNumber EOF
            {
             before(grammarAccess.getPositiveNumberRule()); 
            pushFollow(FOLLOW_rulePositiveNumber_in_entryRulePositiveNumber421);
            rulePositiveNumber();

            state._fsp--;

             after(grammarAccess.getPositiveNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePositiveNumber428); 

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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:237:1: rulePositiveNumber : ( ( rule__PositiveNumber__Group__0 ) ) ;
    public final void rulePositiveNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:241:2: ( ( ( rule__PositiveNumber__Group__0 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:242:1: ( ( rule__PositiveNumber__Group__0 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:242:1: ( ( rule__PositiveNumber__Group__0 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:243:1: ( rule__PositiveNumber__Group__0 )
            {
             before(grammarAccess.getPositiveNumberAccess().getGroup()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:244:1: ( rule__PositiveNumber__Group__0 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:244:2: rule__PositiveNumber__Group__0
            {
            pushFollow(FOLLOW_rule__PositiveNumber__Group__0_in_rulePositiveNumber454);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:256:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:257:1: ( ruleInteger EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:258:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger481);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger488); 

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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:265:1: ruleInteger : ( ( rule__Integer__ValueAssignment ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:269:2: ( ( ( rule__Integer__ValueAssignment ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:270:1: ( ( rule__Integer__ValueAssignment ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:270:1: ( ( rule__Integer__ValueAssignment ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:271:1: ( rule__Integer__ValueAssignment )
            {
             before(grammarAccess.getIntegerAccess().getValueAssignment()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:272:1: ( rule__Integer__ValueAssignment )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:272:2: rule__Integer__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Integer__ValueAssignment_in_ruleInteger514);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:284:1: entryRuleNegativeNumber : ruleNegativeNumber EOF ;
    public final void entryRuleNegativeNumber() throws RecognitionException {
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:285:1: ( ruleNegativeNumber EOF )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:286:1: ruleNegativeNumber EOF
            {
             before(grammarAccess.getNegativeNumberRule()); 
            pushFollow(FOLLOW_ruleNegativeNumber_in_entryRuleNegativeNumber541);
            ruleNegativeNumber();

            state._fsp--;

             after(grammarAccess.getNegativeNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegativeNumber548); 

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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:293:1: ruleNegativeNumber : ( ( rule__NegativeNumber__Group__0 ) ) ;
    public final void ruleNegativeNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:297:2: ( ( ( rule__NegativeNumber__Group__0 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:298:1: ( ( rule__NegativeNumber__Group__0 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:298:1: ( ( rule__NegativeNumber__Group__0 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:299:1: ( rule__NegativeNumber__Group__0 )
            {
             before(grammarAccess.getNegativeNumberAccess().getGroup()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:300:1: ( rule__NegativeNumber__Group__0 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:300:2: rule__NegativeNumber__Group__0
            {
            pushFollow(FOLLOW_rule__NegativeNumber__Group__0_in_ruleNegativeNumber574);
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


    // $ANTLR start "rule__Configuration__Alternatives_2"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:312:1: rule__Configuration__Alternatives_2 : ( ( ( rule__Configuration__Group_2_0__0 ) ) | ( ( rule__Configuration__Group_2_1__0 ) ) );
    public final void rule__Configuration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:316:1: ( ( ( rule__Configuration__Group_2_0__0 ) ) | ( ( rule__Configuration__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:317:1: ( ( rule__Configuration__Group_2_0__0 ) )
                    {
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:317:1: ( ( rule__Configuration__Group_2_0__0 ) )
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:318:1: ( rule__Configuration__Group_2_0__0 )
                    {
                     before(grammarAccess.getConfigurationAccess().getGroup_2_0()); 
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:319:1: ( rule__Configuration__Group_2_0__0 )
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:319:2: rule__Configuration__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Configuration__Group_2_0__0_in_rule__Configuration__Alternatives_2610);
                    rule__Configuration__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConfigurationAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:323:6: ( ( rule__Configuration__Group_2_1__0 ) )
                    {
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:323:6: ( ( rule__Configuration__Group_2_1__0 ) )
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:324:1: ( rule__Configuration__Group_2_1__0 )
                    {
                     before(grammarAccess.getConfigurationAccess().getGroup_2_1()); 
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:325:1: ( rule__Configuration__Group_2_1__0 )
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:325:2: rule__Configuration__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Configuration__Group_2_1__0_in_rule__Configuration__Alternatives_2628);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:334:1: rule__Element__Alternatives : ( ( ruleNumber ) | ( ruleEmpty ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:338:1: ( ( ruleNumber ) | ( ruleEmpty ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT||LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:339:1: ( ruleNumber )
                    {
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:339:1: ( ruleNumber )
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:340:1: ruleNumber
                    {
                     before(grammarAccess.getElementAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumber_in_rule__Element__Alternatives661);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:345:6: ( ruleEmpty )
                    {
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:345:6: ( ruleEmpty )
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:346:1: ruleEmpty
                    {
                     before(grammarAccess.getElementAccess().getEmptyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEmpty_in_rule__Element__Alternatives678);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:356:1: rule__Number__Alternatives : ( ( rulePositiveNumber ) | ( ruleNegativeNumber ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:360:1: ( ( rulePositiveNumber ) | ( ruleNegativeNumber ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:361:1: ( rulePositiveNumber )
                    {
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:361:1: ( rulePositiveNumber )
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:362:1: rulePositiveNumber
                    {
                     before(grammarAccess.getNumberAccess().getPositiveNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePositiveNumber_in_rule__Number__Alternatives710);
                    rulePositiveNumber();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getPositiveNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:367:6: ( ruleNegativeNumber )
                    {
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:367:6: ( ruleNegativeNumber )
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:368:1: ruleNegativeNumber
                    {
                     before(grammarAccess.getNumberAccess().getNegativeNumberParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNegativeNumber_in_rule__Number__Alternatives727);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:380:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:384:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:385:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__0757);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__0760);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:392:1: rule__Configuration__Group__0__Impl : ( 'Matriz inicial:' ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:396:1: ( ( 'Matriz inicial:' ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:397:1: ( 'Matriz inicial:' )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:397:1: ( 'Matriz inicial:' )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:398:1: 'Matriz inicial:'
            {
             before(grammarAccess.getConfigurationAccess().getMatrizInicialKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Configuration__Group__0__Impl788); 
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:411:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:415:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:416:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__1819);
            rule__Configuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__1822);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:423:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__InitialAssignment_1 ) ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:427:1: ( ( ( rule__Configuration__InitialAssignment_1 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:428:1: ( ( rule__Configuration__InitialAssignment_1 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:428:1: ( ( rule__Configuration__InitialAssignment_1 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:429:1: ( rule__Configuration__InitialAssignment_1 )
            {
             before(grammarAccess.getConfigurationAccess().getInitialAssignment_1()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:430:1: ( rule__Configuration__InitialAssignment_1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:430:2: rule__Configuration__InitialAssignment_1
            {
            pushFollow(FOLLOW_rule__Configuration__InitialAssignment_1_in_rule__Configuration__Group__1__Impl849);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:440:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:444:1: ( rule__Configuration__Group__2__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:445:2: rule__Configuration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__2879);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:451:1: rule__Configuration__Group__2__Impl : ( ( rule__Configuration__Alternatives_2 ) ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:455:1: ( ( ( rule__Configuration__Alternatives_2 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:456:1: ( ( rule__Configuration__Alternatives_2 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:456:1: ( ( rule__Configuration__Alternatives_2 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:457:1: ( rule__Configuration__Alternatives_2 )
            {
             before(grammarAccess.getConfigurationAccess().getAlternatives_2()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:458:1: ( rule__Configuration__Alternatives_2 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:458:2: rule__Configuration__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Configuration__Alternatives_2_in_rule__Configuration__Group__2__Impl906);
            rule__Configuration__Alternatives_2();

            state._fsp--;


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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:474:1: rule__Configuration__Group_2_0__0 : rule__Configuration__Group_2_0__0__Impl rule__Configuration__Group_2_0__1 ;
    public final void rule__Configuration__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:478:1: ( rule__Configuration__Group_2_0__0__Impl rule__Configuration__Group_2_0__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:479:2: rule__Configuration__Group_2_0__0__Impl rule__Configuration__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group_2_0__0__Impl_in_rule__Configuration__Group_2_0__0942);
            rule__Configuration__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group_2_0__1_in_rule__Configuration__Group_2_0__0945);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:486:1: rule__Configuration__Group_2_0__0__Impl : ( 'Matriz esperada: ' ) ;
    public final void rule__Configuration__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:490:1: ( ( 'Matriz esperada: ' ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:491:1: ( 'Matriz esperada: ' )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:491:1: ( 'Matriz esperada: ' )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:492:1: 'Matriz esperada: '
            {
             before(grammarAccess.getConfigurationAccess().getMatrizEsperadaKeyword_2_0_0()); 
            match(input,12,FOLLOW_12_in_rule__Configuration__Group_2_0__0__Impl973); 
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:505:1: rule__Configuration__Group_2_0__1 : rule__Configuration__Group_2_0__1__Impl ;
    public final void rule__Configuration__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:509:1: ( rule__Configuration__Group_2_0__1__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:510:2: rule__Configuration__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group_2_0__1__Impl_in_rule__Configuration__Group_2_0__11004);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:516:1: rule__Configuration__Group_2_0__1__Impl : ( ( rule__Configuration__ExpectedAssignment_2_0_1 ) ) ;
    public final void rule__Configuration__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:520:1: ( ( ( rule__Configuration__ExpectedAssignment_2_0_1 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:521:1: ( ( rule__Configuration__ExpectedAssignment_2_0_1 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:521:1: ( ( rule__Configuration__ExpectedAssignment_2_0_1 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:522:1: ( rule__Configuration__ExpectedAssignment_2_0_1 )
            {
             before(grammarAccess.getConfigurationAccess().getExpectedAssignment_2_0_1()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:523:1: ( rule__Configuration__ExpectedAssignment_2_0_1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:523:2: rule__Configuration__ExpectedAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__Configuration__ExpectedAssignment_2_0_1_in_rule__Configuration__Group_2_0__1__Impl1031);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:537:1: rule__Configuration__Group_2_1__0 : rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1 ;
    public final void rule__Configuration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:541:1: ( rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:542:2: rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group_2_1__0__Impl_in_rule__Configuration__Group_2_1__01065);
            rule__Configuration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group_2_1__1_in_rule__Configuration__Group_2_1__01068);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:549:1: rule__Configuration__Group_2_1__0__Impl : ( 'Correo esperado: ' ) ;
    public final void rule__Configuration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:553:1: ( ( 'Correo esperado: ' ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:554:1: ( 'Correo esperado: ' )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:554:1: ( 'Correo esperado: ' )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:555:1: 'Correo esperado: '
            {
             before(grammarAccess.getConfigurationAccess().getCorreoEsperadoKeyword_2_1_0()); 
            match(input,13,FOLLOW_13_in_rule__Configuration__Group_2_1__0__Impl1096); 
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:568:1: rule__Configuration__Group_2_1__1 : rule__Configuration__Group_2_1__1__Impl ;
    public final void rule__Configuration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:572:1: ( rule__Configuration__Group_2_1__1__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:573:2: rule__Configuration__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group_2_1__1__Impl_in_rule__Configuration__Group_2_1__11127);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:579:1: rule__Configuration__Group_2_1__1__Impl : ( ( rule__Configuration__MailAssignment_2_1_1 ) ) ;
    public final void rule__Configuration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:583:1: ( ( ( rule__Configuration__MailAssignment_2_1_1 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:584:1: ( ( rule__Configuration__MailAssignment_2_1_1 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:584:1: ( ( rule__Configuration__MailAssignment_2_1_1 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:585:1: ( rule__Configuration__MailAssignment_2_1_1 )
            {
             before(grammarAccess.getConfigurationAccess().getMailAssignment_2_1_1()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:586:1: ( rule__Configuration__MailAssignment_2_1_1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:586:2: rule__Configuration__MailAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Configuration__MailAssignment_2_1_1_in_rule__Configuration__Group_2_1__1__Impl1154);
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


    // $ANTLR start "rule__Matrix__Group__0"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:600:1: rule__Matrix__Group__0 : rule__Matrix__Group__0__Impl rule__Matrix__Group__1 ;
    public final void rule__Matrix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:604:1: ( rule__Matrix__Group__0__Impl rule__Matrix__Group__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:605:2: rule__Matrix__Group__0__Impl rule__Matrix__Group__1
            {
            pushFollow(FOLLOW_rule__Matrix__Group__0__Impl_in_rule__Matrix__Group__01188);
            rule__Matrix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group__1_in_rule__Matrix__Group__01191);
            rule__Matrix__Group__1();

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
    // $ANTLR end "rule__Matrix__Group__0"


    // $ANTLR start "rule__Matrix__Group__0__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:612:1: rule__Matrix__Group__0__Impl : ( ( rule__Matrix__FilasAssignment_0 ) ) ;
    public final void rule__Matrix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:616:1: ( ( ( rule__Matrix__FilasAssignment_0 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:617:1: ( ( rule__Matrix__FilasAssignment_0 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:617:1: ( ( rule__Matrix__FilasAssignment_0 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:618:1: ( rule__Matrix__FilasAssignment_0 )
            {
             before(grammarAccess.getMatrixAccess().getFilasAssignment_0()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:619:1: ( rule__Matrix__FilasAssignment_0 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:619:2: rule__Matrix__FilasAssignment_0
            {
            pushFollow(FOLLOW_rule__Matrix__FilasAssignment_0_in_rule__Matrix__Group__0__Impl1218);
            rule__Matrix__FilasAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixAccess().getFilasAssignment_0()); 

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
    // $ANTLR end "rule__Matrix__Group__0__Impl"


    // $ANTLR start "rule__Matrix__Group__1"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:629:1: rule__Matrix__Group__1 : rule__Matrix__Group__1__Impl rule__Matrix__Group__2 ;
    public final void rule__Matrix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:633:1: ( rule__Matrix__Group__1__Impl rule__Matrix__Group__2 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:634:2: rule__Matrix__Group__1__Impl rule__Matrix__Group__2
            {
            pushFollow(FOLLOW_rule__Matrix__Group__1__Impl_in_rule__Matrix__Group__11248);
            rule__Matrix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group__2_in_rule__Matrix__Group__11251);
            rule__Matrix__Group__2();

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
    // $ANTLR end "rule__Matrix__Group__1"


    // $ANTLR start "rule__Matrix__Group__1__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:641:1: rule__Matrix__Group__1__Impl : ( 'x' ) ;
    public final void rule__Matrix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:645:1: ( ( 'x' ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:646:1: ( 'x' )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:646:1: ( 'x' )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:647:1: 'x'
            {
             before(grammarAccess.getMatrixAccess().getXKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Matrix__Group__1__Impl1279); 
             after(grammarAccess.getMatrixAccess().getXKeyword_1()); 

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
    // $ANTLR end "rule__Matrix__Group__1__Impl"


    // $ANTLR start "rule__Matrix__Group__2"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:660:1: rule__Matrix__Group__2 : rule__Matrix__Group__2__Impl rule__Matrix__Group__3 ;
    public final void rule__Matrix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:664:1: ( rule__Matrix__Group__2__Impl rule__Matrix__Group__3 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:665:2: rule__Matrix__Group__2__Impl rule__Matrix__Group__3
            {
            pushFollow(FOLLOW_rule__Matrix__Group__2__Impl_in_rule__Matrix__Group__21310);
            rule__Matrix__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group__3_in_rule__Matrix__Group__21313);
            rule__Matrix__Group__3();

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
    // $ANTLR end "rule__Matrix__Group__2"


    // $ANTLR start "rule__Matrix__Group__2__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:672:1: rule__Matrix__Group__2__Impl : ( ( rule__Matrix__ColumnasAssignment_2 ) ) ;
    public final void rule__Matrix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:676:1: ( ( ( rule__Matrix__ColumnasAssignment_2 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:677:1: ( ( rule__Matrix__ColumnasAssignment_2 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:677:1: ( ( rule__Matrix__ColumnasAssignment_2 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:678:1: ( rule__Matrix__ColumnasAssignment_2 )
            {
             before(grammarAccess.getMatrixAccess().getColumnasAssignment_2()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:679:1: ( rule__Matrix__ColumnasAssignment_2 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:679:2: rule__Matrix__ColumnasAssignment_2
            {
            pushFollow(FOLLOW_rule__Matrix__ColumnasAssignment_2_in_rule__Matrix__Group__2__Impl1340);
            rule__Matrix__ColumnasAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMatrixAccess().getColumnasAssignment_2()); 

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
    // $ANTLR end "rule__Matrix__Group__2__Impl"


    // $ANTLR start "rule__Matrix__Group__3"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:689:1: rule__Matrix__Group__3 : rule__Matrix__Group__3__Impl ;
    public final void rule__Matrix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:693:1: ( rule__Matrix__Group__3__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:694:2: rule__Matrix__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Matrix__Group__3__Impl_in_rule__Matrix__Group__31370);
            rule__Matrix__Group__3__Impl();

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
    // $ANTLR end "rule__Matrix__Group__3"


    // $ANTLR start "rule__Matrix__Group__3__Impl"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:700:1: rule__Matrix__Group__3__Impl : ( ( rule__Matrix__LinesAssignment_3 )* ) ;
    public final void rule__Matrix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:704:1: ( ( ( rule__Matrix__LinesAssignment_3 )* ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:705:1: ( ( rule__Matrix__LinesAssignment_3 )* )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:705:1: ( ( rule__Matrix__LinesAssignment_3 )* )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:706:1: ( rule__Matrix__LinesAssignment_3 )*
            {
             before(grammarAccess.getMatrixAccess().getLinesAssignment_3()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:707:1: ( rule__Matrix__LinesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT||LA4_0==16||LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:707:2: rule__Matrix__LinesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Matrix__LinesAssignment_3_in_rule__Matrix__Group__3__Impl1397);
            	    rule__Matrix__LinesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMatrixAccess().getLinesAssignment_3()); 

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
    // $ANTLR end "rule__Matrix__Group__3__Impl"


    // $ANTLR start "rule__Line__Group__0"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:725:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:729:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:730:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_rule__Line__Group__0__Impl_in_rule__Line__Group__01436);
            rule__Line__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Line__Group__1_in_rule__Line__Group__01439);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:737:1: rule__Line__Group__0__Impl : ( ( rule__Line__ElsAssignment_0 ) ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:741:1: ( ( ( rule__Line__ElsAssignment_0 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:742:1: ( ( rule__Line__ElsAssignment_0 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:742:1: ( ( rule__Line__ElsAssignment_0 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:743:1: ( rule__Line__ElsAssignment_0 )
            {
             before(grammarAccess.getLineAccess().getElsAssignment_0()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:744:1: ( rule__Line__ElsAssignment_0 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:744:2: rule__Line__ElsAssignment_0
            {
            pushFollow(FOLLOW_rule__Line__ElsAssignment_0_in_rule__Line__Group__0__Impl1466);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:754:1: rule__Line__Group__1 : rule__Line__Group__1__Impl ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:758:1: ( rule__Line__Group__1__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:759:2: rule__Line__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Line__Group__1__Impl_in_rule__Line__Group__11496);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:765:1: rule__Line__Group__1__Impl : ( ( rule__Line__Group_1__0 )* ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:769:1: ( ( ( rule__Line__Group_1__0 )* ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:770:1: ( ( rule__Line__Group_1__0 )* )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:770:1: ( ( rule__Line__Group_1__0 )* )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:771:1: ( rule__Line__Group_1__0 )*
            {
             before(grammarAccess.getLineAccess().getGroup_1()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:772:1: ( rule__Line__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:772:2: rule__Line__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Line__Group_1__0_in_rule__Line__Group__1__Impl1523);
            	    rule__Line__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:786:1: rule__Line__Group_1__0 : rule__Line__Group_1__0__Impl rule__Line__Group_1__1 ;
    public final void rule__Line__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:790:1: ( rule__Line__Group_1__0__Impl rule__Line__Group_1__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:791:2: rule__Line__Group_1__0__Impl rule__Line__Group_1__1
            {
            pushFollow(FOLLOW_rule__Line__Group_1__0__Impl_in_rule__Line__Group_1__01558);
            rule__Line__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Line__Group_1__1_in_rule__Line__Group_1__01561);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:798:1: rule__Line__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Line__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:802:1: ( ( ',' ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:803:1: ( ',' )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:803:1: ( ',' )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:804:1: ','
            {
             before(grammarAccess.getLineAccess().getCommaKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__Line__Group_1__0__Impl1589); 
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:817:1: rule__Line__Group_1__1 : rule__Line__Group_1__1__Impl ;
    public final void rule__Line__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:821:1: ( rule__Line__Group_1__1__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:822:2: rule__Line__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Line__Group_1__1__Impl_in_rule__Line__Group_1__11620);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:828:1: rule__Line__Group_1__1__Impl : ( ( rule__Line__ElsAssignment_1_1 ) ) ;
    public final void rule__Line__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:832:1: ( ( ( rule__Line__ElsAssignment_1_1 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:833:1: ( ( rule__Line__ElsAssignment_1_1 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:833:1: ( ( rule__Line__ElsAssignment_1_1 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:834:1: ( rule__Line__ElsAssignment_1_1 )
            {
             before(grammarAccess.getLineAccess().getElsAssignment_1_1()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:835:1: ( rule__Line__ElsAssignment_1_1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:835:2: rule__Line__ElsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Line__ElsAssignment_1_1_in_rule__Line__Group_1__1__Impl1647);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:849:1: rule__Empty__Group__0 : rule__Empty__Group__0__Impl rule__Empty__Group__1 ;
    public final void rule__Empty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:853:1: ( rule__Empty__Group__0__Impl rule__Empty__Group__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:854:2: rule__Empty__Group__0__Impl rule__Empty__Group__1
            {
            pushFollow(FOLLOW_rule__Empty__Group__0__Impl_in_rule__Empty__Group__01681);
            rule__Empty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Empty__Group__1_in_rule__Empty__Group__01684);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:861:1: rule__Empty__Group__0__Impl : ( () ) ;
    public final void rule__Empty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:865:1: ( ( () ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:866:1: ( () )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:866:1: ( () )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:867:1: ()
            {
             before(grammarAccess.getEmptyAccess().getEmptyAction_0()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:868:1: ()
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:870:1: 
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:880:1: rule__Empty__Group__1 : rule__Empty__Group__1__Impl ;
    public final void rule__Empty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:884:1: ( rule__Empty__Group__1__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:885:2: rule__Empty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Empty__Group__1__Impl_in_rule__Empty__Group__11742);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:891:1: rule__Empty__Group__1__Impl : ( '_' ) ;
    public final void rule__Empty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:895:1: ( ( '_' ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:896:1: ( '_' )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:896:1: ( '_' )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:897:1: '_'
            {
             before(grammarAccess.getEmptyAccess().get_Keyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Empty__Group__1__Impl1770); 
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:914:1: rule__PositiveNumber__Group__0 : rule__PositiveNumber__Group__0__Impl rule__PositiveNumber__Group__1 ;
    public final void rule__PositiveNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:918:1: ( rule__PositiveNumber__Group__0__Impl rule__PositiveNumber__Group__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:919:2: rule__PositiveNumber__Group__0__Impl rule__PositiveNumber__Group__1
            {
            pushFollow(FOLLOW_rule__PositiveNumber__Group__0__Impl_in_rule__PositiveNumber__Group__01805);
            rule__PositiveNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PositiveNumber__Group__1_in_rule__PositiveNumber__Group__01808);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:926:1: rule__PositiveNumber__Group__0__Impl : ( ruleInteger ) ;
    public final void rule__PositiveNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:930:1: ( ( ruleInteger ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:931:1: ( ruleInteger )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:931:1: ( ruleInteger )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:932:1: ruleInteger
            {
             before(grammarAccess.getPositiveNumberAccess().getIntegerParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleInteger_in_rule__PositiveNumber__Group__0__Impl1835);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:943:1: rule__PositiveNumber__Group__1 : rule__PositiveNumber__Group__1__Impl ;
    public final void rule__PositiveNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:947:1: ( rule__PositiveNumber__Group__1__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:948:2: rule__PositiveNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PositiveNumber__Group__1__Impl_in_rule__PositiveNumber__Group__11864);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:954:1: rule__PositiveNumber__Group__1__Impl : ( ( rule__PositiveNumber__Group_1__0 )? ) ;
    public final void rule__PositiveNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:958:1: ( ( ( rule__PositiveNumber__Group_1__0 )? ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:959:1: ( ( rule__PositiveNumber__Group_1__0 )? )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:959:1: ( ( rule__PositiveNumber__Group_1__0 )? )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:960:1: ( rule__PositiveNumber__Group_1__0 )?
            {
             before(grammarAccess.getPositiveNumberAccess().getGroup_1()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:961:1: ( rule__PositiveNumber__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:961:2: rule__PositiveNumber__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PositiveNumber__Group_1__0_in_rule__PositiveNumber__Group__1__Impl1891);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:975:1: rule__PositiveNumber__Group_1__0 : rule__PositiveNumber__Group_1__0__Impl rule__PositiveNumber__Group_1__1 ;
    public final void rule__PositiveNumber__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:979:1: ( rule__PositiveNumber__Group_1__0__Impl rule__PositiveNumber__Group_1__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:980:2: rule__PositiveNumber__Group_1__0__Impl rule__PositiveNumber__Group_1__1
            {
            pushFollow(FOLLOW_rule__PositiveNumber__Group_1__0__Impl_in_rule__PositiveNumber__Group_1__01926);
            rule__PositiveNumber__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PositiveNumber__Group_1__1_in_rule__PositiveNumber__Group_1__01929);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:987:1: rule__PositiveNumber__Group_1__0__Impl : ( () ) ;
    public final void rule__PositiveNumber__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:991:1: ( ( () ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:992:1: ( () )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:992:1: ( () )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:993:1: ()
            {
             before(grammarAccess.getPositiveNumberAccess().getFractionNumeratorAction_1_0()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:994:1: ()
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:996:1: 
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1006:1: rule__PositiveNumber__Group_1__1 : rule__PositiveNumber__Group_1__1__Impl rule__PositiveNumber__Group_1__2 ;
    public final void rule__PositiveNumber__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1010:1: ( rule__PositiveNumber__Group_1__1__Impl rule__PositiveNumber__Group_1__2 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1011:2: rule__PositiveNumber__Group_1__1__Impl rule__PositiveNumber__Group_1__2
            {
            pushFollow(FOLLOW_rule__PositiveNumber__Group_1__1__Impl_in_rule__PositiveNumber__Group_1__11987);
            rule__PositiveNumber__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PositiveNumber__Group_1__2_in_rule__PositiveNumber__Group_1__11990);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1018:1: rule__PositiveNumber__Group_1__1__Impl : ( '/' ) ;
    public final void rule__PositiveNumber__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1022:1: ( ( '/' ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1023:1: ( '/' )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1023:1: ( '/' )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1024:1: '/'
            {
             before(grammarAccess.getPositiveNumberAccess().getSolidusKeyword_1_1()); 
            match(input,17,FOLLOW_17_in_rule__PositiveNumber__Group_1__1__Impl2018); 
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1037:1: rule__PositiveNumber__Group_1__2 : rule__PositiveNumber__Group_1__2__Impl ;
    public final void rule__PositiveNumber__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1041:1: ( rule__PositiveNumber__Group_1__2__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1042:2: rule__PositiveNumber__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PositiveNumber__Group_1__2__Impl_in_rule__PositiveNumber__Group_1__22049);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1048:1: rule__PositiveNumber__Group_1__2__Impl : ( ( rule__PositiveNumber__DenominatorAssignment_1_2 ) ) ;
    public final void rule__PositiveNumber__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1052:1: ( ( ( rule__PositiveNumber__DenominatorAssignment_1_2 ) ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1053:1: ( ( rule__PositiveNumber__DenominatorAssignment_1_2 ) )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1053:1: ( ( rule__PositiveNumber__DenominatorAssignment_1_2 ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1054:1: ( rule__PositiveNumber__DenominatorAssignment_1_2 )
            {
             before(grammarAccess.getPositiveNumberAccess().getDenominatorAssignment_1_2()); 
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1055:1: ( rule__PositiveNumber__DenominatorAssignment_1_2 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1055:2: rule__PositiveNumber__DenominatorAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PositiveNumber__DenominatorAssignment_1_2_in_rule__PositiveNumber__Group_1__2__Impl2076);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1071:1: rule__NegativeNumber__Group__0 : rule__NegativeNumber__Group__0__Impl rule__NegativeNumber__Group__1 ;
    public final void rule__NegativeNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1075:1: ( rule__NegativeNumber__Group__0__Impl rule__NegativeNumber__Group__1 )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1076:2: rule__NegativeNumber__Group__0__Impl rule__NegativeNumber__Group__1
            {
            pushFollow(FOLLOW_rule__NegativeNumber__Group__0__Impl_in_rule__NegativeNumber__Group__02112);
            rule__NegativeNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NegativeNumber__Group__1_in_rule__NegativeNumber__Group__02115);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1083:1: rule__NegativeNumber__Group__0__Impl : ( '-' ) ;
    public final void rule__NegativeNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1087:1: ( ( '-' ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1088:1: ( '-' )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1088:1: ( '-' )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1089:1: '-'
            {
             before(grammarAccess.getNegativeNumberAccess().getHyphenMinusKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__NegativeNumber__Group__0__Impl2143); 
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1102:1: rule__NegativeNumber__Group__1 : rule__NegativeNumber__Group__1__Impl ;
    public final void rule__NegativeNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1106:1: ( rule__NegativeNumber__Group__1__Impl )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1107:2: rule__NegativeNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NegativeNumber__Group__1__Impl_in_rule__NegativeNumber__Group__12174);
            rule__NegativeNumber__Group__1__Impl();

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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1113:1: rule__NegativeNumber__Group__1__Impl : ( rulePositiveNumber ) ;
    public final void rule__NegativeNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1117:1: ( ( rulePositiveNumber ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1118:1: ( rulePositiveNumber )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1118:1: ( rulePositiveNumber )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1119:1: rulePositiveNumber
            {
             before(grammarAccess.getNegativeNumberAccess().getPositiveNumberParserRuleCall_1()); 
            pushFollow(FOLLOW_rulePositiveNumber_in_rule__NegativeNumber__Group__1__Impl2201);
            rulePositiveNumber();

            state._fsp--;

             after(grammarAccess.getNegativeNumberAccess().getPositiveNumberParserRuleCall_1()); 

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


    // $ANTLR start "rule__Configuration__InitialAssignment_1"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1135:1: rule__Configuration__InitialAssignment_1 : ( ruleMatrix ) ;
    public final void rule__Configuration__InitialAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1139:1: ( ( ruleMatrix ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1140:1: ( ruleMatrix )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1140:1: ( ruleMatrix )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1141:1: ruleMatrix
            {
             before(grammarAccess.getConfigurationAccess().getInitialMatrixParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__Configuration__InitialAssignment_12239);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1150:1: rule__Configuration__ExpectedAssignment_2_0_1 : ( ruleMatrix ) ;
    public final void rule__Configuration__ExpectedAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1154:1: ( ( ruleMatrix ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1155:1: ( ruleMatrix )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1155:1: ( ruleMatrix )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1156:1: ruleMatrix
            {
             before(grammarAccess.getConfigurationAccess().getExpectedMatrixParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__Configuration__ExpectedAssignment_2_0_12270);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1165:1: rule__Configuration__MailAssignment_2_1_1 : ( ruleNumber ) ;
    public final void rule__Configuration__MailAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1169:1: ( ( ruleNumber ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1170:1: ( ruleNumber )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1170:1: ( ruleNumber )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1171:1: ruleNumber
            {
             before(grammarAccess.getConfigurationAccess().getMailNumberParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__Configuration__MailAssignment_2_1_12301);
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


    // $ANTLR start "rule__Matrix__FilasAssignment_0"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1180:1: rule__Matrix__FilasAssignment_0 : ( RULE_INT ) ;
    public final void rule__Matrix__FilasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1184:1: ( ( RULE_INT ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1185:1: ( RULE_INT )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1185:1: ( RULE_INT )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1186:1: RULE_INT
            {
             before(grammarAccess.getMatrixAccess().getFilasINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Matrix__FilasAssignment_02332); 
             after(grammarAccess.getMatrixAccess().getFilasINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Matrix__FilasAssignment_0"


    // $ANTLR start "rule__Matrix__ColumnasAssignment_2"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1195:1: rule__Matrix__ColumnasAssignment_2 : ( RULE_INT ) ;
    public final void rule__Matrix__ColumnasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1199:1: ( ( RULE_INT ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1200:1: ( RULE_INT )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1200:1: ( RULE_INT )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1201:1: RULE_INT
            {
             before(grammarAccess.getMatrixAccess().getColumnasINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Matrix__ColumnasAssignment_22363); 
             after(grammarAccess.getMatrixAccess().getColumnasINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Matrix__ColumnasAssignment_2"


    // $ANTLR start "rule__Matrix__LinesAssignment_3"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1210:1: rule__Matrix__LinesAssignment_3 : ( ruleLine ) ;
    public final void rule__Matrix__LinesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1214:1: ( ( ruleLine ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1215:1: ( ruleLine )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1215:1: ( ruleLine )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1216:1: ruleLine
            {
             before(grammarAccess.getMatrixAccess().getLinesLineParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLine_in_rule__Matrix__LinesAssignment_32394);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getMatrixAccess().getLinesLineParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Matrix__LinesAssignment_3"


    // $ANTLR start "rule__Line__ElsAssignment_0"
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1225:1: rule__Line__ElsAssignment_0 : ( ruleElement ) ;
    public final void rule__Line__ElsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1229:1: ( ( ruleElement ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1230:1: ( ruleElement )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1230:1: ( ruleElement )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1231:1: ruleElement
            {
             before(grammarAccess.getLineAccess().getElsElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Line__ElsAssignment_02425);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1240:1: rule__Line__ElsAssignment_1_1 : ( ruleElement ) ;
    public final void rule__Line__ElsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1244:1: ( ( ruleElement ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1245:1: ( ruleElement )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1245:1: ( ruleElement )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1246:1: ruleElement
            {
             before(grammarAccess.getLineAccess().getElsElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Line__ElsAssignment_1_12456);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1255:1: rule__PositiveNumber__DenominatorAssignment_1_2 : ( ruleInteger ) ;
    public final void rule__PositiveNumber__DenominatorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1259:1: ( ( ruleInteger ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1260:1: ( ruleInteger )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1260:1: ( ruleInteger )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1261:1: ruleInteger
            {
             before(grammarAccess.getPositiveNumberAccess().getDenominatorIntegerParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleInteger_in_rule__PositiveNumber__DenominatorAssignment_1_22487);
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
    // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1270:1: rule__Integer__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Integer__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1274:1: ( ( RULE_INT ) )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1275:1: ( RULE_INT )
            {
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1275:1: ( RULE_INT )
            // ../reboConf.ui/src-gen/edu/upb/lp/ui/contentassist/antlr/internal/InternalReboConf.g:1276:1: RULE_INT
            {
             before(grammarAccess.getIntegerAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Integer__ValueAssignment2518); 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleConfiguration_in_entryRuleConfiguration61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfiguration68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0_in_ruleConfiguration94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_entryRuleMatrix121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__0_in_ruleMatrix154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_entryRuleLine181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLine188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__Group__0_in_ruleLine214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmpty_in_entryRuleEmpty301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmpty308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Empty__Group__0_in_ruleEmpty334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositiveNumber_in_entryRulePositiveNumber421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePositiveNumber428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group__0_in_rulePositiveNumber454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__ValueAssignment_in_ruleInteger514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegativeNumber_in_entryRuleNegativeNumber541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegativeNumber548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeNumber__Group__0_in_ruleNegativeNumber574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_2_0__0_in_rule__Configuration__Alternatives_2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_2_1__0_in_rule__Configuration__Alternatives_2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Element__Alternatives661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmpty_in_rule__Element__Alternatives678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositiveNumber_in_rule__Number__Alternatives710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegativeNumber_in_rule__Number__Alternatives727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__0757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__0760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Configuration__Group__0__Impl788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__1819 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__InitialAssignment_1_in_rule__Configuration__Group__1__Impl849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Alternatives_2_in_rule__Configuration__Group__2__Impl906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_2_0__0__Impl_in_rule__Configuration__Group_2_0__0942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Configuration__Group_2_0__1_in_rule__Configuration__Group_2_0__0945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Configuration__Group_2_0__0__Impl973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_2_0__1__Impl_in_rule__Configuration__Group_2_0__11004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__ExpectedAssignment_2_0_1_in_rule__Configuration__Group_2_0__1__Impl1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_2_1__0__Impl_in_rule__Configuration__Group_2_1__01065 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Configuration__Group_2_1__1_in_rule__Configuration__Group_2_1__01068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Configuration__Group_2_1__0__Impl1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_2_1__1__Impl_in_rule__Configuration__Group_2_1__11127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__MailAssignment_2_1_1_in_rule__Configuration__Group_2_1__1__Impl1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__0__Impl_in_rule__Matrix__Group__01188 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Matrix__Group__1_in_rule__Matrix__Group__01191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__FilasAssignment_0_in_rule__Matrix__Group__0__Impl1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__1__Impl_in_rule__Matrix__Group__11248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Matrix__Group__2_in_rule__Matrix__Group__11251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Matrix__Group__1__Impl1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__2__Impl_in_rule__Matrix__Group__21310 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_rule__Matrix__Group__3_in_rule__Matrix__Group__21313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__ColumnasAssignment_2_in_rule__Matrix__Group__2__Impl1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__3__Impl_in_rule__Matrix__Group__31370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__LinesAssignment_3_in_rule__Matrix__Group__3__Impl1397 = new BitSet(new long[]{0x0000000000050012L});
    public static final BitSet FOLLOW_rule__Line__Group__0__Impl_in_rule__Line__Group__01436 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Line__Group__1_in_rule__Line__Group__01439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__ElsAssignment_0_in_rule__Line__Group__0__Impl1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__Group__1__Impl_in_rule__Line__Group__11496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__Group_1__0_in_rule__Line__Group__1__Impl1523 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Line__Group_1__0__Impl_in_rule__Line__Group_1__01558 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_rule__Line__Group_1__1_in_rule__Line__Group_1__01561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Line__Group_1__0__Impl1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__Group_1__1__Impl_in_rule__Line__Group_1__11620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__ElsAssignment_1_1_in_rule__Line__Group_1__1__Impl1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Empty__Group__0__Impl_in_rule__Empty__Group__01681 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_rule__Empty__Group__1_in_rule__Empty__Group__01684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Empty__Group__1__Impl_in_rule__Empty__Group__11742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Empty__Group__1__Impl1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group__0__Impl_in_rule__PositiveNumber__Group__01805 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group__1_in_rule__PositiveNumber__Group__01808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__PositiveNumber__Group__0__Impl1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group__1__Impl_in_rule__PositiveNumber__Group__11864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group_1__0_in_rule__PositiveNumber__Group__1__Impl1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group_1__0__Impl_in_rule__PositiveNumber__Group_1__01926 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group_1__1_in_rule__PositiveNumber__Group_1__01929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group_1__1__Impl_in_rule__PositiveNumber__Group_1__11987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group_1__2_in_rule__PositiveNumber__Group_1__11990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PositiveNumber__Group_1__1__Impl2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositiveNumber__Group_1__2__Impl_in_rule__PositiveNumber__Group_1__22049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PositiveNumber__DenominatorAssignment_1_2_in_rule__PositiveNumber__Group_1__2__Impl2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeNumber__Group__0__Impl_in_rule__NegativeNumber__Group__02112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NegativeNumber__Group__1_in_rule__NegativeNumber__Group__02115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NegativeNumber__Group__0__Impl2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegativeNumber__Group__1__Impl_in_rule__NegativeNumber__Group__12174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositiveNumber_in_rule__NegativeNumber__Group__1__Impl2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__Configuration__InitialAssignment_12239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__Configuration__ExpectedAssignment_2_0_12270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Configuration__MailAssignment_2_1_12301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Matrix__FilasAssignment_02332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Matrix__ColumnasAssignment_22363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_rule__Matrix__LinesAssignment_32394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Line__ElsAssignment_02425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Line__ElsAssignment_1_12456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__PositiveNumber__DenominatorAssignment_1_22487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Integer__ValueAssignment2518 = new BitSet(new long[]{0x0000000000000002L});

}