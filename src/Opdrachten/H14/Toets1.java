// Hoofdstuk 14
package Opdrachten.Java.H14;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Toets1 van het type Applet.
@SuppressWarnings("serial")
public class Toets1 extends Applet {
	Button frisbierKnop, wijnKnop, koffietheeKnop, binnenlandsgedistKnop, buitenlandsgedistKnop, nieuwebestellingKnop, bestellingafrondenKnop, totaleomzetKnop;
	int aantalFrisBier, aantalWijn, aantalKoffieThee, aantalBinnenlandsGedist, aantalBuitenlandsGedist, totaalFrisBier, totaalWijn, totaalKoffieThee, totaalbinnenlandsGedist, totaalBuitenlandsGedist;
	double bedrag, bestellingswaardeFrisBier, bestellingswaardeWijn, bestellingswaardeKoffieThee,bestellingswaardeBinnenlandsGedist, bestellingswaardeBuitenlandsGedist, bestelling, omzet;
	boolean drankKiezen, nieuweBestelling, frisBier, wijn, koffieThee, binnenlandsGedist, buitenlandsGedist, bestellingAfronden, totaleOmzet;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(500, 400);

		aantalFrisBier = 0;
		aantalWijn = 0;
		aantalKoffieThee = 0;
		aantalBinnenlandsGedist = 0;
		aantalBuitenlandsGedist = 0;
		bedrag = 0;
		bestellingswaardeFrisBier = 0;
		bestellingswaardeWijn = 0;
		bestellingswaardeKoffieThee = 0;
		bestellingswaardeBinnenlandsGedist = 0;
		bestellingswaardeBuitenlandsGedist = 0;
		bestelling = 0;
		omzet = 0;
		totaalFrisBier = 0;
		totaalWijn = 0;
		totaalKoffieThee = 0;
		totaalbinnenlandsGedist = 0;
		totaalBuitenlandsGedist = 0;

		drankKiezen = false;
		nieuweBestelling = false;
		frisBier = false;
		wijn = false;
		koffieThee = false;
		binnenlandsGedist = false;
		buitenlandsGedist = false;
		bestellingAfronden = false;
		totaleOmzet = false;

		frisbierKnop = new Button("Fris/Bier");
		frisbierKnop.addActionListener( new FrisbierListener() );
		add(frisbierKnop);

		wijnKnop = new Button("Wijn");
		wijnKnop.addActionListener( new WijnListener() );
		add(wijnKnop);

		koffietheeKnop = new Button("Koffie/Thee");
		koffietheeKnop.addActionListener( new KoffietheeListener() );
		add(koffietheeKnop);

		binnenlandsgedistKnop = new Button("Binnenlands gedist.");
		binnenlandsgedistKnop.addActionListener( new BinnenlandsgedistListener() );
		add(binnenlandsgedistKnop);

		buitenlandsgedistKnop = new Button("Buitenlands gedist.");
		buitenlandsgedistKnop.addActionListener( new BuitenlandsgedistListener() );
		add(buitenlandsgedistKnop);

		nieuwebestellingKnop = new Button("Nieuwe Bestelling");
		nieuwebestellingKnop.addActionListener( new NieuwebestellingListener() );
		add(nieuwebestellingKnop);

		bestellingafrondenKnop = new Button("Bestelling afronden");
		bestellingafrondenKnop.addActionListener( new BestellingafrondenListener() );
		add(bestellingafrondenKnop);

		totaleomzetKnop = new Button("Totale omzet");
		totaleomzetKnop.addActionListener( new TotaleomzetListener() );
		add(totaleomzetKnop);

