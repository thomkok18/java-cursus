// Hoofdstuk 6
package H6;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Praktijkopdracht van het type Applet.
@SuppressWarnings("serial")
public class Praktijkopdracht extends Applet {
	double a, b, c;
	double uitkomst;
	int d, e;
	int gemiddelde;
	double uitkomst2;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		a = 5.9;
		b = 6.3;
		c = 6.9;
		d = 3;
		e = 10;
		uitkomst = (a+b+c)*e;
		gemiddelde = (int) uitkomst/d;
		uitkomst2 = gemiddelde;
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawString("De uitkomst is: " + uitkomst2/e , 20, 20);
	}
}