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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'='", "'<'", "'>'", "'<='", "'>='", "'!='", "':'", "';'", "':='", "'EINGABE'", "'SCHREIBE'", "'GEHE'", "'ZU'", "'WENN'", "'('", "')'", "'DANN'", "'Halt!'"
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



    // $ANTLR start "entryRuleProgramm"
    // InternalTarot.g:53:1: entryRuleProgramm : ruleProgramm EOF ;
    public final void entryRuleProgramm() throws RecognitionException {
        try {
            // InternalTarot.g:54:1: ( ruleProgramm EOF )
            // InternalTarot.g:55:1: ruleProgramm EOF
            {
             before(grammarAccess.getProgrammRule()); 
            pushFollow(FOLLOW_1);
            ruleProgramm();

            state._fsp--;

             after(grammarAccess.getProgrammRule()); 
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
    // $ANTLR end "entryRuleProgramm"


    // $ANTLR start "ruleProgramm"
    // InternalTarot.g:62:1: ruleProgramm : ( ( ( rule__Programm__ZeilenAssignment ) ) ( ( rule__Programm__ZeilenAssignment )* ) ) ;
    public final void ruleProgramm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:66:2: ( ( ( ( rule__Programm__ZeilenAssignment ) ) ( ( rule__Programm__ZeilenAssignment )* ) ) )
            // InternalTarot.g:67:2: ( ( ( rule__Programm__ZeilenAssignment ) ) ( ( rule__Programm__ZeilenAssignment )* ) )
            {
            // InternalTarot.g:67:2: ( ( ( rule__Programm__ZeilenAssignment ) ) ( ( rule__Programm__ZeilenAssignment )* ) )
            // InternalTarot.g:68:3: ( ( rule__Programm__ZeilenAssignment ) ) ( ( rule__Programm__ZeilenAssignment )* )
            {
            // InternalTarot.g:68:3: ( ( rule__Programm__ZeilenAssignment ) )
            // InternalTarot.g:69:4: ( rule__Programm__ZeilenAssignment )
            {
             before(grammarAccess.getProgrammAccess().getZeilenAssignment()); 
            // InternalTarot.g:70:4: ( rule__Programm__ZeilenAssignment )
            // InternalTarot.g:70:5: rule__Programm__ZeilenAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Programm__ZeilenAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgrammAccess().getZeilenAssignment()); 

            }

            // InternalTarot.g:73:3: ( ( rule__Programm__ZeilenAssignment )* )
            // InternalTarot.g:74:4: ( rule__Programm__ZeilenAssignment )*
            {
             before(grammarAccess.getProgrammAccess().getZeilenAssignment()); 
            // InternalTarot.g:75:4: ( rule__Programm__ZeilenAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTarot.g:75:5: rule__Programm__ZeilenAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Programm__ZeilenAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgrammAccess().getZeilenAssignment()); 

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
    // $ANTLR end "ruleProgramm"


    // $ANTLR start "entryRuleZeile"
    // InternalTarot.g:85:1: entryRuleZeile : ruleZeile EOF ;
    public final void entryRuleZeile() throws RecognitionException {
        try {
            // InternalTarot.g:86:1: ( ruleZeile EOF )
            // InternalTarot.g:87:1: ruleZeile EOF
            {
             before(grammarAccess.getZeileRule()); 
            pushFollow(FOLLOW_1);
            ruleZeile();

            state._fsp--;

             after(grammarAccess.getZeileRule()); 
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
    // $ANTLR end "entryRuleZeile"


    // $ANTLR start "ruleZeile"
    // InternalTarot.g:94:1: ruleZeile : ( ( rule__Zeile__Group__0 ) ) ;
    public final void ruleZeile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:98:2: ( ( ( rule__Zeile__Group__0 ) ) )
            // InternalTarot.g:99:2: ( ( rule__Zeile__Group__0 ) )
            {
            // InternalTarot.g:99:2: ( ( rule__Zeile__Group__0 ) )
            // InternalTarot.g:100:3: ( rule__Zeile__Group__0 )
            {
             before(grammarAccess.getZeileAccess().getGroup()); 
            // InternalTarot.g:101:3: ( rule__Zeile__Group__0 )
            // InternalTarot.g:101:4: rule__Zeile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Zeile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getZeileAccess().getGroup()); 

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
    // $ANTLR end "ruleZeile"


    // $ANTLR start "entryRuleAnweisung"
    // InternalTarot.g:110:1: entryRuleAnweisung : ruleAnweisung EOF ;
    public final void entryRuleAnweisung() throws RecognitionException {
        try {
            // InternalTarot.g:111:1: ( ruleAnweisung EOF )
            // InternalTarot.g:112:1: ruleAnweisung EOF
            {
             before(grammarAccess.getAnweisungRule()); 
            pushFollow(FOLLOW_1);
            ruleAnweisung();

            state._fsp--;

             after(grammarAccess.getAnweisungRule()); 
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
    // $ANTLR end "entryRuleAnweisung"


    // $ANTLR start "ruleAnweisung"
    // InternalTarot.g:119:1: ruleAnweisung : ( ( rule__Anweisung__Alternatives ) ) ;
    public final void ruleAnweisung() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:123:2: ( ( ( rule__Anweisung__Alternatives ) ) )
            // InternalTarot.g:124:2: ( ( rule__Anweisung__Alternatives ) )
            {
            // InternalTarot.g:124:2: ( ( rule__Anweisung__Alternatives ) )
            // InternalTarot.g:125:3: ( rule__Anweisung__Alternatives )
            {
             before(grammarAccess.getAnweisungAccess().getAlternatives()); 
            // InternalTarot.g:126:3: ( rule__Anweisung__Alternatives )
            // InternalTarot.g:126:4: rule__Anweisung__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Anweisung__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnweisungAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAnweisung"


    // $ANTLR start "entryRuleZuordnung"
    // InternalTarot.g:135:1: entryRuleZuordnung : ruleZuordnung EOF ;
    public final void entryRuleZuordnung() throws RecognitionException {
        try {
            // InternalTarot.g:136:1: ( ruleZuordnung EOF )
            // InternalTarot.g:137:1: ruleZuordnung EOF
            {
             before(grammarAccess.getZuordnungRule()); 
            pushFollow(FOLLOW_1);
            ruleZuordnung();

            state._fsp--;

             after(grammarAccess.getZuordnungRule()); 
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
    // $ANTLR end "entryRuleZuordnung"


    // $ANTLR start "ruleZuordnung"
    // InternalTarot.g:144:1: ruleZuordnung : ( ( rule__Zuordnung__Group__0 ) ) ;
    public final void ruleZuordnung() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:148:2: ( ( ( rule__Zuordnung__Group__0 ) ) )
            // InternalTarot.g:149:2: ( ( rule__Zuordnung__Group__0 ) )
            {
            // InternalTarot.g:149:2: ( ( rule__Zuordnung__Group__0 ) )
            // InternalTarot.g:150:3: ( rule__Zuordnung__Group__0 )
            {
             before(grammarAccess.getZuordnungAccess().getGroup()); 
            // InternalTarot.g:151:3: ( rule__Zuordnung__Group__0 )
            // InternalTarot.g:151:4: rule__Zuordnung__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Zuordnung__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getZuordnungAccess().getGroup()); 

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
    // $ANTLR end "ruleZuordnung"


    // $ANTLR start "entryRuleAusdruck"
    // InternalTarot.g:160:1: entryRuleAusdruck : ruleAusdruck EOF ;
    public final void entryRuleAusdruck() throws RecognitionException {
        try {
            // InternalTarot.g:161:1: ( ruleAusdruck EOF )
            // InternalTarot.g:162:1: ruleAusdruck EOF
            {
             before(grammarAccess.getAusdruckRule()); 
            pushFollow(FOLLOW_1);
            ruleAusdruck();

            state._fsp--;

             after(grammarAccess.getAusdruckRule()); 
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
    // $ANTLR end "entryRuleAusdruck"


    // $ANTLR start "ruleAusdruck"
    // InternalTarot.g:169:1: ruleAusdruck : ( ( rule__Ausdruck__Alternatives ) ) ;
    public final void ruleAusdruck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:173:2: ( ( ( rule__Ausdruck__Alternatives ) ) )
            // InternalTarot.g:174:2: ( ( rule__Ausdruck__Alternatives ) )
            {
            // InternalTarot.g:174:2: ( ( rule__Ausdruck__Alternatives ) )
            // InternalTarot.g:175:3: ( rule__Ausdruck__Alternatives )
            {
             before(grammarAccess.getAusdruckAccess().getAlternatives()); 
            // InternalTarot.g:176:3: ( rule__Ausdruck__Alternatives )
            // InternalTarot.g:176:4: rule__Ausdruck__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Ausdruck__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAusdruckAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAusdruck"


    // $ANTLR start "entryRuleStrichOperation"
    // InternalTarot.g:185:1: entryRuleStrichOperation : ruleStrichOperation EOF ;
    public final void entryRuleStrichOperation() throws RecognitionException {
        try {
            // InternalTarot.g:186:1: ( ruleStrichOperation EOF )
            // InternalTarot.g:187:1: ruleStrichOperation EOF
            {
             before(grammarAccess.getStrichOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleStrichOperation();

            state._fsp--;

             after(grammarAccess.getStrichOperationRule()); 
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
    // $ANTLR end "entryRuleStrichOperation"


    // $ANTLR start "ruleStrichOperation"
    // InternalTarot.g:194:1: ruleStrichOperation : ( ( rule__StrichOperation__Group__0 ) ) ;
    public final void ruleStrichOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:198:2: ( ( ( rule__StrichOperation__Group__0 ) ) )
            // InternalTarot.g:199:2: ( ( rule__StrichOperation__Group__0 ) )
            {
            // InternalTarot.g:199:2: ( ( rule__StrichOperation__Group__0 ) )
            // InternalTarot.g:200:3: ( rule__StrichOperation__Group__0 )
            {
             before(grammarAccess.getStrichOperationAccess().getGroup()); 
            // InternalTarot.g:201:3: ( rule__StrichOperation__Group__0 )
            // InternalTarot.g:201:4: rule__StrichOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StrichOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStrichOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleStrichOperation"


    // $ANTLR start "entryRuleGanzzahl"
    // InternalTarot.g:210:1: entryRuleGanzzahl : ruleGanzzahl EOF ;
    public final void entryRuleGanzzahl() throws RecognitionException {
        try {
            // InternalTarot.g:211:1: ( ruleGanzzahl EOF )
            // InternalTarot.g:212:1: ruleGanzzahl EOF
            {
             before(grammarAccess.getGanzzahlRule()); 
            pushFollow(FOLLOW_1);
            ruleGanzzahl();

            state._fsp--;

             after(grammarAccess.getGanzzahlRule()); 
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
    // $ANTLR end "entryRuleGanzzahl"


    // $ANTLR start "ruleGanzzahl"
    // InternalTarot.g:219:1: ruleGanzzahl : ( ( rule__Ganzzahl__Group__0 ) ) ;
    public final void ruleGanzzahl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:223:2: ( ( ( rule__Ganzzahl__Group__0 ) ) )
            // InternalTarot.g:224:2: ( ( rule__Ganzzahl__Group__0 ) )
            {
            // InternalTarot.g:224:2: ( ( rule__Ganzzahl__Group__0 ) )
            // InternalTarot.g:225:3: ( rule__Ganzzahl__Group__0 )
            {
             before(grammarAccess.getGanzzahlAccess().getGroup()); 
            // InternalTarot.g:226:3: ( rule__Ganzzahl__Group__0 )
            // InternalTarot.g:226:4: rule__Ganzzahl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ganzzahl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGanzzahlAccess().getGroup()); 

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
    // $ANTLR end "ruleGanzzahl"


    // $ANTLR start "entryRuleEingabe"
    // InternalTarot.g:235:1: entryRuleEingabe : ruleEingabe EOF ;
    public final void entryRuleEingabe() throws RecognitionException {
        try {
            // InternalTarot.g:236:1: ( ruleEingabe EOF )
            // InternalTarot.g:237:1: ruleEingabe EOF
            {
             before(grammarAccess.getEingabeRule()); 
            pushFollow(FOLLOW_1);
            ruleEingabe();

            state._fsp--;

             after(grammarAccess.getEingabeRule()); 
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
    // $ANTLR end "entryRuleEingabe"


    // $ANTLR start "ruleEingabe"
    // InternalTarot.g:244:1: ruleEingabe : ( ( rule__Eingabe__Group__0 ) ) ;
    public final void ruleEingabe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:248:2: ( ( ( rule__Eingabe__Group__0 ) ) )
            // InternalTarot.g:249:2: ( ( rule__Eingabe__Group__0 ) )
            {
            // InternalTarot.g:249:2: ( ( rule__Eingabe__Group__0 ) )
            // InternalTarot.g:250:3: ( rule__Eingabe__Group__0 )
            {
             before(grammarAccess.getEingabeAccess().getGroup()); 
            // InternalTarot.g:251:3: ( rule__Eingabe__Group__0 )
            // InternalTarot.g:251:4: rule__Eingabe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Eingabe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEingabeAccess().getGroup()); 

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
    // $ANTLR end "ruleEingabe"


    // $ANTLR start "entryRuleAusgabe"
    // InternalTarot.g:260:1: entryRuleAusgabe : ruleAusgabe EOF ;
    public final void entryRuleAusgabe() throws RecognitionException {
        try {
            // InternalTarot.g:261:1: ( ruleAusgabe EOF )
            // InternalTarot.g:262:1: ruleAusgabe EOF
            {
             before(grammarAccess.getAusgabeRule()); 
            pushFollow(FOLLOW_1);
            ruleAusgabe();

            state._fsp--;

             after(grammarAccess.getAusgabeRule()); 
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
    // $ANTLR end "entryRuleAusgabe"


    // $ANTLR start "ruleAusgabe"
    // InternalTarot.g:269:1: ruleAusgabe : ( ( rule__Ausgabe__Group__0 ) ) ;
    public final void ruleAusgabe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:273:2: ( ( ( rule__Ausgabe__Group__0 ) ) )
            // InternalTarot.g:274:2: ( ( rule__Ausgabe__Group__0 ) )
            {
            // InternalTarot.g:274:2: ( ( rule__Ausgabe__Group__0 ) )
            // InternalTarot.g:275:3: ( rule__Ausgabe__Group__0 )
            {
             before(grammarAccess.getAusgabeAccess().getGroup()); 
            // InternalTarot.g:276:3: ( rule__Ausgabe__Group__0 )
            // InternalTarot.g:276:4: rule__Ausgabe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ausgabe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAusgabeAccess().getGroup()); 

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
    // $ANTLR end "ruleAusgabe"


    // $ANTLR start "entryRuleGeheZu"
    // InternalTarot.g:285:1: entryRuleGeheZu : ruleGeheZu EOF ;
    public final void entryRuleGeheZu() throws RecognitionException {
        try {
            // InternalTarot.g:286:1: ( ruleGeheZu EOF )
            // InternalTarot.g:287:1: ruleGeheZu EOF
            {
             before(grammarAccess.getGeheZuRule()); 
            pushFollow(FOLLOW_1);
            ruleGeheZu();

            state._fsp--;

             after(grammarAccess.getGeheZuRule()); 
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
    // $ANTLR end "entryRuleGeheZu"


    // $ANTLR start "ruleGeheZu"
    // InternalTarot.g:294:1: ruleGeheZu : ( ( rule__GeheZu__Group__0 ) ) ;
    public final void ruleGeheZu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:298:2: ( ( ( rule__GeheZu__Group__0 ) ) )
            // InternalTarot.g:299:2: ( ( rule__GeheZu__Group__0 ) )
            {
            // InternalTarot.g:299:2: ( ( rule__GeheZu__Group__0 ) )
            // InternalTarot.g:300:3: ( rule__GeheZu__Group__0 )
            {
             before(grammarAccess.getGeheZuAccess().getGroup()); 
            // InternalTarot.g:301:3: ( rule__GeheZu__Group__0 )
            // InternalTarot.g:301:4: rule__GeheZu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GeheZu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeheZuAccess().getGroup()); 

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
    // $ANTLR end "ruleGeheZu"


    // $ANTLR start "entryRuleKonditionalerGeheZu"
    // InternalTarot.g:310:1: entryRuleKonditionalerGeheZu : ruleKonditionalerGeheZu EOF ;
    public final void entryRuleKonditionalerGeheZu() throws RecognitionException {
        try {
            // InternalTarot.g:311:1: ( ruleKonditionalerGeheZu EOF )
            // InternalTarot.g:312:1: ruleKonditionalerGeheZu EOF
            {
             before(grammarAccess.getKonditionalerGeheZuRule()); 
            pushFollow(FOLLOW_1);
            ruleKonditionalerGeheZu();

            state._fsp--;

             after(grammarAccess.getKonditionalerGeheZuRule()); 
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
    // $ANTLR end "entryRuleKonditionalerGeheZu"


    // $ANTLR start "ruleKonditionalerGeheZu"
    // InternalTarot.g:319:1: ruleKonditionalerGeheZu : ( ( rule__KonditionalerGeheZu__Group__0 ) ) ;
    public final void ruleKonditionalerGeheZu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:323:2: ( ( ( rule__KonditionalerGeheZu__Group__0 ) ) )
            // InternalTarot.g:324:2: ( ( rule__KonditionalerGeheZu__Group__0 ) )
            {
            // InternalTarot.g:324:2: ( ( rule__KonditionalerGeheZu__Group__0 ) )
            // InternalTarot.g:325:3: ( rule__KonditionalerGeheZu__Group__0 )
            {
             before(grammarAccess.getKonditionalerGeheZuAccess().getGroup()); 
            // InternalTarot.g:326:3: ( rule__KonditionalerGeheZu__Group__0 )
            // InternalTarot.g:326:4: rule__KonditionalerGeheZu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KonditionalerGeheZu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKonditionalerGeheZuAccess().getGroup()); 

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
    // $ANTLR end "ruleKonditionalerGeheZu"


    // $ANTLR start "entryRuleHalt"
    // InternalTarot.g:335:1: entryRuleHalt : ruleHalt EOF ;
    public final void entryRuleHalt() throws RecognitionException {
        try {
            // InternalTarot.g:336:1: ( ruleHalt EOF )
            // InternalTarot.g:337:1: ruleHalt EOF
            {
             before(grammarAccess.getHaltRule()); 
            pushFollow(FOLLOW_1);
            ruleHalt();

            state._fsp--;

             after(grammarAccess.getHaltRule()); 
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
    // $ANTLR end "entryRuleHalt"


    // $ANTLR start "ruleHalt"
    // InternalTarot.g:344:1: ruleHalt : ( ( rule__Halt__Group__0 ) ) ;
    public final void ruleHalt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:348:2: ( ( ( rule__Halt__Group__0 ) ) )
            // InternalTarot.g:349:2: ( ( rule__Halt__Group__0 ) )
            {
            // InternalTarot.g:349:2: ( ( rule__Halt__Group__0 ) )
            // InternalTarot.g:350:3: ( rule__Halt__Group__0 )
            {
             before(grammarAccess.getHaltAccess().getGroup()); 
            // InternalTarot.g:351:3: ( rule__Halt__Group__0 )
            // InternalTarot.g:351:4: rule__Halt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Halt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHaltAccess().getGroup()); 

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
    // $ANTLR end "ruleHalt"


    // $ANTLR start "rule__Anweisung__Alternatives"
    // InternalTarot.g:359:1: rule__Anweisung__Alternatives : ( ( ruleZuordnung ) | ( ruleEingabe ) | ( ruleAusgabe ) | ( ruleGeheZu ) | ( ruleKonditionalerGeheZu ) | ( ruleHalt ) );
    public final void rule__Anweisung__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:363:1: ( ( ruleZuordnung ) | ( ruleEingabe ) | ( ruleAusgabe ) | ( ruleGeheZu ) | ( ruleKonditionalerGeheZu ) | ( ruleHalt ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 24:
                {
                alt2=4;
                }
                break;
            case 26:
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
                    // InternalTarot.g:364:2: ( ruleZuordnung )
                    {
                    // InternalTarot.g:364:2: ( ruleZuordnung )
                    // InternalTarot.g:365:3: ruleZuordnung
                    {
                     before(grammarAccess.getAnweisungAccess().getZuordnungParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleZuordnung();

                    state._fsp--;

                     after(grammarAccess.getAnweisungAccess().getZuordnungParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTarot.g:370:2: ( ruleEingabe )
                    {
                    // InternalTarot.g:370:2: ( ruleEingabe )
                    // InternalTarot.g:371:3: ruleEingabe
                    {
                     before(grammarAccess.getAnweisungAccess().getEingabeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEingabe();

                    state._fsp--;

                     after(grammarAccess.getAnweisungAccess().getEingabeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTarot.g:376:2: ( ruleAusgabe )
                    {
                    // InternalTarot.g:376:2: ( ruleAusgabe )
                    // InternalTarot.g:377:3: ruleAusgabe
                    {
                     before(grammarAccess.getAnweisungAccess().getAusgabeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAusgabe();

                    state._fsp--;

                     after(grammarAccess.getAnweisungAccess().getAusgabeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTarot.g:382:2: ( ruleGeheZu )
                    {
                    // InternalTarot.g:382:2: ( ruleGeheZu )
                    // InternalTarot.g:383:3: ruleGeheZu
                    {
                     before(grammarAccess.getAnweisungAccess().getGeheZuParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGeheZu();

                    state._fsp--;

                     after(grammarAccess.getAnweisungAccess().getGeheZuParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTarot.g:388:2: ( ruleKonditionalerGeheZu )
                    {
                    // InternalTarot.g:388:2: ( ruleKonditionalerGeheZu )
                    // InternalTarot.g:389:3: ruleKonditionalerGeheZu
                    {
                     before(grammarAccess.getAnweisungAccess().getKonditionalerGeheZuParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleKonditionalerGeheZu();

                    state._fsp--;

                     after(grammarAccess.getAnweisungAccess().getKonditionalerGeheZuParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTarot.g:394:2: ( ruleHalt )
                    {
                    // InternalTarot.g:394:2: ( ruleHalt )
                    // InternalTarot.g:395:3: ruleHalt
                    {
                     before(grammarAccess.getAnweisungAccess().getHaltParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleHalt();

                    state._fsp--;

                     after(grammarAccess.getAnweisungAccess().getHaltParserRuleCall_5()); 

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
    // $ANTLR end "rule__Anweisung__Alternatives"


    // $ANTLR start "rule__Ausdruck__Alternatives"
    // InternalTarot.g:404:1: rule__Ausdruck__Alternatives : ( ( ruleStrichOperation ) | ( ruleGanzzahl ) );
    public final void rule__Ausdruck__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:408:1: ( ( ruleStrichOperation ) | ( ruleGanzzahl ) )
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
                    // InternalTarot.g:409:2: ( ruleStrichOperation )
                    {
                    // InternalTarot.g:409:2: ( ruleStrichOperation )
                    // InternalTarot.g:410:3: ruleStrichOperation
                    {
                     before(grammarAccess.getAusdruckAccess().getStrichOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStrichOperation();

                    state._fsp--;

                     after(grammarAccess.getAusdruckAccess().getStrichOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTarot.g:415:2: ( ruleGanzzahl )
                    {
                    // InternalTarot.g:415:2: ( ruleGanzzahl )
                    // InternalTarot.g:416:3: ruleGanzzahl
                    {
                     before(grammarAccess.getAusdruckAccess().getGanzzahlParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGanzzahl();

                    state._fsp--;

                     after(grammarAccess.getAusdruckAccess().getGanzzahlParserRuleCall_1()); 

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
    // $ANTLR end "rule__Ausdruck__Alternatives"


    // $ANTLR start "rule__StrichOperation__OpAlternatives_2_0_0"
    // InternalTarot.g:425:1: rule__StrichOperation__OpAlternatives_2_0_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__StrichOperation__OpAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:429:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalTarot.g:430:2: ( '+' )
                    {
                    // InternalTarot.g:430:2: ( '+' )
                    // InternalTarot.g:431:3: '+'
                    {
                     before(grammarAccess.getStrichOperationAccess().getOpPlusSignKeyword_2_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getStrichOperationAccess().getOpPlusSignKeyword_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTarot.g:436:2: ( '-' )
                    {
                    // InternalTarot.g:436:2: ( '-' )
                    // InternalTarot.g:437:3: '-'
                    {
                     before(grammarAccess.getStrichOperationAccess().getOpHyphenMinusKeyword_2_0_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getStrichOperationAccess().getOpHyphenMinusKeyword_2_0_0_1()); 

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
    // $ANTLR end "rule__StrichOperation__OpAlternatives_2_0_0"


    // $ANTLR start "rule__KonditionalerGeheZu__OpAlternatives_3_0"
    // InternalTarot.g:446:1: rule__KonditionalerGeheZu__OpAlternatives_3_0 : ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) | ( '!=' ) );
    public final void rule__KonditionalerGeheZu__OpAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:450:1: ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) | ( '!=' ) )
            int alt5=6;
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
            case 16:
                {
                alt5=4;
                }
                break;
            case 17:
                {
                alt5=5;
                }
                break;
            case 18:
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
                    // InternalTarot.g:451:2: ( '=' )
                    {
                    // InternalTarot.g:451:2: ( '=' )
                    // InternalTarot.g:452:3: '='
                    {
                     before(grammarAccess.getKonditionalerGeheZuAccess().getOpEqualsSignKeyword_3_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getKonditionalerGeheZuAccess().getOpEqualsSignKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTarot.g:457:2: ( '<' )
                    {
                    // InternalTarot.g:457:2: ( '<' )
                    // InternalTarot.g:458:3: '<'
                    {
                     before(grammarAccess.getKonditionalerGeheZuAccess().getOpLessThanSignKeyword_3_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getKonditionalerGeheZuAccess().getOpLessThanSignKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTarot.g:463:2: ( '>' )
                    {
                    // InternalTarot.g:463:2: ( '>' )
                    // InternalTarot.g:464:3: '>'
                    {
                     before(grammarAccess.getKonditionalerGeheZuAccess().getOpGreaterThanSignKeyword_3_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getKonditionalerGeheZuAccess().getOpGreaterThanSignKeyword_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTarot.g:469:2: ( '<=' )
                    {
                    // InternalTarot.g:469:2: ( '<=' )
                    // InternalTarot.g:470:3: '<='
                    {
                     before(grammarAccess.getKonditionalerGeheZuAccess().getOpLessThanSignEqualsSignKeyword_3_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getKonditionalerGeheZuAccess().getOpLessThanSignEqualsSignKeyword_3_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTarot.g:475:2: ( '>=' )
                    {
                    // InternalTarot.g:475:2: ( '>=' )
                    // InternalTarot.g:476:3: '>='
                    {
                     before(grammarAccess.getKonditionalerGeheZuAccess().getOpGreaterThanSignEqualsSignKeyword_3_0_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getKonditionalerGeheZuAccess().getOpGreaterThanSignEqualsSignKeyword_3_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTarot.g:481:2: ( '!=' )
                    {
                    // InternalTarot.g:481:2: ( '!=' )
                    // InternalTarot.g:482:3: '!='
                    {
                     before(grammarAccess.getKonditionalerGeheZuAccess().getOpExclamationMarkEqualsSignKeyword_3_0_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getKonditionalerGeheZuAccess().getOpExclamationMarkEqualsSignKeyword_3_0_5()); 

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
    // $ANTLR end "rule__KonditionalerGeheZu__OpAlternatives_3_0"


    // $ANTLR start "rule__Zeile__Group__0"
    // InternalTarot.g:491:1: rule__Zeile__Group__0 : rule__Zeile__Group__0__Impl rule__Zeile__Group__1 ;
    public final void rule__Zeile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:495:1: ( rule__Zeile__Group__0__Impl rule__Zeile__Group__1 )
            // InternalTarot.g:496:2: rule__Zeile__Group__0__Impl rule__Zeile__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Zeile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zeile__Group__1();

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
    // $ANTLR end "rule__Zeile__Group__0"


    // $ANTLR start "rule__Zeile__Group__0__Impl"
    // InternalTarot.g:503:1: rule__Zeile__Group__0__Impl : ( ( rule__Zeile__NameAssignment_0 ) ) ;
    public final void rule__Zeile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:507:1: ( ( ( rule__Zeile__NameAssignment_0 ) ) )
            // InternalTarot.g:508:1: ( ( rule__Zeile__NameAssignment_0 ) )
            {
            // InternalTarot.g:508:1: ( ( rule__Zeile__NameAssignment_0 ) )
            // InternalTarot.g:509:2: ( rule__Zeile__NameAssignment_0 )
            {
             before(grammarAccess.getZeileAccess().getNameAssignment_0()); 
            // InternalTarot.g:510:2: ( rule__Zeile__NameAssignment_0 )
            // InternalTarot.g:510:3: rule__Zeile__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Zeile__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getZeileAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Zeile__Group__0__Impl"


    // $ANTLR start "rule__Zeile__Group__1"
    // InternalTarot.g:518:1: rule__Zeile__Group__1 : rule__Zeile__Group__1__Impl rule__Zeile__Group__2 ;
    public final void rule__Zeile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:522:1: ( rule__Zeile__Group__1__Impl rule__Zeile__Group__2 )
            // InternalTarot.g:523:2: rule__Zeile__Group__1__Impl rule__Zeile__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Zeile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zeile__Group__2();

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
    // $ANTLR end "rule__Zeile__Group__1"


    // $ANTLR start "rule__Zeile__Group__1__Impl"
    // InternalTarot.g:530:1: rule__Zeile__Group__1__Impl : ( ':' ) ;
    public final void rule__Zeile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:534:1: ( ( ':' ) )
            // InternalTarot.g:535:1: ( ':' )
            {
            // InternalTarot.g:535:1: ( ':' )
            // InternalTarot.g:536:2: ':'
            {
             before(grammarAccess.getZeileAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getZeileAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Zeile__Group__1__Impl"


    // $ANTLR start "rule__Zeile__Group__2"
    // InternalTarot.g:545:1: rule__Zeile__Group__2 : rule__Zeile__Group__2__Impl rule__Zeile__Group__3 ;
    public final void rule__Zeile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:549:1: ( rule__Zeile__Group__2__Impl rule__Zeile__Group__3 )
            // InternalTarot.g:550:2: rule__Zeile__Group__2__Impl rule__Zeile__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Zeile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zeile__Group__3();

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
    // $ANTLR end "rule__Zeile__Group__2"


    // $ANTLR start "rule__Zeile__Group__2__Impl"
    // InternalTarot.g:557:1: rule__Zeile__Group__2__Impl : ( ( rule__Zeile__AnweisungAssignment_2 ) ) ;
    public final void rule__Zeile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:561:1: ( ( ( rule__Zeile__AnweisungAssignment_2 ) ) )
            // InternalTarot.g:562:1: ( ( rule__Zeile__AnweisungAssignment_2 ) )
            {
            // InternalTarot.g:562:1: ( ( rule__Zeile__AnweisungAssignment_2 ) )
            // InternalTarot.g:563:2: ( rule__Zeile__AnweisungAssignment_2 )
            {
             before(grammarAccess.getZeileAccess().getAnweisungAssignment_2()); 
            // InternalTarot.g:564:2: ( rule__Zeile__AnweisungAssignment_2 )
            // InternalTarot.g:564:3: rule__Zeile__AnweisungAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Zeile__AnweisungAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getZeileAccess().getAnweisungAssignment_2()); 

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
    // $ANTLR end "rule__Zeile__Group__2__Impl"


    // $ANTLR start "rule__Zeile__Group__3"
    // InternalTarot.g:572:1: rule__Zeile__Group__3 : rule__Zeile__Group__3__Impl ;
    public final void rule__Zeile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:576:1: ( rule__Zeile__Group__3__Impl )
            // InternalTarot.g:577:2: rule__Zeile__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Zeile__Group__3__Impl();

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
    // $ANTLR end "rule__Zeile__Group__3"


    // $ANTLR start "rule__Zeile__Group__3__Impl"
    // InternalTarot.g:583:1: rule__Zeile__Group__3__Impl : ( ';' ) ;
    public final void rule__Zeile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:587:1: ( ( ';' ) )
            // InternalTarot.g:588:1: ( ';' )
            {
            // InternalTarot.g:588:1: ( ';' )
            // InternalTarot.g:589:2: ';'
            {
             before(grammarAccess.getZeileAccess().getSemicolonKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getZeileAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Zeile__Group__3__Impl"


    // $ANTLR start "rule__Zuordnung__Group__0"
    // InternalTarot.g:599:1: rule__Zuordnung__Group__0 : rule__Zuordnung__Group__0__Impl rule__Zuordnung__Group__1 ;
    public final void rule__Zuordnung__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:603:1: ( rule__Zuordnung__Group__0__Impl rule__Zuordnung__Group__1 )
            // InternalTarot.g:604:2: rule__Zuordnung__Group__0__Impl rule__Zuordnung__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Zuordnung__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zuordnung__Group__1();

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
    // $ANTLR end "rule__Zuordnung__Group__0"


    // $ANTLR start "rule__Zuordnung__Group__0__Impl"
    // InternalTarot.g:611:1: rule__Zuordnung__Group__0__Impl : ( ( rule__Zuordnung__VarAssignment_0 ) ) ;
    public final void rule__Zuordnung__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:615:1: ( ( ( rule__Zuordnung__VarAssignment_0 ) ) )
            // InternalTarot.g:616:1: ( ( rule__Zuordnung__VarAssignment_0 ) )
            {
            // InternalTarot.g:616:1: ( ( rule__Zuordnung__VarAssignment_0 ) )
            // InternalTarot.g:617:2: ( rule__Zuordnung__VarAssignment_0 )
            {
             before(grammarAccess.getZuordnungAccess().getVarAssignment_0()); 
            // InternalTarot.g:618:2: ( rule__Zuordnung__VarAssignment_0 )
            // InternalTarot.g:618:3: rule__Zuordnung__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Zuordnung__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getZuordnungAccess().getVarAssignment_0()); 

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
    // $ANTLR end "rule__Zuordnung__Group__0__Impl"


    // $ANTLR start "rule__Zuordnung__Group__1"
    // InternalTarot.g:626:1: rule__Zuordnung__Group__1 : rule__Zuordnung__Group__1__Impl rule__Zuordnung__Group__2 ;
    public final void rule__Zuordnung__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:630:1: ( rule__Zuordnung__Group__1__Impl rule__Zuordnung__Group__2 )
            // InternalTarot.g:631:2: rule__Zuordnung__Group__1__Impl rule__Zuordnung__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Zuordnung__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zuordnung__Group__2();

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
    // $ANTLR end "rule__Zuordnung__Group__1"


    // $ANTLR start "rule__Zuordnung__Group__1__Impl"
    // InternalTarot.g:638:1: rule__Zuordnung__Group__1__Impl : ( ':=' ) ;
    public final void rule__Zuordnung__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:642:1: ( ( ':=' ) )
            // InternalTarot.g:643:1: ( ':=' )
            {
            // InternalTarot.g:643:1: ( ':=' )
            // InternalTarot.g:644:2: ':='
            {
             before(grammarAccess.getZuordnungAccess().getColonEqualsSignKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getZuordnungAccess().getColonEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Zuordnung__Group__1__Impl"


    // $ANTLR start "rule__Zuordnung__Group__2"
    // InternalTarot.g:653:1: rule__Zuordnung__Group__2 : rule__Zuordnung__Group__2__Impl ;
    public final void rule__Zuordnung__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:657:1: ( rule__Zuordnung__Group__2__Impl )
            // InternalTarot.g:658:2: rule__Zuordnung__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Zuordnung__Group__2__Impl();

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
    // $ANTLR end "rule__Zuordnung__Group__2"


    // $ANTLR start "rule__Zuordnung__Group__2__Impl"
    // InternalTarot.g:664:1: rule__Zuordnung__Group__2__Impl : ( ( rule__Zuordnung__AusdruckAssignment_2 ) ) ;
    public final void rule__Zuordnung__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:668:1: ( ( ( rule__Zuordnung__AusdruckAssignment_2 ) ) )
            // InternalTarot.g:669:1: ( ( rule__Zuordnung__AusdruckAssignment_2 ) )
            {
            // InternalTarot.g:669:1: ( ( rule__Zuordnung__AusdruckAssignment_2 ) )
            // InternalTarot.g:670:2: ( rule__Zuordnung__AusdruckAssignment_2 )
            {
             before(grammarAccess.getZuordnungAccess().getAusdruckAssignment_2()); 
            // InternalTarot.g:671:2: ( rule__Zuordnung__AusdruckAssignment_2 )
            // InternalTarot.g:671:3: rule__Zuordnung__AusdruckAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Zuordnung__AusdruckAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getZuordnungAccess().getAusdruckAssignment_2()); 

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
    // $ANTLR end "rule__Zuordnung__Group__2__Impl"


    // $ANTLR start "rule__StrichOperation__Group__0"
    // InternalTarot.g:680:1: rule__StrichOperation__Group__0 : rule__StrichOperation__Group__0__Impl rule__StrichOperation__Group__1 ;
    public final void rule__StrichOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:684:1: ( rule__StrichOperation__Group__0__Impl rule__StrichOperation__Group__1 )
            // InternalTarot.g:685:2: rule__StrichOperation__Group__0__Impl rule__StrichOperation__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__StrichOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StrichOperation__Group__1();

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
    // $ANTLR end "rule__StrichOperation__Group__0"


    // $ANTLR start "rule__StrichOperation__Group__0__Impl"
    // InternalTarot.g:692:1: rule__StrichOperation__Group__0__Impl : ( () ) ;
    public final void rule__StrichOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:696:1: ( ( () ) )
            // InternalTarot.g:697:1: ( () )
            {
            // InternalTarot.g:697:1: ( () )
            // InternalTarot.g:698:2: ()
            {
             before(grammarAccess.getStrichOperationAccess().getStrichOperationAction_0()); 
            // InternalTarot.g:699:2: ()
            // InternalTarot.g:699:3: 
            {
            }

             after(grammarAccess.getStrichOperationAccess().getStrichOperationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StrichOperation__Group__0__Impl"


    // $ANTLR start "rule__StrichOperation__Group__1"
    // InternalTarot.g:707:1: rule__StrichOperation__Group__1 : rule__StrichOperation__Group__1__Impl rule__StrichOperation__Group__2 ;
    public final void rule__StrichOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:711:1: ( rule__StrichOperation__Group__1__Impl rule__StrichOperation__Group__2 )
            // InternalTarot.g:712:2: rule__StrichOperation__Group__1__Impl rule__StrichOperation__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__StrichOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StrichOperation__Group__2();

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
    // $ANTLR end "rule__StrichOperation__Group__1"


    // $ANTLR start "rule__StrichOperation__Group__1__Impl"
    // InternalTarot.g:719:1: rule__StrichOperation__Group__1__Impl : ( ( rule__StrichOperation__LinksAssignment_1 ) ) ;
    public final void rule__StrichOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:723:1: ( ( ( rule__StrichOperation__LinksAssignment_1 ) ) )
            // InternalTarot.g:724:1: ( ( rule__StrichOperation__LinksAssignment_1 ) )
            {
            // InternalTarot.g:724:1: ( ( rule__StrichOperation__LinksAssignment_1 ) )
            // InternalTarot.g:725:2: ( rule__StrichOperation__LinksAssignment_1 )
            {
             before(grammarAccess.getStrichOperationAccess().getLinksAssignment_1()); 
            // InternalTarot.g:726:2: ( rule__StrichOperation__LinksAssignment_1 )
            // InternalTarot.g:726:3: rule__StrichOperation__LinksAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StrichOperation__LinksAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStrichOperationAccess().getLinksAssignment_1()); 

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
    // $ANTLR end "rule__StrichOperation__Group__1__Impl"


    // $ANTLR start "rule__StrichOperation__Group__2"
    // InternalTarot.g:734:1: rule__StrichOperation__Group__2 : rule__StrichOperation__Group__2__Impl ;
    public final void rule__StrichOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:738:1: ( rule__StrichOperation__Group__2__Impl )
            // InternalTarot.g:739:2: rule__StrichOperation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StrichOperation__Group__2__Impl();

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
    // $ANTLR end "rule__StrichOperation__Group__2"


    // $ANTLR start "rule__StrichOperation__Group__2__Impl"
    // InternalTarot.g:745:1: rule__StrichOperation__Group__2__Impl : ( ( rule__StrichOperation__Group_2__0 ) ) ;
    public final void rule__StrichOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:749:1: ( ( ( rule__StrichOperation__Group_2__0 ) ) )
            // InternalTarot.g:750:1: ( ( rule__StrichOperation__Group_2__0 ) )
            {
            // InternalTarot.g:750:1: ( ( rule__StrichOperation__Group_2__0 ) )
            // InternalTarot.g:751:2: ( rule__StrichOperation__Group_2__0 )
            {
             before(grammarAccess.getStrichOperationAccess().getGroup_2()); 
            // InternalTarot.g:752:2: ( rule__StrichOperation__Group_2__0 )
            // InternalTarot.g:752:3: rule__StrichOperation__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__StrichOperation__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getStrichOperationAccess().getGroup_2()); 

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
    // $ANTLR end "rule__StrichOperation__Group__2__Impl"


    // $ANTLR start "rule__StrichOperation__Group_2__0"
    // InternalTarot.g:761:1: rule__StrichOperation__Group_2__0 : rule__StrichOperation__Group_2__0__Impl rule__StrichOperation__Group_2__1 ;
    public final void rule__StrichOperation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:765:1: ( rule__StrichOperation__Group_2__0__Impl rule__StrichOperation__Group_2__1 )
            // InternalTarot.g:766:2: rule__StrichOperation__Group_2__0__Impl rule__StrichOperation__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__StrichOperation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StrichOperation__Group_2__1();

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
    // $ANTLR end "rule__StrichOperation__Group_2__0"


    // $ANTLR start "rule__StrichOperation__Group_2__0__Impl"
    // InternalTarot.g:773:1: rule__StrichOperation__Group_2__0__Impl : ( ( rule__StrichOperation__OpAssignment_2_0 ) ) ;
    public final void rule__StrichOperation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:777:1: ( ( ( rule__StrichOperation__OpAssignment_2_0 ) ) )
            // InternalTarot.g:778:1: ( ( rule__StrichOperation__OpAssignment_2_0 ) )
            {
            // InternalTarot.g:778:1: ( ( rule__StrichOperation__OpAssignment_2_0 ) )
            // InternalTarot.g:779:2: ( rule__StrichOperation__OpAssignment_2_0 )
            {
             before(grammarAccess.getStrichOperationAccess().getOpAssignment_2_0()); 
            // InternalTarot.g:780:2: ( rule__StrichOperation__OpAssignment_2_0 )
            // InternalTarot.g:780:3: rule__StrichOperation__OpAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__StrichOperation__OpAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStrichOperationAccess().getOpAssignment_2_0()); 

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
    // $ANTLR end "rule__StrichOperation__Group_2__0__Impl"


    // $ANTLR start "rule__StrichOperation__Group_2__1"
    // InternalTarot.g:788:1: rule__StrichOperation__Group_2__1 : rule__StrichOperation__Group_2__1__Impl ;
    public final void rule__StrichOperation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:792:1: ( rule__StrichOperation__Group_2__1__Impl )
            // InternalTarot.g:793:2: rule__StrichOperation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StrichOperation__Group_2__1__Impl();

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
    // $ANTLR end "rule__StrichOperation__Group_2__1"


    // $ANTLR start "rule__StrichOperation__Group_2__1__Impl"
    // InternalTarot.g:799:1: rule__StrichOperation__Group_2__1__Impl : ( ( rule__StrichOperation__RechtsAssignment_2_1 ) ) ;
    public final void rule__StrichOperation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:803:1: ( ( ( rule__StrichOperation__RechtsAssignment_2_1 ) ) )
            // InternalTarot.g:804:1: ( ( rule__StrichOperation__RechtsAssignment_2_1 ) )
            {
            // InternalTarot.g:804:1: ( ( rule__StrichOperation__RechtsAssignment_2_1 ) )
            // InternalTarot.g:805:2: ( rule__StrichOperation__RechtsAssignment_2_1 )
            {
             before(grammarAccess.getStrichOperationAccess().getRechtsAssignment_2_1()); 
            // InternalTarot.g:806:2: ( rule__StrichOperation__RechtsAssignment_2_1 )
            // InternalTarot.g:806:3: rule__StrichOperation__RechtsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StrichOperation__RechtsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStrichOperationAccess().getRechtsAssignment_2_1()); 

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
    // $ANTLR end "rule__StrichOperation__Group_2__1__Impl"


    // $ANTLR start "rule__Ganzzahl__Group__0"
    // InternalTarot.g:815:1: rule__Ganzzahl__Group__0 : rule__Ganzzahl__Group__0__Impl rule__Ganzzahl__Group__1 ;
    public final void rule__Ganzzahl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:819:1: ( rule__Ganzzahl__Group__0__Impl rule__Ganzzahl__Group__1 )
            // InternalTarot.g:820:2: rule__Ganzzahl__Group__0__Impl rule__Ganzzahl__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Ganzzahl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ganzzahl__Group__1();

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
    // $ANTLR end "rule__Ganzzahl__Group__0"


    // $ANTLR start "rule__Ganzzahl__Group__0__Impl"
    // InternalTarot.g:827:1: rule__Ganzzahl__Group__0__Impl : ( () ) ;
    public final void rule__Ganzzahl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:831:1: ( ( () ) )
            // InternalTarot.g:832:1: ( () )
            {
            // InternalTarot.g:832:1: ( () )
            // InternalTarot.g:833:2: ()
            {
             before(grammarAccess.getGanzzahlAccess().getGanzzahlAction_0()); 
            // InternalTarot.g:834:2: ()
            // InternalTarot.g:834:3: 
            {
            }

             after(grammarAccess.getGanzzahlAccess().getGanzzahlAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ganzzahl__Group__0__Impl"


    // $ANTLR start "rule__Ganzzahl__Group__1"
    // InternalTarot.g:842:1: rule__Ganzzahl__Group__1 : rule__Ganzzahl__Group__1__Impl ;
    public final void rule__Ganzzahl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:846:1: ( rule__Ganzzahl__Group__1__Impl )
            // InternalTarot.g:847:2: rule__Ganzzahl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ganzzahl__Group__1__Impl();

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
    // $ANTLR end "rule__Ganzzahl__Group__1"


    // $ANTLR start "rule__Ganzzahl__Group__1__Impl"
    // InternalTarot.g:853:1: rule__Ganzzahl__Group__1__Impl : ( ( rule__Ganzzahl__WertAssignment_1 ) ) ;
    public final void rule__Ganzzahl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:857:1: ( ( ( rule__Ganzzahl__WertAssignment_1 ) ) )
            // InternalTarot.g:858:1: ( ( rule__Ganzzahl__WertAssignment_1 ) )
            {
            // InternalTarot.g:858:1: ( ( rule__Ganzzahl__WertAssignment_1 ) )
            // InternalTarot.g:859:2: ( rule__Ganzzahl__WertAssignment_1 )
            {
             before(grammarAccess.getGanzzahlAccess().getWertAssignment_1()); 
            // InternalTarot.g:860:2: ( rule__Ganzzahl__WertAssignment_1 )
            // InternalTarot.g:860:3: rule__Ganzzahl__WertAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ganzzahl__WertAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGanzzahlAccess().getWertAssignment_1()); 

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
    // $ANTLR end "rule__Ganzzahl__Group__1__Impl"


    // $ANTLR start "rule__Eingabe__Group__0"
    // InternalTarot.g:869:1: rule__Eingabe__Group__0 : rule__Eingabe__Group__0__Impl rule__Eingabe__Group__1 ;
    public final void rule__Eingabe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:873:1: ( rule__Eingabe__Group__0__Impl rule__Eingabe__Group__1 )
            // InternalTarot.g:874:2: rule__Eingabe__Group__0__Impl rule__Eingabe__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Eingabe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eingabe__Group__1();

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
    // $ANTLR end "rule__Eingabe__Group__0"


    // $ANTLR start "rule__Eingabe__Group__0__Impl"
    // InternalTarot.g:881:1: rule__Eingabe__Group__0__Impl : ( 'EINGABE' ) ;
    public final void rule__Eingabe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:885:1: ( ( 'EINGABE' ) )
            // InternalTarot.g:886:1: ( 'EINGABE' )
            {
            // InternalTarot.g:886:1: ( 'EINGABE' )
            // InternalTarot.g:887:2: 'EINGABE'
            {
             before(grammarAccess.getEingabeAccess().getEINGABEKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEingabeAccess().getEINGABEKeyword_0()); 

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
    // $ANTLR end "rule__Eingabe__Group__0__Impl"


    // $ANTLR start "rule__Eingabe__Group__1"
    // InternalTarot.g:896:1: rule__Eingabe__Group__1 : rule__Eingabe__Group__1__Impl ;
    public final void rule__Eingabe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:900:1: ( rule__Eingabe__Group__1__Impl )
            // InternalTarot.g:901:2: rule__Eingabe__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eingabe__Group__1__Impl();

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
    // $ANTLR end "rule__Eingabe__Group__1"


    // $ANTLR start "rule__Eingabe__Group__1__Impl"
    // InternalTarot.g:907:1: rule__Eingabe__Group__1__Impl : ( ( rule__Eingabe__VarAssignment_1 ) ) ;
    public final void rule__Eingabe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:911:1: ( ( ( rule__Eingabe__VarAssignment_1 ) ) )
            // InternalTarot.g:912:1: ( ( rule__Eingabe__VarAssignment_1 ) )
            {
            // InternalTarot.g:912:1: ( ( rule__Eingabe__VarAssignment_1 ) )
            // InternalTarot.g:913:2: ( rule__Eingabe__VarAssignment_1 )
            {
             before(grammarAccess.getEingabeAccess().getVarAssignment_1()); 
            // InternalTarot.g:914:2: ( rule__Eingabe__VarAssignment_1 )
            // InternalTarot.g:914:3: rule__Eingabe__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Eingabe__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEingabeAccess().getVarAssignment_1()); 

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
    // $ANTLR end "rule__Eingabe__Group__1__Impl"


    // $ANTLR start "rule__Ausgabe__Group__0"
    // InternalTarot.g:923:1: rule__Ausgabe__Group__0 : rule__Ausgabe__Group__0__Impl rule__Ausgabe__Group__1 ;
    public final void rule__Ausgabe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:927:1: ( rule__Ausgabe__Group__0__Impl rule__Ausgabe__Group__1 )
            // InternalTarot.g:928:2: rule__Ausgabe__Group__0__Impl rule__Ausgabe__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Ausgabe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ausgabe__Group__1();

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
    // $ANTLR end "rule__Ausgabe__Group__0"


    // $ANTLR start "rule__Ausgabe__Group__0__Impl"
    // InternalTarot.g:935:1: rule__Ausgabe__Group__0__Impl : ( 'SCHREIBE' ) ;
    public final void rule__Ausgabe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:939:1: ( ( 'SCHREIBE' ) )
            // InternalTarot.g:940:1: ( 'SCHREIBE' )
            {
            // InternalTarot.g:940:1: ( 'SCHREIBE' )
            // InternalTarot.g:941:2: 'SCHREIBE'
            {
             before(grammarAccess.getAusgabeAccess().getSCHREIBEKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAusgabeAccess().getSCHREIBEKeyword_0()); 

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
    // $ANTLR end "rule__Ausgabe__Group__0__Impl"


    // $ANTLR start "rule__Ausgabe__Group__1"
    // InternalTarot.g:950:1: rule__Ausgabe__Group__1 : rule__Ausgabe__Group__1__Impl ;
    public final void rule__Ausgabe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:954:1: ( rule__Ausgabe__Group__1__Impl )
            // InternalTarot.g:955:2: rule__Ausgabe__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ausgabe__Group__1__Impl();

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
    // $ANTLR end "rule__Ausgabe__Group__1"


    // $ANTLR start "rule__Ausgabe__Group__1__Impl"
    // InternalTarot.g:961:1: rule__Ausgabe__Group__1__Impl : ( ( rule__Ausgabe__VarAssignment_1 ) ) ;
    public final void rule__Ausgabe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:965:1: ( ( ( rule__Ausgabe__VarAssignment_1 ) ) )
            // InternalTarot.g:966:1: ( ( rule__Ausgabe__VarAssignment_1 ) )
            {
            // InternalTarot.g:966:1: ( ( rule__Ausgabe__VarAssignment_1 ) )
            // InternalTarot.g:967:2: ( rule__Ausgabe__VarAssignment_1 )
            {
             before(grammarAccess.getAusgabeAccess().getVarAssignment_1()); 
            // InternalTarot.g:968:2: ( rule__Ausgabe__VarAssignment_1 )
            // InternalTarot.g:968:3: rule__Ausgabe__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ausgabe__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAusgabeAccess().getVarAssignment_1()); 

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
    // $ANTLR end "rule__Ausgabe__Group__1__Impl"


    // $ANTLR start "rule__GeheZu__Group__0"
    // InternalTarot.g:977:1: rule__GeheZu__Group__0 : rule__GeheZu__Group__0__Impl rule__GeheZu__Group__1 ;
    public final void rule__GeheZu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:981:1: ( rule__GeheZu__Group__0__Impl rule__GeheZu__Group__1 )
            // InternalTarot.g:982:2: rule__GeheZu__Group__0__Impl rule__GeheZu__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__GeheZu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeheZu__Group__1();

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
    // $ANTLR end "rule__GeheZu__Group__0"


    // $ANTLR start "rule__GeheZu__Group__0__Impl"
    // InternalTarot.g:989:1: rule__GeheZu__Group__0__Impl : ( 'GEHE' ) ;
    public final void rule__GeheZu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:993:1: ( ( 'GEHE' ) )
            // InternalTarot.g:994:1: ( 'GEHE' )
            {
            // InternalTarot.g:994:1: ( 'GEHE' )
            // InternalTarot.g:995:2: 'GEHE'
            {
             before(grammarAccess.getGeheZuAccess().getGEHEKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGeheZuAccess().getGEHEKeyword_0()); 

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
    // $ANTLR end "rule__GeheZu__Group__0__Impl"


    // $ANTLR start "rule__GeheZu__Group__1"
    // InternalTarot.g:1004:1: rule__GeheZu__Group__1 : rule__GeheZu__Group__1__Impl rule__GeheZu__Group__2 ;
    public final void rule__GeheZu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1008:1: ( rule__GeheZu__Group__1__Impl rule__GeheZu__Group__2 )
            // InternalTarot.g:1009:2: rule__GeheZu__Group__1__Impl rule__GeheZu__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GeheZu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeheZu__Group__2();

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
    // $ANTLR end "rule__GeheZu__Group__1"


    // $ANTLR start "rule__GeheZu__Group__1__Impl"
    // InternalTarot.g:1016:1: rule__GeheZu__Group__1__Impl : ( 'ZU' ) ;
    public final void rule__GeheZu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1020:1: ( ( 'ZU' ) )
            // InternalTarot.g:1021:1: ( 'ZU' )
            {
            // InternalTarot.g:1021:1: ( 'ZU' )
            // InternalTarot.g:1022:2: 'ZU'
            {
             before(grammarAccess.getGeheZuAccess().getZUKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGeheZuAccess().getZUKeyword_1()); 

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
    // $ANTLR end "rule__GeheZu__Group__1__Impl"


    // $ANTLR start "rule__GeheZu__Group__2"
    // InternalTarot.g:1031:1: rule__GeheZu__Group__2 : rule__GeheZu__Group__2__Impl ;
    public final void rule__GeheZu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1035:1: ( rule__GeheZu__Group__2__Impl )
            // InternalTarot.g:1036:2: rule__GeheZu__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeheZu__Group__2__Impl();

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
    // $ANTLR end "rule__GeheZu__Group__2"


    // $ANTLR start "rule__GeheZu__Group__2__Impl"
    // InternalTarot.g:1042:1: rule__GeheZu__Group__2__Impl : ( ( rule__GeheZu__ZielAssignment_2 ) ) ;
    public final void rule__GeheZu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1046:1: ( ( ( rule__GeheZu__ZielAssignment_2 ) ) )
            // InternalTarot.g:1047:1: ( ( rule__GeheZu__ZielAssignment_2 ) )
            {
            // InternalTarot.g:1047:1: ( ( rule__GeheZu__ZielAssignment_2 ) )
            // InternalTarot.g:1048:2: ( rule__GeheZu__ZielAssignment_2 )
            {
             before(grammarAccess.getGeheZuAccess().getZielAssignment_2()); 
            // InternalTarot.g:1049:2: ( rule__GeheZu__ZielAssignment_2 )
            // InternalTarot.g:1049:3: rule__GeheZu__ZielAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GeheZu__ZielAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGeheZuAccess().getZielAssignment_2()); 

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
    // $ANTLR end "rule__GeheZu__Group__2__Impl"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__0"
    // InternalTarot.g:1058:1: rule__KonditionalerGeheZu__Group__0 : rule__KonditionalerGeheZu__Group__0__Impl rule__KonditionalerGeheZu__Group__1 ;
    public final void rule__KonditionalerGeheZu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1062:1: ( rule__KonditionalerGeheZu__Group__0__Impl rule__KonditionalerGeheZu__Group__1 )
            // InternalTarot.g:1063:2: rule__KonditionalerGeheZu__Group__0__Impl rule__KonditionalerGeheZu__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__KonditionalerGeheZu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KonditionalerGeheZu__Group__1();

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__0"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__0__Impl"
    // InternalTarot.g:1070:1: rule__KonditionalerGeheZu__Group__0__Impl : ( 'WENN' ) ;
    public final void rule__KonditionalerGeheZu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1074:1: ( ( 'WENN' ) )
            // InternalTarot.g:1075:1: ( 'WENN' )
            {
            // InternalTarot.g:1075:1: ( 'WENN' )
            // InternalTarot.g:1076:2: 'WENN'
            {
             before(grammarAccess.getKonditionalerGeheZuAccess().getWENNKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getKonditionalerGeheZuAccess().getWENNKeyword_0()); 

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__0__Impl"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__1"
    // InternalTarot.g:1085:1: rule__KonditionalerGeheZu__Group__1 : rule__KonditionalerGeheZu__Group__1__Impl rule__KonditionalerGeheZu__Group__2 ;
    public final void rule__KonditionalerGeheZu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1089:1: ( rule__KonditionalerGeheZu__Group__1__Impl rule__KonditionalerGeheZu__Group__2 )
            // InternalTarot.g:1090:2: rule__KonditionalerGeheZu__Group__1__Impl rule__KonditionalerGeheZu__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__KonditionalerGeheZu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KonditionalerGeheZu__Group__2();

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__1"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__1__Impl"
    // InternalTarot.g:1097:1: rule__KonditionalerGeheZu__Group__1__Impl : ( '(' ) ;
    public final void rule__KonditionalerGeheZu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1101:1: ( ( '(' ) )
            // InternalTarot.g:1102:1: ( '(' )
            {
            // InternalTarot.g:1102:1: ( '(' )
            // InternalTarot.g:1103:2: '('
            {
             before(grammarAccess.getKonditionalerGeheZuAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getKonditionalerGeheZuAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__1__Impl"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__2"
    // InternalTarot.g:1112:1: rule__KonditionalerGeheZu__Group__2 : rule__KonditionalerGeheZu__Group__2__Impl rule__KonditionalerGeheZu__Group__3 ;
    public final void rule__KonditionalerGeheZu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1116:1: ( rule__KonditionalerGeheZu__Group__2__Impl rule__KonditionalerGeheZu__Group__3 )
            // InternalTarot.g:1117:2: rule__KonditionalerGeheZu__Group__2__Impl rule__KonditionalerGeheZu__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__KonditionalerGeheZu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KonditionalerGeheZu__Group__3();

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__2"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__2__Impl"
    // InternalTarot.g:1124:1: rule__KonditionalerGeheZu__Group__2__Impl : ( ( rule__KonditionalerGeheZu__LinksAssignment_2 ) ) ;
    public final void rule__KonditionalerGeheZu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1128:1: ( ( ( rule__KonditionalerGeheZu__LinksAssignment_2 ) ) )
            // InternalTarot.g:1129:1: ( ( rule__KonditionalerGeheZu__LinksAssignment_2 ) )
            {
            // InternalTarot.g:1129:1: ( ( rule__KonditionalerGeheZu__LinksAssignment_2 ) )
            // InternalTarot.g:1130:2: ( rule__KonditionalerGeheZu__LinksAssignment_2 )
            {
             before(grammarAccess.getKonditionalerGeheZuAccess().getLinksAssignment_2()); 
            // InternalTarot.g:1131:2: ( rule__KonditionalerGeheZu__LinksAssignment_2 )
            // InternalTarot.g:1131:3: rule__KonditionalerGeheZu__LinksAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__KonditionalerGeheZu__LinksAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKonditionalerGeheZuAccess().getLinksAssignment_2()); 

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__2__Impl"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__3"
    // InternalTarot.g:1139:1: rule__KonditionalerGeheZu__Group__3 : rule__KonditionalerGeheZu__Group__3__Impl rule__KonditionalerGeheZu__Group__4 ;
    public final void rule__KonditionalerGeheZu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1143:1: ( rule__KonditionalerGeheZu__Group__3__Impl rule__KonditionalerGeheZu__Group__4 )
            // InternalTarot.g:1144:2: rule__KonditionalerGeheZu__Group__3__Impl rule__KonditionalerGeheZu__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__KonditionalerGeheZu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KonditionalerGeheZu__Group__4();

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__3"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__3__Impl"
    // InternalTarot.g:1151:1: rule__KonditionalerGeheZu__Group__3__Impl : ( ( rule__KonditionalerGeheZu__OpAssignment_3 ) ) ;
    public final void rule__KonditionalerGeheZu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1155:1: ( ( ( rule__KonditionalerGeheZu__OpAssignment_3 ) ) )
            // InternalTarot.g:1156:1: ( ( rule__KonditionalerGeheZu__OpAssignment_3 ) )
            {
            // InternalTarot.g:1156:1: ( ( rule__KonditionalerGeheZu__OpAssignment_3 ) )
            // InternalTarot.g:1157:2: ( rule__KonditionalerGeheZu__OpAssignment_3 )
            {
             before(grammarAccess.getKonditionalerGeheZuAccess().getOpAssignment_3()); 
            // InternalTarot.g:1158:2: ( rule__KonditionalerGeheZu__OpAssignment_3 )
            // InternalTarot.g:1158:3: rule__KonditionalerGeheZu__OpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__KonditionalerGeheZu__OpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getKonditionalerGeheZuAccess().getOpAssignment_3()); 

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__3__Impl"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__4"
    // InternalTarot.g:1166:1: rule__KonditionalerGeheZu__Group__4 : rule__KonditionalerGeheZu__Group__4__Impl rule__KonditionalerGeheZu__Group__5 ;
    public final void rule__KonditionalerGeheZu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1170:1: ( rule__KonditionalerGeheZu__Group__4__Impl rule__KonditionalerGeheZu__Group__5 )
            // InternalTarot.g:1171:2: rule__KonditionalerGeheZu__Group__4__Impl rule__KonditionalerGeheZu__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__KonditionalerGeheZu__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KonditionalerGeheZu__Group__5();

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__4"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__4__Impl"
    // InternalTarot.g:1178:1: rule__KonditionalerGeheZu__Group__4__Impl : ( ( rule__KonditionalerGeheZu__RechtsAssignment_4 ) ) ;
    public final void rule__KonditionalerGeheZu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1182:1: ( ( ( rule__KonditionalerGeheZu__RechtsAssignment_4 ) ) )
            // InternalTarot.g:1183:1: ( ( rule__KonditionalerGeheZu__RechtsAssignment_4 ) )
            {
            // InternalTarot.g:1183:1: ( ( rule__KonditionalerGeheZu__RechtsAssignment_4 ) )
            // InternalTarot.g:1184:2: ( rule__KonditionalerGeheZu__RechtsAssignment_4 )
            {
             before(grammarAccess.getKonditionalerGeheZuAccess().getRechtsAssignment_4()); 
            // InternalTarot.g:1185:2: ( rule__KonditionalerGeheZu__RechtsAssignment_4 )
            // InternalTarot.g:1185:3: rule__KonditionalerGeheZu__RechtsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__KonditionalerGeheZu__RechtsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getKonditionalerGeheZuAccess().getRechtsAssignment_4()); 

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__4__Impl"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__5"
    // InternalTarot.g:1193:1: rule__KonditionalerGeheZu__Group__5 : rule__KonditionalerGeheZu__Group__5__Impl rule__KonditionalerGeheZu__Group__6 ;
    public final void rule__KonditionalerGeheZu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1197:1: ( rule__KonditionalerGeheZu__Group__5__Impl rule__KonditionalerGeheZu__Group__6 )
            // InternalTarot.g:1198:2: rule__KonditionalerGeheZu__Group__5__Impl rule__KonditionalerGeheZu__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__KonditionalerGeheZu__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KonditionalerGeheZu__Group__6();

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__5"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__5__Impl"
    // InternalTarot.g:1205:1: rule__KonditionalerGeheZu__Group__5__Impl : ( ')' ) ;
    public final void rule__KonditionalerGeheZu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1209:1: ( ( ')' ) )
            // InternalTarot.g:1210:1: ( ')' )
            {
            // InternalTarot.g:1210:1: ( ')' )
            // InternalTarot.g:1211:2: ')'
            {
             before(grammarAccess.getKonditionalerGeheZuAccess().getRightParenthesisKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getKonditionalerGeheZuAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__5__Impl"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__6"
    // InternalTarot.g:1220:1: rule__KonditionalerGeheZu__Group__6 : rule__KonditionalerGeheZu__Group__6__Impl rule__KonditionalerGeheZu__Group__7 ;
    public final void rule__KonditionalerGeheZu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1224:1: ( rule__KonditionalerGeheZu__Group__6__Impl rule__KonditionalerGeheZu__Group__7 )
            // InternalTarot.g:1225:2: rule__KonditionalerGeheZu__Group__6__Impl rule__KonditionalerGeheZu__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__KonditionalerGeheZu__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KonditionalerGeheZu__Group__7();

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__6"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__6__Impl"
    // InternalTarot.g:1232:1: rule__KonditionalerGeheZu__Group__6__Impl : ( 'DANN' ) ;
    public final void rule__KonditionalerGeheZu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1236:1: ( ( 'DANN' ) )
            // InternalTarot.g:1237:1: ( 'DANN' )
            {
            // InternalTarot.g:1237:1: ( 'DANN' )
            // InternalTarot.g:1238:2: 'DANN'
            {
             before(grammarAccess.getKonditionalerGeheZuAccess().getDANNKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getKonditionalerGeheZuAccess().getDANNKeyword_6()); 

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__6__Impl"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__7"
    // InternalTarot.g:1247:1: rule__KonditionalerGeheZu__Group__7 : rule__KonditionalerGeheZu__Group__7__Impl rule__KonditionalerGeheZu__Group__8 ;
    public final void rule__KonditionalerGeheZu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1251:1: ( rule__KonditionalerGeheZu__Group__7__Impl rule__KonditionalerGeheZu__Group__8 )
            // InternalTarot.g:1252:2: rule__KonditionalerGeheZu__Group__7__Impl rule__KonditionalerGeheZu__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__KonditionalerGeheZu__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KonditionalerGeheZu__Group__8();

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__7"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__7__Impl"
    // InternalTarot.g:1259:1: rule__KonditionalerGeheZu__Group__7__Impl : ( 'GEHE' ) ;
    public final void rule__KonditionalerGeheZu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1263:1: ( ( 'GEHE' ) )
            // InternalTarot.g:1264:1: ( 'GEHE' )
            {
            // InternalTarot.g:1264:1: ( 'GEHE' )
            // InternalTarot.g:1265:2: 'GEHE'
            {
             before(grammarAccess.getKonditionalerGeheZuAccess().getGEHEKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getKonditionalerGeheZuAccess().getGEHEKeyword_7()); 

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__7__Impl"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__8"
    // InternalTarot.g:1274:1: rule__KonditionalerGeheZu__Group__8 : rule__KonditionalerGeheZu__Group__8__Impl rule__KonditionalerGeheZu__Group__9 ;
    public final void rule__KonditionalerGeheZu__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1278:1: ( rule__KonditionalerGeheZu__Group__8__Impl rule__KonditionalerGeheZu__Group__9 )
            // InternalTarot.g:1279:2: rule__KonditionalerGeheZu__Group__8__Impl rule__KonditionalerGeheZu__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__KonditionalerGeheZu__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KonditionalerGeheZu__Group__9();

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__8"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__8__Impl"
    // InternalTarot.g:1286:1: rule__KonditionalerGeheZu__Group__8__Impl : ( 'ZU' ) ;
    public final void rule__KonditionalerGeheZu__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1290:1: ( ( 'ZU' ) )
            // InternalTarot.g:1291:1: ( 'ZU' )
            {
            // InternalTarot.g:1291:1: ( 'ZU' )
            // InternalTarot.g:1292:2: 'ZU'
            {
             before(grammarAccess.getKonditionalerGeheZuAccess().getZUKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getKonditionalerGeheZuAccess().getZUKeyword_8()); 

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__8__Impl"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__9"
    // InternalTarot.g:1301:1: rule__KonditionalerGeheZu__Group__9 : rule__KonditionalerGeheZu__Group__9__Impl ;
    public final void rule__KonditionalerGeheZu__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1305:1: ( rule__KonditionalerGeheZu__Group__9__Impl )
            // InternalTarot.g:1306:2: rule__KonditionalerGeheZu__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KonditionalerGeheZu__Group__9__Impl();

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__9"


    // $ANTLR start "rule__KonditionalerGeheZu__Group__9__Impl"
    // InternalTarot.g:1312:1: rule__KonditionalerGeheZu__Group__9__Impl : ( ( rule__KonditionalerGeheZu__ZielAssignment_9 ) ) ;
    public final void rule__KonditionalerGeheZu__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1316:1: ( ( ( rule__KonditionalerGeheZu__ZielAssignment_9 ) ) )
            // InternalTarot.g:1317:1: ( ( rule__KonditionalerGeheZu__ZielAssignment_9 ) )
            {
            // InternalTarot.g:1317:1: ( ( rule__KonditionalerGeheZu__ZielAssignment_9 ) )
            // InternalTarot.g:1318:2: ( rule__KonditionalerGeheZu__ZielAssignment_9 )
            {
             before(grammarAccess.getKonditionalerGeheZuAccess().getZielAssignment_9()); 
            // InternalTarot.g:1319:2: ( rule__KonditionalerGeheZu__ZielAssignment_9 )
            // InternalTarot.g:1319:3: rule__KonditionalerGeheZu__ZielAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__KonditionalerGeheZu__ZielAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getKonditionalerGeheZuAccess().getZielAssignment_9()); 

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
    // $ANTLR end "rule__KonditionalerGeheZu__Group__9__Impl"


    // $ANTLR start "rule__Halt__Group__0"
    // InternalTarot.g:1328:1: rule__Halt__Group__0 : rule__Halt__Group__0__Impl rule__Halt__Group__1 ;
    public final void rule__Halt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1332:1: ( rule__Halt__Group__0__Impl rule__Halt__Group__1 )
            // InternalTarot.g:1333:2: rule__Halt__Group__0__Impl rule__Halt__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Halt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Halt__Group__1();

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
    // $ANTLR end "rule__Halt__Group__0"


    // $ANTLR start "rule__Halt__Group__0__Impl"
    // InternalTarot.g:1340:1: rule__Halt__Group__0__Impl : ( () ) ;
    public final void rule__Halt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1344:1: ( ( () ) )
            // InternalTarot.g:1345:1: ( () )
            {
            // InternalTarot.g:1345:1: ( () )
            // InternalTarot.g:1346:2: ()
            {
             before(grammarAccess.getHaltAccess().getHaltAction_0()); 
            // InternalTarot.g:1347:2: ()
            // InternalTarot.g:1347:3: 
            {
            }

             after(grammarAccess.getHaltAccess().getHaltAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Halt__Group__0__Impl"


    // $ANTLR start "rule__Halt__Group__1"
    // InternalTarot.g:1355:1: rule__Halt__Group__1 : rule__Halt__Group__1__Impl ;
    public final void rule__Halt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1359:1: ( rule__Halt__Group__1__Impl )
            // InternalTarot.g:1360:2: rule__Halt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Halt__Group__1__Impl();

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
    // $ANTLR end "rule__Halt__Group__1"


    // $ANTLR start "rule__Halt__Group__1__Impl"
    // InternalTarot.g:1366:1: rule__Halt__Group__1__Impl : ( 'Halt!' ) ;
    public final void rule__Halt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1370:1: ( ( 'Halt!' ) )
            // InternalTarot.g:1371:1: ( 'Halt!' )
            {
            // InternalTarot.g:1371:1: ( 'Halt!' )
            // InternalTarot.g:1372:2: 'Halt!'
            {
             before(grammarAccess.getHaltAccess().getHaltKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHaltAccess().getHaltKeyword_1()); 

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
    // $ANTLR end "rule__Halt__Group__1__Impl"


    // $ANTLR start "rule__Programm__ZeilenAssignment"
    // InternalTarot.g:1382:1: rule__Programm__ZeilenAssignment : ( ruleZeile ) ;
    public final void rule__Programm__ZeilenAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1386:1: ( ( ruleZeile ) )
            // InternalTarot.g:1387:2: ( ruleZeile )
            {
            // InternalTarot.g:1387:2: ( ruleZeile )
            // InternalTarot.g:1388:3: ruleZeile
            {
             before(grammarAccess.getProgrammAccess().getZeilenZeileParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleZeile();

            state._fsp--;

             after(grammarAccess.getProgrammAccess().getZeilenZeileParserRuleCall_0()); 

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
    // $ANTLR end "rule__Programm__ZeilenAssignment"


    // $ANTLR start "rule__Zeile__NameAssignment_0"
    // InternalTarot.g:1397:1: rule__Zeile__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Zeile__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1401:1: ( ( RULE_ID ) )
            // InternalTarot.g:1402:2: ( RULE_ID )
            {
            // InternalTarot.g:1402:2: ( RULE_ID )
            // InternalTarot.g:1403:3: RULE_ID
            {
             before(grammarAccess.getZeileAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getZeileAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Zeile__NameAssignment_0"


    // $ANTLR start "rule__Zeile__AnweisungAssignment_2"
    // InternalTarot.g:1412:1: rule__Zeile__AnweisungAssignment_2 : ( ruleAnweisung ) ;
    public final void rule__Zeile__AnweisungAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1416:1: ( ( ruleAnweisung ) )
            // InternalTarot.g:1417:2: ( ruleAnweisung )
            {
            // InternalTarot.g:1417:2: ( ruleAnweisung )
            // InternalTarot.g:1418:3: ruleAnweisung
            {
             before(grammarAccess.getZeileAccess().getAnweisungAnweisungParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnweisung();

            state._fsp--;

             after(grammarAccess.getZeileAccess().getAnweisungAnweisungParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Zeile__AnweisungAssignment_2"


    // $ANTLR start "rule__Zuordnung__VarAssignment_0"
    // InternalTarot.g:1427:1: rule__Zuordnung__VarAssignment_0 : ( RULE_ID ) ;
    public final void rule__Zuordnung__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1431:1: ( ( RULE_ID ) )
            // InternalTarot.g:1432:2: ( RULE_ID )
            {
            // InternalTarot.g:1432:2: ( RULE_ID )
            // InternalTarot.g:1433:3: RULE_ID
            {
             before(grammarAccess.getZuordnungAccess().getVarIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getZuordnungAccess().getVarIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Zuordnung__VarAssignment_0"


    // $ANTLR start "rule__Zuordnung__AusdruckAssignment_2"
    // InternalTarot.g:1442:1: rule__Zuordnung__AusdruckAssignment_2 : ( ruleAusdruck ) ;
    public final void rule__Zuordnung__AusdruckAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1446:1: ( ( ruleAusdruck ) )
            // InternalTarot.g:1447:2: ( ruleAusdruck )
            {
            // InternalTarot.g:1447:2: ( ruleAusdruck )
            // InternalTarot.g:1448:3: ruleAusdruck
            {
             before(grammarAccess.getZuordnungAccess().getAusdruckAusdruckParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAusdruck();

            state._fsp--;

             after(grammarAccess.getZuordnungAccess().getAusdruckAusdruckParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Zuordnung__AusdruckAssignment_2"


    // $ANTLR start "rule__StrichOperation__LinksAssignment_1"
    // InternalTarot.g:1457:1: rule__StrichOperation__LinksAssignment_1 : ( RULE_ID ) ;
    public final void rule__StrichOperation__LinksAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1461:1: ( ( RULE_ID ) )
            // InternalTarot.g:1462:2: ( RULE_ID )
            {
            // InternalTarot.g:1462:2: ( RULE_ID )
            // InternalTarot.g:1463:3: RULE_ID
            {
             before(grammarAccess.getStrichOperationAccess().getLinksIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStrichOperationAccess().getLinksIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__StrichOperation__LinksAssignment_1"


    // $ANTLR start "rule__StrichOperation__OpAssignment_2_0"
    // InternalTarot.g:1472:1: rule__StrichOperation__OpAssignment_2_0 : ( ( rule__StrichOperation__OpAlternatives_2_0_0 ) ) ;
    public final void rule__StrichOperation__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1476:1: ( ( ( rule__StrichOperation__OpAlternatives_2_0_0 ) ) )
            // InternalTarot.g:1477:2: ( ( rule__StrichOperation__OpAlternatives_2_0_0 ) )
            {
            // InternalTarot.g:1477:2: ( ( rule__StrichOperation__OpAlternatives_2_0_0 ) )
            // InternalTarot.g:1478:3: ( rule__StrichOperation__OpAlternatives_2_0_0 )
            {
             before(grammarAccess.getStrichOperationAccess().getOpAlternatives_2_0_0()); 
            // InternalTarot.g:1479:3: ( rule__StrichOperation__OpAlternatives_2_0_0 )
            // InternalTarot.g:1479:4: rule__StrichOperation__OpAlternatives_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__StrichOperation__OpAlternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStrichOperationAccess().getOpAlternatives_2_0_0()); 

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
    // $ANTLR end "rule__StrichOperation__OpAssignment_2_0"


    // $ANTLR start "rule__StrichOperation__RechtsAssignment_2_1"
    // InternalTarot.g:1487:1: rule__StrichOperation__RechtsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__StrichOperation__RechtsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1491:1: ( ( RULE_ID ) )
            // InternalTarot.g:1492:2: ( RULE_ID )
            {
            // InternalTarot.g:1492:2: ( RULE_ID )
            // InternalTarot.g:1493:3: RULE_ID
            {
             before(grammarAccess.getStrichOperationAccess().getRechtsIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStrichOperationAccess().getRechtsIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__StrichOperation__RechtsAssignment_2_1"


    // $ANTLR start "rule__Ganzzahl__WertAssignment_1"
    // InternalTarot.g:1502:1: rule__Ganzzahl__WertAssignment_1 : ( RULE_INT ) ;
    public final void rule__Ganzzahl__WertAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1506:1: ( ( RULE_INT ) )
            // InternalTarot.g:1507:2: ( RULE_INT )
            {
            // InternalTarot.g:1507:2: ( RULE_INT )
            // InternalTarot.g:1508:3: RULE_INT
            {
             before(grammarAccess.getGanzzahlAccess().getWertINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGanzzahlAccess().getWertINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Ganzzahl__WertAssignment_1"


    // $ANTLR start "rule__Eingabe__VarAssignment_1"
    // InternalTarot.g:1517:1: rule__Eingabe__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__Eingabe__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1521:1: ( ( RULE_ID ) )
            // InternalTarot.g:1522:2: ( RULE_ID )
            {
            // InternalTarot.g:1522:2: ( RULE_ID )
            // InternalTarot.g:1523:3: RULE_ID
            {
             before(grammarAccess.getEingabeAccess().getVarIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEingabeAccess().getVarIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Eingabe__VarAssignment_1"


    // $ANTLR start "rule__Ausgabe__VarAssignment_1"
    // InternalTarot.g:1532:1: rule__Ausgabe__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ausgabe__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1536:1: ( ( RULE_ID ) )
            // InternalTarot.g:1537:2: ( RULE_ID )
            {
            // InternalTarot.g:1537:2: ( RULE_ID )
            // InternalTarot.g:1538:3: RULE_ID
            {
             before(grammarAccess.getAusgabeAccess().getVarIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAusgabeAccess().getVarIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Ausgabe__VarAssignment_1"


    // $ANTLR start "rule__GeheZu__ZielAssignment_2"
    // InternalTarot.g:1547:1: rule__GeheZu__ZielAssignment_2 : ( RULE_ID ) ;
    public final void rule__GeheZu__ZielAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1551:1: ( ( RULE_ID ) )
            // InternalTarot.g:1552:2: ( RULE_ID )
            {
            // InternalTarot.g:1552:2: ( RULE_ID )
            // InternalTarot.g:1553:3: RULE_ID
            {
             before(grammarAccess.getGeheZuAccess().getZielIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGeheZuAccess().getZielIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__GeheZu__ZielAssignment_2"


    // $ANTLR start "rule__KonditionalerGeheZu__LinksAssignment_2"
    // InternalTarot.g:1562:1: rule__KonditionalerGeheZu__LinksAssignment_2 : ( RULE_ID ) ;
    public final void rule__KonditionalerGeheZu__LinksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1566:1: ( ( RULE_ID ) )
            // InternalTarot.g:1567:2: ( RULE_ID )
            {
            // InternalTarot.g:1567:2: ( RULE_ID )
            // InternalTarot.g:1568:3: RULE_ID
            {
             before(grammarAccess.getKonditionalerGeheZuAccess().getLinksIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKonditionalerGeheZuAccess().getLinksIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__KonditionalerGeheZu__LinksAssignment_2"


    // $ANTLR start "rule__KonditionalerGeheZu__OpAssignment_3"
    // InternalTarot.g:1577:1: rule__KonditionalerGeheZu__OpAssignment_3 : ( ( rule__KonditionalerGeheZu__OpAlternatives_3_0 ) ) ;
    public final void rule__KonditionalerGeheZu__OpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1581:1: ( ( ( rule__KonditionalerGeheZu__OpAlternatives_3_0 ) ) )
            // InternalTarot.g:1582:2: ( ( rule__KonditionalerGeheZu__OpAlternatives_3_0 ) )
            {
            // InternalTarot.g:1582:2: ( ( rule__KonditionalerGeheZu__OpAlternatives_3_0 ) )
            // InternalTarot.g:1583:3: ( rule__KonditionalerGeheZu__OpAlternatives_3_0 )
            {
             before(grammarAccess.getKonditionalerGeheZuAccess().getOpAlternatives_3_0()); 
            // InternalTarot.g:1584:3: ( rule__KonditionalerGeheZu__OpAlternatives_3_0 )
            // InternalTarot.g:1584:4: rule__KonditionalerGeheZu__OpAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__KonditionalerGeheZu__OpAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getKonditionalerGeheZuAccess().getOpAlternatives_3_0()); 

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
    // $ANTLR end "rule__KonditionalerGeheZu__OpAssignment_3"


    // $ANTLR start "rule__KonditionalerGeheZu__RechtsAssignment_4"
    // InternalTarot.g:1592:1: rule__KonditionalerGeheZu__RechtsAssignment_4 : ( RULE_ID ) ;
    public final void rule__KonditionalerGeheZu__RechtsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1596:1: ( ( RULE_ID ) )
            // InternalTarot.g:1597:2: ( RULE_ID )
            {
            // InternalTarot.g:1597:2: ( RULE_ID )
            // InternalTarot.g:1598:3: RULE_ID
            {
             before(grammarAccess.getKonditionalerGeheZuAccess().getRechtsIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKonditionalerGeheZuAccess().getRechtsIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__KonditionalerGeheZu__RechtsAssignment_4"


    // $ANTLR start "rule__KonditionalerGeheZu__ZielAssignment_9"
    // InternalTarot.g:1607:1: rule__KonditionalerGeheZu__ZielAssignment_9 : ( RULE_ID ) ;
    public final void rule__KonditionalerGeheZu__ZielAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTarot.g:1611:1: ( ( RULE_ID ) )
            // InternalTarot.g:1612:2: ( RULE_ID )
            {
            // InternalTarot.g:1612:2: ( RULE_ID )
            // InternalTarot.g:1613:3: RULE_ID
            {
             before(grammarAccess.getKonditionalerGeheZuAccess().getZielIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKonditionalerGeheZuAccess().getZielIDTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__KonditionalerGeheZu__ZielAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000045C00010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});

}