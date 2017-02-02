// Hoofdstuk 6
package Opdrachten.H6;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht1 extends Applet {
	double euro, aantalPersonen, uitkomst;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		euro = 113;
		aantalPersonen = 4;
		uitkomst = euro / aantalPersonen;
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawString("Jan krijgt: " + uitkomst, 20, 20);
		g.drawString("Ali krijgt: " + uitkomst, 20, 40);
		g.drawString("Jeannette krijgt: " + uitkomst, 20, 60);
		g.drawString("Thom krijgt: " + uitkomst, 20, 80);
	}
}