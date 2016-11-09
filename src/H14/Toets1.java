// Hoofdstuk 14
package H14;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Toets1 van het type Applet.
@SuppressWarnings("serial")
public class Toets1 extends Applet {
	Button frisbierKnop, wijnKnop, koffietheeKnop, binnenlandsgedistKnop, buitenlandsgedistKnop, nieuwebestellingKnop, bestellingafrondenKnop, totaleomzetKnop;
	double bedrag, aantalGeklikt = 1, bestellingswaarde, productwaarde;
	int frisBier = 0, totaalFrisBier = 0;
	boolean nieuweBestelling, extraBestelling, drankKiezen, aantalFrisBier;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(500, 400);
		frisBier = 0;
		aantalFrisBier = false;
		nieuweBestelling = false;
		extraBestelling = false;
		drankKiezen = false;

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
		if (drankKiezen) {
			g.drawString("Fris/Bier: " + frisBier, 50, 100);
		}
		if (nieuweBestelling == false) {
			g.drawString("Maak een keuze", 50, 80);
		}
		if (extraBestelling) {
			g.drawString("Maak een keuze", 50, 80);
			g.drawString("Totaal Bedrag: " + productwaarde, 50, 140 );
			g.drawString("Totaal Bestellingsbedrag: " + bestellingswaarde, 50, 120 );
		}
		if (nieuweBestelling) {
			g.drawString("Totaal Bedrag: " + productwaarde, 50, 140 );
			g.drawString("Totaal Bestellingsbedrag: " + bestellingswaarde, 50, 120 );
		}
		if (drankKiezen) {
			g.drawString("Voer dranken in", 50, 80);
		}
	}

	class FrisbierListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			frisBier++;
			bedrag = 2.00;
			bestellingswaarde = bedrag * aantalGeklikt++;
			repaint();
		}
	}

	class WijnListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.50;
			bestellingswaarde = bedrag * aantalGeklikt++;
			repaint();
		}
	}

	class KoffietheeListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 1.75;
			bestellingswaarde = bedrag * aantalGeklikt++;
			repaint();
		}
	}

	class BinnenlandsgedistListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.75;
			bestellingswaarde = bedrag * aantalGeklikt++;
			repaint();
		}
	}
	class BuitenlandsgedistListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 3.50;
			bestellingswaarde = bedrag * aantalGeklikt++;
			repaint();
		}
	}

	class NieuwebestellingListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 0;
			aantalFrisBier = false;
			nieuweBestelling = true;
			drankKiezen = true;
			extraBestelling = false;
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
			aantalGeklikt = 1;
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
			productwaarde = bedrag * aantalGeklikt;
			productwaarde += bestellingswaarde;
			frisBier = 0;
			aantalGeklikt = 1;
			repaint();
		}
	}

	class TotaleomzetListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			aantalFrisBier = true;
			drankKiezen = false;
			nieuweBestelling = false;
			extraBestelling = false;
			nieuweBestelling = false;
			drankKiezen = false;

			productwaarde = bedrag * aantalGeklikt;
			bestellingswaarde = bestellingswaarde + productwaarde;
			bestellingswaarde = 0;
			aantalGeklikt = 1;
			repaint();
		}
	}
}