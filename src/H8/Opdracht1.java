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
	Button okKnop, resetKnop;
	Label label;
	String string;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		tekstvak = new TextField("", 30);
		label = new Label("Tekst");
		add(label);
		okKnop = new Button("Ok");
		okKnop.addActionListener( new OkKnopListener() );
		add(okKnop);
		resetKnop = new Button("Reset");
		resetKnop.addActionListener( new ResetKnopListener() );
		add(tekstvak);
		add(resetKnop);
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawString(string, 50, 60 );
	}

	class OkKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			string = tekstvak.getText();
			repaint();
		}
	}

	class ResetKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			string = ("");
			tekstvak.setText("");
			repaint();
		}
	}
}