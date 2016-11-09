// Hoofdstuk 8
package H8;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Knop van het type Applet.
@SuppressWarnings("serial")
public class Praktijkopdracht extends Applet {
	TextField tekstvak1, tekstvak2;
	Button keerKnop, deelKnop, plusKnop, minKnop;
	double invoerGetal1, invoerGetal2, antwoord;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(500, 100);
		keerKnop = new Button("*");
		keerKnop.addActionListener( new keerKnopListener() );
		add(keerKnop);
		deelKnop = new Button("/");
		deelKnop.addActionListener( new deelKnopListener() );
		add(deelKnop);
		plusKnop = new Button("+");
		plusKnop.addActionListener( new plusKnopListener() );
		add(plusKnop);
		minKnop = new Button("-");
		minKnop.addActionListener( new minKnopListener() );
		add(minKnop);
		tekstvak1 = new TextField("", 20);
		add(tekstvak1);
		tekstvak2 = new TextField("", 20);
		add(tekstvak2);
	}

	class keerKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			invoerGetal1 = Double.parseDouble(tekstvak1.getText());
			invoerGetal2 = Double.parseDouble(tekstvak2.getText());
			antwoord = invoerGetal1 * invoerGetal2;
			tekstvak1.setText("" + antwoord);
			repaint();
		}
	}
	class deelKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			invoerGetal1 = Double.parseDouble(tekstvak1.getText());
			invoerGetal2 = Double.parseDouble(tekstvak2.getText());
			antwoord = invoerGetal1 / invoerGetal2;
			tekstvak1.setText("" + antwoord);
		}
	}
	class plusKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			invoerGetal1 = Double.parseDouble(tekstvak1.getText());
			invoerGetal2 = Double.parseDouble(tekstvak2.getText());
			antwoord = invoerGetal1 + invoerGetal2;
			tekstvak1.setText("" + antwoord);
		}
	}
	class minKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			invoerGetal1 = Double.parseDouble(tekstvak1.getText());
			invoerGetal2 = Double.parseDouble(tekstvak2.getText());
			antwoord = invoerGetal1 - invoerGetal2;
			tekstvak1.setText("" + antwoord);
		}
	}
}