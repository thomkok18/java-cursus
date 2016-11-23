// Hoofdstuk 13
package H13;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

//Een klasse met de naam PraktijkOpdracht van het type Applet.
@SuppressWarnings("serial")
public class PraktijkOpdracht extends Applet {
	int naarRechts, aantalBomen, aantalRijen, boomstam, bladeren;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(800,800);
		naarRechts = 100;
		aantalBomen = 5;
		aantalRijen = 3;
		boomstam = 120;
		bladeren = 60;
	}

	public void tekenBoom( Graphics g, int x1, int y1, int x2, int y2) {
		g.setColor(new Color(127, 51, 0));
		g.fillRect(x1, y1, 20, 60);
		g.setColor(Color.GREEN);
		g.fillOval(x2, y2, 60, 60);
	}
	public void paint(Graphics g) {
		boomstam = 120;
		bladeren = 60;
		naarRechts = 100;
		for (int rijen = 0; rijen < aantalRijen; rijen++) {
			for (int bomen = 0; bomen < aantalBomen; bomen++) {
				tekenBoom(g, naarRechts, boomstam, naarRechts - 20, bladeren);
				naarRechts += 100;
			}
			boomstam += 130;
			bladeren += 130;
			naarRechts = 100;
		}
	}
}