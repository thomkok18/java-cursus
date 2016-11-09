// Hoofdstuk 10
package H10;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht2 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht2 extends Applet {
	TextField tekstvak;
	Button knop;
	int hoogsteGetal, laagsteGetal, getal;
	boolean geklikt;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		hoogsteGetal = 0;
		laagsteGetal = 0;
		getal = 0;
		geklikt = false;
		tekstvak = new TextField("", 30);
		add(tekstvak);
		knop = new Button("Ok");
		knop.addActionListener( new knopListener() );
		add(knop);
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
			g.drawString("Hoogste Getal: " + hoogsteGetal, 50, 60 );
			g.drawString("Laagste Getal: " + laagsteGetal, 50, 80 );
	}

	class knopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			String TekstvakGetal = tekstvak.getText();
			getal = Integer.parseInt(TekstvakGetal);
			if (getal > hoogsteGetal && getal != Integer.MAX_VALUE && getal < Integer.MAX_VALUE) {
				hoogsteGetal = getal;
			}
			if (getal < laagsteGetal && getal != Integer.MIN_VALUE && getal > Integer.MIN_VALUE) {
				laagsteGetal = getal;
			}
			if (geklikt == false) {
				laagsteGetal = hoogsteGetal;
			}
			tekstvak.setText("");
			geklikt = true;
			repaint();
		}
	}
}