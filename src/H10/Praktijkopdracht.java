// Hoofdstuk 10
package H10;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Praktijkopdracht van het type Applet.
@SuppressWarnings("serial")
public class Praktijkopdracht extends Applet {
	TextField tekstvak;
	String sBeoordeling;
	Label label;
	Button knop;
	double getal, cijfer;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		sBeoordeling = "";
		setSize(600, 500);
		label = new Label("Voer je behaalde cijfer in");
		add (label);
		knop = new Button("Ok");
		knop.addActionListener( new knop1Listener() );
		add(knop);
		tekstvak = new TextField("", 20);
		add(tekstvak);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		g.drawString(sBeoordeling, 50, 60 );

	}

	class knop1Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			cijfer = Double.parseDouble(tekstvak.getText());
			if (cijfer >= 1 && cijfer <= 10){
				getal =  cijfer + getal;
				tekstvak.setText("");
				if (cijfer <= 3){
					sBeoordeling = cijfer + " Slecht";
				}
				if (cijfer >= 4){
					sBeoordeling = cijfer + " Onvoldoende";
				}
				if (cijfer >= 5.5){
					sBeoordeling = cijfer + " Matig";
				}
				if (cijfer >= 6){
					sBeoordeling = cijfer + " Voldoende";
				}
				if (cijfer >= 8){
					sBeoordeling = cijfer + " Goed";
				}
				if (cijfer > 10){
					cijfer = 10;
				}
			} else { 
				sBeoordeling = "Foute invoer";
				tekstvak.setText("");
			}
			repaint();
		}
	}
}