// Hoofdstuk 2
package Opdrachten.H2;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht1 extends Applet {

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init()   {
		setBackground(Color.blue);
	}

	//Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g)   {
		g.setColor(Color.yellow);
		g.drawString("Thom", 50, 60 );
	}
}