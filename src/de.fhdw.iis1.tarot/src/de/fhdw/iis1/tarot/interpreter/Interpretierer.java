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
		int operandA = speicher.containsKey(operation.getLinks()) ? speicher.get(operation.getLinks()) : Integer.parseInt(operation.getLinks());
		int operandB = speicher.containsKey(operation.getRechts()) ? speicher.get(operation.getRechts()) : Integer.parseInt(operation.getRechts());
		
		return operation.getOp().equals("+") ? operandA + operandB : operandA - operandB;
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
		int operandA = bestimmeOperand(kondGeheZu.getLinks());
		int operandB = bestimmeOperand(kondGeheZu.getRechts());
				
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

	private int bestimmeOperand(String schluessel) {
		if (speicher.containsKey(schluessel)) {
			return speicher.get(schluessel);
		} else {
			return Integer.parseInt(schluessel);
		}
	}
	
	@Override
	public Object caseHalt(Halt object) {
		return -2; // Break
	}
	
}
