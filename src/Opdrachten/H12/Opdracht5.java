// Hoofdstuk 12
package Opdrachten.Java.H12;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//Een klasse met de naam Opdracht4 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht5 extends Applet {
	boolean gevonden;
	int[] salaris = {100, 200, 500, 400, 300};
	int vind;
	Button okKnop;
	TextField tekstvak;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(300,100);
		vind = 0;
		gevonden = false;
		okKnop = new Button("Ok");
		add(okKnop);
		okKnop.addActionListener( new OkKnopListener());
		tekstvak = new TextField("", 10);
		add(tekstvak);
	}

	class OkKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			String getal = tekstvak.getText();
			vind = Integer.parseInt(getal);
			int index = 0;
			while(index < salaris.length) {
				if(salaris[index] == vind) {
					gevonden = true;
					break;
				}
				index ++;
			}
			tekstvak.setText("");
			repaint();
		}
	}


	public void paint(Graphics g) {
		if(gevonden) {
			g.drawString("De waarde " + vind + " is gevonden.", 20, 50);
			gevonden = false;
		}else {
			g.drawString("De waarde " + vind + " is niet gevonden.", 20, 50);
		}
	}
}