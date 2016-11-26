// Hoofdstuk 6
package Opdrachten.H6;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam PraktijkOpdracht van het type Applet.
@SuppressWarnings("serial")
public class PraktijkOpdracht extends Applet {
	double cijfer1, cijfer2, cijfer3, cijfersKeer, uitkomst;
	int aantalCijfers, tien, gemiddelde;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		cijfer1 = 5.9;
		cijfer2 = 6.3;
		cijfer3 = 6.9;
		aantalCijfers = 3;
		tien = 10;
		cijfersKeer = (cijfer1+cijfer2+cijfer3)*tien;
		gemiddelde = (int) cijfersKeer/aantalCijfers;
		uitkomst = gemiddelde;
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawString("De uitkomst is: " + uitkomst/tien , 20, 20);
	}
}