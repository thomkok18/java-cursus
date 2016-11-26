// Hoofdstuk 12
package Opdrachten.H12;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

// Een klasse met de naam Opdracht3 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht3 extends Applet {
	int[] getallen = new int[5];
	TextField[] tekstvakken = new TextField[5];
	Button knop;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(400, 400);
		knop = new Button("Getallen invoeren");
		add(knop);		
		knop.addActionListener (new TekstvakkenListener());
		for (int tekstvak = 0; tekstvak < 5; tekstvak++) {
			tekstvakken[tekstvak] = new TextField("");
			add(tekstvakken[tekstvak]);
		}		
	}

	class TekstvakkenListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			String getal;
			for (int cijfer = 0; cijfer < tekstvakken.length; cijfer++) {
				getal = tekstvakken[cijfer].getText();
				getallen[cijfer] = Integer.parseInt(getal);
			}
			Arrays.sort(getallen);
			repaint();
		}
	}
	public void paint(Graphics g) {
		for (int geordend = 0; geordend < getallen.length; geordend++) {
			g.drawString("" + getallen[geordend], 50, 20 * geordend + 20);
		}
	}
}