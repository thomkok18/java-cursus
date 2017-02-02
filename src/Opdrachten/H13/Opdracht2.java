// Hoofdstuk 13
package Opdrachten.H13;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht2 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht2 extends Applet {

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(400, 200);
	}

	public 	void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x3, y3, x1, y1);
		g.drawLine(x2, y2, x3, y3);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		tekenDriehoek(g, 100, 100, 15, 100, 100, 15);
	}
}