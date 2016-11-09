// Hoofdstuk 11
package H11;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht6 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht5 extends Applet {

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(200, 500);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		int x = 20, y = 20;
		for (int teller = 0; teller < 5; teller++){
			g.drawRect(x, y, 20, 20);
			x += 20;
			y += 20;
		}
	}
}