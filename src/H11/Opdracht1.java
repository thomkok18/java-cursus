// Hoofdstuk 11
package H11;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht1 extends Applet {
	int lijn, aantalLijnen, lengteLijn, afstandLijnen;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		aantalLijnen = 15;
		setSize(600, 400);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		afstandLijnen = 20;
		for(lijn = 1; lijn <= aantalLijnen; lijn++) {
			lengteLijn += 20;
			afstandLijnen += 20;
			g.drawLine(afstandLijnen , 300, afstandLijnen, 50 );
			g.drawString("" + lijn, afstandLijnen , 315);
		}
	}
}