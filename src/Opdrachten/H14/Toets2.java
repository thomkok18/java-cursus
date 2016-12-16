// Hoofdstuk 14
package Opdrachten.H14;

// Importeer de benodigde klassen uit de Java bibliotheek.

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

// Een klasse met de naam Toets1 van het type Applet.
@SuppressWarnings("serial")
public class Toets2 extends Applet {
	Button speelKnop, koopKnop;
	int krediet, punten;
	private Image afbeeldingFruit1, afbeeldingFruit2, afbeeldingFruit3;
	private URL pad;
	private AudioClip win, jackpot;
	boolean gewonnen;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(500, 400);
		krediet = 10;
		punten = 0;
		gewonnen = false;

		pad = Toets2.class.getResource("/Opdrachten/H14/Audio/Fruitmachine/jackpot.wav");
		jackpot = getAudioClip(pad, "jackpot.wav");

		pad = Toets2.class.getResource("/Opdrachten/H14/Audio/Fruitmachine/slot-payoff.wav");
		win = getAudioClip(pad, "slot-payoff.wav");

		speelKnop = new Button("Speel");
		speelKnop.addActionListener( new SpeelKnopListener() );
		add(speelKnop);

		koopKnop = new Button("Koop 10 kredietpunten");
		koopKnop.addActionListener( new KoopKnopListener() );
		add(koopKnop);
		koopKnop.setEnabled(false);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		g.drawString("Krediet: " + krediet, 50, 270);
		if (gewonnen == true) {
			g.drawString("Gewonnen: " + punten + " punten!", 50, 290);
		}
		g.drawImage(afbeeldingFruit1, 50, 50, 100, 200, this);
		g.drawImage(afbeeldingFruit2, 150, 50, 100, 200, this);
		g.drawImage(afbeeldingFruit3, 250, 50, 100, 200, this);
	}

	class SpeelKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			gewonnen = false;
			punten = 0;

			double randomFruit1 = Math.random();
			int speel1 = (int) (randomFruit1 * 20 + 1);
			pad = Toets2.class.getResource("/Opdrachten/H14/img/Fruitplaatjes/fruit_" + speel1 + ".jpg");
			afbeeldingFruit1 = getImage(pad, "fruit_"+ speel1 +".jpg");

			double randomFruit2 = Math.random();
			int speel2 = (int) (randomFruit2 * 20 + 1);
			pad = Toets2.class.getResource("/Opdrachten/H14/img/Fruitplaatjes/fruit_" + speel2 + ".jpg");
			afbeeldingFruit2 = getImage(pad, "fruit_"+ speel2 +".jpg");

			double randomFruit3 = Math.random();
			int speel3 = (int) (randomFruit3 * 20 + 1);
			pad = Toets2.class.getResource("/Opdrachten/H14/img/Fruitplaatjes/fruit_" + speel3 + ".jpg");
			afbeeldingFruit3 = getImage(pad, "fruit_"+ speel3 +".jpg");

			if (afbeeldingFruit1 == afbeeldingFruit2 && afbeeldingFruit2 == afbeeldingFruit3) {
				punten = 20;
				krediet += 20;
				gewonnen = true;
				win.play();
			}
			if (afbeeldingFruit1 == afbeeldingFruit2 || afbeeldingFruit1 == afbeeldingFruit3 || afbeeldingFruit2 == afbeeldingFruit3) {
				punten = 4;
				krediet += 4;
				gewonnen = true;
				jackpot.play();
			}
			if (krediet > 1) {
				krediet--;
			} else {
				krediet = 0;
				speelKnop.setEnabled(false);
				koopKnop.setEnabled(true);
			}
			repaint();
		}
	}

	class KoopKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			if (krediet == 0) {
				krediet += 10;
				speelKnop.setEnabled(true);
				koopKnop.setEnabled(false);
			}
			repaint();
		}
	}
}