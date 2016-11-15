// Hoofdstuk 8
package H8;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Knop van het type Applet.
@SuppressWarnings("serial")
public class PraktijkOpdracht extends Applet {
	TextField tekstvak1, tekstvak2;
	Button keerKnop, deelKnop, plusKnop, minKnop;
	double invoerGetal1, invoerGetal2, antwoord;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(500, 100);
		keerKnop = new Button("*");
		keerKnop.addActionListener( new KeerKnopListener() );
		add(keerKnop);
		deelKnop = new Button("/");
		deelKnop.addActionListener( new DeelKnopListener() );
		add(deelKnop);
		plusKnop = new Button("+");
		plusKnop.addActionListener( new PlusKnopListener() );
		add(plusKnop);
		minKnop = new Button("-");
		minKnop.addActionListener( new MinKnopListener() );
		add(minKnop);
		tekstvak1 = new TextField("", 20);
		add(tekstvak1);
		tekstvak2 = new TextField("", 20);
		add(tekstvak2);
	}

	class KeerKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			invoerGetal1 = Double.parseDouble(tekstvak1.getText());
			invoerGetal2 = Double.parseDouble(tekstvak2.getText());
			antwoord = invoerGetal1 * invoerGetal2;
			tekstvak1.setText("" + antwoord);
			repaint();
		}
	}
	class DeelKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			invoerGetal1 = Double.parseDouble(tekstvak1.getText());
			invoerGetal2 = Double.parseDouble(tekstvak2.getText());
			antwoord = invoerGetal1 / invoerGetal2;
			tekstvak1.setText("" + antwoord);
		}
	}
	class PlusKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			invoerGetal1 = Double.parseDouble(tekstvak1.getText());
			invoerGetal2 = Double.parseDouble(tekstvak2.getText());
			antwoord = invoerGetal1 + invoerGetal2;
			tekstvak1.setText("" + antwoord);
		}
	}
	class MinKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			invoerGetal1 = Double.parseDouble(tekstvak1.getText());
			invoerGetal2 = Double.parseDouble(tekstvak2.getText());
			antwoord = invoerGetal1 - invoerGetal2;
			tekstvak1.setText("" + antwoord);
		}
	}
}