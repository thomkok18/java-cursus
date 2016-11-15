// Hoofdstuk 12
package H12;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht2 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht2 extends Applet {
	int smileyKnoppen[];
	Button smileyKnop;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(400, 400);
		smileyKnoppen = new int[25];
		for (int smiley = 0; smiley < smileyKnoppen.length; smiley++) {
			smileyKnoppen[smiley] = smiley;
			smileyKnop = new Button("=D");
			add(smileyKnop);
		}
	}
}