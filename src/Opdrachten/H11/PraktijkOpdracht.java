// Hoofdstuk 11
package Opdrachten.H11;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam PraktijkOpdracht van het type Applet.
@SuppressWarnings("serial")
public class PraktijkOpdracht extends Applet {
	TextField tekstvak;
	String tafelfout, tafel, error;
	Label label;
	Button okKnop;
	int getal, cijfer, y;
	boolean geklikt, foutmelding;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		tafelfout = "";
		geklikt = false;
		cijfer = 0;
		getal = 0;
		setSize(600, 500);
		label = new Label("Voer de tafel in");
		add(label);
		tekstvak = new TextField("", 20);
		add(tekstvak);
		okKnop = new Button("Ok");
		okKnop.addActionListener(new OkListener());
		add(okKnop);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		if (geklikt == true) {
			if (foutmelding == false) {
				y = 60;
				for (int i = 1; i <= 10; i++) {
					y += 20;
					tafel = cijfer * i + "";
					g.drawString("Tafel van " + i + " X " + cijfer + " = " + tafel, 50, y);
				}
			} else {
				g.drawString("" + error, 50, 60);
				foutmelding = false;
			}
		}
	}

	class OkListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				cijfer = Integer.parseInt(tekstvak.getText());
				if (cijfer >= 1 && cijfer <= 10) {
					getal = cijfer + getal;
					tekstvak.setText("");
				}
				geklikt = true;
				repaint();
			} catch (NumberFormatException exc) {
				foutmelding = true;
				geklikt = true;
				error = "De variable klopt niet.";
				tekstvak.setText("");
				repaint();
			}
		}
	}
}