// Hoofdstuk 13
package Opdrachten.H10;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht1 extends Applet {
	Button blauw, groen, rood, geel, paars;
	boolean gekliktBlauw, gekliktGroen, gekliktRood, gekliktGeel, gekliktPaars;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(400, 200);
		gekliktBlauw = false;
		gekliktGroen = false;
		gekliktRood = false;
		gekliktGeel = false;
		gekliktPaars = false;
		blauw = new Button("Blauw");
		blauw.addActionListener( new BlauwListener() );
		add(blauw);
		groen = new Button("Groen");
		groen.addActionListener( new GroenListener() );
		add(groen);
		rood = new Button("Rood");
		rood.addActionListener( new RoodListener() );
		add(rood);
		geel = new Button("Geel");
		geel.addActionListener( new GeelListener() );
		add(geel);
		paars = new Button("Paars");
		paars.addActionListener( new PaarsListener() );
		add(paars);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		setBackground(Color.BLACK);
		if (gekliktBlauw) {
			g.setColor(Color.BLUE);
			g.drawString("Blauw",  50, 60);
			gekliktBlauw = false;
		} else {
			blauw.setBackground(new Color(240, 240, 240));
		}
		if (gekliktGroen) {
			g.setColor(Color.GREEN);
			g.drawString("Groen",  50, 60);
			gekliktGroen = false;
		} else {
			groen.setBackground(new Color(240, 240, 240));
		}
		if (gekliktRood) {
			g.setColor(Color.RED);
			g.drawString("Rood",  50, 60);
			gekliktRood = false;
		} else {
			rood.setBackground(new Color(240, 240, 240));
		}
		if (gekliktGeel) {
			g.setColor(Color.YELLOW);
			g.drawString("Geel",  50, 60);
			gekliktGeel = false;
		} else {
			geel.setBackground(new Color(240, 240, 240));
		}
		if (gekliktPaars) {
			g.setColor(Color.MAGENTA);
			g.drawString("Paars",  50, 60);
			gekliktPaars = false;
		} else {
			paars.setBackground(new Color(240, 240, 240));
		}
	}

	class BlauwListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			blauw.setBackground(Color.BLUE);
			gekliktBlauw = true;
			repaint();
		}
	}

	class GroenListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			groen.setBackground(Color.GREEN);
			gekliktGroen = true;
			repaint();
		}
	}

	class RoodListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			rood.setBackground(Color.RED);
			gekliktRood = true;
			repaint();
		}
	}

	class GeelListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			geel.setBackground(Color.YELLOW);
			gekliktGeel = true;
			repaint();
		}
	}

	class PaarsListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			paars.setBackground(Color.MAGENTA);
			gekliktPaars = true;
			repaint();
		}
	}
}