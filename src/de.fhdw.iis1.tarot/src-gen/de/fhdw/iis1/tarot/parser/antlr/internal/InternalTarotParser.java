package de.fhdw.iis1.tarot.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fhdw.iis1.tarot.services.TarotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTarotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "';'", "':='", "'+'", "'-'", "'EINGABE'", "'SCHREIBE'", "'GEHE'", "'ZU'", "'WENN'", "'('", "'='", "'<'", "'>'", "'<='", "'>='", "'!='", "')'", "'DANN'", "'Halt!'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTarotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTarotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTarotParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTarot.g"; }



     	private TarotGrammarAccess grammarAccess;

        public InternalTarotParser(TokenStream input, TarotGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Programm";
       	}

       	@Override
       	protected TarotGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgramm"
    // InternalTarot.g:64:1: entryRuleProgramm returns [EObject current=null] : iv_ruleProgramm= ruleProgramm EOF ;
    public final EObject entryRuleProgramm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramm = null;


        try {
            // InternalTarot.g:64:49: (iv_ruleProgramm= ruleProgramm EOF )
            // InternalTarot.g:65:2: iv_ruleProgramm= ruleProgramm EOF
            {
             newCompositeNode(grammarAccess.getProgrammRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgramm=ruleProgramm();

            state._fsp--;

             current =iv_ruleProgramm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgramm"


    // $ANTLR start "ruleProgramm"
    // InternalTarot.g:71:1: ruleProgramm returns [EObject current=null] : ( (lv_zeilen_0_0= ruleZeile ) )+ ;
    public final EObject ruleProgramm() throws RecognitionException {
        EObject current = null;

        EObject lv_zeilen_0_0 = null;



        	enterRule();

        try {
            // InternalTarot.g:77:2: ( ( (lv_zeilen_0_0= ruleZeile ) )+ )
            // InternalTarot.g:78:2: ( (lv_zeilen_0_0= ruleZeile ) )+
            {
            // InternalTarot.g:78:2: ( (lv_zeilen_0_0= ruleZeile ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTarot.g:79:3: (lv_zeilen_0_0= ruleZeile )
            	    {
            	    // InternalTarot.g:79:3: (lv_zeilen_0_0= ruleZeile )
            	    // InternalTarot.g:80:4: lv_zeilen_0_0= ruleZeile
            	    {

            	    				newCompositeNode(grammarAccess.getProgrammAccess().getZeilenZeileParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_zeilen_0_0=ruleZeile();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgrammRule());
            	    				}
            	    				add(
            	    					current,
            	    					"zeilen",
            	    					lv_zeilen_0_0,
            	    					"de.fhdw.iis1.tarot.Tarot.Zeile");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end "ruleProgramm"


    // $ANTLR start "entryRuleZeile"
    // InternalTarot.g:100:1: entryRuleZeile returns [EObject current=null] : iv_ruleZeile= ruleZeile EOF ;
    public final EObject entryRuleZeile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZeile = null;


        try {
            // InternalTarot.g:100:46: (iv_ruleZeile= ruleZeile EOF )
            // InternalTarot.g:101:2: iv_ruleZeile= ruleZeile EOF
            {
             newCompositeNode(grammarAccess.getZeileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZeile=ruleZeile();

            state._fsp--;

             current =iv_ruleZeile; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleZeile"


    // $ANTLR start "ruleZeile"
    // InternalTarot.g:107:1: ruleZeile returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_anweisung_2_0= ruleAnweisung ) ) otherlv_3= ';' ) ;
    public final EObject ruleZeile() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_anweisung_2_0 = null;



        	enterRule();

        try {
            // InternalTarot.g:113:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_anweisung_2_0= ruleAnweisung ) ) otherlv_3= ';' ) )
            // InternalTarot.g:114:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_anweisung_2_0= ruleAnweisung ) ) otherlv_3= ';' )
            {
            // InternalTarot.g:114:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_anweisung_2_0= ruleAnweisung ) ) otherlv_3= ';' )
            // InternalTarot.g:115:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_anweisung_2_0= ruleAnweisung ) ) otherlv_3= ';'
            {
            // InternalTarot.g:115:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTarot.g:116:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTarot.g:116:4: (lv_name_0_0= RULE_ID )
            // InternalTarot.g:117:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getZeileAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getZeileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getZeileAccess().getColonKeyword_1());
            		
            // InternalTarot.g:137:3: ( (lv_anweisung_2_0= ruleAnweisung ) )
            // InternalTarot.g:138:4: (lv_anweisung_2_0= ruleAnweisung )
            {
            // InternalTarot.g:138:4: (lv_anweisung_2_0= ruleAnweisung )
            // InternalTarot.g:139:5: lv_anweisung_2_0= ruleAnweisung
            {

            					newCompositeNode(grammarAccess.getZeileAccess().getAnweisungAnweisungParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_anweisung_2_0=ruleAnweisung();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getZeileRule());
            					}
            					set(
            						current,
            						"anweisung",
            						lv_anweisung_2_0,
            						"de.fhdw.iis1.tarot.Tarot.Anweisung");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getZeileAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleZeile"


    // $ANTLR start "entryRuleAnweisung"
    // InternalTarot.g:164:1: entryRuleAnweisung returns [EObject current=null] : iv_ruleAnweisung= ruleAnweisung EOF ;
    public final EObject entryRuleAnweisung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnweisung = null;


        try {
            // InternalTarot.g:164:50: (iv_ruleAnweisung= ruleAnweisung EOF )
            // InternalTarot.g:165:2: iv_ruleAnweisung= ruleAnweisung EOF
            {
             newCompositeNode(grammarAccess.getAnweisungRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnweisung=ruleAnweisung();

            state._fsp--;

             current =iv_ruleAnweisung; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnweisung"


    // $ANTLR start "ruleAnweisung"
    // InternalTarot.g:171:1: ruleAnweisung returns [EObject current=null] : (this_Zuordnung_0= ruleZuordnung | this_Eingabe_1= ruleEingabe | this_Ausgabe_2= ruleAusgabe | this_GeheZu_3= ruleGeheZu | this_KonditionalerGeheZu_4= ruleKonditionalerGeheZu | this_Halt_5= ruleHalt ) ;
    public final EObject ruleAnweisung() throws RecognitionException {
        EObject current = null;

        EObject this_Zuordnung_0 = null;

        EObject this_Eingabe_1 = null;

        EObject this_Ausgabe_2 = null;

        EObject this_GeheZu_3 = null;

        EObject this_KonditionalerGeheZu_4 = null;

        EObject this_Halt_5 = null;



        	enterRule();

        try {
            // InternalTarot.g:177:2: ( (this_Zuordnung_0= ruleZuordnung | this_Eingabe_1= ruleEingabe | this_Ausgabe_2= ruleAusgabe | this_GeheZu_3= ruleGeheZu | this_KonditionalerGeheZu_4= ruleKonditionalerGeheZu | this_Halt_5= ruleHalt ) )
            // InternalTarot.g:178:2: (this_Zuordnung_0= ruleZuordnung | this_Eingabe_1= ruleEingabe | this_Ausgabe_2= ruleAusgabe | this_GeheZu_3= ruleGeheZu | this_KonditionalerGeheZu_4= ruleKonditionalerGeheZu | this_Halt_5= ruleHalt )
            {
            // InternalTarot.g:178:2: (this_Zuordnung_0= ruleZuordnung | this_Eingabe_1= ruleEingabe | this_Ausgabe_2= ruleAusgabe | this_GeheZu_3= ruleGeheZu | this_KonditionalerGeheZu_4= ruleKonditionalerGeheZu | this_Halt_5= ruleHalt )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 30:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTarot.g:179:3: this_Zuordnung_0= ruleZuordnung
                    {

                    			newCompositeNode(grammarAccess.getAnweisungAccess().getZuordnungParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Zuordnung_0=ruleZuordnung();

                    state._fsp--;


                    			current = this_Zuordnung_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTarot.g:188:3: this_Eingabe_1= ruleEingabe
                    {

                    			newCompositeNode(grammarAccess.getAnweisungAccess().getEingabeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Eingabe_1=ruleEingabe();

                    state._fsp--;


                    			current = this_Eingabe_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTarot.g:197:3: this_Ausgabe_2= ruleAusgabe
                    {

                    			newCompositeNode(grammarAccess.getAnweisungAccess().getAusgabeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ausgabe_2=ruleAusgabe();

                    state._fsp--;


                    			current = this_Ausgabe_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTarot.g:206:3: this_GeheZu_3= ruleGeheZu
                    {

                    			newCompositeNode(grammarAccess.getAnweisungAccess().getGeheZuParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeheZu_3=ruleGeheZu();

                    state._fsp--;


                    			current = this_GeheZu_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTarot.g:215:3: this_KonditionalerGeheZu_4= ruleKonditionalerGeheZu
                    {

                    			newCompositeNode(grammarAccess.getAnweisungAccess().getKonditionalerGeheZuParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_KonditionalerGeheZu_4=ruleKonditionalerGeheZu();

                    state._fsp--;


                    			current = this_KonditionalerGeheZu_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTarot.g:224:3: this_Halt_5= ruleHalt
                    {

                    			newCompositeNode(grammarAccess.getAnweisungAccess().getHaltParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Halt_5=ruleHalt();

                    state._fsp--;


                    			current = this_Halt_5;
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
    // $ANTLR end "ruleAnweisung"


    // $ANTLR start "entryRuleZuordnung"
    // InternalTarot.g:236:1: entryRuleZuordnung returns [EObject current=null] : iv_ruleZuordnung= ruleZuordnung EOF ;
    public final EObject entryRuleZuordnung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZuordnung = null;


        try {
            // InternalTarot.g:236:50: (iv_ruleZuordnung= ruleZuordnung EOF )
            // InternalTarot.g:237:2: iv_ruleZuordnung= ruleZuordnung EOF
            {
             newCompositeNode(grammarAccess.getZuordnungRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZuordnung=ruleZuordnung();

            state._fsp--;

             current =iv_ruleZuordnung; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleZuordnung"


    // $ANTLR start "ruleZuordnung"
    // InternalTarot.g:243:1: ruleZuordnung returns [EObject current=null] : ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_ausdruck_2_0= ruleAusdruck ) ) ) ;
    public final EObject ruleZuordnung() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        EObject lv_ausdruck_2_0 = null;



        	enterRule();

        try {
            // InternalTarot.g:249:2: ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_ausdruck_2_0= ruleAusdruck ) ) ) )
            // InternalTarot.g:250:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_ausdruck_2_0= ruleAusdruck ) ) )
            {
            // InternalTarot.g:250:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_ausdruck_2_0= ruleAusdruck ) ) )
            // InternalTarot.g:251:3: ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_ausdruck_2_0= ruleAusdruck ) )
            {
            // InternalTarot.g:251:3: ( (lv_var_0_0= RULE_ID ) )
            // InternalTarot.g:252:4: (lv_var_0_0= RULE_ID )
            {
            // InternalTarot.g:252:4: (lv_var_0_0= RULE_ID )
            // InternalTarot.g:253:5: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_var_0_0, grammarAccess.getZuordnungAccess().getVarIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getZuordnungRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getZuordnungAccess().getColonEqualsSignKeyword_1());
            		
            // InternalTarot.g:273:3: ( (lv_ausdruck_2_0= ruleAusdruck ) )
            // InternalTarot.g:274:4: (lv_ausdruck_2_0= ruleAusdruck )
            {
            // InternalTarot.g:274:4: (lv_ausdruck_2_0= ruleAusdruck )
            // InternalTarot.g:275:5: lv_ausdruck_2_0= ruleAusdruck
            {

            					newCompositeNode(grammarAccess.getZuordnungAccess().getAusdruckAusdruckParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ausdruck_2_0=ruleAusdruck();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getZuordnungRule());
            					}
            					set(
            						current,
            						"ausdruck",
            						lv_ausdruck_2_0,
            						"de.fhdw.iis1.tarot.Tarot.Ausdruck");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleZuordnung"


    // $ANTLR start "entryRuleAusdruck"
    // InternalTarot.g:296:1: entryRuleAusdruck returns [EObject current=null] : iv_ruleAusdruck= ruleAusdruck EOF ;
    public final EObject entryRuleAusdruck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAusdruck = null;


        try {
            // InternalTarot.g:296:49: (iv_ruleAusdruck= ruleAusdruck EOF )
            // InternalTarot.g:297:2: iv_ruleAusdruck= ruleAusdruck EOF
            {
             newCompositeNode(grammarAccess.getAusdruckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAusdruck=ruleAusdruck();

            state._fsp--;

             current =iv_ruleAusdruck; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAusdruck"


    // $ANTLR start "ruleAusdruck"
    // InternalTarot.g:303:1: ruleAusdruck returns [EObject current=null] : (this_StrichOperation_0= ruleStrichOperation | this_Ganzzahl_1= ruleGanzzahl ) ;
    public final EObject ruleAusdruck() throws RecognitionException {
        EObject current = null;

        EObject this_StrichOperation_0 = null;

        EObject this_Ganzzahl_1 = null;



        	enterRule();

        try {
            // InternalTarot.g:309:2: ( (this_StrichOperation_0= ruleStrichOperation | this_Ganzzahl_1= ruleGanzzahl ) )
            // InternalTarot.g:310:2: (this_StrichOperation_0= ruleStrichOperation | this_Ganzzahl_1= ruleGanzzahl )
            {
            // InternalTarot.g:310:2: (this_StrichOperation_0= ruleStrichOperation | this_Ganzzahl_1= ruleGanzzahl )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTarot.g:311:3: this_StrichOperation_0= ruleStrichOperation
                    {

                    			newCompositeNode(grammarAccess.getAusdruckAccess().getStrichOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StrichOperation_0=ruleStrichOperation();

                    state._fsp--;


                    			current = this_StrichOperation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTarot.g:320:3: this_Ganzzahl_1= ruleGanzzahl
                    {

                    			newCompositeNode(grammarAccess.getAusdruckAccess().getGanzzahlParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ganzzahl_1=ruleGanzzahl();

                    state._fsp--;


                    			current = this_Ganzzahl_1;
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
    // $ANTLR end "ruleAusdruck"


    // $ANTLR start "entryRuleStrichOperation"
    // InternalTarot.g:332:1: entryRuleStrichOperation returns [EObject current=null] : iv_ruleStrichOperation= ruleStrichOperation EOF ;
    public final EObject entryRuleStrichOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrichOperation = null;


        try {
            // InternalTarot.g:332:56: (iv_ruleStrichOperation= ruleStrichOperation EOF )
            // InternalTarot.g:333:2: iv_ruleStrichOperation= ruleStrichOperation EOF
            {
             newCompositeNode(grammarAccess.getStrichOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrichOperation=ruleStrichOperation();

            state._fsp--;

             current =iv_ruleStrichOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStrichOperation"


    // $ANTLR start "ruleStrichOperation"
    // InternalTarot.g:339:1: ruleStrichOperation returns [EObject current=null] : ( () ( (lv_links_1_0= RULE_ID ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rechts_3_0= RULE_ID ) ) ) ) ;
    public final EObject ruleStrichOperation() throws RecognitionException {
        EObject current = null;

        Token lv_links_1_0=null;
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_rechts_3_0=null;


        	enterRule();

        try {
            // InternalTarot.g:345:2: ( ( () ( (lv_links_1_0= RULE_ID ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rechts_3_0= RULE_ID ) ) ) ) )
            // InternalTarot.g:346:2: ( () ( (lv_links_1_0= RULE_ID ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rechts_3_0= RULE_ID ) ) ) )
            {
            // InternalTarot.g:346:2: ( () ( (lv_links_1_0= RULE_ID ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rechts_3_0= RULE_ID ) ) ) )
            // InternalTarot.g:347:3: () ( (lv_links_1_0= RULE_ID ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rechts_3_0= RULE_ID ) ) )
            {
            // InternalTarot.g:347:3: ()
            // InternalTarot.g:348:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStrichOperationAccess().getStrichOperationAction_0(),
            					current);
            			

            }

            // InternalTarot.g:354:3: ( (lv_links_1_0= RULE_ID ) )
            // InternalTarot.g:355:4: (lv_links_1_0= RULE_ID )
            {
            // InternalTarot.g:355:4: (lv_links_1_0= RULE_ID )
            // InternalTarot.g:356:5: lv_links_1_0= RULE_ID
            {
            lv_links_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_links_1_0, grammarAccess.getStrichOperationAccess().getLinksIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStrichOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"links",
            						lv_links_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTarot.g:372:3: ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rechts_3_0= RULE_ID ) ) )
            // InternalTarot.g:373:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rechts_3_0= RULE_ID ) )
            {
            // InternalTarot.g:373:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            // InternalTarot.g:374:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            {
            // InternalTarot.g:374:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            // InternalTarot.g:375:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            {
            // InternalTarot.g:375:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTarot.g:376:7: lv_op_2_1= '+'
                    {
                    lv_op_2_1=(Token)match(input,14,FOLLOW_10); 

                    							newLeafNode(lv_op_2_1, grammarAccess.getStrichOperationAccess().getOpPlusSignKeyword_2_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getStrichOperationRule());
                    							}
                    							setWithLastConsumed(current, "op", lv_op_2_1, null);
                    						

                    }
                    break;
                case 2 :
                    // InternalTarot.g:387:7: lv_op_2_2= '-'
                    {
                    lv_op_2_2=(Token)match(input,15,FOLLOW_10); 

                    							newLeafNode(lv_op_2_2, grammarAccess.getStrichOperationAccess().getOpHyphenMinusKeyword_2_0_0_1());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getStrichOperationRule());
                    							}
                    							setWithLastConsumed(current, "op", lv_op_2_2, null);
                    						

                    }
                    break;

            }


            }


            }

            // InternalTarot.g:400:4: ( (lv_rechts_3_0= RULE_ID ) )
            // InternalTarot.g:401:5: (lv_rechts_3_0= RULE_ID )
            {
            // InternalTarot.g:401:5: (lv_rechts_3_0= RULE_ID )
            // InternalTarot.g:402:6: lv_rechts_3_0= RULE_ID
            {
            lv_rechts_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            						newLeafNode(lv_rechts_3_0, grammarAccess.getStrichOperationAccess().getRechtsIDTerminalRuleCall_2_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getStrichOperationRule());
            						}
            						setWithLastConsumed(
            							current,
            							"rechts",
            							lv_rechts_3_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }


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
    // $ANTLR end "ruleStrichOperation"


    // $ANTLR start "entryRuleGanzzahl"
    // InternalTarot.g:423:1: entryRuleGanzzahl returns [EObject current=null] : iv_ruleGanzzahl= ruleGanzzahl EOF ;
    public final EObject entryRuleGanzzahl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGanzzahl = null;


        try {
            // InternalTarot.g:423:49: (iv_ruleGanzzahl= ruleGanzzahl EOF )
            // InternalTarot.g:424:2: iv_ruleGanzzahl= ruleGanzzahl EOF
            {
             newCompositeNode(grammarAccess.getGanzzahlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGanzzahl=ruleGanzzahl();

            state._fsp--;

             current =iv_ruleGanzzahl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGanzzahl"


    // $ANTLR start "ruleGanzzahl"
    // InternalTarot.g:430:1: ruleGanzzahl returns [EObject current=null] : ( () ( (lv_wert_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGanzzahl() throws RecognitionException {
        EObject current = null;

        Token lv_wert_1_0=null;


        	enterRule();

        try {
            // InternalTarot.g:436:2: ( ( () ( (lv_wert_1_0= RULE_INT ) ) ) )
            // InternalTarot.g:437:2: ( () ( (lv_wert_1_0= RULE_INT ) ) )
            {
            // InternalTarot.g:437:2: ( () ( (lv_wert_1_0= RULE_INT ) ) )
            // InternalTarot.g:438:3: () ( (lv_wert_1_0= RULE_INT ) )
            {
            // InternalTarot.g:438:3: ()
            // InternalTarot.g:439:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGanzzahlAccess().getGanzzahlAction_0(),
            					current);
            			

            }

            // InternalTarot.g:445:3: ( (lv_wert_1_0= RULE_INT ) )
            // InternalTarot.g:446:4: (lv_wert_1_0= RULE_INT )
            {
            // InternalTarot.g:446:4: (lv_wert_1_0= RULE_INT )
            // InternalTarot.g:447:5: lv_wert_1_0= RULE_INT
            {
            lv_wert_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_wert_1_0, grammarAccess.getGanzzahlAccess().getWertINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGanzzahlRule());
            					}
            					setWithLastConsumed(
            						current,
            						"wert",
            						lv_wert_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleGanzzahl"


    // $ANTLR start "entryRuleEingabe"
    // InternalTarot.g:467:1: entryRuleEingabe returns [EObject current=null] : iv_ruleEingabe= ruleEingabe EOF ;
    public final EObject entryRuleEingabe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEingabe = null;


        try {
            // InternalTarot.g:467:48: (iv_ruleEingabe= ruleEingabe EOF )
            // InternalTarot.g:468:2: iv_ruleEingabe= ruleEingabe EOF
            {
             newCompositeNode(grammarAccess.getEingabeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEingabe=ruleEingabe();

            state._fsp--;

             current =iv_ruleEingabe; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEingabe"


    // $ANTLR start "ruleEingabe"
    // InternalTarot.g:474:1: ruleEingabe returns [EObject current=null] : (otherlv_0= 'EINGABE' ( (lv_var_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEingabe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_1_0=null;


        	enterRule();

        try {
            // InternalTarot.g:480:2: ( (otherlv_0= 'EINGABE' ( (lv_var_1_0= RULE_ID ) ) ) )
            // InternalTarot.g:481:2: (otherlv_0= 'EINGABE' ( (lv_var_1_0= RULE_ID ) ) )
            {
            // InternalTarot.g:481:2: (otherlv_0= 'EINGABE' ( (lv_var_1_0= RULE_ID ) ) )
            // InternalTarot.g:482:3: otherlv_0= 'EINGABE' ( (lv_var_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEingabeAccess().getEINGABEKeyword_0());
            		
            // InternalTarot.g:486:3: ( (lv_var_1_0= RULE_ID ) )
            // InternalTarot.g:487:4: (lv_var_1_0= RULE_ID )
            {
            // InternalTarot.g:487:4: (lv_var_1_0= RULE_ID )
            // InternalTarot.g:488:5: lv_var_1_0= RULE_ID
            {
            lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_var_1_0, grammarAccess.getEingabeAccess().getVarIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEingabeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


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
    // $ANTLR end "ruleEingabe"


    // $ANTLR start "entryRuleAusgabe"
    // InternalTarot.g:508:1: entryRuleAusgabe returns [EObject current=null] : iv_ruleAusgabe= ruleAusgabe EOF ;
    public final EObject entryRuleAusgabe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAusgabe = null;


        try {
            // InternalTarot.g:508:48: (iv_ruleAusgabe= ruleAusgabe EOF )
            // InternalTarot.g:509:2: iv_ruleAusgabe= ruleAusgabe EOF
            {
             newCompositeNode(grammarAccess.getAusgabeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAusgabe=ruleAusgabe();

            state._fsp--;

             current =iv_ruleAusgabe; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAusgabe"


    // $ANTLR start "ruleAusgabe"
    // InternalTarot.g:515:1: ruleAusgabe returns [EObject current=null] : (otherlv_0= 'SCHREIBE' ( (lv_var_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAusgabe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_1_0=null;


        	enterRule();

        try {
            // InternalTarot.g:521:2: ( (otherlv_0= 'SCHREIBE' ( (lv_var_1_0= RULE_ID ) ) ) )
            // InternalTarot.g:522:2: (otherlv_0= 'SCHREIBE' ( (lv_var_1_0= RULE_ID ) ) )
            {
            // InternalTarot.g:522:2: (otherlv_0= 'SCHREIBE' ( (lv_var_1_0= RULE_ID ) ) )
            // InternalTarot.g:523:3: otherlv_0= 'SCHREIBE' ( (lv_var_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAusgabeAccess().getSCHREIBEKeyword_0());
            		
            // InternalTarot.g:527:3: ( (lv_var_1_0= RULE_ID ) )
            // InternalTarot.g:528:4: (lv_var_1_0= RULE_ID )
            {
            // InternalTarot.g:528:4: (lv_var_1_0= RULE_ID )
            // InternalTarot.g:529:5: lv_var_1_0= RULE_ID
            {
            lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_var_1_0, grammarAccess.getAusgabeAccess().getVarIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAusgabeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


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
    // $ANTLR end "ruleAusgabe"


    // $ANTLR start "entryRuleGeheZu"
    // InternalTarot.g:549:1: entryRuleGeheZu returns [EObject current=null] : iv_ruleGeheZu= ruleGeheZu EOF ;
    public final EObject entryRuleGeheZu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeheZu = null;


        try {
            // InternalTarot.g:549:47: (iv_ruleGeheZu= ruleGeheZu EOF )
            // InternalTarot.g:550:2: iv_ruleGeheZu= ruleGeheZu EOF
            {
             newCompositeNode(grammarAccess.getGeheZuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeheZu=ruleGeheZu();

            state._fsp--;

             current =iv_ruleGeheZu; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGeheZu"


    // $ANTLR start "ruleGeheZu"
    // InternalTarot.g:556:1: ruleGeheZu returns [EObject current=null] : (otherlv_0= 'GEHE' otherlv_1= 'ZU' ( (lv_ziel_2_0= RULE_ID ) ) ) ;
    public final EObject ruleGeheZu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ziel_2_0=null;


        	enterRule();

        try {
            // InternalTarot.g:562:2: ( (otherlv_0= 'GEHE' otherlv_1= 'ZU' ( (lv_ziel_2_0= RULE_ID ) ) ) )
            // InternalTarot.g:563:2: (otherlv_0= 'GEHE' otherlv_1= 'ZU' ( (lv_ziel_2_0= RULE_ID ) ) )
            {
            // InternalTarot.g:563:2: (otherlv_0= 'GEHE' otherlv_1= 'ZU' ( (lv_ziel_2_0= RULE_ID ) ) )
            // InternalTarot.g:564:3: otherlv_0= 'GEHE' otherlv_1= 'ZU' ( (lv_ziel_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGeheZuAccess().getGEHEKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getGeheZuAccess().getZUKeyword_1());
            		
            // InternalTarot.g:572:3: ( (lv_ziel_2_0= RULE_ID ) )
            // InternalTarot.g:573:4: (lv_ziel_2_0= RULE_ID )
            {
            // InternalTarot.g:573:4: (lv_ziel_2_0= RULE_ID )
            // InternalTarot.g:574:5: lv_ziel_2_0= RULE_ID
            {
            lv_ziel_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_ziel_2_0, grammarAccess.getGeheZuAccess().getZielIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeheZuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ziel",
            						lv_ziel_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


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
    // $ANTLR end "ruleGeheZu"


    // $ANTLR start "entryRuleKonditionalerGeheZu"
    // InternalTarot.g:594:1: entryRuleKonditionalerGeheZu returns [EObject current=null] : iv_ruleKonditionalerGeheZu= ruleKonditionalerGeheZu EOF ;
    public final EObject entryRuleKonditionalerGeheZu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKonditionalerGeheZu = null;


        try {
            // InternalTarot.g:594:60: (iv_ruleKonditionalerGeheZu= ruleKonditionalerGeheZu EOF )
            // InternalTarot.g:595:2: iv_ruleKonditionalerGeheZu= ruleKonditionalerGeheZu EOF
            {
             newCompositeNode(grammarAccess.getKonditionalerGeheZuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKonditionalerGeheZu=ruleKonditionalerGeheZu();

            state._fsp--;

             current =iv_ruleKonditionalerGeheZu; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKonditionalerGeheZu"


    // $ANTLR start "ruleKonditionalerGeheZu"
    // InternalTarot.g:601:1: ruleKonditionalerGeheZu returns [EObject current=null] : (otherlv_0= 'WENN' otherlv_1= '(' ( (lv_links_2_0= RULE_ID ) ) ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' | lv_op_3_4= '<=' | lv_op_3_5= '>=' | lv_op_3_6= '!=' ) ) ) ( (lv_rechts_4_0= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'DANN' otherlv_7= 'GEHE' otherlv_8= 'ZU' ( (lv_ziel_9_0= RULE_ID ) ) ) ;
    public final EObject ruleKonditionalerGeheZu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_links_2_0=null;
        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        Token lv_op_3_3=null;
        Token lv_op_3_4=null;
        Token lv_op_3_5=null;
        Token lv_op_3_6=null;
        Token lv_rechts_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_ziel_9_0=null;


        	enterRule();

        try {
            // InternalTarot.g:607:2: ( (otherlv_0= 'WENN' otherlv_1= '(' ( (lv_links_2_0= RULE_ID ) ) ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' | lv_op_3_4= '<=' | lv_op_3_5= '>=' | lv_op_3_6= '!=' ) ) ) ( (lv_rechts_4_0= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'DANN' otherlv_7= 'GEHE' otherlv_8= 'ZU' ( (lv_ziel_9_0= RULE_ID ) ) ) )
            // InternalTarot.g:608:2: (otherlv_0= 'WENN' otherlv_1= '(' ( (lv_links_2_0= RULE_ID ) ) ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' | lv_op_3_4= '<=' | lv_op_3_5= '>=' | lv_op_3_6= '!=' ) ) ) ( (lv_rechts_4_0= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'DANN' otherlv_7= 'GEHE' otherlv_8= 'ZU' ( (lv_ziel_9_0= RULE_ID ) ) )
            {
            // InternalTarot.g:608:2: (otherlv_0= 'WENN' otherlv_1= '(' ( (lv_links_2_0= RULE_ID ) ) ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' | lv_op_3_4= '<=' | lv_op_3_5= '>=' | lv_op_3_6= '!=' ) ) ) ( (lv_rechts_4_0= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'DANN' otherlv_7= 'GEHE' otherlv_8= 'ZU' ( (lv_ziel_9_0= RULE_ID ) ) )
            // InternalTarot.g:609:3: otherlv_0= 'WENN' otherlv_1= '(' ( (lv_links_2_0= RULE_ID ) ) ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' | lv_op_3_4= '<=' | lv_op_3_5= '>=' | lv_op_3_6= '!=' ) ) ) ( (lv_rechts_4_0= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'DANN' otherlv_7= 'GEHE' otherlv_8= 'ZU' ( (lv_ziel_9_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getKonditionalerGeheZuAccess().getWENNKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getKonditionalerGeheZuAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTarot.g:617:3: ( (lv_links_2_0= RULE_ID ) )
            // InternalTarot.g:618:4: (lv_links_2_0= RULE_ID )
            {
            // InternalTarot.g:618:4: (lv_links_2_0= RULE_ID )
            // InternalTarot.g:619:5: lv_links_2_0= RULE_ID
            {
            lv_links_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_links_2_0, grammarAccess.getKonditionalerGeheZuAccess().getLinksIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKonditionalerGeheZuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"links",
            						lv_links_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTarot.g:635:3: ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' | lv_op_3_4= '<=' | lv_op_3_5= '>=' | lv_op_3_6= '!=' ) ) )
            // InternalTarot.g:636:4: ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' | lv_op_3_4= '<=' | lv_op_3_5= '>=' | lv_op_3_6= '!=' ) )
            {
            // InternalTarot.g:636:4: ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' | lv_op_3_4= '<=' | lv_op_3_5= '>=' | lv_op_3_6= '!=' ) )
            // InternalTarot.g:637:5: (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' | lv_op_3_4= '<=' | lv_op_3_5= '>=' | lv_op_3_6= '!=' )
            {
            // InternalTarot.g:637:5: (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' | lv_op_3_4= '<=' | lv_op_3_5= '>=' | lv_op_3_6= '!=' )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            case 26:
                {
                alt5=5;
                }
                break;
            case 27:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTarot.g:638:6: lv_op_3_1= '='
                    {
                    lv_op_3_1=(Token)match(input,22,FOLLOW_10); 

                    						newLeafNode(lv_op_3_1, grammarAccess.getKonditionalerGeheZuAccess().getOpEqualsSignKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKonditionalerGeheZuRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTarot.g:649:6: lv_op_3_2= '<'
                    {
                    lv_op_3_2=(Token)match(input,23,FOLLOW_10); 

                    						newLeafNode(lv_op_3_2, grammarAccess.getKonditionalerGeheZuAccess().getOpLessThanSignKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKonditionalerGeheZuRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTarot.g:660:6: lv_op_3_3= '>'
                    {
                    lv_op_3_3=(Token)match(input,24,FOLLOW_10); 

                    						newLeafNode(lv_op_3_3, grammarAccess.getKonditionalerGeheZuAccess().getOpGreaterThanSignKeyword_3_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKonditionalerGeheZuRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalTarot.g:671:6: lv_op_3_4= '<='
                    {
                    lv_op_3_4=(Token)match(input,25,FOLLOW_10); 

                    						newLeafNode(lv_op_3_4, grammarAccess.getKonditionalerGeheZuAccess().getOpLessThanSignEqualsSignKeyword_3_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKonditionalerGeheZuRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalTarot.g:682:6: lv_op_3_5= '>='
                    {
                    lv_op_3_5=(Token)match(input,26,FOLLOW_10); 

                    						newLeafNode(lv_op_3_5, grammarAccess.getKonditionalerGeheZuAccess().getOpGreaterThanSignEqualsSignKeyword_3_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKonditionalerGeheZuRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalTarot.g:693:6: lv_op_3_6= '!='
                    {
                    lv_op_3_6=(Token)match(input,27,FOLLOW_10); 

                    						newLeafNode(lv_op_3_6, grammarAccess.getKonditionalerGeheZuAccess().getOpExclamationMarkEqualsSignKeyword_3_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKonditionalerGeheZuRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_6, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalTarot.g:706:3: ( (lv_rechts_4_0= RULE_ID ) )
            // InternalTarot.g:707:4: (lv_rechts_4_0= RULE_ID )
            {
            // InternalTarot.g:707:4: (lv_rechts_4_0= RULE_ID )
            // InternalTarot.g:708:5: lv_rechts_4_0= RULE_ID
            {
            lv_rechts_4_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_rechts_4_0, grammarAccess.getKonditionalerGeheZuAccess().getRechtsIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKonditionalerGeheZuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rechts",
            						lv_rechts_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getKonditionalerGeheZuAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getKonditionalerGeheZuAccess().getDANNKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getKonditionalerGeheZuAccess().getGEHEKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getKonditionalerGeheZuAccess().getZUKeyword_8());
            		
            // InternalTarot.g:740:3: ( (lv_ziel_9_0= RULE_ID ) )
            // InternalTarot.g:741:4: (lv_ziel_9_0= RULE_ID )
            {
            // InternalTarot.g:741:4: (lv_ziel_9_0= RULE_ID )
            // InternalTarot.g:742:5: lv_ziel_9_0= RULE_ID
            {
            lv_ziel_9_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_ziel_9_0, grammarAccess.getKonditionalerGeheZuAccess().getZielIDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKonditionalerGeheZuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ziel",
            						lv_ziel_9_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


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
    // $ANTLR end "ruleKonditionalerGeheZu"


    // $ANTLR start "entryRuleHalt"
    // InternalTarot.g:762:1: entryRuleHalt returns [EObject current=null] : iv_ruleHalt= ruleHalt EOF ;
    public final EObject entryRuleHalt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHalt = null;


        try {
            // InternalTarot.g:762:45: (iv_ruleHalt= ruleHalt EOF )
            // InternalTarot.g:763:2: iv_ruleHalt= ruleHalt EOF
            {
             newCompositeNode(grammarAccess.getHaltRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHalt=ruleHalt();

            state._fsp--;

             current =iv_ruleHalt; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHalt"


    // $ANTLR start "ruleHalt"
    // InternalTarot.g:769:1: ruleHalt returns [EObject current=null] : ( () otherlv_1= 'Halt!' ) ;
    public final EObject ruleHalt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTarot.g:775:2: ( ( () otherlv_1= 'Halt!' ) )
            // InternalTarot.g:776:2: ( () otherlv_1= 'Halt!' )
            {
            // InternalTarot.g:776:2: ( () otherlv_1= 'Halt!' )
            // InternalTarot.g:777:3: () otherlv_1= 'Halt!'
            {
            // InternalTarot.g:777:3: ()
            // InternalTarot.g:778:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHaltAccess().getHaltAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getHaltAccess().getHaltKeyword_1());
            		

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
    // $ANTLR end "ruleHalt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040170010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});

}