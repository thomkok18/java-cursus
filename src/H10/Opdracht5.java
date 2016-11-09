// Hoofdstuk 10
package H10;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht5 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht5 extends Applet {
	TextField Tekstvak;
	String Tekst1, Tekst2, Tekst3;
	Button Knop;
	double getal, cijfer, gemiddelde;
	int teller;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(600, 500);
		Knop = new Button("Ok");
		Knop.addActionListener( new knop1Listener() );
		add(Knop);
		Tekstvak = new TextField("", 20);
		add(Tekstvak);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		g.drawString(Tekst1, 50, 60 );
		g.drawString(Tekst2, 50, 80 );
		g.drawString(Tekst3, 50, 100 );

	}

	class knop1Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			cijfer = Double.parseDouble(Tekstvak.getText());
			teller++;
			getal =  cijfer + getal;
			gemiddelde = getal / teller;
			Tekstvak.setText("");
			if (gemiddelde > 5.5){
				Tekst2 = gemiddelde + " Je bent geslaagd!";
			}
			if (gemiddelde < 5.5){
				Tekst2 = gemiddelde + " Je bent gezakt.";
			}
			if (cijfer > 5.5){
				Tekst1 = cijfer + " Voldoende";
			}
			if (cijfer < 5.5){
				Tekst1 = cijfer + " Onvoldoende";
			}
			if (cijfer > 10){
				cijfer = 10;
			}
			repaint();
		}
	}
}