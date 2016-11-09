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
	String beoordeling, geslaagd;
	Button okKnop;
	double getal, cijfer, gemiddelde;
	int aantalCijfers;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(600, 500);
		okKnop = new Button("Ok");
		okKnop.addActionListener( new okKnopListener() );
		add(okKnop);
		Tekstvak = new TextField("", 20);
		add(Tekstvak);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		g.drawString(beoordeling, 50, 60 );
		g.drawString(geslaagd, 50, 80 );

	}

	class okKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			cijfer = Double.parseDouble(Tekstvak.getText());
			aantalCijfers++;
			getal =  cijfer + getal;
			gemiddelde = getal / aantalCijfers;
			Tekstvak.setText("");
			if (gemiddelde > 5.5){
				geslaagd = gemiddelde + " Je bent geslaagd!";
			}
			if (gemiddelde < 5.5){
				geslaagd = gemiddelde + " Je bent gezakt.";
			}
			if (cijfer > 5.5){
				beoordeling = cijfer + " Voldoende";
			}
			if (cijfer < 5.5){
				beoordeling = cijfer + " Onvoldoende";
			}
			if (cijfer > 10){
				cijfer = 10;
			}
			repaint();
		}
	}
}