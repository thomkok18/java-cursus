// Hoofdstuk 8
package Opdrachten.Java.H8;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam PraktijkOpdracht van het type Applet.
@SuppressWarnings("serial")
public class Toets extends Applet {
	Button frisKnop, bierKnop, wijnKnop, koffieKnop, binDistKnop, buitDistKnop, nieuweBestelligKnop;
	double bedrag, bestellingswaarde, dagomzet;
	int frisBestelling, bierBestelling, wijnBestelling, koffieBestelling, binDistBestelling, buitDistBestelling;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(400, 300);
		frisBestelling = 0;
		bierBestelling = 0;
		wijnBestelling = 0;
		koffieBestelling = 0;
		binDistBestelling = 0;
		buitDistBestelling = 0;
		frisKnop = new Button("Fris");
		frisKnop.addActionListener( new FrisKnopListener() );
		add(frisKnop);
		bierKnop = new Button("Bier");
		bierKnop.addActionListener( new BierKnopListener() );
		add(bierKnop);
		wijnKnop = new Button("Wijn");
		wijnKnop.addActionListener( new WijnKnopListener() );
		add(wijnKnop);
		koffieKnop = new Button("Koffie");
		koffieKnop.addActionListener( new KoffieKnopListener() );
		add(koffieKnop);
		binDistKnop = new Button("BinDist");
		binDistKnop.addActionListener( new BinDistKnopListener() );
		add(binDistKnop);
		buitDistKnop = new Button("BuitDist");
		buitDistKnop.addActionListener( new BuitDistKnopListener() );
		add(buitDistKnop);
		nieuweBestelligKnop = new Button("Nieuwe Bestelling");
		nieuweBestelligKnop.addActionListener( new NieuweBestelligKnopListener() );
		add(nieuweBestelligKnop);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		g.drawString("Aantal fris: " + frisBestelling, 50, 80 );
		g.drawString("Aantal bier: " + bierBestelling, 50, 100 );
		g.drawString("Aantal wijn: " + wijnBestelling, 50, 120 );
		g.drawString("Aantal koffie: " + koffieBestelling, 50, 140 );
		g.drawString("Aantal BinDist: " + binDistBestelling, 50, 160 );
		g.drawString("Aantal BuitDist: " + buitDistBestelling, 50, 180 );
		g.drawString("Bestelling totaal: " + String.format("€ %.2f", bestellingswaarde), 50, 200 );
		g.drawString("Totaal dagomzet: " + String.format("€ %.2f", dagomzet), 50, 220 );
	}

	class FrisKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.00;
			frisBestelling++;
			bestellingswaarde = bedrag * frisBestelling;
			repaint();
		}
	}
	class BierKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.25;
			bierBestelling++;
			bestellingswaarde = bedrag * bierBestelling;
			repaint();
		}
	}
	class WijnKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.50;
			wijnBestelling++;
			bestellingswaarde = bedrag * wijnBestelling;
			repaint();
		}
	}
	class KoffieKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 1.75;
			koffieBestelling++;
			bestellingswaarde = bedrag * koffieBestelling;
			repaint();
		}
	}
	class BinDistKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.75;
			binDistBestelling++;
			bestellingswaarde = bedrag * binDistBestelling;
			repaint();
		}
	}
	class BuitDistKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 3.50;
			buitDistBestelling++;
			bestellingswaarde = bedrag * buitDistBestelling;
			repaint();
		}
	}
	class NieuweBestelligKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			dagomzet = bestellingswaarde + dagomzet;
			frisBestelling = 0;
			bierBestelling = 0;
			wijnBestelling = 0;
			koffieBestelling = 0;
			binDistBestelling = 0;
			buitDistBestelling = 0;
			bestellingswaarde = 0;
			repaint();
		}
	}
}