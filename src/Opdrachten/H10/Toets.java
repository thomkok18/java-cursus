// Hoofdstuk 10
package Opdrachten.H10;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Toets van het type Applet.
@SuppressWarnings("serial")
public class Toets extends Applet {
	TextField tekstvak;
	int london, newyork, tokyo, sydney, cijfer;
	Label label;
	Button tijdenKnop;
	boolean foutmelding;
	String error;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		london = 0;
		newyork = 0;
		tokyo = 0;
		sydney = 0;
		cijfer = 0;
		cijfer = 0;
		error = "";
		setSize(400, 500);
		label = new Label("Voer een uur in");
		add(label);
		tijdenKnop = new Button("Toon tijden");
		tijdenKnop.addActionListener( new TijdenKnopListener() );
		add(tijdenKnop);
		tekstvak = new TextField("", 5);
		add(tekstvak);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		if (foutmelding == false) {
			g.drawString("Tijd in London: " + london + ":00", 50, 60);
			g.drawString("Tijd in New York: " + newyork + ":00", 50, 80);
			g.drawString("Tijd in Tokyo: " + tokyo + ":00", 50, 100);
			g.drawString("Tijd in Sydney: " + sydney + ":00", 50, 120);
		}
		if (foutmelding == true) {
			g.drawString("" + error, 50, 60);
			foutmelding = false;
		}
	}

	class TijdenKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			cijfer = Integer.parseInt(tekstvak.getText());
			if(cijfer <= 24 && cijfer >= 0){
				london = cijfer - 1;
				newyork = cijfer - 5;
				tokyo = cijfer + 9;
				sydney = cijfer + 12;
				if (cijfer <= 0){
					london += 24;
				}
				if (cijfer <= 4){
					newyork += 24;
				}
				if (tokyo >= 24){
					tokyo -= 24;
				}
				if (sydney >= 24){
					sydney -= 24;
				}
			} else {
				foutmelding = true;
				error = "Voer een geldig getal in.";
			}
			tekstvak.setText("");
			repaint();
		}
	}
}