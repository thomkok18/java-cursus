// Hoofdstuk 4
package Opdrachten.Java.H4;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")	
public class Opdracht1 extends Applet {

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawLine(100, 100, 50, 100);
		g.drawLine(75, 15, 50, 100);
		g.drawLine(100, 100, 75, 15);	
	}
}