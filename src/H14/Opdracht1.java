// Hoofdstuk 14
package H14;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht1 extends Applet {
	String [] cijfers = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "koningin", "koning", "joker"};
	String [] kleuren = {"ruit", "klaver", "harten", "schoppen"};
	double r, b;
	int randomCijfer, randomKleur;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(400, 200);
		r = Math.random();
		randomCijfer = (int) (r * 12);

		b = Math.random();
		randomKleur = (int) (b * 4);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {		
		g.drawString("" + kleuren[randomKleur] + ", " + cijfers[randomCijfer], 20,20);
	}
}