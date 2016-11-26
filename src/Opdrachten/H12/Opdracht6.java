// Hoofdstuk 12
package Opdrachten.H12;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//Een klasse met de naam Opdracht4 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht6 extends Applet {
	boolean gevonden;
	int[] salaris = {100, 200, 500, 400, 300, 400, 500, 200, 400, 500};
	int vind, salarisaantal;
	Button okKnop;
	TextField tekstvak;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(400,200);
		salarisaantal = 0;
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
					salarisaantal ++;
				}
				index ++;
			}
			tekstvak.setText("");
			repaint();
		}
	}


	public void paint(Graphics g) {
		if(gevonden) {
			g.drawString("De waarde " + vind + " is " + salarisaantal + " keer gevonden.", 20, 50);
			gevonden = false;
			salarisaantal = 0;
		}else {
			g.drawString("De waarde " + vind + " is niet gevonden.", 20, 50);
		}
	}
}