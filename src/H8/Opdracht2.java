// Hoofdstuk 8
package H8;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht2 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht2 extends Applet {
	Button man, vrouw, meisje, jongen, reset;
	int totaalMan = 0, totaalVrouw = 0, totaalMeisje = 0, totaalJongen = 0, totaalBezoekers = 0;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		//Schermgrootte
		setSize(500, 300);

		//Knop Man
		man = new Button("Man");
		man.addActionListener(new manListener() );
		add(man);

		//Knop Vrouw
		vrouw = new Button("Vrouw");
		vrouw.addActionListener(new vrouwListener() );
		add(vrouw);

		//Knop Meisje
		meisje = new Button("Meisje");
		meisje.addActionListener(new meisjeListener() );
		add(meisje);

		//Knop Jongen
		jongen = new Button("Jongen");
		jongen.addActionListener(new jongenListener() );
		add(jongen);

		//Knop Reset
		reset = new Button("Reset");
		reset.addActionListener(new resetListener() );
		add(reset);
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawString("Aantal Mannen:"+ totaalMan, 50, 120 );
		g.drawString("Aantal Vrouwen:"+ totaalVrouw, 50, 140 );
		g.drawString("Aantal Meisjes:"+ totaalMeisje, 50, 160 );
		g.drawString("Aantal Jongens:"+ totaalJongen, 50, 180 );
		g.drawString("Totaal Bezoekers:"+ totaalBezoekers, 50, 200 );

	}

	class manListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			totaalMan++;
			totaalBezoekers++;
			totaalJongen++;
			repaint();
		}
	}

	class vrouwListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			totaalVrouw++;
			totaalBezoekers++;
			totaalMeisje++;
			repaint();
		}
	}

	class meisjeListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			totaalBezoekers++;
			totaalMeisje++;
			repaint();
		}
	}

	class jongenListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			totaalBezoekers++;
			totaalJongen++;
			repaint();
		}
	}

	class resetListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			totaalMan = 0;
			totaalVrouw = 0;
			totaalMeisje = 0;
			totaalJongen = 0;
			totaalBezoekers = 0;
			repaint();
		}
	}
}