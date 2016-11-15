// Hoofdstuk 13
package H13;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

//Een klasse met de naam PraktijkOpdracht van het type Applet.
@SuppressWarnings("serial")
public class Praktijkopdracht extends Applet {
	int naarRechts = 100, aantalBomen = 5, aantalRijen = 2, boomstam = 120, bladeren = 60;
	boolean rijen;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(800,800);
		rijen = false;
	}

	public void tekenBoom( Graphics g, int x1, int y1, int x2, int y2) {
		g.setColor(Color.RED);
		g.fillRect(x1, y1, 20, 60);
		g.setColor(Color.GREEN);
		g.fillOval(x2, y2, 60, 60);
	}
	public void paint(Graphics g) {
		for (int teller = 0; teller < aantalBomen; teller++) {
			naarRechts += 100;

			tekenBoom(g,naarRechts,boomstam,naarRechts - 20,bladeren);
			tekenBoom(g,naarRechts,300,naarRechts - 20,240);
		}
	}
}