		frisbierKnop.setEnabled(false);
		wijnKnop.setEnabled(false);
		koffietheeKnop.setEnabled(false);
		binnenlandsgedistKnop.setEnabled(false);
		buitenlandsgedistKnop.setEnabled(false);
		nieuwebestellingKnop.setEnabled(true);
		bestellingafrondenKnop.setEnabled(false);
		totaleomzetKnop.setEnabled(true);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		if (totaleOmzet) {
			g.drawString("Voer dranken in:", 50, 80);
			g.drawString("FrisBier: " + totaalFrisBier, 50, 100);
			g.drawString("Wijn: " + totaalWijn, 50, 120);
			g.drawString("Koffie/Thee: " + totaalKoffieThee, 50, 140);
			g.drawString("Binnenlandsgedist: " + totaalbinnenlandsGedist, 50, 160);
			g.drawString("Buitenlandsgedist: " + totaalBuitenlandsGedist, 50, 180);
			g.drawString("De totale omzet: " + omzet, 50, 200);
		}
		if (bestellingAfronden) {
			if (frisBier) {
				g.drawString("Fris/Bier: " + aantalFrisBier, 50, 100);
			}
			if (wijn) {
				g.drawString("Wijn: " + aantalWijn, 50, 120);
			}
			if (koffieThee) {
				g.drawString("Koffie/Thee: " + aantalKoffieThee, 50, 140);
			}
			if (binnenlandsGedist) {
				g.drawString("binnenlandsGedist: " + aantalBinnenlandsGedist, 50, 160);
			}
			if (buitenlandsGedist) {
				g.drawString("BuitenlandsGedist: " + aantalBuitenlandsGedist, 50, 180);
			}
			g.drawString("Het bedrag van je bestelling: " + bestelling, 50, 200);
		}
		if (nieuweBestelling) {
			g.drawString("Voer dranken in:", 50, 80);
			g.drawString("FrisBier: " + aantalFrisBier, 50, 100);
			g.drawString("Wijn: " + aantalWijn, 50, 120);
			g.drawString("Koffie/Thee: " + aantalKoffieThee, 50, 140);
			g.drawString("Binnenlandsgedist: " + aantalBinnenlandsGedist, 50, 160);
			g.drawString("Buitenlandsgedist: " + aantalBuitenlandsGedist, 50, 180);
			g.drawString("Totale bedrag van je bestelling: " + bestelling, 50, 200);
		}
	}

	class FrisbierListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			aantalFrisBier++;
			bedrag = 2.00;
			frisBier = true;
			bestellingswaardeFrisBier = aantalFrisBier * bedrag;
			bestelling = bestellingswaardeFrisBier + bestellingswaardeWijn + bestellingswaardeKoffieThee + bestellingswaardeBinnenlandsGedist + bestellingswaardeBuitenlandsGedist;
			repaint();
		}
	}

	class WijnListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			aantalWijn++;
			bedrag = 2.50;
			wijn = true;
			bestellingswaardeWijn = aantalWijn * bedrag;
			bestelling = bestellingswaardeFrisBier + bestellingswaardeWijn + bestellingswaardeKoffieThee + bestellingswaardeBinnenlandsGedist + bestellingswaardeBuitenlandsGedist;
			repaint();
		}
	}

	class KoffietheeListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			aantalKoffieThee++;
			bedrag = 1.75;
			koffieThee = true;
			bestellingswaardeKoffieThee = aantalKoffieThee * bedrag;
			bestelling = bestellingswaardeFrisBier + bestellingswaardeWijn + bestellingswaardeKoffieThee + bestellingswaardeBinnenlandsGedist + bestellingswaardeBuitenlandsGedist;
			repaint();
		}
	}

	class BinnenlandsgedistListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			aantalBinnenlandsGedist++;
			bedrag = 2.75;
			binnenlandsGedist = true;
			bestellingswaardeBinnenlandsGedist = aantalBinnenlandsGedist * bedrag;
			bestelling = bestellingswaardeFrisBier + bestellingswaardeWijn + bestellingswaardeKoffieThee + bestellingswaardeBinnenlandsGedist + bestellingswaardeBuitenlandsGedist;
			repaint();
		}
	}
	class BuitenlandsgedistListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			aantalBuitenlandsGedist++;
			bedrag = 3.50;
			buitenlandsGedist = true;
			bestellingswaardeBuitenlandsGedist = aantalBuitenlandsGedist * bedrag;
			bestelling = bestellingswaardeFrisBier + bestellingswaardeWijn + bestellingswaardeKoffieThee + bestellingswaardeBinnenlandsGedist + bestellingswaardeBuitenlandsGedist;
			repaint();
		}
	}

	class NieuwebestellingListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 0;
			aantalFrisBier = 0;
			aantalWijn = 0;
			aantalKoffieThee = 0;
			aantalBinnenlandsGedist = 0;
			aantalBuitenlandsGedist = 0;
			bestellingswaardeFrisBier = 0;
			bestellingswaardeWijn = 0;
			bestellingswaardeKoffieThee = 0;
			bestellingswaardeBinnenlandsGedist = 0;
			bestellingswaardeBuitenlandsGedist = 0;
			bestelling = 0;

			frisBier = false;
			wijn = false;
			koffieThee = false;
			binnenlandsGedist = false;
			buitenlandsGedist = false;

			nieuweBestelling = true;
			bestellingAfronden = false;
			totaleOmzet = false;

			frisbierKnop.setEnabled(true);
			wijnKnop.setEnabled(true);
			koffietheeKnop.setEnabled(true);
			binnenlandsgedistKnop.setEnabled(true);
			buitenlandsgedistKnop.setEnabled(true);
			nieuwebestellingKnop.setEnabled(false);
			bestellingafrondenKnop.setEnabled(true);
			totaleomzetKnop.setEnabled(false);
			repaint();
		}
	}

	class BestellingafrondenListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			nieuweBestelling = false;
			bestellingAfronden = true;
			totaleOmzet = false;

			totaalFrisBier = aantalFrisBier + totaalFrisBier;
			totaalWijn = aantalWijn + totaalWijn;
			totaalKoffieThee = aantalKoffieThee + totaalKoffieThee;
			totaalbinnenlandsGedist = aantalBinnenlandsGedist + totaalbinnenlandsGedist;
			totaalBuitenlandsGedist = aantalBuitenlandsGedist + totaalBuitenlandsGedist;
			omzet = bestelling + omzet;

			frisbierKnop.setEnabled(false);
			wijnKnop.setEnabled(false);
			koffietheeKnop.setEnabled(false);
			binnenlandsgedistKnop.setEnabled(false);
			buitenlandsgedistKnop.setEnabled(false);
			nieuwebestellingKnop.setEnabled(true);
			bestellingafrondenKnop.setEnabled(false);
			totaleomzetKnop.setEnabled(true);
			repaint();
		}
	}

	class TotaleomzetListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			nieuweBestelling = false;
			bestellingAfronden = false;
			totaleOmzet = true;

			totaleomzetKnop.setEnabled(false);
			repaint();
		}
	}
}