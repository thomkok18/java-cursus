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
	int Hoogstegetal;
	int Laagstegetal;
	int Getal;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		tekstvak = new TextField("", 30);
		add(tekstvak);
		knop = new Button("Ok");
		knop.addActionListener( new knopListener() );
		add(knop);
		Laagstegetal = 2147483647;
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		if (Getal > 0) {
			g.drawString("Hoogste Getal: " + Hoogstegetal, 50, 60 );	
			g.drawString("Laagste Getal: " + Laagstegetal, 50, 80 );
		}
	}

	class knopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {

			String TekstvakGetal = tekstvak.getText();
			Getal = Integer.parseInt(TekstvakGetal);

			if ( Getal > Hoogstegetal ) {
				Hoogstegetal = Getal;
			}
			if ( Getal < Laagstegetal) {
				Laagstegetal = Getal;
			}
			repaint();
		}
	}
}