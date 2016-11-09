// Hoofdstuk 8
package H8;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Knop van het type Applet.
@SuppressWarnings("serial")
public class Praktijkopdracht extends Applet {
	TextField tekstvak1;
	TextField tekstvak2;
	Button knop1;
	Button knop2;
	Button knop3;
	Button knop4;
	double getal1;
	double getal2;
	double antwoord;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		knop1 = new Button("*");
		knop1.addActionListener( new knop1Listener() );
		add(knop1);
		knop2 = new Button("/");
		knop2.addActionListener( new knop2Listener() );
		add(knop2);
		knop3 = new Button("+");
		knop3.addActionListener( new knop3Listener() );
		add(knop3);
		knop4 = new Button("-");
		knop4.addActionListener( new knop4Listener() );
		add(knop4);
		tekstvak1 = new TextField("", 20);
		add(tekstvak1);
		tekstvak2 = new TextField("", 20);
		add(tekstvak2);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
	}

	class knop1Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			getal1 = Double.parseDouble(tekstvak1.getText());
			getal2 = Double.parseDouble(tekstvak2.getText());
			antwoord = getal1 * getal2;
			tekstvak1.setText("" + antwoord);
			repaint();
		}
	}
	class knop2Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			getal1 = Double.parseDouble(tekstvak1.getText());
			getal2 = Double.parseDouble(tekstvak2.getText());
			antwoord = getal1 / getal2;
			tekstvak1.setText("" + antwoord);
		}
	}
	class knop3Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			getal1 = Double.parseDouble(tekstvak1.getText());
			getal2 = Double.parseDouble(tekstvak2.getText());
			antwoord = getal1 + getal2;
			tekstvak1.setText("" + antwoord);
		}
	}
	class knop4Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			getal1 = Double.parseDouble(tekstvak1.getText());
			getal2 = Double.parseDouble(tekstvak2.getText());
			antwoord = getal1 - getal2;
			tekstvak1.setText("" + antwoord);
		}
	}
}