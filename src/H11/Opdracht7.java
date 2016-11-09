// Hoofdstuk 11
package H11;

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
		int x = 500, y = 500, l = 10, b = 10;
		for (int teller = 0; teller < 50; teller++){
			g.drawOval(x, y, l, b);
			x -= 5;
			y -= 5;
			l += 10;
			b += 10;
		}
	}
}