// Hoofdstuk 11
package H11;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht9 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht8 extends Applet {

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(1200, 1000);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		int x = 0, y = 0, l = 10, b = 10;
		for (int teller = 0; teller < 100; teller++){
			g.drawOval(x, y, l, b);
			x -= 0;
			y -= 0;
			l += 10;
			b += 10;
		}
	}
}