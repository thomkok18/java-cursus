// Hoofdstuk 8
package H8;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.DecimalFormat;

// Een klasse met de naam Praktijkopdracht van het type Applet.
@SuppressWarnings("serial")
public class Toets1 extends Applet {
	Button frisKnop, bierKnop, wijnKnop, koffieKnop, binDistKnop, buitDistKnop, nieuweBestelligKnop;
	double bedrag, bestellingswaarde, dagomzet;
	int frisBestelling, bierBestelling, wijnBestelling, koffieBestelling, binDistBestelling, buitDistBestelling, bestelling;

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
		frisKnop.addActionListener( new frisKnopListener() );
		add(frisKnop);
		bierKnop = new Button("Bier");
		bierKnop.addActionListener( new bierKnopListener() );
		add(bierKnop);
		wijnKnop = new Button("Wijn");
		wijnKnop.addActionListener( new wijnKnopListener() );
		add(wijnKnop);
		koffieKnop = new Button("Koffie");
		koffieKnop.addActionListener( new koffieKnopListener() );
		add(koffieKnop);
		binDistKnop = new Button("BinDist");
		binDistKnop.addActionListener( new binDistKnopListener() );
		add(binDistKnop);
		buitDistKnop = new Button("BuitDist");
		buitDistKnop.addActionListener( new buitDistKnopListener() );
		add(buitDistKnop);
		nieuweBestelligKnop = new Button("Nieuwe Bestelling");
		nieuweBestelligKnop.addActionListener( new nieuweBestelligKnopListener() );
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

	class frisKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.00;
			frisBestelling++;
			bestellingswaarde = bedrag * frisBestelling;
			repaint();
		}
	}
	class bierKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.25;
			bierBestelling++;
			bestellingswaarde = bedrag * bierBestelling;
			repaint();
		}
	}
	class wijnKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.50;
			wijnBestelling++;
			bestellingswaarde = bedrag * wijnBestelling;
			repaint();
		}
	}
	class koffieKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 1.75;
			koffieBestelling++;
			bestellingswaarde = bedrag * koffieBestelling;
			repaint();
		}
	}
	class binDistKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.75;
			binDistBestelling++;
			bestellingswaarde = bedrag * binDistBestelling;
			repaint();
		}
	}
	class buitDistKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 3.50;
			buitDistBestelling++;
			bestellingswaarde = bedrag * buitDistBestelling;
			repaint();
		}
	}
	class nieuweBestelligKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bestellingswaarde = bedrag * bestelling;
			dagomzet = bestellingswaarde + dagomzet;
			frisBestelling = 0;
			bierBestelling = 0;
			wijnBestelling = 0;
			koffieBestelling = 0;
			binDistBestelling = 0;
			buitDistBestelling = 0;
			bestellingswaarde = 0;
			bestelling = 0;
			repaint();
		}
	}
}

//Opmerking: krijg niet voor elkaar de teller op te lossen...