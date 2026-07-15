package de.fhdw.iis1.tarot.interpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.util.XtextSwitch;
import de.fhdw.iis1.tarot.tarot.*;
import de.fhdw.iis1.tarot.tarot.util.TarotSwitch;

public class Interpretierer extends TarotSwitch<Object>{
	private final Map<String, Integer> speicher = new HashMap<>();
	private final Scanner scanner = new Scanner(System.in);
	
	@Override
	public Object caseZuordnung(Zuordnung zuordnung) {
		speicher.put(zuordnung.getVar(), (Integer) this.doSwitch(zuordnung.getAusdruck()));
		return -1;
	}
	
	@Override
	public Object caseStrichOperation(StrichOperation operation) {
		if (speicher.containsKey(operation.getLinks())) {
			int operandA = speicher.get(operation.getLinks());
			int operandB;
			
			if (speicher.containsKey(operation.getRechts())) {
				operandB = speicher.get(operation.getRechts());	
			} else {
				operandB = Integer.parseInt(operation.getRechts());
			}
			return operation.getOp().equals("+") ? operandA + operandB : operandA - operandB;
		}
		throw new IllegalStateException("Ungültiger Ausdruck.");
	}
	
	@Override
	public Object caseGanzzahl(Ganzzahl zahl) {
		return zahl.getWert();
	}
	
	@Override
	public Object caseEingabe(Eingabe eingabe) {
		System.out.println("Gib einen Wert für " + eingabe.getVar() + " ein: ");
		speicher.put(eingabe.getVar(), scanner.nextInt());
		return -1;
	}
	
	@Override
	public Object caseAusgabe(Ausgabe ausgabe) {
		System.out.println("Der Wert von " + ausgabe.getVar() + " ist " + speicher.get(ausgabe.getVar()));
		return -1;
	}
	
	@Override
	public Object caseGeheZu(GeheZu geheZu) {
		return Integer.parseInt(geheZu.getZiel().substring(1));
	}
	
	@Override
	public Object caseKonditionalerGeheZu(KonditionalerGeheZu kondGeheZu) {
		boolean bedingung = false;
		int operandA;
		int operandB;
		if (speicher.containsKey(kondGeheZu.getLinks())) {
			operandA = speicher.get(kondGeheZu.getLinks());
		} else {
			operandA = Integer.parseInt(kondGeheZu.getLinks());
		}
		
		if (speicher.containsKey(kondGeheZu.getRechts())) {
			operandB = speicher.get(kondGeheZu.getRechts());
		} else {
			operandB = Integer.parseInt(kondGeheZu.getRechts());
		}
		
		switch(kondGeheZu.getOp()) {
			case("="): 
				bedingung = operandA == operandB;
				break;
			case("<"): 
				bedingung = operandA < operandB;
				break;
			case(">"): 
				bedingung = operandA > operandB;
				break;
			case("<="): 
				bedingung = operandA <= operandB;
				break;
			case(">="): 
				bedingung = operandA >= operandB;
				break;
			case("!="): 
				bedingung = operandA != operandB;
				break;
		}
		if(bedingung) {
			return Integer.parseInt(kondGeheZu.getZiel().substring(1));
		}
		return -1; // Nicht Springen
	}
	
	@Override
	public Object caseHalt(Halt object) {
		return -2; // Break
	}
	
}
