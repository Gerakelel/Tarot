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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "';'", "':='", "'+'", "'-'", "'EINGABE'", "'SCHREIBE'", "'GEHE'", "'ZU'", "'WENN'", "'('", "'='", "'<'", "'>'", "')'", "'DANN'", "'Halt!'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
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
    // InternalTarot.g:107:1: ruleZeile returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_anweisung_2_0= ruleAnweisung ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleZeile() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_anweisung_2_0 = null;



        	enterRule();

        try {
            // InternalTarot.g:113:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_anweisung_2_0= ruleAnweisung ) ) (otherlv_3= ';' )? ) )
            // InternalTarot.g:114:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_anweisung_2_0= ruleAnweisung ) ) (otherlv_3= ';' )? )
            {
            // InternalTarot.g:114:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_anweisung_2_0= ruleAnweisung ) ) (otherlv_3= ';' )? )
            // InternalTarot.g:115:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_anweisung_2_0= ruleAnweisung ) ) (otherlv_3= ';' )?
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

            // InternalTarot.g:156:3: (otherlv_3= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTarot.g:157:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getZeileAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleZeile"


    // $ANTLR start "entryRuleAnweisung"
    // InternalTarot.g:166:1: entryRuleAnweisung returns [EObject current=null] : iv_ruleAnweisung= ruleAnweisung EOF ;
    public final EObject entryRuleAnweisung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnweisung = null;


        try {
            // InternalTarot.g:166:50: (iv_ruleAnweisung= ruleAnweisung EOF )
            // InternalTarot.g:167:2: iv_ruleAnweisung= ruleAnweisung EOF
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
    // InternalTarot.g:173:1: ruleAnweisung returns [EObject current=null] : (this_Zuordnung_0= ruleZuordnung | this_Eingabe_1= ruleEingabe | this_Ausgabe_2= ruleAusgabe | this_GeheZu_3= ruleGeheZu | this_KonditionalerGeheZu_4= ruleKonditionalerGeheZu | this_Halt_5= ruleHalt ) ;
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
            // InternalTarot.g:179:2: ( (this_Zuordnung_0= ruleZuordnung | this_Eingabe_1= ruleEingabe | this_Ausgabe_2= ruleAusgabe | this_GeheZu_3= ruleGeheZu | this_KonditionalerGeheZu_4= ruleKonditionalerGeheZu | this_Halt_5= ruleHalt ) )
            // InternalTarot.g:180:2: (this_Zuordnung_0= ruleZuordnung | this_Eingabe_1= ruleEingabe | this_Ausgabe_2= ruleAusgabe | this_GeheZu_3= ruleGeheZu | this_KonditionalerGeheZu_4= ruleKonditionalerGeheZu | this_Halt_5= ruleHalt )
            {
            // InternalTarot.g:180:2: (this_Zuordnung_0= ruleZuordnung | this_Eingabe_1= ruleEingabe | this_Ausgabe_2= ruleAusgabe | this_GeheZu_3= ruleGeheZu | this_KonditionalerGeheZu_4= ruleKonditionalerGeheZu | this_Halt_5= ruleHalt )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            case 27:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTarot.g:181:3: this_Zuordnung_0= ruleZuordnung
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
                    // InternalTarot.g:190:3: this_Eingabe_1= ruleEingabe
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
                    // InternalTarot.g:199:3: this_Ausgabe_2= ruleAusgabe
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
                    // InternalTarot.g:208:3: this_GeheZu_3= ruleGeheZu
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
                    // InternalTarot.g:217:3: this_KonditionalerGeheZu_4= ruleKonditionalerGeheZu
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
                    // InternalTarot.g:226:3: this_Halt_5= ruleHalt
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
    // InternalTarot.g:238:1: entryRuleZuordnung returns [EObject current=null] : iv_ruleZuordnung= ruleZuordnung EOF ;
    public final EObject entryRuleZuordnung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZuordnung = null;


        try {
            // InternalTarot.g:238:50: (iv_ruleZuordnung= ruleZuordnung EOF )
            // InternalTarot.g:239:2: iv_ruleZuordnung= ruleZuordnung EOF
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
    // InternalTarot.g:245:1: ruleZuordnung returns [EObject current=null] : ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_ausdruck_2_0= ruleAusdruck ) ) ) ;
    public final EObject ruleZuordnung() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        EObject lv_ausdruck_2_0 = null;



        	enterRule();

        try {
            // InternalTarot.g:251:2: ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_ausdruck_2_0= ruleAusdruck ) ) ) )
            // InternalTarot.g:252:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_ausdruck_2_0= ruleAusdruck ) ) )
            {
            // InternalTarot.g:252:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_ausdruck_2_0= ruleAusdruck ) ) )
            // InternalTarot.g:253:3: ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_ausdruck_2_0= ruleAusdruck ) )
            {
            // InternalTarot.g:253:3: ( (lv_var_0_0= RULE_ID ) )
            // InternalTarot.g:254:4: (lv_var_0_0= RULE_ID )
            {
            // InternalTarot.g:254:4: (lv_var_0_0= RULE_ID )
            // InternalTarot.g:255:5: lv_var_0_0= RULE_ID
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
            		
            // InternalTarot.g:275:3: ( (lv_ausdruck_2_0= ruleAusdruck ) )
            // InternalTarot.g:276:4: (lv_ausdruck_2_0= ruleAusdruck )
            {
            // InternalTarot.g:276:4: (lv_ausdruck_2_0= ruleAusdruck )
            // InternalTarot.g:277:5: lv_ausdruck_2_0= ruleAusdruck
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
    // InternalTarot.g:298:1: entryRuleAusdruck returns [EObject current=null] : iv_ruleAusdruck= ruleAusdruck EOF ;
    public final EObject entryRuleAusdruck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAusdruck = null;


        try {
            // InternalTarot.g:298:49: (iv_ruleAusdruck= ruleAusdruck EOF )
            // InternalTarot.g:299:2: iv_ruleAusdruck= ruleAusdruck EOF
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
    // InternalTarot.g:305:1: ruleAusdruck returns [EObject current=null] : (this_StrichOperation_0= ruleStrichOperation | this_Ganzzahl_1= ruleGanzzahl ) ;
    public final EObject ruleAusdruck() throws RecognitionException {
        EObject current = null;

        EObject this_StrichOperation_0 = null;

        EObject this_Ganzzahl_1 = null;



        	enterRule();

        try {
            // InternalTarot.g:311:2: ( (this_StrichOperation_0= ruleStrichOperation | this_Ganzzahl_1= ruleGanzzahl ) )
            // InternalTarot.g:312:2: (this_StrichOperation_0= ruleStrichOperation | this_Ganzzahl_1= ruleGanzzahl )
            {
            // InternalTarot.g:312:2: (this_StrichOperation_0= ruleStrichOperation | this_Ganzzahl_1= ruleGanzzahl )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTarot.g:313:3: this_StrichOperation_0= ruleStrichOperation
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
                    // InternalTarot.g:322:3: this_Ganzzahl_1= ruleGanzzahl
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
    // InternalTarot.g:334:1: entryRuleStrichOperation returns [EObject current=null] : iv_ruleStrichOperation= ruleStrichOperation EOF ;
    public final EObject entryRuleStrichOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrichOperation = null;


        try {
            // InternalTarot.g:334:56: (iv_ruleStrichOperation= ruleStrichOperation EOF )
            // InternalTarot.g:335:2: iv_ruleStrichOperation= ruleStrichOperation EOF
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
    // InternalTarot.g:341:1: ruleStrichOperation returns [EObject current=null] : ( () ( (lv_links_1_0= RULE_ID ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rechts_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleStrichOperation() throws RecognitionException {
        EObject current = null;

        Token lv_links_1_0=null;
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_rechts_3_0=null;


        	enterRule();

        try {
            // InternalTarot.g:347:2: ( ( () ( (lv_links_1_0= RULE_ID ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rechts_3_0= RULE_ID ) ) )? ) )
            // InternalTarot.g:348:2: ( () ( (lv_links_1_0= RULE_ID ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rechts_3_0= RULE_ID ) ) )? )
            {
            // InternalTarot.g:348:2: ( () ( (lv_links_1_0= RULE_ID ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rechts_3_0= RULE_ID ) ) )? )
            // InternalTarot.g:349:3: () ( (lv_links_1_0= RULE_ID ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rechts_3_0= RULE_ID ) ) )?
            {
            // InternalTarot.g:349:3: ()
            // InternalTarot.g:350:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStrichOperationAccess().getStrichOperationAction_0(),
            					current);
            			

            }

            // InternalTarot.g:356:3: ( (lv_links_1_0= RULE_ID ) )
            // InternalTarot.g:357:4: (lv_links_1_0= RULE_ID )
            {
            // InternalTarot.g:357:4: (lv_links_1_0= RULE_ID )
            // InternalTarot.g:358:5: lv_links_1_0= RULE_ID
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

            // InternalTarot.g:374:3: ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rechts_3_0= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTarot.g:375:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rechts_3_0= RULE_ID ) )
                    {
                    // InternalTarot.g:375:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
                    // InternalTarot.g:376:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
                    {
                    // InternalTarot.g:376:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
                    // InternalTarot.g:377:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
                    {
                    // InternalTarot.g:377:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==14) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==15) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalTarot.g:378:7: lv_op_2_1= '+'
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
                            // InternalTarot.g:389:7: lv_op_2_2= '-'
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

                    // InternalTarot.g:402:4: ( (lv_rechts_3_0= RULE_ID ) )
                    // InternalTarot.g:403:5: (lv_rechts_3_0= RULE_ID )
                    {
                    // InternalTarot.g:403:5: (lv_rechts_3_0= RULE_ID )
                    // InternalTarot.g:404:6: lv_rechts_3_0= RULE_ID
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
    // $ANTLR end "ruleStrichOperation"


    // $ANTLR start "entryRuleGanzzahl"
    // InternalTarot.g:425:1: entryRuleGanzzahl returns [EObject current=null] : iv_ruleGanzzahl= ruleGanzzahl EOF ;
    public final EObject entryRuleGanzzahl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGanzzahl = null;


        try {
            // InternalTarot.g:425:49: (iv_ruleGanzzahl= ruleGanzzahl EOF )
            // InternalTarot.g:426:2: iv_ruleGanzzahl= ruleGanzzahl EOF
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
    // InternalTarot.g:432:1: ruleGanzzahl returns [EObject current=null] : ( () ( (lv_wert_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGanzzahl() throws RecognitionException {
        EObject current = null;

        Token lv_wert_1_0=null;


        	enterRule();

        try {
            // InternalTarot.g:438:2: ( ( () ( (lv_wert_1_0= RULE_INT ) ) ) )
            // InternalTarot.g:439:2: ( () ( (lv_wert_1_0= RULE_INT ) ) )
            {
            // InternalTarot.g:439:2: ( () ( (lv_wert_1_0= RULE_INT ) ) )
            // InternalTarot.g:440:3: () ( (lv_wert_1_0= RULE_INT ) )
            {
            // InternalTarot.g:440:3: ()
            // InternalTarot.g:441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGanzzahlAccess().getGanzzahlAction_0(),
            					current);
            			

            }

            // InternalTarot.g:447:3: ( (lv_wert_1_0= RULE_INT ) )
            // InternalTarot.g:448:4: (lv_wert_1_0= RULE_INT )
            {
            // InternalTarot.g:448:4: (lv_wert_1_0= RULE_INT )
            // InternalTarot.g:449:5: lv_wert_1_0= RULE_INT
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
    // InternalTarot.g:469:1: entryRuleEingabe returns [EObject current=null] : iv_ruleEingabe= ruleEingabe EOF ;
    public final EObject entryRuleEingabe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEingabe = null;


        try {
            // InternalTarot.g:469:48: (iv_ruleEingabe= ruleEingabe EOF )
            // InternalTarot.g:470:2: iv_ruleEingabe= ruleEingabe EOF
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
    // InternalTarot.g:476:1: ruleEingabe returns [EObject current=null] : (otherlv_0= 'EINGABE' ( (lv_var_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEingabe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_1_0=null;


        	enterRule();

        try {
            // InternalTarot.g:482:2: ( (otherlv_0= 'EINGABE' ( (lv_var_1_0= RULE_ID ) ) ) )
            // InternalTarot.g:483:2: (otherlv_0= 'EINGABE' ( (lv_var_1_0= RULE_ID ) ) )
            {
            // InternalTarot.g:483:2: (otherlv_0= 'EINGABE' ( (lv_var_1_0= RULE_ID ) ) )
            // InternalTarot.g:484:3: otherlv_0= 'EINGABE' ( (lv_var_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEingabeAccess().getEINGABEKeyword_0());
            		
            // InternalTarot.g:488:3: ( (lv_var_1_0= RULE_ID ) )
            // InternalTarot.g:489:4: (lv_var_1_0= RULE_ID )
            {
            // InternalTarot.g:489:4: (lv_var_1_0= RULE_ID )
            // InternalTarot.g:490:5: lv_var_1_0= RULE_ID
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
    // InternalTarot.g:510:1: entryRuleAusgabe returns [EObject current=null] : iv_ruleAusgabe= ruleAusgabe EOF ;
    public final EObject entryRuleAusgabe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAusgabe = null;


        try {
            // InternalTarot.g:510:48: (iv_ruleAusgabe= ruleAusgabe EOF )
            // InternalTarot.g:511:2: iv_ruleAusgabe= ruleAusgabe EOF
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
    // InternalTarot.g:517:1: ruleAusgabe returns [EObject current=null] : (otherlv_0= 'SCHREIBE' ( (lv_var_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAusgabe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_1_0=null;


        	enterRule();

        try {
            // InternalTarot.g:523:2: ( (otherlv_0= 'SCHREIBE' ( (lv_var_1_0= RULE_ID ) ) ) )
            // InternalTarot.g:524:2: (otherlv_0= 'SCHREIBE' ( (lv_var_1_0= RULE_ID ) ) )
            {
            // InternalTarot.g:524:2: (otherlv_0= 'SCHREIBE' ( (lv_var_1_0= RULE_ID ) ) )
            // InternalTarot.g:525:3: otherlv_0= 'SCHREIBE' ( (lv_var_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAusgabeAccess().getSCHREIBEKeyword_0());
            		
            // InternalTarot.g:529:3: ( (lv_var_1_0= RULE_ID ) )
            // InternalTarot.g:530:4: (lv_var_1_0= RULE_ID )
            {
            // InternalTarot.g:530:4: (lv_var_1_0= RULE_ID )
            // InternalTarot.g:531:5: lv_var_1_0= RULE_ID
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
    // InternalTarot.g:551:1: entryRuleGeheZu returns [EObject current=null] : iv_ruleGeheZu= ruleGeheZu EOF ;
    public final EObject entryRuleGeheZu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeheZu = null;


        try {
            // InternalTarot.g:551:47: (iv_ruleGeheZu= ruleGeheZu EOF )
            // InternalTarot.g:552:2: iv_ruleGeheZu= ruleGeheZu EOF
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
    // InternalTarot.g:558:1: ruleGeheZu returns [EObject current=null] : (otherlv_0= 'GEHE' otherlv_1= 'ZU' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleGeheZu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTarot.g:564:2: ( (otherlv_0= 'GEHE' otherlv_1= 'ZU' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalTarot.g:565:2: (otherlv_0= 'GEHE' otherlv_1= 'ZU' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalTarot.g:565:2: (otherlv_0= 'GEHE' otherlv_1= 'ZU' ( (otherlv_2= RULE_ID ) ) )
            // InternalTarot.g:566:3: otherlv_0= 'GEHE' otherlv_1= 'ZU' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGeheZuAccess().getGEHEKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getGeheZuAccess().getZUKeyword_1());
            		
            // InternalTarot.g:574:3: ( (otherlv_2= RULE_ID ) )
            // InternalTarot.g:575:4: (otherlv_2= RULE_ID )
            {
            // InternalTarot.g:575:4: (otherlv_2= RULE_ID )
            // InternalTarot.g:576:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeheZuRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getGeheZuAccess().getTargetZeileCrossReference_2_0());
            				

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
    // InternalTarot.g:591:1: entryRuleKonditionalerGeheZu returns [EObject current=null] : iv_ruleKonditionalerGeheZu= ruleKonditionalerGeheZu EOF ;
    public final EObject entryRuleKonditionalerGeheZu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKonditionalerGeheZu = null;


        try {
            // InternalTarot.g:591:60: (iv_ruleKonditionalerGeheZu= ruleKonditionalerGeheZu EOF )
            // InternalTarot.g:592:2: iv_ruleKonditionalerGeheZu= ruleKonditionalerGeheZu EOF
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
    // InternalTarot.g:598:1: ruleKonditionalerGeheZu returns [EObject current=null] : (otherlv_0= 'WENN' otherlv_1= '(' ( (lv_links_2_0= RULE_ID ) ) ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' ) ) ) ( (lv_rechts_4_0= ruleWert ) ) otherlv_5= ')' otherlv_6= 'DANN' otherlv_7= 'GEHE' otherlv_8= 'ZU' ( (otherlv_9= RULE_ID ) ) ) ;
    public final EObject ruleKonditionalerGeheZu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_links_2_0=null;
        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        Token lv_op_3_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_rechts_4_0 = null;



        	enterRule();

        try {
            // InternalTarot.g:604:2: ( (otherlv_0= 'WENN' otherlv_1= '(' ( (lv_links_2_0= RULE_ID ) ) ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' ) ) ) ( (lv_rechts_4_0= ruleWert ) ) otherlv_5= ')' otherlv_6= 'DANN' otherlv_7= 'GEHE' otherlv_8= 'ZU' ( (otherlv_9= RULE_ID ) ) ) )
            // InternalTarot.g:605:2: (otherlv_0= 'WENN' otherlv_1= '(' ( (lv_links_2_0= RULE_ID ) ) ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' ) ) ) ( (lv_rechts_4_0= ruleWert ) ) otherlv_5= ')' otherlv_6= 'DANN' otherlv_7= 'GEHE' otherlv_8= 'ZU' ( (otherlv_9= RULE_ID ) ) )
            {
            // InternalTarot.g:605:2: (otherlv_0= 'WENN' otherlv_1= '(' ( (lv_links_2_0= RULE_ID ) ) ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' ) ) ) ( (lv_rechts_4_0= ruleWert ) ) otherlv_5= ')' otherlv_6= 'DANN' otherlv_7= 'GEHE' otherlv_8= 'ZU' ( (otherlv_9= RULE_ID ) ) )
            // InternalTarot.g:606:3: otherlv_0= 'WENN' otherlv_1= '(' ( (lv_links_2_0= RULE_ID ) ) ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' ) ) ) ( (lv_rechts_4_0= ruleWert ) ) otherlv_5= ')' otherlv_6= 'DANN' otherlv_7= 'GEHE' otherlv_8= 'ZU' ( (otherlv_9= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getKonditionalerGeheZuAccess().getWENNKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getKonditionalerGeheZuAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTarot.g:614:3: ( (lv_links_2_0= RULE_ID ) )
            // InternalTarot.g:615:4: (lv_links_2_0= RULE_ID )
            {
            // InternalTarot.g:615:4: (lv_links_2_0= RULE_ID )
            // InternalTarot.g:616:5: lv_links_2_0= RULE_ID
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

            // InternalTarot.g:632:3: ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' ) ) )
            // InternalTarot.g:633:4: ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' ) )
            {
            // InternalTarot.g:633:4: ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' ) )
            // InternalTarot.g:634:5: (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' )
            {
            // InternalTarot.g:634:5: (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTarot.g:635:6: lv_op_3_1= '='
                    {
                    lv_op_3_1=(Token)match(input,22,FOLLOW_8); 

                    						newLeafNode(lv_op_3_1, grammarAccess.getKonditionalerGeheZuAccess().getOpEqualsSignKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKonditionalerGeheZuRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTarot.g:646:6: lv_op_3_2= '<'
                    {
                    lv_op_3_2=(Token)match(input,23,FOLLOW_8); 

                    						newLeafNode(lv_op_3_2, grammarAccess.getKonditionalerGeheZuAccess().getOpLessThanSignKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKonditionalerGeheZuRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTarot.g:657:6: lv_op_3_3= '>'
                    {
                    lv_op_3_3=(Token)match(input,24,FOLLOW_8); 

                    						newLeafNode(lv_op_3_3, grammarAccess.getKonditionalerGeheZuAccess().getOpGreaterThanSignKeyword_3_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKonditionalerGeheZuRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalTarot.g:670:3: ( (lv_rechts_4_0= ruleWert ) )
            // InternalTarot.g:671:4: (lv_rechts_4_0= ruleWert )
            {
            // InternalTarot.g:671:4: (lv_rechts_4_0= ruleWert )
            // InternalTarot.g:672:5: lv_rechts_4_0= ruleWert
            {

            					newCompositeNode(grammarAccess.getKonditionalerGeheZuAccess().getRechtsWertParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_rechts_4_0=ruleWert();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKonditionalerGeheZuRule());
            					}
            					set(
            						current,
            						"rechts",
            						lv_rechts_4_0,
            						"de.fhdw.iis1.tarot.Tarot.Wert");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getKonditionalerGeheZuAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getKonditionalerGeheZuAccess().getDANNKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getKonditionalerGeheZuAccess().getGEHEKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getKonditionalerGeheZuAccess().getZUKeyword_8());
            		
            // InternalTarot.g:705:3: ( (otherlv_9= RULE_ID ) )
            // InternalTarot.g:706:4: (otherlv_9= RULE_ID )
            {
            // InternalTarot.g:706:4: (otherlv_9= RULE_ID )
            // InternalTarot.g:707:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKonditionalerGeheZuRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_9, grammarAccess.getKonditionalerGeheZuAccess().getZielZeileCrossReference_9_0());
            				

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


    // $ANTLR start "entryRuleWert"
    // InternalTarot.g:722:1: entryRuleWert returns [String current=null] : iv_ruleWert= ruleWert EOF ;
    public final String entryRuleWert() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWert = null;


        try {
            // InternalTarot.g:722:44: (iv_ruleWert= ruleWert EOF )
            // InternalTarot.g:723:2: iv_ruleWert= ruleWert EOF
            {
             newCompositeNode(grammarAccess.getWertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWert=ruleWert();

            state._fsp--;

             current =iv_ruleWert.getText(); 
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
    // $ANTLR end "entryRuleWert"


    // $ANTLR start "ruleWert"
    // InternalTarot.g:729:1: ruleWert returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleWert() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTarot.g:735:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) )
            // InternalTarot.g:736:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            {
            // InternalTarot.g:736:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTarot.g:737:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getWertAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTarot.g:745:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getWertAccess().getINTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleWert"


    // $ANTLR start "entryRuleHalt"
    // InternalTarot.g:756:1: entryRuleHalt returns [EObject current=null] : iv_ruleHalt= ruleHalt EOF ;
    public final EObject entryRuleHalt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHalt = null;


        try {
            // InternalTarot.g:756:45: (iv_ruleHalt= ruleHalt EOF )
            // InternalTarot.g:757:2: iv_ruleHalt= ruleHalt EOF
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
    // InternalTarot.g:763:1: ruleHalt returns [EObject current=null] : ( () otherlv_1= 'Halt!' ) ;
    public final EObject ruleHalt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTarot.g:769:2: ( ( () otherlv_1= 'Halt!' ) )
            // InternalTarot.g:770:2: ( () otherlv_1= 'Halt!' )
            {
            // InternalTarot.g:770:2: ( () otherlv_1= 'Halt!' )
            // InternalTarot.g:771:3: () otherlv_1= 'Halt!'
            {
            // InternalTarot.g:771:3: ()
            // InternalTarot.g:772:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHaltAccess().getHaltAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008170010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});

}