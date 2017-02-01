// Hoofdstuk 12
package Opdrachten.Java.H12;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//Een klasse met de naam PraktijkOpdracht van het type Applet.
@SuppressWarnings("serial")
public class PraktijkOpdracht extends Applet {
	int index, i;
	Button okKnop;
	TextField naamTekstvak, telefoonTekstvak;
	String voornaamArray[], telefoonArray[], error;
	Label voornaamLabel, telefoonnummerLabel;
	boolean foutmelding;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(700, 300);
		error = "";
		foutmelding = false;
		index = 0;
		i = 0;
		voornaamArray = new String[10];
		telefoonArray = new String[10];
		voornaamLabel = new Label("Vul uw voornaam in");
		add(voornaamLabel);
		naamTekstvak = new TextField("", 20);
		add(naamTekstvak);
		telefoonnummerLabel = new Label("Vul uw telefoonnummer in");
		add(telefoonnummerLabel);
		telefoonTekstvak = new TextField("", 20);
		add(telefoonTekstvak);
		okKnop = new Button("Ok");
		add(okKnop);
		okKnop.addActionListener(new OkKnopListener());
	}

	class OkKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			voornaamArray[index] = naamTekstvak.getText();
			telefoonArray[index] = telefoonTekstvak.getText();
			if (!voornaamArray[index].equals("") && !telefoonArray[index].equals("")) {
				if (index == 10) {
					for (i = 0; i < voornaamArray.length; i++) {
						voornaamArray[i] = "";
					}
					for (i = 0; i < telefoonArray.length; i++) {
						voornaamArray[i] = "";
					}
				}
				index++;
			}
			else {
				foutmelding = true;
				error = "Vul voornaam en telefoonnummer in.";
			}
			naamTekstvak.setText("");
			telefoonTekstvak.setText("");
			repaint();
		}
	}

	public void paint(Graphics g) {
		int y = 30;
		if (foutmelding == false) {
			if (index < 10) {
				g.drawString("Aantal ingevoerd: " + index + "/10", 50, 50);
			}
			if (index == 10) {
				for (int i = 0; i < index; i++) {
					y += 20;
					g.drawString("Voornaam: " + voornaamArray[i] + "     " + "Telefoonnummer: " + telefoonArray[i], 50, y);
				}
				index = 0;
			}
		} else {
			g.drawString("Aantal ingevoerd: " + index + "/10", 50, 50);
			g.drawString("" + error, 50, 70);
			foutmelding = false;
		}
	}
}