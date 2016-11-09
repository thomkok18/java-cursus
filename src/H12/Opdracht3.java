// Hoofdstuk 12
package H12;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

// Een klasse met de naam Opdracht3 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht3 extends Applet {
	int[] tekstvakken = new int[5];
	TextField[] tekstvak = new TextField[5];	
	Button knop;
	String a;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(400, 400);
		knop = new Button("Getallen invoeren");
		add(knop);		
		knop.addActionListener (new tekstvakListener());
		for (int teller = 0; teller < 5; teller ++) {	            
			tekstvak[teller] = new TextField("");				 
			add(tekstvak[teller]);		 			 
		}		
	}

	class tekstvakListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			for (int teller = 0; teller < tekstvak.length; teller ++) {
				a = tekstvak[teller].getText();
				tekstvakken[teller] = Integer.parseInt( a);
			}
			Arrays.sort(tekstvakken);
			repaint();
		}
	}
	public void paint(Graphics g) {
		for (int teller = 0; teller < tekstvakken.length; teller ++) {
			g.drawString("" + tekstvakken[teller], 50, 20 * teller + 20);
		}
	}
}