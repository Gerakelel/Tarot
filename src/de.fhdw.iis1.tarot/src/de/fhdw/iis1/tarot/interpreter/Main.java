package de.fhdw.iis1.tarot.interpreter;

import org.eclipse.xtext.resource.XtextResourceSet;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import com.google.inject.Injector;
import de.fhdw.iis1.tarot.TarotStandaloneSetup;
import de.fhdw.iis1.tarot.tarot.*;

public class Main {
	public static void main(String[] args) {
		
		String programm = "Div"; // Verfügbar: Mul, Div

		Injector injezierer = new TarotStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet ressourcenSammlung = injezierer.getInstance(XtextResourceSet.class);
		String pfad = Paths.get("..", "..", "programme", "src", programm + ".tarot").toString();
		Resource ressource = ressourcenSammlung.getResource(URI.createFileURI(pfad), true);

		Interpretierer interpretierer = new Interpretierer();
		Programm prog = (Programm) ressource.getContents().get(0);
		List<Zeile> zeilen = prog.getZeilen();

		for (int pz = 0; pz < zeilen.size(); pz++) {
			int setzePz = (int) interpretierer.doSwitch(zeilen.get(pz).getAnweisung());
			if (setzePz >= 0) {
				pz = setzePz - 1;
			} else if (setzePz == -2) {
				break;
			}
		}

	}
}