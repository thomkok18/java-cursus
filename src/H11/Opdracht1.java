// Hoofdstuk 11
package H11;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht1 extends Applet {

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		int teller;
		int lengte = 0;
		int breedte = 0;
		for(teller = 1; teller <= 10; teller++) {
			lengte += 20;
			breedte += 20;
			g.drawLine(breedte , 300, lengte, 50 );
			g.drawString("" + teller, lengte , 315);
		} 
	}
}