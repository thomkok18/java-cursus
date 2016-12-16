// Hoofdstuk 14
package Opdrachten.H14;

// Importeer de benodigde klassen uit de Java bibliotheek.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Een klasse met de naam Toets1 van het type Applet.
@SuppressWarnings("serial")
public class Toets2 extends Applet {
	Button speelKnop, koopKnop;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(500, 400);

		speelKnop = new Button("Speel");
		speelKnop.addActionListener( new SpeelKnopListener() );
		add(speelKnop);

		koopKnop = new Button("Koop 10 kredietpunten");
		koopKnop.addActionListener( new WijnListener() );
		add(koopKnop);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {

	}

	class SpeelKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			repaint();
		}
	}

	class WijnListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			repaint();
		}
	}
}