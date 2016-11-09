// Hoofdstuk 8
package H8;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht2 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht2 extends Applet {
	Button Man;
	Button Vrouw;
	Button Meisje;
	Button Jongen;
	Button Reset;
	int TotaalMan = 0;
	int TotaalVrouw = 0;
	int TotaalMeisje = 0;
	int TotaalJongen = 0;
	int TotaalBezoekers = 0;


	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		//Schermgrootte
		setSize(600, 500);

		//Knop Man
		Man = new Button("Man");
		Man.addActionListener(new ManListener() );
		add(Man);

		//Knop Vrouw
		Vrouw = new Button("Vrouw");
		Vrouw.addActionListener(new VrouwListener() );
		add(Vrouw);

		//Knop Meisje
		Meisje = new Button("Meisje");
		Meisje.addActionListener(new MeisjeListener() );
		add(Meisje);

		//Knop Jongen
		Jongen = new Button("Jongen");
		Jongen.addActionListener(new JongenListener() );
		add(Jongen);

		//Knop Reset
		Reset = new Button("Reset");
		Reset.addActionListener(new ResetListener() );
		add(Reset);
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawString("Aantal Mannen:"+ TotaalMan, 50, 120 );
		g.drawString("Aantal Vrouwen:"+ TotaalVrouw, 50, 140 );
		g.drawString("Aantal Meisjes:"+ TotaalMeisje, 50, 160 );
		g.drawString("Aantal Jongens:"+ TotaalJongen, 50, 180 );
		g.drawString("Totaal Bezoekers:"+ TotaalBezoekers, 50, 200 );

	}

	class ManListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			TotaalMan++;
			TotaalBezoekers++;
			TotaalJongen++;
			repaint();
		}
	}

	class VrouwListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			TotaalVrouw++;
			TotaalBezoekers++;
			TotaalMeisje++;
			repaint();
		}
	}

	class MeisjeListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			TotaalBezoekers++;
			TotaalMeisje++;
			repaint();
		}
	}

	class JongenListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			TotaalBezoekers++;
			TotaalJongen++;
			repaint();
		}
	}

	class ResetListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			TotaalMan = 0;
			TotaalVrouw = 0;
			TotaalMeisje = 0;
			TotaalJongen = 0;
			TotaalBezoekers = 0;
			repaint();
		}
	}
}