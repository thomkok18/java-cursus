// Hoofdstuk 4
package Opdrachten.Java.H4;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht2 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht2 extends Applet {

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawLine(100, 100, 50, 100);
		g.drawLine(75, 50, 50, 100);
		g.drawLine(100, 100, 75, 50);
		g.drawRect(50, 100, 50, 50);
		g.drawRect(60, 120, 20, 30);
		g.drawRect(70, 80, 10, 10);
	}
}