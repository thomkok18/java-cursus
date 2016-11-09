// Hoofdstuk 8
package H8;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Praktijkopdracht van het type Applet.
@SuppressWarnings("serial")
public class Toets2 extends Applet {
	Button knop1;
	Button knop2; 
	Button knop3;
	Button knop4;
	Button knop5;
	Button knop6;
	Button knop7;
	double bedrag, teller = 1, bestellingswaarde, dagomzet;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(400, 500);
		knop1 = new Button("Fris");
		knop1.addActionListener( new knop1Listener() );
		add(knop1);
		knop2 = new Button("Bier");
		knop2.addActionListener( new knop2Listener() );
		add(knop2);
		knop3 = new Button("Wijn");
		knop3.addActionListener( new knop3Listener() );
		add(knop3);
		knop4 = new Button("Koffie");
		knop4.addActionListener( new knop4Listener() );
		add(knop4);
		knop5 = new Button("BinDist");
		knop5.addActionListener( new knop5Listener() );
		add(knop5);
		knop6 = new Button("BuitDist");
		knop6.addActionListener( new knop6Listener() );
		add(knop6);
		knop7 = new Button("Nieuwe Bestelling");
		knop7.addActionListener( new knop7Listener() );
		add(knop7);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		g.drawString("Bestelling totaal: " + String.format("%.2f", bestellingswaarde), 50, 100);
		g.drawString("Totaal dagomzet: " + String.format("%.2f", dagomzet), 50, 120 );
	}

	class knop1Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.00;
			bestellingswaarde = bedrag * teller++;
			repaint();
		}
	}
	class knop2Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.25;
			bestellingswaarde = bedrag * teller++;
			repaint();
		}
	}
	class knop3Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.50;
			bestellingswaarde = bedrag * teller++;
			repaint();
		}
	}
	class knop4Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 1.75;
			bestellingswaarde = bedrag * teller++;
			repaint();
		}
	}
	class knop5Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.75;
			bestellingswaarde = bedrag * teller++;
			repaint();
		}
	}
	class knop6Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 3.50;
			bestellingswaarde = bedrag * teller++;
			repaint();
		}
	}
	class knop7Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			teller = 1;
			bestellingswaarde = bedrag * teller++;
			dagomzet = bestellingswaarde + dagomzet;
			bestellingswaarde = 0;
			teller = 1;
			repaint();
		}
	}
}