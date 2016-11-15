// Hoofdstuk 10
package H10;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam PraktijkOpdracht van het type Applet.
@SuppressWarnings("serial")
public class PraktijkOpdracht extends Applet {
	TextField tekstvak;
	String beoordeling;
	Label label;
	Button okKnop;
	double getal, cijfer;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		beoordeling = "";
		setSize(600, 500);
		label = new Label("Voer je behaalde cijfer in");
		add(label);
		okKnop = new Button("Ok");
		okKnop.addActionListener( new OkKnopListener() );
		add(okKnop);
		tekstvak = new TextField("", 20);
		add(tekstvak);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		g.drawString(beoordeling, 50, 60 );

	}

	class OkKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			cijfer = Double.parseDouble(tekstvak.getText());
			if (cijfer >= 1 && cijfer <= 10){
				getal =  cijfer + getal;
				tekstvak.setText("");
				if (cijfer <= 3){
					beoordeling = cijfer + " Slecht";
				}
				if (cijfer >= 4){
					beoordeling = cijfer + " Onvoldoende";
				}
				if (cijfer >= 5){
					beoordeling = cijfer + " Matig";
				}
				if (cijfer >= 6){
					beoordeling = cijfer + " Voldoende";
				}
				if (cijfer >= 8){
					beoordeling = cijfer + " Goed";
				}
			} else { 
				beoordeling = "Vul een goed cijfer in.";
				tekstvak.setText("");
			}
			repaint();
		}
	}
}