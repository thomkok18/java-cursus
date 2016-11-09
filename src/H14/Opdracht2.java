// Hoofdstuk 14
package H14;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht2 extends Applet {
	int randomCijfer, randomKleur, x, y;
	String [] cijfers = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "koningin", "koning", "joker"};
	String [] kleuren = {"ruit", "klaver", "harten", "schoppen"};
	String [] speler1 = {"konijn"};
	String [] speler2 = {"konijn"};
	String [] speler3 = {"konijn"};
	String [] speler4 = {"konijn"};

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		x = 20;
		y = 20;
		setSize(600, 200);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {	
		for (int teller = 0; teller < 12; teller++) {
			x += 40;
			y += 20;
			g.drawString("Speler 1: " + speler1[0] , x, y);
			g.drawString("Speler 2:" + speler2[0] , x, y);
			g.drawString("Speler 3:" + speler3[0] , x, y);
			g.drawString("Speler 4:" + speler4[0] , x, y);
		}
	}
}