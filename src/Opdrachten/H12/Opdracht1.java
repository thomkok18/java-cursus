// Hoofdstuk 11
package Opdrachten.H12;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

//Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht1 extends Applet {
	double gemiddelde;
	int maand, salaris[], optellen, beginGetal, totaalSalaris;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(400, 400);
		optellen = 100;
		beginGetal = 100;
		totaalSalaris = 0;
		salaris = new int[10];
		for (maand = 0; maand < salaris.length; maand++) {
			salaris[maand] = optellen * maand + beginGetal;
			totaalSalaris += salaris[maand];
		}
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		gemiddelde = totaalSalaris / salaris.length;
		for (maand = 0; maand < salaris.length; maand ++) {
			g.drawString("" + salaris[maand], 50, 20 * maand + 20);
			g.drawString ("Gemiddelde is: " + gemiddelde, 50, 220); 
		} 
	}
}