package de.fhdw.iis1.tarot.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.fhdw.iis1.tarot.services.TarotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTarotParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'='", "'<'", "'>'", "':'", "';'", "':='", "'EINGABE'", "'SCHREIBE'", "'GEHE'", "'ZU'", "'WENN'", "'('", "')'", "'DANN'", "'Halt!'"
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

    	public void setGrammarAccess(TarotGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalTarot.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalTarot.g:54:1: ( ruleProgram EOF )
            // InternalTarot.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalTarot.g:62:1: ruleProgram : ( ( ( rule__Program__LinesAssignment ) ) ( ( rule__Program__LinesAssignment )* ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:66:2: ( ( ( ( rule__Program__LinesAssignment ) ) ( ( rule__Program__LinesAssignment )* ) ) )
            // InternalTarot.g:67:2: ( ( ( rule__Program__LinesAssignment ) ) ( ( rule__Program__LinesAssignment )* ) )
            {
            // InternalTarot.g:67:2: ( ( ( rule__Program__LinesAssignment ) ) ( ( rule__Program__LinesAssignment )* ) )
            // InternalTarot.g:68:3: ( ( rule__Program__LinesAssignment ) ) ( ( rule__Program__LinesAssignment )* )
            {
            // InternalTarot.g:68:3: ( ( rule__Program__LinesAssignment ) )
            // InternalTarot.g:69:4: ( rule__Program__LinesAssignment )
            {
             before(grammarAccess.getProgramAccess().getLinesAssignment()); 
            // InternalTarot.g:70:4: ( rule__Program__LinesAssignment )
            // InternalTarot.g:70:5: rule__Program__LinesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Program__LinesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getLinesAssignment()); 

            }

            // InternalTarot.g:73:3: ( ( rule__Program__LinesAssignment )* )
            // InternalTarot.g:74:4: ( rule__Program__LinesAssignment )*
            {
             before(grammarAccess.getProgramAccess().getLinesAssignment()); 
            // InternalTarot.g:75:4: ( rule__Program__LinesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTarot.g:75:5: rule__Program__LinesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__LinesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getLinesAssignment()); 

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleLine"
    // InternalTarot.g:85:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalTarot.g:86:1: ( ruleLine EOF )
            // InternalTarot.g:87:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getLineRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalTarot.g:94:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:98:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalTarot.g:99:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalTarot.g:99:2: ( ( rule__Line__Group__0 ) )
            // InternalTarot.g:100:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalTarot.g:101:3: ( rule__Line__Group__0 )
            // InternalTarot.g:101:4: rule__Line__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleInstruction"
    // InternalTarot.g:110:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalTarot.g:111:1: ( ruleInstruction EOF )
            // InternalTarot.g:112:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalTarot.g:119:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:123:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalTarot.g:124:2: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalTarot.g:124:2: ( ( rule__Instruction__Alternatives ) )
            // InternalTarot.g:125:3: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // InternalTarot.g:126:3: ( rule__Instruction__Alternatives )
            // InternalTarot.g:126:4: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleAssignment"
    // InternalTarot.g:135:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalTarot.g:136:1: ( ruleAssignment EOF )
            // InternalTarot.g:137:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalTarot.g:144:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:148:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalTarot.g:149:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalTarot.g:149:2: ( ( rule__Assignment__Group__0 ) )
            // InternalTarot.g:150:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalTarot.g:151:3: ( rule__Assignment__Group__0 )
            // InternalTarot.g:151:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleExpression"
    // InternalTarot.g:160:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalTarot.g:161:1: ( ruleExpression EOF )
            // InternalTarot.g:162:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalTarot.g:169:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:173:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalTarot.g:174:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalTarot.g:174:2: ( ( rule__Expression__Alternatives ) )
            // InternalTarot.g:175:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalTarot.g:176:3: ( rule__Expression__Alternatives )
            // InternalTarot.g:176:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddSubExpr"
    // InternalTarot.g:185:1: entryRuleAddSubExpr : ruleAddSubExpr EOF ;
    public final void entryRuleAddSubExpr() throws RecognitionException {
        try {
            // InternalTarot.g:186:1: ( ruleAddSubExpr EOF )
            // InternalTarot.g:187:1: ruleAddSubExpr EOF
            {
             before(grammarAccess.getAddSubExprRule()); 
            pushFollow(FOLLOW_1);
            ruleAddSubExpr();

            state._fsp--;

             after(grammarAccess.getAddSubExprRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAddSubExpr"


    // $ANTLR start "ruleAddSubExpr"
    // InternalTarot.g:194:1: ruleAddSubExpr : ( ( rule__AddSubExpr__Group__0 ) ) ;
    public final void ruleAddSubExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:198:2: ( ( ( rule__AddSubExpr__Group__0 ) ) )
            // InternalTarot.g:199:2: ( ( rule__AddSubExpr__Group__0 ) )
            {
            // InternalTarot.g:199:2: ( ( rule__AddSubExpr__Group__0 ) )
            // InternalTarot.g:200:3: ( rule__AddSubExpr__Group__0 )
            {
             before(grammarAccess.getAddSubExprAccess().getGroup()); 
            // InternalTarot.g:201:3: ( rule__AddSubExpr__Group__0 )
            // InternalTarot.g:201:4: rule__AddSubExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddSubExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddSubExprAccess().getGroup()); 

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
    // $ANTLR end "ruleAddSubExpr"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalTarot.g:210:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalTarot.g:211:1: ( ruleIntLiteral EOF )
            // InternalTarot.g:212:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalTarot.g:219:1: ruleIntLiteral : ( ( rule__IntLiteral__Group__0 ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:223:2: ( ( ( rule__IntLiteral__Group__0 ) ) )
            // InternalTarot.g:224:2: ( ( rule__IntLiteral__Group__0 ) )
            {
            // InternalTarot.g:224:2: ( ( rule__IntLiteral__Group__0 ) )
            // InternalTarot.g:225:3: ( rule__IntLiteral__Group__0 )
            {
             before(grammarAccess.getIntLiteralAccess().getGroup()); 
            // InternalTarot.g:226:3: ( rule__IntLiteral__Group__0 )
            // InternalTarot.g:226:4: rule__IntLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleInput"
    // InternalTarot.g:235:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalTarot.g:236:1: ( ruleInput EOF )
            // InternalTarot.g:237:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalTarot.g:244:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:248:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalTarot.g:249:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalTarot.g:249:2: ( ( rule__Input__Group__0 ) )
            // InternalTarot.g:250:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalTarot.g:251:3: ( rule__Input__Group__0 )
            // InternalTarot.g:251:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalTarot.g:260:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalTarot.g:261:1: ( ruleOutput EOF )
            // InternalTarot.g:262:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalTarot.g:269:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:273:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalTarot.g:274:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalTarot.g:274:2: ( ( rule__Output__Group__0 ) )
            // InternalTarot.g:275:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalTarot.g:276:3: ( rule__Output__Group__0 )
            // InternalTarot.g:276:4: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleGoto"
    // InternalTarot.g:285:1: entryRuleGoto : ruleGoto EOF ;
    public final void entryRuleGoto() throws RecognitionException {
        try {
            // InternalTarot.g:286:1: ( ruleGoto EOF )
            // InternalTarot.g:287:1: ruleGoto EOF
            {
             before(grammarAccess.getGotoRule()); 
            pushFollow(FOLLOW_1);
            ruleGoto();

            state._fsp--;

             after(grammarAccess.getGotoRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGoto"


    // $ANTLR start "ruleGoto"
    // InternalTarot.g:294:1: ruleGoto : ( ( rule__Goto__Group__0 ) ) ;
    public final void ruleGoto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:298:2: ( ( ( rule__Goto__Group__0 ) ) )
            // InternalTarot.g:299:2: ( ( rule__Goto__Group__0 ) )
            {
            // InternalTarot.g:299:2: ( ( rule__Goto__Group__0 ) )
            // InternalTarot.g:300:3: ( rule__Goto__Group__0 )
            {
             before(grammarAccess.getGotoAccess().getGroup()); 
            // InternalTarot.g:301:3: ( rule__Goto__Group__0 )
            // InternalTarot.g:301:4: rule__Goto__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Goto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGotoAccess().getGroup()); 

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
    // $ANTLR end "ruleGoto"


    // $ANTLR start "entryRuleConditionalGoto"
    // InternalTarot.g:310:1: entryRuleConditionalGoto : ruleConditionalGoto EOF ;
    public final void entryRuleConditionalGoto() throws RecognitionException {
        try {
            // InternalTarot.g:311:1: ( ruleConditionalGoto EOF )
            // InternalTarot.g:312:1: ruleConditionalGoto EOF
            {
             before(grammarAccess.getConditionalGotoRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalGoto();

            state._fsp--;

             after(grammarAccess.getConditionalGotoRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditionalGoto"


    // $ANTLR start "ruleConditionalGoto"
    // InternalTarot.g:319:1: ruleConditionalGoto : ( ( rule__ConditionalGoto__Group__0 ) ) ;
    public final void ruleConditionalGoto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:323:2: ( ( ( rule__ConditionalGoto__Group__0 ) ) )
            // InternalTarot.g:324:2: ( ( rule__ConditionalGoto__Group__0 ) )
            {
            // InternalTarot.g:324:2: ( ( rule__ConditionalGoto__Group__0 ) )
            // InternalTarot.g:325:3: ( rule__ConditionalGoto__Group__0 )
            {
             before(grammarAccess.getConditionalGotoAccess().getGroup()); 
            // InternalTarot.g:326:3: ( rule__ConditionalGoto__Group__0 )
            // InternalTarot.g:326:4: rule__ConditionalGoto__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalGoto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalGotoAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionalGoto"


    // $ANTLR start "entryRuleValue"
    // InternalTarot.g:335:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalTarot.g:336:1: ( ruleValue EOF )
            // InternalTarot.g:337:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalTarot.g:344:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:348:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalTarot.g:349:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalTarot.g:349:2: ( ( rule__Value__Alternatives ) )
            // InternalTarot.g:350:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalTarot.g:351:3: ( rule__Value__Alternatives )
            // InternalTarot.g:351:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleStop"
    // InternalTarot.g:360:1: entryRuleStop : ruleStop EOF ;
    public final void entryRuleStop() throws RecognitionException {
        try {
            // InternalTarot.g:361:1: ( ruleStop EOF )
            // InternalTarot.g:362:1: ruleStop EOF
            {
             before(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            ruleStop();

            state._fsp--;

             after(grammarAccess.getStopRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalTarot.g:369:1: ruleStop : ( ( rule__Stop__Group__0 ) ) ;
    public final void ruleStop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:373:2: ( ( ( rule__Stop__Group__0 ) ) )
            // InternalTarot.g:374:2: ( ( rule__Stop__Group__0 ) )
            {
            // InternalTarot.g:374:2: ( ( rule__Stop__Group__0 ) )
            // InternalTarot.g:375:3: ( rule__Stop__Group__0 )
            {
             before(grammarAccess.getStopAccess().getGroup()); 
            // InternalTarot.g:376:3: ( rule__Stop__Group__0 )
            // InternalTarot.g:376:4: rule__Stop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStopAccess().getGroup()); 

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
    // $ANTLR end "ruleStop"


    // $ANTLR start "rule__Instruction__Alternatives"
    // InternalTarot.g:384:1: rule__Instruction__Alternatives : ( ( ruleAssignment ) | ( ruleInput ) | ( ruleOutput ) | ( ruleGoto ) | ( ruleConditionalGoto ) | ( ruleStop ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:388:1: ( ( ruleAssignment ) | ( ruleInput ) | ( ruleOutput ) | ( ruleGoto ) | ( ruleConditionalGoto ) | ( ruleStop ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case 23:
                {
                alt2=5;
                }
                break;
            case 27:
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
                    // InternalTarot.g:389:2: ( ruleAssignment )
                    {
                    // InternalTarot.g:389:2: ( ruleAssignment )
                    // InternalTarot.g:390:3: ruleAssignment
                    {
                     before(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTarot.g:395:2: ( ruleInput )
                    {
                    // InternalTarot.g:395:2: ( ruleInput )
                    // InternalTarot.g:396:3: ruleInput
                    {
                     before(grammarAccess.getInstructionAccess().getInputParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInput();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getInputParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTarot.g:401:2: ( ruleOutput )
                    {
                    // InternalTarot.g:401:2: ( ruleOutput )
                    // InternalTarot.g:402:3: ruleOutput
                    {
                     before(grammarAccess.getInstructionAccess().getOutputParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOutput();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getOutputParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTarot.g:407:2: ( ruleGoto )
                    {
                    // InternalTarot.g:407:2: ( ruleGoto )
                    // InternalTarot.g:408:3: ruleGoto
                    {
                     before(grammarAccess.getInstructionAccess().getGotoParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGoto();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getGotoParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTarot.g:413:2: ( ruleConditionalGoto )
                    {
                    // InternalTarot.g:413:2: ( ruleConditionalGoto )
                    // InternalTarot.g:414:3: ruleConditionalGoto
                    {
                     before(grammarAccess.getInstructionAccess().getConditionalGotoParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleConditionalGoto();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getConditionalGotoParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTarot.g:419:2: ( ruleStop )
                    {
                    // InternalTarot.g:419:2: ( ruleStop )
                    // InternalTarot.g:420:3: ruleStop
                    {
                     before(grammarAccess.getInstructionAccess().getStopParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleStop();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getStopParserRuleCall_5()); 

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
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalTarot.g:429:1: rule__Expression__Alternatives : ( ( ruleAddSubExpr ) | ( ruleIntLiteral ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:433:1: ( ( ruleAddSubExpr ) | ( ruleIntLiteral ) )
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
                    // InternalTarot.g:434:2: ( ruleAddSubExpr )
                    {
                    // InternalTarot.g:434:2: ( ruleAddSubExpr )
                    // InternalTarot.g:435:3: ruleAddSubExpr
                    {
                     before(grammarAccess.getExpressionAccess().getAddSubExprParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAddSubExpr();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getAddSubExprParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTarot.g:440:2: ( ruleIntLiteral )
                    {
                    // InternalTarot.g:440:2: ( ruleIntLiteral )
                    // InternalTarot.g:441:3: ruleIntLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getIntLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getIntLiteralParserRuleCall_1()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__AddSubExpr__OpAlternatives_2_0_0"
    // InternalTarot.g:450:1: rule__AddSubExpr__OpAlternatives_2_0_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__AddSubExpr__OpAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:454:1: ( ( '+' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTarot.g:455:2: ( '+' )
                    {
                    // InternalTarot.g:455:2: ( '+' )
                    // InternalTarot.g:456:3: '+'
                    {
                     before(grammarAccess.getAddSubExprAccess().getOpPlusSignKeyword_2_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAddSubExprAccess().getOpPlusSignKeyword_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTarot.g:461:2: ( '-' )
                    {
                    // InternalTarot.g:461:2: ( '-' )
                    // InternalTarot.g:462:3: '-'
                    {
                     before(grammarAccess.getAddSubExprAccess().getOpHyphenMinusKeyword_2_0_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAddSubExprAccess().getOpHyphenMinusKeyword_2_0_0_1()); 

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
    // $ANTLR end "rule__AddSubExpr__OpAlternatives_2_0_0"


    // $ANTLR start "rule__ConditionalGoto__OpAlternatives_3_0"
    // InternalTarot.g:471:1: rule__ConditionalGoto__OpAlternatives_3_0 : ( ( '=' ) | ( '<' ) | ( '>' ) );
    public final void rule__ConditionalGoto__OpAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:475:1: ( ( '=' ) | ( '<' ) | ( '>' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTarot.g:476:2: ( '=' )
                    {
                    // InternalTarot.g:476:2: ( '=' )
                    // InternalTarot.g:477:3: '='
                    {
                     before(grammarAccess.getConditionalGotoAccess().getOpEqualsSignKeyword_3_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConditionalGotoAccess().getOpEqualsSignKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTarot.g:482:2: ( '<' )
                    {
                    // InternalTarot.g:482:2: ( '<' )
                    // InternalTarot.g:483:3: '<'
                    {
                     before(grammarAccess.getConditionalGotoAccess().getOpLessThanSignKeyword_3_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getConditionalGotoAccess().getOpLessThanSignKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTarot.g:488:2: ( '>' )
                    {
                    // InternalTarot.g:488:2: ( '>' )
                    // InternalTarot.g:489:3: '>'
                    {
                     before(grammarAccess.getConditionalGotoAccess().getOpGreaterThanSignKeyword_3_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConditionalGotoAccess().getOpGreaterThanSignKeyword_3_0_2()); 

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
    // $ANTLR end "rule__ConditionalGoto__OpAlternatives_3_0"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalTarot.g:498:1: rule__Value__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:502:1: ( ( RULE_ID ) | ( RULE_INT ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTarot.g:503:2: ( RULE_ID )
                    {
                    // InternalTarot.g:503:2: ( RULE_ID )
                    // InternalTarot.g:504:3: RULE_ID
                    {
                     before(grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTarot.g:509:2: ( RULE_INT )
                    {
                    // InternalTarot.g:509:2: ( RULE_INT )
                    // InternalTarot.g:510:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Line__Group__0"
    // InternalTarot.g:519:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:523:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalTarot.g:524:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Line__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalTarot.g:531:1: rule__Line__Group__0__Impl : ( ( rule__Line__NameAssignment_0 ) ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:535:1: ( ( ( rule__Line__NameAssignment_0 ) ) )
            // InternalTarot.g:536:1: ( ( rule__Line__NameAssignment_0 ) )
            {
            // InternalTarot.g:536:1: ( ( rule__Line__NameAssignment_0 ) )
            // InternalTarot.g:537:2: ( rule__Line__NameAssignment_0 )
            {
             before(grammarAccess.getLineAccess().getNameAssignment_0()); 
            // InternalTarot.g:538:2: ( rule__Line__NameAssignment_0 )
            // InternalTarot.g:538:3: rule__Line__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Line__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getNameAssignment_0()); 

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
    // InternalTarot.g:546:1: rule__Line__Group__1 : rule__Line__Group__1__Impl rule__Line__Group__2 ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:550:1: ( rule__Line__Group__1__Impl rule__Line__Group__2 )
            // InternalTarot.g:551:2: rule__Line__Group__1__Impl rule__Line__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Line__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__2();

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
    // InternalTarot.g:558:1: rule__Line__Group__1__Impl : ( ':' ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:562:1: ( ( ':' ) )
            // InternalTarot.g:563:1: ( ':' )
            {
            // InternalTarot.g:563:1: ( ':' )
            // InternalTarot.g:564:2: ':'
            {
             before(grammarAccess.getLineAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getColonKeyword_1()); 

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


    // $ANTLR start "rule__Line__Group__2"
    // InternalTarot.g:573:1: rule__Line__Group__2 : rule__Line__Group__2__Impl rule__Line__Group__3 ;
    public final void rule__Line__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:577:1: ( rule__Line__Group__2__Impl rule__Line__Group__3 )
            // InternalTarot.g:578:2: rule__Line__Group__2__Impl rule__Line__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Line__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__3();

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
    // $ANTLR end "rule__Line__Group__2"


    // $ANTLR start "rule__Line__Group__2__Impl"
    // InternalTarot.g:585:1: rule__Line__Group__2__Impl : ( ( rule__Line__InstructionAssignment_2 ) ) ;
    public final void rule__Line__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:589:1: ( ( ( rule__Line__InstructionAssignment_2 ) ) )
            // InternalTarot.g:590:1: ( ( rule__Line__InstructionAssignment_2 ) )
            {
            // InternalTarot.g:590:1: ( ( rule__Line__InstructionAssignment_2 ) )
            // InternalTarot.g:591:2: ( rule__Line__InstructionAssignment_2 )
            {
             before(grammarAccess.getLineAccess().getInstructionAssignment_2()); 
            // InternalTarot.g:592:2: ( rule__Line__InstructionAssignment_2 )
            // InternalTarot.g:592:3: rule__Line__InstructionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Line__InstructionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getInstructionAssignment_2()); 

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
    // $ANTLR end "rule__Line__Group__2__Impl"


    // $ANTLR start "rule__Line__Group__3"
    // InternalTarot.g:600:1: rule__Line__Group__3 : rule__Line__Group__3__Impl ;
    public final void rule__Line__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:604:1: ( rule__Line__Group__3__Impl )
            // InternalTarot.g:605:2: rule__Line__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__3__Impl();

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
    // $ANTLR end "rule__Line__Group__3"


    // $ANTLR start "rule__Line__Group__3__Impl"
    // InternalTarot.g:611:1: rule__Line__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Line__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:615:1: ( ( ( ';' )? ) )
            // InternalTarot.g:616:1: ( ( ';' )? )
            {
            // InternalTarot.g:616:1: ( ( ';' )? )
            // InternalTarot.g:617:2: ( ';' )?
            {
             before(grammarAccess.getLineAccess().getSemicolonKeyword_3()); 
            // InternalTarot.g:618:2: ( ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTarot.g:618:3: ';'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLineAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Line__Group__3__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalTarot.g:627:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:631:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalTarot.g:632:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

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
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalTarot.g:639:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VarAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:643:1: ( ( ( rule__Assignment__VarAssignment_0 ) ) )
            // InternalTarot.g:644:1: ( ( rule__Assignment__VarAssignment_0 ) )
            {
            // InternalTarot.g:644:1: ( ( rule__Assignment__VarAssignment_0 ) )
            // InternalTarot.g:645:2: ( rule__Assignment__VarAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getVarAssignment_0()); 
            // InternalTarot.g:646:2: ( rule__Assignment__VarAssignment_0 )
            // InternalTarot.g:646:3: rule__Assignment__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getVarAssignment_0()); 

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
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalTarot.g:654:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:658:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalTarot.g:659:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

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
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalTarot.g:666:1: rule__Assignment__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:670:1: ( ( ':=' ) )
            // InternalTarot.g:671:1: ( ':=' )
            {
            // InternalTarot.g:671:1: ( ':=' )
            // InternalTarot.g:672:2: ':='
            {
             before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalTarot.g:681:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:685:1: ( rule__Assignment__Group__2__Impl )
            // InternalTarot.g:686:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2__Impl();

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
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalTarot.g:692:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExprAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:696:1: ( ( ( rule__Assignment__ExprAssignment_2 ) ) )
            // InternalTarot.g:697:1: ( ( rule__Assignment__ExprAssignment_2 ) )
            {
            // InternalTarot.g:697:1: ( ( rule__Assignment__ExprAssignment_2 ) )
            // InternalTarot.g:698:2: ( rule__Assignment__ExprAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getExprAssignment_2()); 
            // InternalTarot.g:699:2: ( rule__Assignment__ExprAssignment_2 )
            // InternalTarot.g:699:3: rule__Assignment__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getExprAssignment_2()); 

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
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__AddSubExpr__Group__0"
    // InternalTarot.g:708:1: rule__AddSubExpr__Group__0 : rule__AddSubExpr__Group__0__Impl rule__AddSubExpr__Group__1 ;
    public final void rule__AddSubExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:712:1: ( rule__AddSubExpr__Group__0__Impl rule__AddSubExpr__Group__1 )
            // InternalTarot.g:713:2: rule__AddSubExpr__Group__0__Impl rule__AddSubExpr__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AddSubExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddSubExpr__Group__1();

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
    // $ANTLR end "rule__AddSubExpr__Group__0"


    // $ANTLR start "rule__AddSubExpr__Group__0__Impl"
    // InternalTarot.g:720:1: rule__AddSubExpr__Group__0__Impl : ( () ) ;
    public final void rule__AddSubExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:724:1: ( ( () ) )
            // InternalTarot.g:725:1: ( () )
            {
            // InternalTarot.g:725:1: ( () )
            // InternalTarot.g:726:2: ()
            {
             before(grammarAccess.getAddSubExprAccess().getAddSubExprAction_0()); 
            // InternalTarot.g:727:2: ()
            // InternalTarot.g:727:3: 
            {
            }

             after(grammarAccess.getAddSubExprAccess().getAddSubExprAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddSubExpr__Group__0__Impl"


    // $ANTLR start "rule__AddSubExpr__Group__1"
    // InternalTarot.g:735:1: rule__AddSubExpr__Group__1 : rule__AddSubExpr__Group__1__Impl rule__AddSubExpr__Group__2 ;
    public final void rule__AddSubExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:739:1: ( rule__AddSubExpr__Group__1__Impl rule__AddSubExpr__Group__2 )
            // InternalTarot.g:740:2: rule__AddSubExpr__Group__1__Impl rule__AddSubExpr__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AddSubExpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddSubExpr__Group__2();

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
    // $ANTLR end "rule__AddSubExpr__Group__1"


    // $ANTLR start "rule__AddSubExpr__Group__1__Impl"
    // InternalTarot.g:747:1: rule__AddSubExpr__Group__1__Impl : ( ( rule__AddSubExpr__LeftAssignment_1 ) ) ;
    public final void rule__AddSubExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:751:1: ( ( ( rule__AddSubExpr__LeftAssignment_1 ) ) )
            // InternalTarot.g:752:1: ( ( rule__AddSubExpr__LeftAssignment_1 ) )
            {
            // InternalTarot.g:752:1: ( ( rule__AddSubExpr__LeftAssignment_1 ) )
            // InternalTarot.g:753:2: ( rule__AddSubExpr__LeftAssignment_1 )
            {
             before(grammarAccess.getAddSubExprAccess().getLeftAssignment_1()); 
            // InternalTarot.g:754:2: ( rule__AddSubExpr__LeftAssignment_1 )
            // InternalTarot.g:754:3: rule__AddSubExpr__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddSubExpr__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddSubExprAccess().getLeftAssignment_1()); 

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
    // $ANTLR end "rule__AddSubExpr__Group__1__Impl"


    // $ANTLR start "rule__AddSubExpr__Group__2"
    // InternalTarot.g:762:1: rule__AddSubExpr__Group__2 : rule__AddSubExpr__Group__2__Impl ;
    public final void rule__AddSubExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:766:1: ( rule__AddSubExpr__Group__2__Impl )
            // InternalTarot.g:767:2: rule__AddSubExpr__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddSubExpr__Group__2__Impl();

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
    // $ANTLR end "rule__AddSubExpr__Group__2"


    // $ANTLR start "rule__AddSubExpr__Group__2__Impl"
    // InternalTarot.g:773:1: rule__AddSubExpr__Group__2__Impl : ( ( rule__AddSubExpr__Group_2__0 )? ) ;
    public final void rule__AddSubExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:777:1: ( ( ( rule__AddSubExpr__Group_2__0 )? ) )
            // InternalTarot.g:778:1: ( ( rule__AddSubExpr__Group_2__0 )? )
            {
            // InternalTarot.g:778:1: ( ( rule__AddSubExpr__Group_2__0 )? )
            // InternalTarot.g:779:2: ( rule__AddSubExpr__Group_2__0 )?
            {
             before(grammarAccess.getAddSubExprAccess().getGroup_2()); 
            // InternalTarot.g:780:2: ( rule__AddSubExpr__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=11 && LA8_0<=12)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTarot.g:780:3: rule__AddSubExpr__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddSubExpr__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddSubExprAccess().getGroup_2()); 

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
    // $ANTLR end "rule__AddSubExpr__Group__2__Impl"


    // $ANTLR start "rule__AddSubExpr__Group_2__0"
    // InternalTarot.g:789:1: rule__AddSubExpr__Group_2__0 : rule__AddSubExpr__Group_2__0__Impl rule__AddSubExpr__Group_2__1 ;
    public final void rule__AddSubExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:793:1: ( rule__AddSubExpr__Group_2__0__Impl rule__AddSubExpr__Group_2__1 )
            // InternalTarot.g:794:2: rule__AddSubExpr__Group_2__0__Impl rule__AddSubExpr__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__AddSubExpr__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddSubExpr__Group_2__1();

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
    // $ANTLR end "rule__AddSubExpr__Group_2__0"


    // $ANTLR start "rule__AddSubExpr__Group_2__0__Impl"
    // InternalTarot.g:801:1: rule__AddSubExpr__Group_2__0__Impl : ( ( rule__AddSubExpr__OpAssignment_2_0 ) ) ;
    public final void rule__AddSubExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:805:1: ( ( ( rule__AddSubExpr__OpAssignment_2_0 ) ) )
            // InternalTarot.g:806:1: ( ( rule__AddSubExpr__OpAssignment_2_0 ) )
            {
            // InternalTarot.g:806:1: ( ( rule__AddSubExpr__OpAssignment_2_0 ) )
            // InternalTarot.g:807:2: ( rule__AddSubExpr__OpAssignment_2_0 )
            {
             before(grammarAccess.getAddSubExprAccess().getOpAssignment_2_0()); 
            // InternalTarot.g:808:2: ( rule__AddSubExpr__OpAssignment_2_0 )
            // InternalTarot.g:808:3: rule__AddSubExpr__OpAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__AddSubExpr__OpAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAddSubExprAccess().getOpAssignment_2_0()); 

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
    // $ANTLR end "rule__AddSubExpr__Group_2__0__Impl"


    // $ANTLR start "rule__AddSubExpr__Group_2__1"
    // InternalTarot.g:816:1: rule__AddSubExpr__Group_2__1 : rule__AddSubExpr__Group_2__1__Impl ;
    public final void rule__AddSubExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:820:1: ( rule__AddSubExpr__Group_2__1__Impl )
            // InternalTarot.g:821:2: rule__AddSubExpr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddSubExpr__Group_2__1__Impl();

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
    // $ANTLR end "rule__AddSubExpr__Group_2__1"


    // $ANTLR start "rule__AddSubExpr__Group_2__1__Impl"
    // InternalTarot.g:827:1: rule__AddSubExpr__Group_2__1__Impl : ( ( rule__AddSubExpr__RightAssignment_2_1 ) ) ;
    public final void rule__AddSubExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:831:1: ( ( ( rule__AddSubExpr__RightAssignment_2_1 ) ) )
            // InternalTarot.g:832:1: ( ( rule__AddSubExpr__RightAssignment_2_1 ) )
            {
            // InternalTarot.g:832:1: ( ( rule__AddSubExpr__RightAssignment_2_1 ) )
            // InternalTarot.g:833:2: ( rule__AddSubExpr__RightAssignment_2_1 )
            {
             before(grammarAccess.getAddSubExprAccess().getRightAssignment_2_1()); 
            // InternalTarot.g:834:2: ( rule__AddSubExpr__RightAssignment_2_1 )
            // InternalTarot.g:834:3: rule__AddSubExpr__RightAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AddSubExpr__RightAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAddSubExprAccess().getRightAssignment_2_1()); 

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
    // $ANTLR end "rule__AddSubExpr__Group_2__1__Impl"


    // $ANTLR start "rule__IntLiteral__Group__0"
    // InternalTarot.g:843:1: rule__IntLiteral__Group__0 : rule__IntLiteral__Group__0__Impl rule__IntLiteral__Group__1 ;
    public final void rule__IntLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:847:1: ( rule__IntLiteral__Group__0__Impl rule__IntLiteral__Group__1 )
            // InternalTarot.g:848:2: rule__IntLiteral__Group__0__Impl rule__IntLiteral__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__IntLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntLiteral__Group__1();

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
    // $ANTLR end "rule__IntLiteral__Group__0"


    // $ANTLR start "rule__IntLiteral__Group__0__Impl"
    // InternalTarot.g:855:1: rule__IntLiteral__Group__0__Impl : ( () ) ;
    public final void rule__IntLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:859:1: ( ( () ) )
            // InternalTarot.g:860:1: ( () )
            {
            // InternalTarot.g:860:1: ( () )
            // InternalTarot.g:861:2: ()
            {
             before(grammarAccess.getIntLiteralAccess().getIntLiteralAction_0()); 
            // InternalTarot.g:862:2: ()
            // InternalTarot.g:862:3: 
            {
            }

             after(grammarAccess.getIntLiteralAccess().getIntLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__Group__0__Impl"


    // $ANTLR start "rule__IntLiteral__Group__1"
    // InternalTarot.g:870:1: rule__IntLiteral__Group__1 : rule__IntLiteral__Group__1__Impl ;
    public final void rule__IntLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:874:1: ( rule__IntLiteral__Group__1__Impl )
            // InternalTarot.g:875:2: rule__IntLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__IntLiteral__Group__1"


    // $ANTLR start "rule__IntLiteral__Group__1__Impl"
    // InternalTarot.g:881:1: rule__IntLiteral__Group__1__Impl : ( ( rule__IntLiteral__ValueAssignment_1 ) ) ;
    public final void rule__IntLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:885:1: ( ( ( rule__IntLiteral__ValueAssignment_1 ) ) )
            // InternalTarot.g:886:1: ( ( rule__IntLiteral__ValueAssignment_1 ) )
            {
            // InternalTarot.g:886:1: ( ( rule__IntLiteral__ValueAssignment_1 ) )
            // InternalTarot.g:887:2: ( rule__IntLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getIntLiteralAccess().getValueAssignment_1()); 
            // InternalTarot.g:888:2: ( rule__IntLiteral__ValueAssignment_1 )
            // InternalTarot.g:888:3: rule__IntLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__IntLiteral__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalTarot.g:897:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:901:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalTarot.g:902:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

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
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalTarot.g:909:1: rule__Input__Group__0__Impl : ( 'EINGABE' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:913:1: ( ( 'EINGABE' ) )
            // InternalTarot.g:914:1: ( 'EINGABE' )
            {
            // InternalTarot.g:914:1: ( 'EINGABE' )
            // InternalTarot.g:915:2: 'EINGABE'
            {
             before(grammarAccess.getInputAccess().getEINGABEKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getEINGABEKeyword_0()); 

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
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalTarot.g:924:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:928:1: ( rule__Input__Group__1__Impl )
            // InternalTarot.g:929:2: rule__Input__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__1__Impl();

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
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalTarot.g:935:1: rule__Input__Group__1__Impl : ( ( rule__Input__VarAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:939:1: ( ( ( rule__Input__VarAssignment_1 ) ) )
            // InternalTarot.g:940:1: ( ( rule__Input__VarAssignment_1 ) )
            {
            // InternalTarot.g:940:1: ( ( rule__Input__VarAssignment_1 ) )
            // InternalTarot.g:941:2: ( rule__Input__VarAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getVarAssignment_1()); 
            // InternalTarot.g:942:2: ( rule__Input__VarAssignment_1 )
            // InternalTarot.g:942:3: rule__Input__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getVarAssignment_1()); 

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
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalTarot.g:951:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:955:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalTarot.g:956:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

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
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalTarot.g:963:1: rule__Output__Group__0__Impl : ( 'SCHREIBE' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:967:1: ( ( 'SCHREIBE' ) )
            // InternalTarot.g:968:1: ( 'SCHREIBE' )
            {
            // InternalTarot.g:968:1: ( 'SCHREIBE' )
            // InternalTarot.g:969:2: 'SCHREIBE'
            {
             before(grammarAccess.getOutputAccess().getSCHREIBEKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getSCHREIBEKeyword_0()); 

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
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalTarot.g:978:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:982:1: ( rule__Output__Group__1__Impl )
            // InternalTarot.g:983:2: rule__Output__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__1__Impl();

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
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalTarot.g:989:1: rule__Output__Group__1__Impl : ( ( rule__Output__VarAssignment_1 ) ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:993:1: ( ( ( rule__Output__VarAssignment_1 ) ) )
            // InternalTarot.g:994:1: ( ( rule__Output__VarAssignment_1 ) )
            {
            // InternalTarot.g:994:1: ( ( rule__Output__VarAssignment_1 ) )
            // InternalTarot.g:995:2: ( rule__Output__VarAssignment_1 )
            {
             before(grammarAccess.getOutputAccess().getVarAssignment_1()); 
            // InternalTarot.g:996:2: ( rule__Output__VarAssignment_1 )
            // InternalTarot.g:996:3: rule__Output__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getVarAssignment_1()); 

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
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Goto__Group__0"
    // InternalTarot.g:1005:1: rule__Goto__Group__0 : rule__Goto__Group__0__Impl rule__Goto__Group__1 ;
    public final void rule__Goto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1009:1: ( rule__Goto__Group__0__Impl rule__Goto__Group__1 )
            // InternalTarot.g:1010:2: rule__Goto__Group__0__Impl rule__Goto__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Goto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goto__Group__1();

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
    // $ANTLR end "rule__Goto__Group__0"


    // $ANTLR start "rule__Goto__Group__0__Impl"
    // InternalTarot.g:1017:1: rule__Goto__Group__0__Impl : ( 'GEHE' ) ;
    public final void rule__Goto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1021:1: ( ( 'GEHE' ) )
            // InternalTarot.g:1022:1: ( 'GEHE' )
            {
            // InternalTarot.g:1022:1: ( 'GEHE' )
            // InternalTarot.g:1023:2: 'GEHE'
            {
             before(grammarAccess.getGotoAccess().getGEHEKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGotoAccess().getGEHEKeyword_0()); 

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
    // $ANTLR end "rule__Goto__Group__0__Impl"


    // $ANTLR start "rule__Goto__Group__1"
    // InternalTarot.g:1032:1: rule__Goto__Group__1 : rule__Goto__Group__1__Impl rule__Goto__Group__2 ;
    public final void rule__Goto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1036:1: ( rule__Goto__Group__1__Impl rule__Goto__Group__2 )
            // InternalTarot.g:1037:2: rule__Goto__Group__1__Impl rule__Goto__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Goto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goto__Group__2();

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
    // $ANTLR end "rule__Goto__Group__1"


    // $ANTLR start "rule__Goto__Group__1__Impl"
    // InternalTarot.g:1044:1: rule__Goto__Group__1__Impl : ( 'ZU' ) ;
    public final void rule__Goto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1048:1: ( ( 'ZU' ) )
            // InternalTarot.g:1049:1: ( 'ZU' )
            {
            // InternalTarot.g:1049:1: ( 'ZU' )
            // InternalTarot.g:1050:2: 'ZU'
            {
             before(grammarAccess.getGotoAccess().getZUKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGotoAccess().getZUKeyword_1()); 

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
    // $ANTLR end "rule__Goto__Group__1__Impl"


    // $ANTLR start "rule__Goto__Group__2"
    // InternalTarot.g:1059:1: rule__Goto__Group__2 : rule__Goto__Group__2__Impl ;
    public final void rule__Goto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1063:1: ( rule__Goto__Group__2__Impl )
            // InternalTarot.g:1064:2: rule__Goto__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goto__Group__2__Impl();

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
    // $ANTLR end "rule__Goto__Group__2"


    // $ANTLR start "rule__Goto__Group__2__Impl"
    // InternalTarot.g:1070:1: rule__Goto__Group__2__Impl : ( ( rule__Goto__TargetAssignment_2 ) ) ;
    public final void rule__Goto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1074:1: ( ( ( rule__Goto__TargetAssignment_2 ) ) )
            // InternalTarot.g:1075:1: ( ( rule__Goto__TargetAssignment_2 ) )
            {
            // InternalTarot.g:1075:1: ( ( rule__Goto__TargetAssignment_2 ) )
            // InternalTarot.g:1076:2: ( rule__Goto__TargetAssignment_2 )
            {
             before(grammarAccess.getGotoAccess().getTargetAssignment_2()); 
            // InternalTarot.g:1077:2: ( rule__Goto__TargetAssignment_2 )
            // InternalTarot.g:1077:3: rule__Goto__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Goto__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGotoAccess().getTargetAssignment_2()); 

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
    // $ANTLR end "rule__Goto__Group__2__Impl"


    // $ANTLR start "rule__ConditionalGoto__Group__0"
    // InternalTarot.g:1086:1: rule__ConditionalGoto__Group__0 : rule__ConditionalGoto__Group__0__Impl rule__ConditionalGoto__Group__1 ;
    public final void rule__ConditionalGoto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1090:1: ( rule__ConditionalGoto__Group__0__Impl rule__ConditionalGoto__Group__1 )
            // InternalTarot.g:1091:2: rule__ConditionalGoto__Group__0__Impl rule__ConditionalGoto__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ConditionalGoto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalGoto__Group__1();

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
    // $ANTLR end "rule__ConditionalGoto__Group__0"


    // $ANTLR start "rule__ConditionalGoto__Group__0__Impl"
    // InternalTarot.g:1098:1: rule__ConditionalGoto__Group__0__Impl : ( 'WENN' ) ;
    public final void rule__ConditionalGoto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1102:1: ( ( 'WENN' ) )
            // InternalTarot.g:1103:1: ( 'WENN' )
            {
            // InternalTarot.g:1103:1: ( 'WENN' )
            // InternalTarot.g:1104:2: 'WENN'
            {
             before(grammarAccess.getConditionalGotoAccess().getWENNKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConditionalGotoAccess().getWENNKeyword_0()); 

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
    // $ANTLR end "rule__ConditionalGoto__Group__0__Impl"


    // $ANTLR start "rule__ConditionalGoto__Group__1"
    // InternalTarot.g:1113:1: rule__ConditionalGoto__Group__1 : rule__ConditionalGoto__Group__1__Impl rule__ConditionalGoto__Group__2 ;
    public final void rule__ConditionalGoto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1117:1: ( rule__ConditionalGoto__Group__1__Impl rule__ConditionalGoto__Group__2 )
            // InternalTarot.g:1118:2: rule__ConditionalGoto__Group__1__Impl rule__ConditionalGoto__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ConditionalGoto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalGoto__Group__2();

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
    // $ANTLR end "rule__ConditionalGoto__Group__1"


    // $ANTLR start "rule__ConditionalGoto__Group__1__Impl"
    // InternalTarot.g:1125:1: rule__ConditionalGoto__Group__1__Impl : ( '(' ) ;
    public final void rule__ConditionalGoto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1129:1: ( ( '(' ) )
            // InternalTarot.g:1130:1: ( '(' )
            {
            // InternalTarot.g:1130:1: ( '(' )
            // InternalTarot.g:1131:2: '('
            {
             before(grammarAccess.getConditionalGotoAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConditionalGotoAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ConditionalGoto__Group__1__Impl"


    // $ANTLR start "rule__ConditionalGoto__Group__2"
    // InternalTarot.g:1140:1: rule__ConditionalGoto__Group__2 : rule__ConditionalGoto__Group__2__Impl rule__ConditionalGoto__Group__3 ;
    public final void rule__ConditionalGoto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1144:1: ( rule__ConditionalGoto__Group__2__Impl rule__ConditionalGoto__Group__3 )
            // InternalTarot.g:1145:2: rule__ConditionalGoto__Group__2__Impl rule__ConditionalGoto__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ConditionalGoto__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalGoto__Group__3();

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
    // $ANTLR end "rule__ConditionalGoto__Group__2"


    // $ANTLR start "rule__ConditionalGoto__Group__2__Impl"
    // InternalTarot.g:1152:1: rule__ConditionalGoto__Group__2__Impl : ( ( rule__ConditionalGoto__LeftAssignment_2 ) ) ;
    public final void rule__ConditionalGoto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1156:1: ( ( ( rule__ConditionalGoto__LeftAssignment_2 ) ) )
            // InternalTarot.g:1157:1: ( ( rule__ConditionalGoto__LeftAssignment_2 ) )
            {
            // InternalTarot.g:1157:1: ( ( rule__ConditionalGoto__LeftAssignment_2 ) )
            // InternalTarot.g:1158:2: ( rule__ConditionalGoto__LeftAssignment_2 )
            {
             before(grammarAccess.getConditionalGotoAccess().getLeftAssignment_2()); 
            // InternalTarot.g:1159:2: ( rule__ConditionalGoto__LeftAssignment_2 )
            // InternalTarot.g:1159:3: rule__ConditionalGoto__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalGoto__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalGotoAccess().getLeftAssignment_2()); 

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
    // $ANTLR end "rule__ConditionalGoto__Group__2__Impl"


    // $ANTLR start "rule__ConditionalGoto__Group__3"
    // InternalTarot.g:1167:1: rule__ConditionalGoto__Group__3 : rule__ConditionalGoto__Group__3__Impl rule__ConditionalGoto__Group__4 ;
    public final void rule__ConditionalGoto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1171:1: ( rule__ConditionalGoto__Group__3__Impl rule__ConditionalGoto__Group__4 )
            // InternalTarot.g:1172:2: rule__ConditionalGoto__Group__3__Impl rule__ConditionalGoto__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ConditionalGoto__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalGoto__Group__4();

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
    // $ANTLR end "rule__ConditionalGoto__Group__3"


    // $ANTLR start "rule__ConditionalGoto__Group__3__Impl"
    // InternalTarot.g:1179:1: rule__ConditionalGoto__Group__3__Impl : ( ( rule__ConditionalGoto__OpAssignment_3 ) ) ;
    public final void rule__ConditionalGoto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1183:1: ( ( ( rule__ConditionalGoto__OpAssignment_3 ) ) )
            // InternalTarot.g:1184:1: ( ( rule__ConditionalGoto__OpAssignment_3 ) )
            {
            // InternalTarot.g:1184:1: ( ( rule__ConditionalGoto__OpAssignment_3 ) )
            // InternalTarot.g:1185:2: ( rule__ConditionalGoto__OpAssignment_3 )
            {
             before(grammarAccess.getConditionalGotoAccess().getOpAssignment_3()); 
            // InternalTarot.g:1186:2: ( rule__ConditionalGoto__OpAssignment_3 )
            // InternalTarot.g:1186:3: rule__ConditionalGoto__OpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalGoto__OpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionalGotoAccess().getOpAssignment_3()); 

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
    // $ANTLR end "rule__ConditionalGoto__Group__3__Impl"


    // $ANTLR start "rule__ConditionalGoto__Group__4"
    // InternalTarot.g:1194:1: rule__ConditionalGoto__Group__4 : rule__ConditionalGoto__Group__4__Impl rule__ConditionalGoto__Group__5 ;
    public final void rule__ConditionalGoto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1198:1: ( rule__ConditionalGoto__Group__4__Impl rule__ConditionalGoto__Group__5 )
            // InternalTarot.g:1199:2: rule__ConditionalGoto__Group__4__Impl rule__ConditionalGoto__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ConditionalGoto__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalGoto__Group__5();

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
    // $ANTLR end "rule__ConditionalGoto__Group__4"


    // $ANTLR start "rule__ConditionalGoto__Group__4__Impl"
    // InternalTarot.g:1206:1: rule__ConditionalGoto__Group__4__Impl : ( ( rule__ConditionalGoto__RightAssignment_4 ) ) ;
    public final void rule__ConditionalGoto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1210:1: ( ( ( rule__ConditionalGoto__RightAssignment_4 ) ) )
            // InternalTarot.g:1211:1: ( ( rule__ConditionalGoto__RightAssignment_4 ) )
            {
            // InternalTarot.g:1211:1: ( ( rule__ConditionalGoto__RightAssignment_4 ) )
            // InternalTarot.g:1212:2: ( rule__ConditionalGoto__RightAssignment_4 )
            {
             before(grammarAccess.getConditionalGotoAccess().getRightAssignment_4()); 
            // InternalTarot.g:1213:2: ( rule__ConditionalGoto__RightAssignment_4 )
            // InternalTarot.g:1213:3: rule__ConditionalGoto__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalGoto__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionalGotoAccess().getRightAssignment_4()); 

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
    // $ANTLR end "rule__ConditionalGoto__Group__4__Impl"


    // $ANTLR start "rule__ConditionalGoto__Group__5"
    // InternalTarot.g:1221:1: rule__ConditionalGoto__Group__5 : rule__ConditionalGoto__Group__5__Impl rule__ConditionalGoto__Group__6 ;
    public final void rule__ConditionalGoto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1225:1: ( rule__ConditionalGoto__Group__5__Impl rule__ConditionalGoto__Group__6 )
            // InternalTarot.g:1226:2: rule__ConditionalGoto__Group__5__Impl rule__ConditionalGoto__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__ConditionalGoto__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalGoto__Group__6();

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
    // $ANTLR end "rule__ConditionalGoto__Group__5"


    // $ANTLR start "rule__ConditionalGoto__Group__5__Impl"
    // InternalTarot.g:1233:1: rule__ConditionalGoto__Group__5__Impl : ( ')' ) ;
    public final void rule__ConditionalGoto__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1237:1: ( ( ')' ) )
            // InternalTarot.g:1238:1: ( ')' )
            {
            // InternalTarot.g:1238:1: ( ')' )
            // InternalTarot.g:1239:2: ')'
            {
             before(grammarAccess.getConditionalGotoAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConditionalGotoAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__ConditionalGoto__Group__5__Impl"


    // $ANTLR start "rule__ConditionalGoto__Group__6"
    // InternalTarot.g:1248:1: rule__ConditionalGoto__Group__6 : rule__ConditionalGoto__Group__6__Impl rule__ConditionalGoto__Group__7 ;
    public final void rule__ConditionalGoto__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1252:1: ( rule__ConditionalGoto__Group__6__Impl rule__ConditionalGoto__Group__7 )
            // InternalTarot.g:1253:2: rule__ConditionalGoto__Group__6__Impl rule__ConditionalGoto__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__ConditionalGoto__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalGoto__Group__7();

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
    // $ANTLR end "rule__ConditionalGoto__Group__6"


    // $ANTLR start "rule__ConditionalGoto__Group__6__Impl"
    // InternalTarot.g:1260:1: rule__ConditionalGoto__Group__6__Impl : ( 'DANN' ) ;
    public final void rule__ConditionalGoto__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1264:1: ( ( 'DANN' ) )
            // InternalTarot.g:1265:1: ( 'DANN' )
            {
            // InternalTarot.g:1265:1: ( 'DANN' )
            // InternalTarot.g:1266:2: 'DANN'
            {
             before(grammarAccess.getConditionalGotoAccess().getDANNKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConditionalGotoAccess().getDANNKeyword_6()); 

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
    // $ANTLR end "rule__ConditionalGoto__Group__6__Impl"


    // $ANTLR start "rule__ConditionalGoto__Group__7"
    // InternalTarot.g:1275:1: rule__ConditionalGoto__Group__7 : rule__ConditionalGoto__Group__7__Impl rule__ConditionalGoto__Group__8 ;
    public final void rule__ConditionalGoto__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1279:1: ( rule__ConditionalGoto__Group__7__Impl rule__ConditionalGoto__Group__8 )
            // InternalTarot.g:1280:2: rule__ConditionalGoto__Group__7__Impl rule__ConditionalGoto__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__ConditionalGoto__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalGoto__Group__8();

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
    // $ANTLR end "rule__ConditionalGoto__Group__7"


    // $ANTLR start "rule__ConditionalGoto__Group__7__Impl"
    // InternalTarot.g:1287:1: rule__ConditionalGoto__Group__7__Impl : ( 'GEHE' ) ;
    public final void rule__ConditionalGoto__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1291:1: ( ( 'GEHE' ) )
            // InternalTarot.g:1292:1: ( 'GEHE' )
            {
            // InternalTarot.g:1292:1: ( 'GEHE' )
            // InternalTarot.g:1293:2: 'GEHE'
            {
             before(grammarAccess.getConditionalGotoAccess().getGEHEKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConditionalGotoAccess().getGEHEKeyword_7()); 

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
    // $ANTLR end "rule__ConditionalGoto__Group__7__Impl"


    // $ANTLR start "rule__ConditionalGoto__Group__8"
    // InternalTarot.g:1302:1: rule__ConditionalGoto__Group__8 : rule__ConditionalGoto__Group__8__Impl rule__ConditionalGoto__Group__9 ;
    public final void rule__ConditionalGoto__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1306:1: ( rule__ConditionalGoto__Group__8__Impl rule__ConditionalGoto__Group__9 )
            // InternalTarot.g:1307:2: rule__ConditionalGoto__Group__8__Impl rule__ConditionalGoto__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__ConditionalGoto__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalGoto__Group__9();

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
    // $ANTLR end "rule__ConditionalGoto__Group__8"


    // $ANTLR start "rule__ConditionalGoto__Group__8__Impl"
    // InternalTarot.g:1314:1: rule__ConditionalGoto__Group__8__Impl : ( 'ZU' ) ;
    public final void rule__ConditionalGoto__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1318:1: ( ( 'ZU' ) )
            // InternalTarot.g:1319:1: ( 'ZU' )
            {
            // InternalTarot.g:1319:1: ( 'ZU' )
            // InternalTarot.g:1320:2: 'ZU'
            {
             before(grammarAccess.getConditionalGotoAccess().getZUKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConditionalGotoAccess().getZUKeyword_8()); 

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
    // $ANTLR end "rule__ConditionalGoto__Group__8__Impl"


    // $ANTLR start "rule__ConditionalGoto__Group__9"
    // InternalTarot.g:1329:1: rule__ConditionalGoto__Group__9 : rule__ConditionalGoto__Group__9__Impl ;
    public final void rule__ConditionalGoto__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1333:1: ( rule__ConditionalGoto__Group__9__Impl )
            // InternalTarot.g:1334:2: rule__ConditionalGoto__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalGoto__Group__9__Impl();

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
    // $ANTLR end "rule__ConditionalGoto__Group__9"


    // $ANTLR start "rule__ConditionalGoto__Group__9__Impl"
    // InternalTarot.g:1340:1: rule__ConditionalGoto__Group__9__Impl : ( ( rule__ConditionalGoto__TargetAssignment_9 ) ) ;
    public final void rule__ConditionalGoto__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1344:1: ( ( ( rule__ConditionalGoto__TargetAssignment_9 ) ) )
            // InternalTarot.g:1345:1: ( ( rule__ConditionalGoto__TargetAssignment_9 ) )
            {
            // InternalTarot.g:1345:1: ( ( rule__ConditionalGoto__TargetAssignment_9 ) )
            // InternalTarot.g:1346:2: ( rule__ConditionalGoto__TargetAssignment_9 )
            {
             before(grammarAccess.getConditionalGotoAccess().getTargetAssignment_9()); 
            // InternalTarot.g:1347:2: ( rule__ConditionalGoto__TargetAssignment_9 )
            // InternalTarot.g:1347:3: rule__ConditionalGoto__TargetAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalGoto__TargetAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getConditionalGotoAccess().getTargetAssignment_9()); 

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
    // $ANTLR end "rule__ConditionalGoto__Group__9__Impl"


    // $ANTLR start "rule__Stop__Group__0"
    // InternalTarot.g:1356:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1360:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // InternalTarot.g:1361:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Stop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stop__Group__1();

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
    // $ANTLR end "rule__Stop__Group__0"


    // $ANTLR start "rule__Stop__Group__0__Impl"
    // InternalTarot.g:1368:1: rule__Stop__Group__0__Impl : ( () ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1372:1: ( ( () ) )
            // InternalTarot.g:1373:1: ( () )
            {
            // InternalTarot.g:1373:1: ( () )
            // InternalTarot.g:1374:2: ()
            {
             before(grammarAccess.getStopAccess().getStopAction_0()); 
            // InternalTarot.g:1375:2: ()
            // InternalTarot.g:1375:3: 
            {
            }

             after(grammarAccess.getStopAccess().getStopAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__0__Impl"


    // $ANTLR start "rule__Stop__Group__1"
    // InternalTarot.g:1383:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1387:1: ( rule__Stop__Group__1__Impl )
            // InternalTarot.g:1388:2: rule__Stop__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stop__Group__1__Impl();

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
    // $ANTLR end "rule__Stop__Group__1"


    // $ANTLR start "rule__Stop__Group__1__Impl"
    // InternalTarot.g:1394:1: rule__Stop__Group__1__Impl : ( 'Halt!' ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1398:1: ( ( 'Halt!' ) )
            // InternalTarot.g:1399:1: ( 'Halt!' )
            {
            // InternalTarot.g:1399:1: ( 'Halt!' )
            // InternalTarot.g:1400:2: 'Halt!'
            {
             before(grammarAccess.getStopAccess().getHaltKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStopAccess().getHaltKeyword_1()); 

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
    // $ANTLR end "rule__Stop__Group__1__Impl"


    // $ANTLR start "rule__Program__LinesAssignment"
    // InternalTarot.g:1410:1: rule__Program__LinesAssignment : ( ruleLine ) ;
    public final void rule__Program__LinesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1414:1: ( ( ruleLine ) )
            // InternalTarot.g:1415:2: ( ruleLine )
            {
            // InternalTarot.g:1415:2: ( ruleLine )
            // InternalTarot.g:1416:3: ruleLine
            {
             before(grammarAccess.getProgramAccess().getLinesLineParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getLinesLineParserRuleCall_0()); 

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
    // $ANTLR end "rule__Program__LinesAssignment"


    // $ANTLR start "rule__Line__NameAssignment_0"
    // InternalTarot.g:1425:1: rule__Line__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Line__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1429:1: ( ( RULE_ID ) )
            // InternalTarot.g:1430:2: ( RULE_ID )
            {
            // InternalTarot.g:1430:2: ( RULE_ID )
            // InternalTarot.g:1431:3: RULE_ID
            {
             before(grammarAccess.getLineAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Line__NameAssignment_0"


    // $ANTLR start "rule__Line__InstructionAssignment_2"
    // InternalTarot.g:1440:1: rule__Line__InstructionAssignment_2 : ( ruleInstruction ) ;
    public final void rule__Line__InstructionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1444:1: ( ( ruleInstruction ) )
            // InternalTarot.g:1445:2: ( ruleInstruction )
            {
            // InternalTarot.g:1445:2: ( ruleInstruction )
            // InternalTarot.g:1446:3: ruleInstruction
            {
             before(grammarAccess.getLineAccess().getInstructionInstructionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getLineAccess().getInstructionInstructionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Line__InstructionAssignment_2"


    // $ANTLR start "rule__Assignment__VarAssignment_0"
    // InternalTarot.g:1455:1: rule__Assignment__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__Assignment__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1459:1: ( ( RULE_ID ) )
            // InternalTarot.g:1460:2: ( RULE_ID )
            {
            // InternalTarot.g:1460:2: ( RULE_ID )
            // InternalTarot.g:1461:3: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getVarIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getVarIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Assignment__VarAssignment_0"


    // $ANTLR start "rule__Assignment__ExprAssignment_2"
    // InternalTarot.g:1470:1: rule__Assignment__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1474:1: ( ( ruleExpression ) )
            // InternalTarot.g:1475:2: ( ruleExpression )
            {
            // InternalTarot.g:1475:2: ( ruleExpression )
            // InternalTarot.g:1476:3: ruleExpression
            {
             before(grammarAccess.getAssignmentAccess().getExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getExprExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Assignment__ExprAssignment_2"


    // $ANTLR start "rule__AddSubExpr__LeftAssignment_1"
    // InternalTarot.g:1485:1: rule__AddSubExpr__LeftAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddSubExpr__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1489:1: ( ( RULE_ID ) )
            // InternalTarot.g:1490:2: ( RULE_ID )
            {
            // InternalTarot.g:1490:2: ( RULE_ID )
            // InternalTarot.g:1491:3: RULE_ID
            {
             before(grammarAccess.getAddSubExprAccess().getLeftIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddSubExprAccess().getLeftIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AddSubExpr__LeftAssignment_1"


    // $ANTLR start "rule__AddSubExpr__OpAssignment_2_0"
    // InternalTarot.g:1500:1: rule__AddSubExpr__OpAssignment_2_0 : ( ( rule__AddSubExpr__OpAlternatives_2_0_0 ) ) ;
    public final void rule__AddSubExpr__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1504:1: ( ( ( rule__AddSubExpr__OpAlternatives_2_0_0 ) ) )
            // InternalTarot.g:1505:2: ( ( rule__AddSubExpr__OpAlternatives_2_0_0 ) )
            {
            // InternalTarot.g:1505:2: ( ( rule__AddSubExpr__OpAlternatives_2_0_0 ) )
            // InternalTarot.g:1506:3: ( rule__AddSubExpr__OpAlternatives_2_0_0 )
            {
             before(grammarAccess.getAddSubExprAccess().getOpAlternatives_2_0_0()); 
            // InternalTarot.g:1507:3: ( rule__AddSubExpr__OpAlternatives_2_0_0 )
            // InternalTarot.g:1507:4: rule__AddSubExpr__OpAlternatives_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AddSubExpr__OpAlternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAddSubExprAccess().getOpAlternatives_2_0_0()); 

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
    // $ANTLR end "rule__AddSubExpr__OpAssignment_2_0"


    // $ANTLR start "rule__AddSubExpr__RightAssignment_2_1"
    // InternalTarot.g:1515:1: rule__AddSubExpr__RightAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__AddSubExpr__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1519:1: ( ( RULE_ID ) )
            // InternalTarot.g:1520:2: ( RULE_ID )
            {
            // InternalTarot.g:1520:2: ( RULE_ID )
            // InternalTarot.g:1521:3: RULE_ID
            {
             before(grammarAccess.getAddSubExprAccess().getRightIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddSubExprAccess().getRightIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__AddSubExpr__RightAssignment_2_1"


    // $ANTLR start "rule__IntLiteral__ValueAssignment_1"
    // InternalTarot.g:1530:1: rule__IntLiteral__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1534:1: ( ( RULE_INT ) )
            // InternalTarot.g:1535:2: ( RULE_INT )
            {
            // InternalTarot.g:1535:2: ( RULE_INT )
            // InternalTarot.g:1536:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__IntLiteral__ValueAssignment_1"


    // $ANTLR start "rule__Input__VarAssignment_1"
    // InternalTarot.g:1545:1: rule__Input__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__Input__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1549:1: ( ( RULE_ID ) )
            // InternalTarot.g:1550:2: ( RULE_ID )
            {
            // InternalTarot.g:1550:2: ( RULE_ID )
            // InternalTarot.g:1551:3: RULE_ID
            {
             before(grammarAccess.getInputAccess().getVarIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getVarIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Input__VarAssignment_1"


    // $ANTLR start "rule__Output__VarAssignment_1"
    // InternalTarot.g:1560:1: rule__Output__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__Output__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1564:1: ( ( RULE_ID ) )
            // InternalTarot.g:1565:2: ( RULE_ID )
            {
            // InternalTarot.g:1565:2: ( RULE_ID )
            // InternalTarot.g:1566:3: RULE_ID
            {
             before(grammarAccess.getOutputAccess().getVarIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getVarIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Output__VarAssignment_1"


    // $ANTLR start "rule__Goto__TargetAssignment_2"
    // InternalTarot.g:1575:1: rule__Goto__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Goto__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1579:1: ( ( ( RULE_ID ) ) )
            // InternalTarot.g:1580:2: ( ( RULE_ID ) )
            {
            // InternalTarot.g:1580:2: ( ( RULE_ID ) )
            // InternalTarot.g:1581:3: ( RULE_ID )
            {
             before(grammarAccess.getGotoAccess().getTargetLineCrossReference_2_0()); 
            // InternalTarot.g:1582:3: ( RULE_ID )
            // InternalTarot.g:1583:4: RULE_ID
            {
             before(grammarAccess.getGotoAccess().getTargetLineIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGotoAccess().getTargetLineIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getGotoAccess().getTargetLineCrossReference_2_0()); 

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
    // $ANTLR end "rule__Goto__TargetAssignment_2"


    // $ANTLR start "rule__ConditionalGoto__LeftAssignment_2"
    // InternalTarot.g:1594:1: rule__ConditionalGoto__LeftAssignment_2 : ( RULE_ID ) ;
    public final void rule__ConditionalGoto__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1598:1: ( ( RULE_ID ) )
            // InternalTarot.g:1599:2: ( RULE_ID )
            {
            // InternalTarot.g:1599:2: ( RULE_ID )
            // InternalTarot.g:1600:3: RULE_ID
            {
             before(grammarAccess.getConditionalGotoAccess().getLeftIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionalGotoAccess().getLeftIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ConditionalGoto__LeftAssignment_2"


    // $ANTLR start "rule__ConditionalGoto__OpAssignment_3"
    // InternalTarot.g:1609:1: rule__ConditionalGoto__OpAssignment_3 : ( ( rule__ConditionalGoto__OpAlternatives_3_0 ) ) ;
    public final void rule__ConditionalGoto__OpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1613:1: ( ( ( rule__ConditionalGoto__OpAlternatives_3_0 ) ) )
            // InternalTarot.g:1614:2: ( ( rule__ConditionalGoto__OpAlternatives_3_0 ) )
            {
            // InternalTarot.g:1614:2: ( ( rule__ConditionalGoto__OpAlternatives_3_0 ) )
            // InternalTarot.g:1615:3: ( rule__ConditionalGoto__OpAlternatives_3_0 )
            {
             before(grammarAccess.getConditionalGotoAccess().getOpAlternatives_3_0()); 
            // InternalTarot.g:1616:3: ( rule__ConditionalGoto__OpAlternatives_3_0 )
            // InternalTarot.g:1616:4: rule__ConditionalGoto__OpAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalGoto__OpAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalGotoAccess().getOpAlternatives_3_0()); 

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
    // $ANTLR end "rule__ConditionalGoto__OpAssignment_3"


    // $ANTLR start "rule__ConditionalGoto__RightAssignment_4"
    // InternalTarot.g:1624:1: rule__ConditionalGoto__RightAssignment_4 : ( ruleValue ) ;
    public final void rule__ConditionalGoto__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1628:1: ( ( ruleValue ) )
            // InternalTarot.g:1629:2: ( ruleValue )
            {
            // InternalTarot.g:1629:2: ( ruleValue )
            // InternalTarot.g:1630:3: ruleValue
            {
             before(grammarAccess.getConditionalGotoAccess().getRightValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getConditionalGotoAccess().getRightValueParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ConditionalGoto__RightAssignment_4"


    // $ANTLR start "rule__ConditionalGoto__TargetAssignment_9"
    // InternalTarot.g:1639:1: rule__ConditionalGoto__TargetAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionalGoto__TargetAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1643:1: ( ( ( RULE_ID ) ) )
            // InternalTarot.g:1644:2: ( ( RULE_ID ) )
            {
            // InternalTarot.g:1644:2: ( ( RULE_ID ) )
            // InternalTarot.g:1645:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionalGotoAccess().getTargetLineCrossReference_9_0()); 
            // InternalTarot.g:1646:3: ( RULE_ID )
            // InternalTarot.g:1647:4: RULE_ID
            {
             before(grammarAccess.getConditionalGotoAccess().getTargetLineIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionalGotoAccess().getTargetLineIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getConditionalGotoAccess().getTargetLineCrossReference_9_0()); 

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
    // $ANTLR end "rule__ConditionalGoto__TargetAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008B80010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});

}