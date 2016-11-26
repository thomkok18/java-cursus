// Hoofdstuk 4
package Opdrachten.H4;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

//Een klasse met de naam Opdracht6 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht6 extends Applet {

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.fillRoundRect(20, 20, 60, 140, 10, 10);
		g.setColor(Color.red);
		g.fillOval(35, 30, 30, 30);
		g.setColor(Color.yellow);
		g.fillOval(35, 70, 30, 30);
		g.setColor(Color.green);
		g.fillOval(35, 110, 30, 30);
	}
}