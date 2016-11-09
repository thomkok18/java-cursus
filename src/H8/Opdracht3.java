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
	Button knop1;
	String s;
	double BTW ;
	double BTWuitkomst;
	int a;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		a = 0;
		BTW= 1.19;
		label = new Label("Inclusief BTW");
		add(label);
		knop1 = new Button("Ok");
		knop1.addActionListener( new knop1Listener() );
		add(knop1);
		tekstvak = new TextField("", 20);
		add(tekstvak);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		g.drawString("Exclusief BTW: " + BTWuitkomst, 50, 60 );
	}

	class knop1Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			s = tekstvak.getText();
			a = Integer.parseInt(s);
			BTWuitkomst = a * BTW;
			repaint();
		}
	}
}