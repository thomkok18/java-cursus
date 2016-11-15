// Hoofdstuk 11
package H11;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.applet.Applet;
import java.awt.*;

//Een klasse met de naam Opdracht10 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht9 extends Applet {

	//Een (lege) methode die de Applet gaat initialiseren. 
	public void init() {
		setSize(300, 300);
	}

	//Een methode die de inhoud van het scherm tekent.	 
	public void paint(Graphics g) {
		int x, y = 50, breedte = 20, hoogte = 20;
		setBackground(Color.gray);

		for (int i = 0; i < 4; i++) {

			x = 50;
			y += hoogte;

			for (int kolom = 0; kolom < 8; kolom++) {
				if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
					g.setColor(Color.black);
					g.fillRect(x, y, breedte, hoogte);
				} else {
					g.setColor(Color.white);
					g.fillRect(x, y, breedte, hoogte);
				}
				x += breedte;
			}

			x = 50;
			y += hoogte;

			for (int kolom = 0; kolom < 8; kolom++) {
				if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
					g.setColor(Color.white);
					g.fillRect(x, y, breedte, hoogte);
				} else {
					g.setColor(Color.black);
					g.fillRect(x, y, breedte, hoogte);

				}
				x += breedte;
			}
		}
	}
}