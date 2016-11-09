// Hoofdstuk 12
package H12;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht2 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht2 extends Applet {
	int knoppen[];
	Button knop;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(400, 400);
		knoppen = new int[25];
		for (int teller = 0; teller < knoppen.length; teller ++) {
			knoppen[teller] = teller;
			knop = new Button("=D");
			knop.addActionListener( new knopListener() );
			add(knop);
		}
	}

	class knopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			repaint();
		}
	}
}