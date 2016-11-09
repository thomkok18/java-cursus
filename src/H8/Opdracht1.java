// Hoofdstuk 8
package H8;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht1 extends Applet {
	TextField tekstvak;
	Button knop, knop2;
	Label label;
	String s;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		tekstvak = new TextField("", 30);
		label = new Label("Tekst");
		add(label);
		knop = new Button("Ok");
		knop.addActionListener( new knopListener() );
		add(knop);
		knop2 = new Button("Reset");
		knop2.addActionListener( new knop2Listener() );
		add(tekstvak);
		add(knop2);
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawString(s, 50, 60 );
	}

	class knopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			s = tekstvak.getText();
			repaint();
		}
	}

	class knop2Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			s = ("");
			repaint();
		}
	}
}