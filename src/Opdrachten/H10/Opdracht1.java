// Hoofdstuk 10
package Opdrachten.Java.H10;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht1 extends Applet {
	TextField tekstvak;
	Button okKnop;
	int hoogstegetal;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		tekstvak = new TextField("", 30);
		add(tekstvak);
		okKnop = new Button("Ok");
		okKnop.addActionListener( new OkKnopListener() );
		add(okKnop);
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawString("Hoogste Getal: " + hoogstegetal, 50, 60 );
	}

	class OkKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			String tekstvakGetal = tekstvak.getText();
			int getal = Integer.parseInt(tekstvakGetal);
			if ( getal > hoogstegetal ) {
				hoogstegetal = getal;
			}
			tekstvak.setText("");
			repaint();
		}
	}
}