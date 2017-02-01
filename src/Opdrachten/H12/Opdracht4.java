// Hoofdstuk 12
package Opdrachten.Java.H12;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

//Een klasse met de naam Opdracht4 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht4 extends Applet {
	boolean gevonden;
	int[] salaris = {100, 200, 500, 400, 300};
	int vind;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(300,100);
		vind = 400;
		gevonden = false;
		int index = 0;
		while(index < salaris.length) {
			if(salaris[index] == vind) {
				gevonden = true;
				break;
			}
			index++;
		}
	}

	public void paint(Graphics g) {
		if(gevonden == true) {
			g.drawString("De waarde " + vind + " is gevonden.", 20, 50);
		}
		else {
			g.drawString("De waarde " + vind + " is niet gevonden.", 20, 50);
		}
	}
}