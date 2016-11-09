// Hoofdstuk 11
package H11;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht7 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht6 extends Applet {

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(200, 500);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		int x = 100, y = 100, l = 10, b = 10;
		for (int teller = 0; teller < 5; teller++){
			g.drawOval(x, y, l, b);
			x -= 10;
			y -= 10;
			l += 20;
			b += 20;
		}
	}
}