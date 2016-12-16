// Hoofdstuk 14
package Opdrachten.H14;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Toets1 van het type Applet.
@SuppressWarnings("serial")
public class Toets1 extends Applet {
	Button frisbierKnop, wijnKnop, koffietheeKnop, binnenlandsgedistKnop, buitenlandsgedistKnop, nieuwebestellingKnop, bestellingafrondenKnop, totaleomzetKnop;
	double bedrag, aantalGeklikt, bestellingswaarde, productwaarde;
	int frisBier,wijn, koffieThee, binnelandsGedist , buitenlandsGedist, totaalFrisBier, totaalWijn, totaalKoffieThee, totaalBinnelandsGedist, totaalBuitenlandsGedist;
	boolean nieuweBestelling, extraBestelling, drankKiezen, aantalFrisBier, aantalWijn, aantalKoffieThee, aantalBinnenlandsGedist, aantalBuitenlandsGedist, totaleomzet;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(500, 400);
		aantalGeklikt = 0;
		frisBier = 0;
		wijn = 0;
		koffieThee = 0;
		binnelandsGedist = 0;
		buitenlandsGedist = 0;

		totaalFrisBier = 0;
		totaalWijn = 0;
		totaalKoffieThee = 0;
		totaalBinnelandsGedist = 0;
		totaalBuitenlandsGedist = 0;

		aantalFrisBier = false;
		aantalWijn = false;
		aantalKoffieThee = false;
		aantalBinnenlandsGedist = false;
		aantalBuitenlandsGedist = false;

		nieuweBestelling = false;
		extraBestelling = false;
		drankKiezen = false;
		totaleomzet = false;

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
		if (aantalFrisBier) {
			g.drawString("Fris/Bier: " + totaalFrisBier, 50, 100);
		}
		if (aantalWijn) {
			g.drawString("Wijn: " + totaalWijn, 50, 120);
		}
		if (aantalKoffieThee) {
			g.drawString("Koffie/Thee: " + totaalKoffieThee, 50, 140);
		}
		if (aantalBinnenlandsGedist) {
			g.drawString("BinnelandsGedist: " + totaalBinnelandsGedist, 50, 160);
		}
		if (aantalBuitenlandsGedist) {
			g.drawString("BuitenlandsGedist: " + totaalBuitenlandsGedist, 50, 180);
		}
		if (drankKiezen) {
			g.drawString("Fris/Bier: " + frisBier, 50, 100);
			g.drawString("Wijn: " + wijn, 50, 120);
			g.drawString("Koffie/Thee: " + frisBier, 50, 140);
			g.drawString("BinnenlandsGedist: " + binnelandsGedist, 50, 160);
			g.drawString("BuitenlandsGedist: " + buitenlandsGedist, 50, 180);
		}
		if (totaleomzet) {
			g.drawString("Totaal aantal producten verkocht.", 50, 80);
		}
		if (extraBestelling) {
			g.drawString("Maak een keuze", 50, 80);
			g.drawString("Totaal Bedrag: " + productwaarde, 50, 140 );
			g.drawString("Totaal Bestellingsbedrag: " + bestellingswaarde, 50, 120 );
		}
		if (nieuweBestelling) {
			g.drawString("Totaal Bedrag: " + productwaarde, 50, 200 );
			g.drawString("Totaal Bestellingsbedrag: " + bestellingswaarde, 50, 220 );
		}
		if (drankKiezen) {
			g.drawString("Voer dranken in", 50, 80);
		}
	}

	class FrisbierListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			aantalGeklikt++;
			frisBier++;
			bedrag = 2.00;
			bestellingswaarde = bedrag * aantalGeklikt;
			repaint();
		}
	}

	class WijnListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			aantalGeklikt++;
			wijn++;
			bedrag = 2.50;
			bestellingswaarde = bedrag * aantalGeklikt;
			repaint();
		}
	}

	class KoffietheeListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			aantalGeklikt++;
			koffieThee++;
			bedrag = 1.75;
			bestellingswaarde = bedrag * aantalGeklikt;
			repaint();
		}
	}

	class BinnenlandsgedistListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			aantalGeklikt++;
			binnelandsGedist++;
			bedrag = 2.75;
			bestellingswaarde = bedrag * aantalGeklikt;
			repaint();
		}
	}
	class BuitenlandsgedistListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			aantalGeklikt++;
			buitenlandsGedist++;
			bedrag = 3.50;
			bestellingswaarde = bedrag * aantalGeklikt;
			repaint();
		}
	}

	class NieuwebestellingListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 0;
			frisBier = 0;
			wijn = 0;
			koffieThee = 0;
			binnelandsGedist = 0;
			buitenlandsGedist = 0;

			aantalFrisBier = false;
			aantalWijn = false;
			aantalKoffieThee = false;
			aantalBinnenlandsGedist = false;
			aantalBuitenlandsGedist = false;

			nieuweBestelling = true;
			drankKiezen = true;
			extraBestelling = false;
			totaleomzet = false;

			frisbierKnop.setEnabled(true);
			wijnKnop.setEnabled(true);
			koffietheeKnop.setEnabled(true);
			binnenlandsgedistKnop.setEnabled(true);
			buitenlandsgedistKnop.setEnabled(true);
			nieuwebestellingKnop.setEnabled(false);
			bestellingafrondenKnop.setEnabled(true);
			totaleomzetKnop.setEnabled(false);

			bestellingswaarde = bedrag * aantalGeklikt;
			productwaarde = bestellingswaarde + productwaarde;
			bestellingswaarde = 0;
			aantalGeklikt = 0;
			repaint();
		}
	}

	class BestellingafrondenListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			extraBestelling = true;
			drankKiezen = false;
			nieuweBestelling = false;

			frisbierKnop.setEnabled(false);
			wijnKnop.setEnabled(false);
			koffietheeKnop.setEnabled(false);
			binnenlandsgedistKnop.setEnabled(false);
			buitenlandsgedistKnop.setEnabled(false);
			nieuwebestellingKnop.setEnabled(true);
			bestellingafrondenKnop.setEnabled(false);
			totaleomzetKnop.setEnabled(true);

			totaalFrisBier = frisBier + frisBier;
			totaalWijn = wijn + wijn;
			totaalKoffieThee = koffieThee + koffieThee;
			totaalBinnelandsGedist = binnelandsGedist + binnelandsGedist;
			totaalBuitenlandsGedist = buitenlandsGedist + buitenlandsGedist;

			productwaarde = bedrag * aantalGeklikt;
			productwaarde += bestellingswaarde;
			aantalGeklikt = 0;
			repaint();
		}
	}

	class TotaleomzetListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			totaleomzet = true;
			aantalFrisBier = true;
			aantalWijn = true;
			aantalKoffieThee = true;
			aantalBinnenlandsGedist = true;
			aantalBuitenlandsGedist = true;

			drankKiezen = false;
			nieuweBestelling = false;
			extraBestelling = false;
			nieuweBestelling = false;

			productwaarde = bedrag * aantalGeklikt;
			bestellingswaarde = bestellingswaarde + productwaarde;
			bestellingswaarde = 0;
			aantalGeklikt = 0;
			repaint();
		}
	}
}