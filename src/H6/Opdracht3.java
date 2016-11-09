// Hoofdstuk 6
package H6;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht3 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht3 extends Applet {
	int eersteInt, tweedeInt, negatieveInt;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		eersteInt = 1124242324;
		tweedeInt = 1023241324;
		negatieveInt = eersteInt+tweedeInt;
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawString("De uitkomst is: " + negatieveInt, 20, 20);
	}
}