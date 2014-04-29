package edu.upb.lp.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.upb.lp.services.ReboConfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReboConfParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g"; }



     	private ReboConfGrammarAccess grammarAccess;
     	
        public InternalReboConfParser(TokenStream input, ReboConfGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Configuration";	
       	}
       	
       	@Override
       	protected ReboConfGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleConfiguration"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:67:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:68:2: (iv_ruleConfiguration= ruleConfiguration EOF )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:69:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_ruleConfiguration_in_entryRuleConfiguration75);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfiguration85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:76:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'Matriz inicial:' ( (lv_initial_1_0= ruleMatrix ) ) ( (otherlv_2= 'Matriz esperada: ' ( (lv_expected_3_0= ruleMatrix ) ) ) | (otherlv_4= 'Correo esperado: ' ( (lv_mail_5_0= ruleNumber ) ) ) ) ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_initial_1_0 = null;

        EObject lv_expected_3_0 = null;

        EObject lv_mail_5_0 = null;


         enterRule(); 
            
        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:79:28: ( (otherlv_0= 'Matriz inicial:' ( (lv_initial_1_0= ruleMatrix ) ) ( (otherlv_2= 'Matriz esperada: ' ( (lv_expected_3_0= ruleMatrix ) ) ) | (otherlv_4= 'Correo esperado: ' ( (lv_mail_5_0= ruleNumber ) ) ) ) ) )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:80:1: (otherlv_0= 'Matriz inicial:' ( (lv_initial_1_0= ruleMatrix ) ) ( (otherlv_2= 'Matriz esperada: ' ( (lv_expected_3_0= ruleMatrix ) ) ) | (otherlv_4= 'Correo esperado: ' ( (lv_mail_5_0= ruleNumber ) ) ) ) )
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:80:1: (otherlv_0= 'Matriz inicial:' ( (lv_initial_1_0= ruleMatrix ) ) ( (otherlv_2= 'Matriz esperada: ' ( (lv_expected_3_0= ruleMatrix ) ) ) | (otherlv_4= 'Correo esperado: ' ( (lv_mail_5_0= ruleNumber ) ) ) ) )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:80:3: otherlv_0= 'Matriz inicial:' ( (lv_initial_1_0= ruleMatrix ) ) ( (otherlv_2= 'Matriz esperada: ' ( (lv_expected_3_0= ruleMatrix ) ) ) | (otherlv_4= 'Correo esperado: ' ( (lv_mail_5_0= ruleNumber ) ) ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleConfiguration122); 

                	newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getMatrizInicialKeyword_0());
                
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:84:1: ( (lv_initial_1_0= ruleMatrix ) )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:85:1: (lv_initial_1_0= ruleMatrix )
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:85:1: (lv_initial_1_0= ruleMatrix )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:86:3: lv_initial_1_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getConfigurationAccess().getInitialMatrixParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix_in_ruleConfiguration143);
            lv_initial_1_0=ruleMatrix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	        }
                   		set(
                   			current, 
                   			"initial",
                    		lv_initial_1_0, 
                    		"Matrix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:102:2: ( (otherlv_2= 'Matriz esperada: ' ( (lv_expected_3_0= ruleMatrix ) ) ) | (otherlv_4= 'Correo esperado: ' ( (lv_mail_5_0= ruleNumber ) ) ) )
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
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:102:3: (otherlv_2= 'Matriz esperada: ' ( (lv_expected_3_0= ruleMatrix ) ) )
                    {
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:102:3: (otherlv_2= 'Matriz esperada: ' ( (lv_expected_3_0= ruleMatrix ) ) )
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:102:5: otherlv_2= 'Matriz esperada: ' ( (lv_expected_3_0= ruleMatrix ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConfiguration157); 

                        	newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getMatrizEsperadaKeyword_2_0_0());
                        
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:106:1: ( (lv_expected_3_0= ruleMatrix ) )
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:107:1: (lv_expected_3_0= ruleMatrix )
                    {
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:107:1: (lv_expected_3_0= ruleMatrix )
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:108:3: lv_expected_3_0= ruleMatrix
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationAccess().getExpectedMatrixParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMatrix_in_ruleConfiguration178);
                    lv_expected_3_0=ruleMatrix();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	        }
                           		set(
                           			current, 
                           			"expected",
                            		lv_expected_3_0, 
                            		"Matrix");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:125:6: (otherlv_4= 'Correo esperado: ' ( (lv_mail_5_0= ruleNumber ) ) )
                    {
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:125:6: (otherlv_4= 'Correo esperado: ' ( (lv_mail_5_0= ruleNumber ) ) )
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:125:8: otherlv_4= 'Correo esperado: ' ( (lv_mail_5_0= ruleNumber ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleConfiguration198); 

                        	newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getCorreoEsperadoKeyword_2_1_0());
                        
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:129:1: ( (lv_mail_5_0= ruleNumber ) )
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:130:1: (lv_mail_5_0= ruleNumber )
                    {
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:130:1: (lv_mail_5_0= ruleNumber )
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:131:3: lv_mail_5_0= ruleNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationAccess().getMailNumberParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumber_in_ruleConfiguration219);
                    lv_mail_5_0=ruleNumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	        }
                           		set(
                           			current, 
                           			"mail",
                            		lv_mail_5_0, 
                            		"Number");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleMatrix"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:155:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:156:2: (iv_ruleMatrix= ruleMatrix EOF )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:157:2: iv_ruleMatrix= ruleMatrix EOF
            {
             newCompositeNode(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_ruleMatrix_in_entryRuleMatrix257);
            iv_ruleMatrix=ruleMatrix();

            state._fsp--;

             current =iv_ruleMatrix; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix267); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatrix"


    // $ANTLR start "ruleMatrix"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:164:1: ruleMatrix returns [EObject current=null] : ( ( (lv_filas_0_0= RULE_INT ) ) otherlv_1= 'x' ( (lv_columnas_2_0= RULE_INT ) ) ( (lv_lines_3_0= ruleLine ) )* ) ;
    public final EObject ruleMatrix() throws RecognitionException {
        EObject current = null;

        Token lv_filas_0_0=null;
        Token otherlv_1=null;
        Token lv_columnas_2_0=null;
        EObject lv_lines_3_0 = null;


         enterRule(); 
            
        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:167:28: ( ( ( (lv_filas_0_0= RULE_INT ) ) otherlv_1= 'x' ( (lv_columnas_2_0= RULE_INT ) ) ( (lv_lines_3_0= ruleLine ) )* ) )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:168:1: ( ( (lv_filas_0_0= RULE_INT ) ) otherlv_1= 'x' ( (lv_columnas_2_0= RULE_INT ) ) ( (lv_lines_3_0= ruleLine ) )* )
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:168:1: ( ( (lv_filas_0_0= RULE_INT ) ) otherlv_1= 'x' ( (lv_columnas_2_0= RULE_INT ) ) ( (lv_lines_3_0= ruleLine ) )* )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:168:2: ( (lv_filas_0_0= RULE_INT ) ) otherlv_1= 'x' ( (lv_columnas_2_0= RULE_INT ) ) ( (lv_lines_3_0= ruleLine ) )*
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:168:2: ( (lv_filas_0_0= RULE_INT ) )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:169:1: (lv_filas_0_0= RULE_INT )
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:169:1: (lv_filas_0_0= RULE_INT )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:170:3: lv_filas_0_0= RULE_INT
            {
            lv_filas_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMatrix309); 

            			newLeafNode(lv_filas_0_0, grammarAccess.getMatrixAccess().getFilasINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMatrixRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"filas",
                    		lv_filas_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleMatrix326); 

                	newLeafNode(otherlv_1, grammarAccess.getMatrixAccess().getXKeyword_1());
                
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:190:1: ( (lv_columnas_2_0= RULE_INT ) )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:191:1: (lv_columnas_2_0= RULE_INT )
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:191:1: (lv_columnas_2_0= RULE_INT )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:192:3: lv_columnas_2_0= RULE_INT
            {
            lv_columnas_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMatrix343); 

            			newLeafNode(lv_columnas_2_0, grammarAccess.getMatrixAccess().getColumnasINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMatrixRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"columnas",
                    		lv_columnas_2_0, 
                    		"INT");
            	    

            }


            }

            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:208:2: ( (lv_lines_3_0= ruleLine ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_INT||LA2_0==16||LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:209:1: (lv_lines_3_0= ruleLine )
            	    {
            	    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:209:1: (lv_lines_3_0= ruleLine )
            	    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:210:3: lv_lines_3_0= ruleLine
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMatrixAccess().getLinesLineParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLine_in_ruleMatrix369);
            	    lv_lines_3_0=ruleLine();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"lines",
            	            		lv_lines_3_0, 
            	            		"Line");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatrix"


    // $ANTLR start "entryRuleLine"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:234:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:235:2: (iv_ruleLine= ruleLine EOF )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:236:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_ruleLine_in_entryRuleLine406);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLine416); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:243:1: ruleLine returns [EObject current=null] : ( ( (lv_els_0_0= ruleElement ) ) (otherlv_1= ',' ( (lv_els_2_0= ruleElement ) ) )* ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_els_0_0 = null;

        EObject lv_els_2_0 = null;


         enterRule(); 
            
        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:246:28: ( ( ( (lv_els_0_0= ruleElement ) ) (otherlv_1= ',' ( (lv_els_2_0= ruleElement ) ) )* ) )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:247:1: ( ( (lv_els_0_0= ruleElement ) ) (otherlv_1= ',' ( (lv_els_2_0= ruleElement ) ) )* )
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:247:1: ( ( (lv_els_0_0= ruleElement ) ) (otherlv_1= ',' ( (lv_els_2_0= ruleElement ) ) )* )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:247:2: ( (lv_els_0_0= ruleElement ) ) (otherlv_1= ',' ( (lv_els_2_0= ruleElement ) ) )*
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:247:2: ( (lv_els_0_0= ruleElement ) )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:248:1: (lv_els_0_0= ruleElement )
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:248:1: (lv_els_0_0= ruleElement )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:249:3: lv_els_0_0= ruleElement
            {
             
            	        newCompositeNode(grammarAccess.getLineAccess().getElsElementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleElement_in_ruleLine462);
            lv_els_0_0=ruleElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLineRule());
            	        }
                   		add(
                   			current, 
                   			"els",
                    		lv_els_0_0, 
                    		"Element");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:265:2: (otherlv_1= ',' ( (lv_els_2_0= ruleElement ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:265:4: otherlv_1= ',' ( (lv_els_2_0= ruleElement ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleLine475); 

            	        	newLeafNode(otherlv_1, grammarAccess.getLineAccess().getCommaKeyword_1_0());
            	        
            	    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:269:1: ( (lv_els_2_0= ruleElement ) )
            	    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:270:1: (lv_els_2_0= ruleElement )
            	    {
            	    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:270:1: (lv_els_2_0= ruleElement )
            	    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:271:3: lv_els_2_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLineAccess().getElsElementParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleLine496);
            	    lv_els_2_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"els",
            	            		lv_els_2_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleElement"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:295:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:296:2: (iv_ruleElement= ruleElement EOF )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:297:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement534);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement544); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:304:1: ruleElement returns [EObject current=null] : (this_Number_0= ruleNumber | this_Empty_1= ruleEmpty ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Empty_1 = null;


         enterRule(); 
            
        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:307:28: ( (this_Number_0= ruleNumber | this_Empty_1= ruleEmpty ) )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:308:1: (this_Number_0= ruleNumber | this_Empty_1= ruleEmpty )
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:308:1: (this_Number_0= ruleNumber | this_Empty_1= ruleEmpty )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:309:5: this_Number_0= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getNumberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumber_in_ruleElement591);
                    this_Number_0=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:319:5: this_Empty_1= ruleEmpty
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getEmptyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEmpty_in_ruleElement618);
                    this_Empty_1=ruleEmpty();

                    state._fsp--;

                     
                            current = this_Empty_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleEmpty"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:335:1: entryRuleEmpty returns [EObject current=null] : iv_ruleEmpty= ruleEmpty EOF ;
    public final EObject entryRuleEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmpty = null;


        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:336:2: (iv_ruleEmpty= ruleEmpty EOF )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:337:2: iv_ruleEmpty= ruleEmpty EOF
            {
             newCompositeNode(grammarAccess.getEmptyRule()); 
            pushFollow(FOLLOW_ruleEmpty_in_entryRuleEmpty653);
            iv_ruleEmpty=ruleEmpty();

            state._fsp--;

             current =iv_ruleEmpty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmpty663); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmpty"


    // $ANTLR start "ruleEmpty"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:344:1: ruleEmpty returns [EObject current=null] : ( () otherlv_1= '_' ) ;
    public final EObject ruleEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:347:28: ( ( () otherlv_1= '_' ) )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:348:1: ( () otherlv_1= '_' )
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:348:1: ( () otherlv_1= '_' )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:348:2: () otherlv_1= '_'
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:348:2: ()
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:349:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEmptyAccess().getEmptyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleEmpty709); 

                	newLeafNode(otherlv_1, grammarAccess.getEmptyAccess().get_Keyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmpty"


    // $ANTLR start "entryRuleNumber"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:366:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:367:2: (iv_ruleNumber= ruleNumber EOF )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:368:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber745);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber755); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:375:1: ruleNumber returns [EObject current=null] : (this_PositiveNumber_0= rulePositiveNumber | this_NegativeNumber_1= ruleNegativeNumber ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        EObject this_PositiveNumber_0 = null;

        EObject this_NegativeNumber_1 = null;


         enterRule(); 
            
        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:378:28: ( (this_PositiveNumber_0= rulePositiveNumber | this_NegativeNumber_1= ruleNegativeNumber ) )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:379:1: (this_PositiveNumber_0= rulePositiveNumber | this_NegativeNumber_1= ruleNegativeNumber )
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:379:1: (this_PositiveNumber_0= rulePositiveNumber | this_NegativeNumber_1= ruleNegativeNumber )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:380:5: this_PositiveNumber_0= rulePositiveNumber
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getPositiveNumberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePositiveNumber_in_ruleNumber802);
                    this_PositiveNumber_0=rulePositiveNumber();

                    state._fsp--;

                     
                            current = this_PositiveNumber_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:390:5: this_NegativeNumber_1= ruleNegativeNumber
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getNegativeNumberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNegativeNumber_in_ruleNumber829);
                    this_NegativeNumber_1=ruleNegativeNumber();

                    state._fsp--;

                     
                            current = this_NegativeNumber_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRulePositiveNumber"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:406:1: entryRulePositiveNumber returns [EObject current=null] : iv_rulePositiveNumber= rulePositiveNumber EOF ;
    public final EObject entryRulePositiveNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveNumber = null;


        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:407:2: (iv_rulePositiveNumber= rulePositiveNumber EOF )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:408:2: iv_rulePositiveNumber= rulePositiveNumber EOF
            {
             newCompositeNode(grammarAccess.getPositiveNumberRule()); 
            pushFollow(FOLLOW_rulePositiveNumber_in_entryRulePositiveNumber864);
            iv_rulePositiveNumber=rulePositiveNumber();

            state._fsp--;

             current =iv_rulePositiveNumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePositiveNumber874); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePositiveNumber"


    // $ANTLR start "rulePositiveNumber"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:415:1: rulePositiveNumber returns [EObject current=null] : (this_Integer_0= ruleInteger ( () otherlv_2= '/' ( (lv_denominator_3_0= ruleInteger ) ) )? ) ;
    public final EObject rulePositiveNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Integer_0 = null;

        EObject lv_denominator_3_0 = null;


         enterRule(); 
            
        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:418:28: ( (this_Integer_0= ruleInteger ( () otherlv_2= '/' ( (lv_denominator_3_0= ruleInteger ) ) )? ) )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:419:1: (this_Integer_0= ruleInteger ( () otherlv_2= '/' ( (lv_denominator_3_0= ruleInteger ) ) )? )
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:419:1: (this_Integer_0= ruleInteger ( () otherlv_2= '/' ( (lv_denominator_3_0= ruleInteger ) ) )? )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:420:5: this_Integer_0= ruleInteger ( () otherlv_2= '/' ( (lv_denominator_3_0= ruleInteger ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getPositiveNumberAccess().getIntegerParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleInteger_in_rulePositiveNumber921);
            this_Integer_0=ruleInteger();

            state._fsp--;

             
                    current = this_Integer_0; 
                    afterParserOrEnumRuleCall();
                
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:428:1: ( () otherlv_2= '/' ( (lv_denominator_3_0= ruleInteger ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:428:2: () otherlv_2= '/' ( (lv_denominator_3_0= ruleInteger ) )
                    {
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:428:2: ()
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:429:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getPositiveNumberAccess().getFractionNumeratorAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePositiveNumber942); 

                        	newLeafNode(otherlv_2, grammarAccess.getPositiveNumberAccess().getSolidusKeyword_1_1());
                        
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:438:1: ( (lv_denominator_3_0= ruleInteger ) )
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:439:1: (lv_denominator_3_0= ruleInteger )
                    {
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:439:1: (lv_denominator_3_0= ruleInteger )
                    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:440:3: lv_denominator_3_0= ruleInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getPositiveNumberAccess().getDenominatorIntegerParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInteger_in_rulePositiveNumber963);
                    lv_denominator_3_0=ruleInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPositiveNumberRule());
                    	        }
                           		set(
                           			current, 
                           			"denominator",
                            		lv_denominator_3_0, 
                            		"Integer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePositiveNumber"


    // $ANTLR start "entryRuleInteger"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:464:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:465:2: (iv_ruleInteger= ruleInteger EOF )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:466:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger1001);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger1011); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:473:1: ruleInteger returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:476:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:477:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:477:1: ( (lv_value_0_0= RULE_INT ) )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:478:1: (lv_value_0_0= RULE_INT )
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:478:1: (lv_value_0_0= RULE_INT )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:479:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInteger1052); 

            			newLeafNode(lv_value_0_0, grammarAccess.getIntegerAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleNegativeNumber"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:503:1: entryRuleNegativeNumber returns [EObject current=null] : iv_ruleNegativeNumber= ruleNegativeNumber EOF ;
    public final EObject entryRuleNegativeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegativeNumber = null;


        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:504:2: (iv_ruleNegativeNumber= ruleNegativeNumber EOF )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:505:2: iv_ruleNegativeNumber= ruleNegativeNumber EOF
            {
             newCompositeNode(grammarAccess.getNegativeNumberRule()); 
            pushFollow(FOLLOW_ruleNegativeNumber_in_entryRuleNegativeNumber1092);
            iv_ruleNegativeNumber=ruleNegativeNumber();

            state._fsp--;

             current =iv_ruleNegativeNumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegativeNumber1102); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegativeNumber"


    // $ANTLR start "ruleNegativeNumber"
    // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:512:1: ruleNegativeNumber returns [EObject current=null] : (otherlv_0= '-' this_PositiveNumber_1= rulePositiveNumber ) ;
    public final EObject ruleNegativeNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_PositiveNumber_1 = null;


         enterRule(); 
            
        try {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:515:28: ( (otherlv_0= '-' this_PositiveNumber_1= rulePositiveNumber ) )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:516:1: (otherlv_0= '-' this_PositiveNumber_1= rulePositiveNumber )
            {
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:516:1: (otherlv_0= '-' this_PositiveNumber_1= rulePositiveNumber )
            // ../reboConf/src-gen/edu/upb/lp/parser/antlr/internal/InternalReboConf.g:516:3: otherlv_0= '-' this_PositiveNumber_1= rulePositiveNumber
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleNegativeNumber1139); 

                	newLeafNode(otherlv_0, grammarAccess.getNegativeNumberAccess().getHyphenMinusKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getNegativeNumberAccess().getPositiveNumberParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulePositiveNumber_in_ruleNegativeNumber1161);
            this_PositiveNumber_1=rulePositiveNumber();

            state._fsp--;

             
                    current = this_PositiveNumber_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegativeNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleConfiguration_in_entryRuleConfiguration75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfiguration85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConfiguration122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleConfiguration143 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleConfiguration157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleConfiguration178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleConfiguration198 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleConfiguration219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_entryRuleMatrix257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMatrix309 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMatrix326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMatrix343 = new BitSet(new long[]{0x0000000000050012L});
    public static final BitSet FOLLOW_ruleLine_in_ruleMatrix369 = new BitSet(new long[]{0x0000000000050012L});
    public static final BitSet FOLLOW_ruleLine_in_entryRuleLine406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLine416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleLine462 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleLine475 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_ruleElement_in_ruleLine496 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleElement591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmpty_in_ruleElement618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmpty_in_entryRuleEmpty653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmpty663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleEmpty709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositiveNumber_in_ruleNumber802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegativeNumber_in_ruleNumber829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositiveNumber_in_entryRulePositiveNumber864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePositiveNumber874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rulePositiveNumber921 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_rulePositiveNumber942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteger_in_rulePositiveNumber963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInteger1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegativeNumber_in_entryRuleNegativeNumber1092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegativeNumber1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleNegativeNumber1139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePositiveNumber_in_ruleNegativeNumber1161 = new BitSet(new long[]{0x0000000000000002L});

}