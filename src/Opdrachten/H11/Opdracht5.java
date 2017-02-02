// Hoofdstuk 11
package Opdrachten.H11;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht6 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht5 extends Applet {

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(200, 200);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		int xCoordinaat = 20, yCoordinaat = 20, aantalVierkanten = 5;
		for (int vierkantje = 0; vierkantje < aantalVierkanten; vierkantje++){
			g.drawRect(xCoordinaat, yCoordinaat, 20, 20);
			xCoordinaat += 20;
			yCoordinaat += 20;
		}
	}
}