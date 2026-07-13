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
        	return "Program";
       	}

       	@Override
       	protected TarotGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalTarot.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalTarot.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalTarot.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalTarot.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_lines_0_0= ruleLine ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_lines_0_0 = null;



        	enterRule();

        try {
            // InternalTarot.g:77:2: ( ( (lv_lines_0_0= ruleLine ) )+ )
            // InternalTarot.g:78:2: ( (lv_lines_0_0= ruleLine ) )+
            {
            // InternalTarot.g:78:2: ( (lv_lines_0_0= ruleLine ) )+
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
            	    // InternalTarot.g:79:3: (lv_lines_0_0= ruleLine )
            	    {
            	    // InternalTarot.g:79:3: (lv_lines_0_0= ruleLine )
            	    // InternalTarot.g:80:4: lv_lines_0_0= ruleLine
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getLinesLineParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_lines_0_0=ruleLine();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"lines",
            	    					lv_lines_0_0,
            	    					"de.fhdw.iis1.tarot.Tarot.Line");
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleLine"
    // InternalTarot.g:100:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalTarot.g:100:45: (iv_ruleLine= ruleLine EOF )
            // InternalTarot.g:101:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
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
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalTarot.g:107:1: ruleLine returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_instruction_2_0= ruleInstruction ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_instruction_2_0 = null;



        	enterRule();

        try {
            // InternalTarot.g:113:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_instruction_2_0= ruleInstruction ) ) (otherlv_3= ';' )? ) )
            // InternalTarot.g:114:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_instruction_2_0= ruleInstruction ) ) (otherlv_3= ';' )? )
            {
            // InternalTarot.g:114:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_instruction_2_0= ruleInstruction ) ) (otherlv_3= ';' )? )
            // InternalTarot.g:115:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_instruction_2_0= ruleInstruction ) ) (otherlv_3= ';' )?
            {
            // InternalTarot.g:115:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTarot.g:116:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTarot.g:116:4: (lv_name_0_0= RULE_ID )
            // InternalTarot.g:117:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLineAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLineAccess().getColonKeyword_1());
            		
            // InternalTarot.g:137:3: ( (lv_instruction_2_0= ruleInstruction ) )
            // InternalTarot.g:138:4: (lv_instruction_2_0= ruleInstruction )
            {
            // InternalTarot.g:138:4: (lv_instruction_2_0= ruleInstruction )
            // InternalTarot.g:139:5: lv_instruction_2_0= ruleInstruction
            {

            					newCompositeNode(grammarAccess.getLineAccess().getInstructionInstructionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_instruction_2_0=ruleInstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineRule());
            					}
            					set(
            						current,
            						"instruction",
            						lv_instruction_2_0,
            						"de.fhdw.iis1.tarot.Tarot.Instruction");
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

                    				newLeafNode(otherlv_3, grammarAccess.getLineAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleInstruction"
    // InternalTarot.g:166:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalTarot.g:166:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalTarot.g:167:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalTarot.g:173:1: ruleInstruction returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_Input_1= ruleInput | this_Output_2= ruleOutput | this_Goto_3= ruleGoto | this_ConditionalGoto_4= ruleConditionalGoto | this_Stop_5= ruleStop ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_Input_1 = null;

        EObject this_Output_2 = null;

        EObject this_Goto_3 = null;

        EObject this_ConditionalGoto_4 = null;

        EObject this_Stop_5 = null;



        	enterRule();

        try {
            // InternalTarot.g:179:2: ( (this_Assignment_0= ruleAssignment | this_Input_1= ruleInput | this_Output_2= ruleOutput | this_Goto_3= ruleGoto | this_ConditionalGoto_4= ruleConditionalGoto | this_Stop_5= ruleStop ) )
            // InternalTarot.g:180:2: (this_Assignment_0= ruleAssignment | this_Input_1= ruleInput | this_Output_2= ruleOutput | this_Goto_3= ruleGoto | this_ConditionalGoto_4= ruleConditionalGoto | this_Stop_5= ruleStop )
            {
            // InternalTarot.g:180:2: (this_Assignment_0= ruleAssignment | this_Input_1= ruleInput | this_Output_2= ruleOutput | this_Goto_3= ruleGoto | this_ConditionalGoto_4= ruleConditionalGoto | this_Stop_5= ruleStop )
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
                    // InternalTarot.g:181:3: this_Assignment_0= ruleAssignment
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;


                    			current = this_Assignment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTarot.g:190:3: this_Input_1= ruleInput
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getInputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Input_1=ruleInput();

                    state._fsp--;


                    			current = this_Input_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTarot.g:199:3: this_Output_2= ruleOutput
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getOutputParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Output_2=ruleOutput();

                    state._fsp--;


                    			current = this_Output_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTarot.g:208:3: this_Goto_3= ruleGoto
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getGotoParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Goto_3=ruleGoto();

                    state._fsp--;


                    			current = this_Goto_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTarot.g:217:3: this_ConditionalGoto_4= ruleConditionalGoto
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getConditionalGotoParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionalGoto_4=ruleConditionalGoto();

                    state._fsp--;


                    			current = this_ConditionalGoto_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTarot.g:226:3: this_Stop_5= ruleStop
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getStopParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Stop_5=ruleStop();

                    state._fsp--;


                    			current = this_Stop_5;
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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleAssignment"
    // InternalTarot.g:238:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalTarot.g:238:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalTarot.g:239:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalTarot.g:245:1: ruleAssignment returns [EObject current=null] : ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalTarot.g:251:2: ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalTarot.g:252:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalTarot.g:252:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalTarot.g:253:3: ( (lv_var_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expr_2_0= ruleExpression ) )
            {
            // InternalTarot.g:253:3: ( (lv_var_0_0= RULE_ID ) )
            // InternalTarot.g:254:4: (lv_var_0_0= RULE_ID )
            {
            // InternalTarot.g:254:4: (lv_var_0_0= RULE_ID )
            // InternalTarot.g:255:5: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_var_0_0, grammarAccess.getAssignmentAccess().getVarIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1());
            		
            // InternalTarot.g:275:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalTarot.g:276:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalTarot.g:276:4: (lv_expr_2_0= ruleExpression )
            // InternalTarot.g:277:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"de.fhdw.iis1.tarot.Tarot.Expression");
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleExpression"
    // InternalTarot.g:298:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalTarot.g:298:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalTarot.g:299:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalTarot.g:305:1: ruleExpression returns [EObject current=null] : (this_AddSubExpr_0= ruleAddSubExpr | this_IntLiteral_1= ruleIntLiteral ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddSubExpr_0 = null;

        EObject this_IntLiteral_1 = null;



        	enterRule();

        try {
            // InternalTarot.g:311:2: ( (this_AddSubExpr_0= ruleAddSubExpr | this_IntLiteral_1= ruleIntLiteral ) )
            // InternalTarot.g:312:2: (this_AddSubExpr_0= ruleAddSubExpr | this_IntLiteral_1= ruleIntLiteral )
            {
            // InternalTarot.g:312:2: (this_AddSubExpr_0= ruleAddSubExpr | this_IntLiteral_1= ruleIntLiteral )
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
                    // InternalTarot.g:313:3: this_AddSubExpr_0= ruleAddSubExpr
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAddSubExprParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddSubExpr_0=ruleAddSubExpr();

                    state._fsp--;


                    			current = this_AddSubExpr_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTarot.g:322:3: this_IntLiteral_1= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getIntLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_1=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_1;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddSubExpr"
    // InternalTarot.g:334:1: entryRuleAddSubExpr returns [EObject current=null] : iv_ruleAddSubExpr= ruleAddSubExpr EOF ;
    public final EObject entryRuleAddSubExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddSubExpr = null;


        try {
            // InternalTarot.g:334:51: (iv_ruleAddSubExpr= ruleAddSubExpr EOF )
            // InternalTarot.g:335:2: iv_ruleAddSubExpr= ruleAddSubExpr EOF
            {
             newCompositeNode(grammarAccess.getAddSubExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddSubExpr=ruleAddSubExpr();

            state._fsp--;

             current =iv_ruleAddSubExpr; 
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
    // $ANTLR end "entryRuleAddSubExpr"


    // $ANTLR start "ruleAddSubExpr"
    // InternalTarot.g:341:1: ruleAddSubExpr returns [EObject current=null] : ( () ( (lv_left_1_0= RULE_ID ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleAddSubExpr() throws RecognitionException {
        EObject current = null;

        Token lv_left_1_0=null;
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_right_3_0=null;


        	enterRule();

        try {
            // InternalTarot.g:347:2: ( ( () ( (lv_left_1_0= RULE_ID ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= RULE_ID ) ) )? ) )
            // InternalTarot.g:348:2: ( () ( (lv_left_1_0= RULE_ID ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= RULE_ID ) ) )? )
            {
            // InternalTarot.g:348:2: ( () ( (lv_left_1_0= RULE_ID ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= RULE_ID ) ) )? )
            // InternalTarot.g:349:3: () ( (lv_left_1_0= RULE_ID ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= RULE_ID ) ) )?
            {
            // InternalTarot.g:349:3: ()
            // InternalTarot.g:350:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddSubExprAccess().getAddSubExprAction_0(),
            					current);
            			

            }

            // InternalTarot.g:356:3: ( (lv_left_1_0= RULE_ID ) )
            // InternalTarot.g:357:4: (lv_left_1_0= RULE_ID )
            {
            // InternalTarot.g:357:4: (lv_left_1_0= RULE_ID )
            // InternalTarot.g:358:5: lv_left_1_0= RULE_ID
            {
            lv_left_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_left_1_0, grammarAccess.getAddSubExprAccess().getLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddSubExprRule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTarot.g:374:3: ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTarot.g:375:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= RULE_ID ) )
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

                            							newLeafNode(lv_op_2_1, grammarAccess.getAddSubExprAccess().getOpPlusSignKeyword_2_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAddSubExprRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalTarot.g:389:7: lv_op_2_2= '-'
                            {
                            lv_op_2_2=(Token)match(input,15,FOLLOW_10); 

                            							newLeafNode(lv_op_2_2, grammarAccess.getAddSubExprAccess().getOpHyphenMinusKeyword_2_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAddSubExprRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalTarot.g:402:4: ( (lv_right_3_0= RULE_ID ) )
                    // InternalTarot.g:403:5: (lv_right_3_0= RULE_ID )
                    {
                    // InternalTarot.g:403:5: (lv_right_3_0= RULE_ID )
                    // InternalTarot.g:404:6: lv_right_3_0= RULE_ID
                    {
                    lv_right_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_right_3_0, grammarAccess.getAddSubExprAccess().getRightIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddSubExprRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"right",
                    							lv_right_3_0,
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
    // $ANTLR end "ruleAddSubExpr"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalTarot.g:425:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalTarot.g:425:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalTarot.g:426:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalTarot.g:432:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalTarot.g:438:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalTarot.g:439:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalTarot.g:439:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalTarot.g:440:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalTarot.g:440:3: ()
            // InternalTarot.g:441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
            					current);
            			

            }

            // InternalTarot.g:447:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalTarot.g:448:4: (lv_value_1_0= RULE_INT )
            {
            // InternalTarot.g:448:4: (lv_value_1_0= RULE_INT )
            // InternalTarot.g:449:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleInput"
    // InternalTarot.g:469:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalTarot.g:469:46: (iv_ruleInput= ruleInput EOF )
            // InternalTarot.g:470:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalTarot.g:476:1: ruleInput returns [EObject current=null] : (otherlv_0= 'EINGABE' ( (lv_var_1_0= RULE_ID ) ) ) ;
    public final EObject ruleInput() throws RecognitionException {
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

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getEINGABEKeyword_0());
            		
            // InternalTarot.g:488:3: ( (lv_var_1_0= RULE_ID ) )
            // InternalTarot.g:489:4: (lv_var_1_0= RULE_ID )
            {
            // InternalTarot.g:489:4: (lv_var_1_0= RULE_ID )
            // InternalTarot.g:490:5: lv_var_1_0= RULE_ID
            {
            lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_var_1_0, grammarAccess.getInputAccess().getVarIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalTarot.g:510:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalTarot.g:510:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalTarot.g:511:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalTarot.g:517:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'SCHREIBE' ( (lv_var_1_0= RULE_ID ) ) ) ;
    public final EObject ruleOutput() throws RecognitionException {
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

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getSCHREIBEKeyword_0());
            		
            // InternalTarot.g:529:3: ( (lv_var_1_0= RULE_ID ) )
            // InternalTarot.g:530:4: (lv_var_1_0= RULE_ID )
            {
            // InternalTarot.g:530:4: (lv_var_1_0= RULE_ID )
            // InternalTarot.g:531:5: lv_var_1_0= RULE_ID
            {
            lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_var_1_0, grammarAccess.getOutputAccess().getVarIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleGoto"
    // InternalTarot.g:551:1: entryRuleGoto returns [EObject current=null] : iv_ruleGoto= ruleGoto EOF ;
    public final EObject entryRuleGoto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoto = null;


        try {
            // InternalTarot.g:551:45: (iv_ruleGoto= ruleGoto EOF )
            // InternalTarot.g:552:2: iv_ruleGoto= ruleGoto EOF
            {
             newCompositeNode(grammarAccess.getGotoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoto=ruleGoto();

            state._fsp--;

             current =iv_ruleGoto; 
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
    // $ANTLR end "entryRuleGoto"


    // $ANTLR start "ruleGoto"
    // InternalTarot.g:558:1: ruleGoto returns [EObject current=null] : (otherlv_0= 'GEHE' otherlv_1= 'ZU' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleGoto() throws RecognitionException {
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

            			newLeafNode(otherlv_0, grammarAccess.getGotoAccess().getGEHEKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getGotoAccess().getZUKeyword_1());
            		
            // InternalTarot.g:574:3: ( (otherlv_2= RULE_ID ) )
            // InternalTarot.g:575:4: (otherlv_2= RULE_ID )
            {
            // InternalTarot.g:575:4: (otherlv_2= RULE_ID )
            // InternalTarot.g:576:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGotoRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getGotoAccess().getTargetLineCrossReference_2_0());
            				

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
    // $ANTLR end "ruleGoto"


    // $ANTLR start "entryRuleConditionalGoto"
    // InternalTarot.g:591:1: entryRuleConditionalGoto returns [EObject current=null] : iv_ruleConditionalGoto= ruleConditionalGoto EOF ;
    public final EObject entryRuleConditionalGoto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalGoto = null;


        try {
            // InternalTarot.g:591:56: (iv_ruleConditionalGoto= ruleConditionalGoto EOF )
            // InternalTarot.g:592:2: iv_ruleConditionalGoto= ruleConditionalGoto EOF
            {
             newCompositeNode(grammarAccess.getConditionalGotoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalGoto=ruleConditionalGoto();

            state._fsp--;

             current =iv_ruleConditionalGoto; 
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
    // $ANTLR end "entryRuleConditionalGoto"


    // $ANTLR start "ruleConditionalGoto"
    // InternalTarot.g:598:1: ruleConditionalGoto returns [EObject current=null] : (otherlv_0= 'WENN' otherlv_1= '(' ( (lv_left_2_0= RULE_ID ) ) ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' ) ) ) ( (lv_right_4_0= ruleValue ) ) otherlv_5= ')' otherlv_6= 'DANN' otherlv_7= 'GEHE' otherlv_8= 'ZU' ( (otherlv_9= RULE_ID ) ) ) ;
    public final EObject ruleConditionalGoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_left_2_0=null;
        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        Token lv_op_3_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalTarot.g:604:2: ( (otherlv_0= 'WENN' otherlv_1= '(' ( (lv_left_2_0= RULE_ID ) ) ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' ) ) ) ( (lv_right_4_0= ruleValue ) ) otherlv_5= ')' otherlv_6= 'DANN' otherlv_7= 'GEHE' otherlv_8= 'ZU' ( (otherlv_9= RULE_ID ) ) ) )
            // InternalTarot.g:605:2: (otherlv_0= 'WENN' otherlv_1= '(' ( (lv_left_2_0= RULE_ID ) ) ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' ) ) ) ( (lv_right_4_0= ruleValue ) ) otherlv_5= ')' otherlv_6= 'DANN' otherlv_7= 'GEHE' otherlv_8= 'ZU' ( (otherlv_9= RULE_ID ) ) )
            {
            // InternalTarot.g:605:2: (otherlv_0= 'WENN' otherlv_1= '(' ( (lv_left_2_0= RULE_ID ) ) ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' ) ) ) ( (lv_right_4_0= ruleValue ) ) otherlv_5= ')' otherlv_6= 'DANN' otherlv_7= 'GEHE' otherlv_8= 'ZU' ( (otherlv_9= RULE_ID ) ) )
            // InternalTarot.g:606:3: otherlv_0= 'WENN' otherlv_1= '(' ( (lv_left_2_0= RULE_ID ) ) ( ( (lv_op_3_1= '=' | lv_op_3_2= '<' | lv_op_3_3= '>' ) ) ) ( (lv_right_4_0= ruleValue ) ) otherlv_5= ')' otherlv_6= 'DANN' otherlv_7= 'GEHE' otherlv_8= 'ZU' ( (otherlv_9= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalGotoAccess().getWENNKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalGotoAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTarot.g:614:3: ( (lv_left_2_0= RULE_ID ) )
            // InternalTarot.g:615:4: (lv_left_2_0= RULE_ID )
            {
            // InternalTarot.g:615:4: (lv_left_2_0= RULE_ID )
            // InternalTarot.g:616:5: lv_left_2_0= RULE_ID
            {
            lv_left_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_left_2_0, grammarAccess.getConditionalGotoAccess().getLeftIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalGotoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_2_0,
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

                    						newLeafNode(lv_op_3_1, grammarAccess.getConditionalGotoAccess().getOpEqualsSignKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionalGotoRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTarot.g:646:6: lv_op_3_2= '<'
                    {
                    lv_op_3_2=(Token)match(input,23,FOLLOW_8); 

                    						newLeafNode(lv_op_3_2, grammarAccess.getConditionalGotoAccess().getOpLessThanSignKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionalGotoRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTarot.g:657:6: lv_op_3_3= '>'
                    {
                    lv_op_3_3=(Token)match(input,24,FOLLOW_8); 

                    						newLeafNode(lv_op_3_3, grammarAccess.getConditionalGotoAccess().getOpGreaterThanSignKeyword_3_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionalGotoRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalTarot.g:670:3: ( (lv_right_4_0= ruleValue ) )
            // InternalTarot.g:671:4: (lv_right_4_0= ruleValue )
            {
            // InternalTarot.g:671:4: (lv_right_4_0= ruleValue )
            // InternalTarot.g:672:5: lv_right_4_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getConditionalGotoAccess().getRightValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_right_4_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalGotoRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_4_0,
            						"de.fhdw.iis1.tarot.Tarot.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionalGotoAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionalGotoAccess().getDANNKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getConditionalGotoAccess().getGEHEKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getConditionalGotoAccess().getZUKeyword_8());
            		
            // InternalTarot.g:705:3: ( (otherlv_9= RULE_ID ) )
            // InternalTarot.g:706:4: (otherlv_9= RULE_ID )
            {
            // InternalTarot.g:706:4: (otherlv_9= RULE_ID )
            // InternalTarot.g:707:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalGotoRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_9, grammarAccess.getConditionalGotoAccess().getTargetLineCrossReference_9_0());
            				

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
    // $ANTLR end "ruleConditionalGoto"


    // $ANTLR start "entryRuleValue"
    // InternalTarot.g:722:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalTarot.g:722:45: (iv_ruleValue= ruleValue EOF )
            // InternalTarot.g:723:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalTarot.g:729:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
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
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getValueAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTarot.g:745:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getValueAccess().getINTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleStop"
    // InternalTarot.g:756:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalTarot.g:756:45: (iv_ruleStop= ruleStop EOF )
            // InternalTarot.g:757:2: iv_ruleStop= ruleStop EOF
            {
             newCompositeNode(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStop=ruleStop();

            state._fsp--;

             current =iv_ruleStop; 
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
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalTarot.g:763:1: ruleStop returns [EObject current=null] : ( () otherlv_1= 'Halt!' ) ;
    public final EObject ruleStop() throws RecognitionException {
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
            					grammarAccess.getStopAccess().getStopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStopAccess().getHaltKeyword_1());
            		

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
    // $ANTLR end "ruleStop"

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