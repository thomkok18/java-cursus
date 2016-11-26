// Hoofdstuk 11
package Opdrachten.H11;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht3 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht2 extends Applet {

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(900, 100);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		int beginGetal = 20, minGetal = 1, eindGetal = 10, afstandGetallen = 30, getal, verschil;
		verschil = beginGetal - eindGetal;
		for(int aantalGetallen = 0; aantalGetallen <= verschil; aantalGetallen++) {
			afstandGetallen += 30;
			getal = beginGetal;
			beginGetal = getal - minGetal;
			g.drawString("" + getal, afstandGetallen , 50);
		}
	}
}