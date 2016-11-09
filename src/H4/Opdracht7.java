// Hoofdstuk 4
package H4;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

//Een klasse met de naam Opdracht7 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht7 extends Applet {

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawRoundRect(20, 20, 50, 50, 10, 10);
		g.fillOval(30, 30, 10, 10);
		g.fillOval(50, 30, 10, 10);
		g.fillOval(30, 50, 10, 10);
		g.fillOval(50, 50, 10, 10);
	}
}