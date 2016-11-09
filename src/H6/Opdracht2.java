// Hoofdstuk 6
package H6;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht2 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht2 extends Applet {
	int minuut, dagUren, jaarDagen;
	int uur, dag, jaar;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		minuut = 60;
		dagUren = 24;
		jaarDagen = 365;
		uur = minuut * minuut;
		dag = uur * dagUren;
		jaar = dag * jaarDagen;
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawString("Aantal seconde in een uur: " + uur, 20, 20);
		g.drawString("Aantal seconde in een dag: " + dag, 20, 40);
		g.drawString("Aantal seconde in een jaar: " + jaar, 20, 60);
	}
}