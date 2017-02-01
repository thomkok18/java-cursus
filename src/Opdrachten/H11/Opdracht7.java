// Hoofdstuk 11
package Opdrachten.Java.H11;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht8 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht7 extends Applet {

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(900, 900);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		int xCoordinaat = 500, yCoordinaat = 500, aantalCirkels = 50, lengte = 10, breedte = 10;
		for (int teller = 0; teller < aantalCirkels; teller++){
			g.drawOval(xCoordinaat, yCoordinaat, breedte, lengte);
			xCoordinaat -= 5;
			yCoordinaat -= 5;
			lengte += 10;
			breedte += 10;
		}
	}
}