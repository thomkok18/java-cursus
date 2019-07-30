// Hoofdstuk 11
package Opdrachten.H11;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht7 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht7 extends Applet {

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(200, 200);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		int xCoordinaat = 100, yCoordinaat = 100, aantalCirkels = 5, lengte = 10, breedte = 10;
		for (int teller = 0; teller < aantalCirkels; teller++){
			g.drawOval(xCoordinaat, yCoordinaat, breedte, lengte);
			xCoordinaat -= 10;
			yCoordinaat -= 10;
			lengte += 20;
			breedte += 20;
		}
	}
}