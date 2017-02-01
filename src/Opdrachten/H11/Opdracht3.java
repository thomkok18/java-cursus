// Hoofdstuk 11
package Opdrachten.Java.H11;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht3 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht3 extends Applet {

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(900, 100);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		int eersteGetal = 1, tweedeGetal = 1, antwoord = 0, afstandGetallen = 10;
		for(int aantalGetallen = 0; aantalGetallen <= 20; aantalGetallen++) {
			eersteGetal = tweedeGetal + antwoord;
			tweedeGetal = antwoord;
			antwoord = eersteGetal;
			g.drawString("" + antwoord, afstandGetallen , 50);
			afstandGetallen += 40;
		} 
	}
}