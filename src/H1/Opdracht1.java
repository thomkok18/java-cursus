// Hoofdstuk 1
package H1;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

//Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht1 extends Applet {

	//Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		g.drawString("Hallo, Wereld!", 50, 60 );
	}
}