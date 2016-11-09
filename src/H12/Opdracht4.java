// Hoofdstuk 12
package H12;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

//Een klasse met de naam Opdracht4 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht4 extends Applet {
	boolean gevonden;
	double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 }; 
	double gezocht;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		gezocht = 400;
		gevonden = false;
		int teller = 0;
		while(teller < salaris.length) {
			if(salaris[teller] == gezocht) {
				gevonden = true;
				break;
			}
			teller ++;
		}
	}

	public void paint(Graphics g) {
		if(gevonden == true) {
			g.drawString("De waarde is gevonden.", 20, 50);
		}
		else {
			g.drawString("De waarde is niet gevonden.", 20, 50);
		}
	}
}