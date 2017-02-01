// Hoofdstuk 11
package Opdrachten.Java.H11;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht4 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht4 extends Applet {

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(300, 100);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		int teller, tafel = 3, keerNummer = 1, aantalAntwoorden = 10, antwoord = 0, xCoordinaat = 20;
		for(keerNummer = 1; keerNummer <= aantalAntwoorden; keerNummer++) {
			antwoord = tafel * keerNummer;
			g.drawString("" + antwoord, xCoordinaat , 50);
			xCoordinaat += 20;
		} 
	}
}