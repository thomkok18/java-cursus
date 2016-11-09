// Hoofdstuk 11
package H11;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht4 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht4 extends Applet {

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(300, 100);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		int teller, a = 3, b = 1, c = 0, x = 10;
		for(teller = 1; teller <= 10; teller++) {
			b = teller;
			c = a * b;
			g.drawString("" + c, x , 50);
			x += 20;
		} 
	}
}