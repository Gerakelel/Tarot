package de.fhdw.iis1.tarot.interpreter;

import org.eclipse.xtext.resource.XtextResourceSet;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import com.google.inject.Injector;
import de.fhdw.iis1.tarot.TarotStandaloneSetup;
import de.fhdw.iis1.tarot.tarot.*;

public class Main {
	public static void main(String[] args) {
		
		Injector injector =
	            new TarotStandaloneSetup()
	                .createInjectorAndDoEMFRegistration();
	 
	        XtextResourceSet resourceSet =
	            injector.getInstance(XtextResourceSet.class);
		String pfad = "C:\\Users\\admin\\Documents\\GitHub\\Tarot\\programme\\src\\Test.tarot";
		
		 Resource resource = resourceSet.getResource(
		            URI.createFileURI(pfad),
		            true
		        );
		 
		 Interpreter interpreter = new Interpreter();
		 Programm prog = (Programm) resource.getContents().get(0);
		 List<Zeile> zeilen = prog.getZeilen();
		 
		 for(Zeile zeile : zeilen) {
			 interpreter.doSwitch(zeile.getAnweisung());
		 }
		 
	}
}