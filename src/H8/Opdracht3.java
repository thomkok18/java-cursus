// Hoofdstuk 8
package H8;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht3 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht3 extends Applet {
	TextField tekstvak;
	Label label;
	Button okKnop;
	String string;
	double btw ,btwUitkomst;
	int ingevoerdGetal;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		ingevoerdGetal = 0;
		btw = 0.21;
		label = new Label("Inclusief BTW");
		add(label);
		okKnop = new Button("Ok");
		okKnop.addActionListener( new OkKnopListener() );
		add(okKnop);
		tekstvak = new TextField("", 20);
		add(tekstvak);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		g.drawString("Exclusief BTW: " + btwUitkomst, 50, 60 );
	}

	class OkKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			string = tekstvak.getText();
			ingevoerdGetal = Integer.parseInt(string);
			btwUitkomst = ingevoerdGetal * btw;
			tekstvak.setText("");
			repaint();
		}
	}
}