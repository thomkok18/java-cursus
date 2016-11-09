// Hoofdstuk 4
package H4;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht3 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht3 extends Applet {

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawOval(50, 50, 20, 20);
		g.drawRect(49, 70, 20, 180);
		g.setColor(Color.red);
		g.fillRect(70, 70, 100, 20);
		g.setColor(Color.white);
		g.fillRect(70, 90, 100, 20);
		g.setColor(Color.blue);
		g.fillRect(70, 110, 100, 20);
	}
}