// Hoofdstuk 4
package H4;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht4 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht4 extends Applet {
	int gewichtValerie, gewichtJeroen, gewichtHans;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(600, 300);
		gewichtValerie = 40;
		gewichtJeroen = 100;
		gewichtHans = 80;

	}
	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {

		// De hoofdlijnen
		g.drawLine(20, 100, 20, 200);
		g.drawLine(180, 200, 20, 200);

		// De kleine lijntjes
		g.drawLine(20, 100, 30, 100);
		g.drawLine(20, 120, 30, 120);
		g.drawLine(20, 140, 30, 140);
		g.drawLine(20, 160, 30, 160);
		g.drawLine(20, 180, 30, 180);
		g.drawLine(20, 200, 30, 200);

		// Waarden
		g.drawString("0", 5, 200 );
		g.drawString("2", 5, 180 );
		g.drawString("4", 5, 160 );
		g.drawString("6", 5, 140 );
		g.drawString("8", 5, 120 );
		g.drawString("10", 5, 100 );
		g.drawString("kg x10", 5, 80 );

		// Valerie
		if (gewichtValerie == 0){
			g.setColor(Color.pink);
			g.fillRect(20, 200, 40, 1);
			g.drawString("Valerie", 20, 220 );
		}
		if (gewichtValerie == 10){
			g.setColor(Color.pink);
			g.fillRect(20, 190, 40, 10);
			g.drawString("Valerie", 20, 220 );
		}
		if (gewichtValerie == 20){
			g.setColor(Color.pink);
			g.fillRect(20, 180, 40, 20);
			g.drawString("Valerie", 20, 220 );
		}
		if (gewichtValerie == 30){
			g.setColor(Color.pink);
			g.fillRect(20, 170, 40, 30);
			g.drawString("Valerie", 20, 220 );
		}
		if (gewichtValerie == 40){
			g.setColor(Color.pink);
			g.fillRect(20, 160, 40, 40);
			g.drawString("Valerie", 20, 220 );
		}
		if (gewichtValerie == 50){
			g.setColor(Color.pink);
			g.fillRect(20, 150, 40, 50);
			g.drawString("Valerie", 20, 220 );
		}
		if (gewichtValerie == 60){
			g.setColor(Color.pink);
			g.fillRect(20, 140, 40, 60);
			g.drawString("Valerie", 20, 220 );
		}
		if (gewichtValerie == 70){
			g.setColor(Color.pink);
			g.fillRect(20, 130, 40, 70);
			g.drawString("Valerie", 20, 220 );
		}
		if (gewichtValerie == 80){
			g.setColor(Color.pink);
			g.fillRect(20, 120, 40, 80);
			g.drawString("Valerie", 20, 220 );
		}
		if (gewichtValerie == 90){
			g.setColor(Color.pink);
			g.fillRect(20, 110, 40, 90);
			g.drawString("Valerie", 20, 220 );
		}
		if (gewichtValerie == 100){
			g.setColor(Color.pink);
			g.fillRect(20, 100, 40, 100);
			g.drawString("Valerie", 20, 220 );
		}
		else {
			g.setColor(Color.pink);
			g.fillRect(20, 200, 40, 1);
			g.drawString("Valerie", 20, 220 );
		}

		// Jeroen
		if (gewichtJeroen == 0){
			g.setColor(Color.orange);
			g.fillRect(80, 200, 40, 1);
			g.drawString("Jeroen", 80, 220 );
		}
		if (gewichtJeroen == 10){
			g.setColor(Color.orange);
			g.fillRect(80, 190, 40, 10);
			g.drawString("Jeroen", 80, 220 );
		}
		if (gewichtJeroen == 20){
			g.setColor(Color.orange);
			g.fillRect(80, 180, 40, 20);
			g.drawString("Jeroen", 80, 220 );
		}
		if (gewichtJeroen == 30){
			g.setColor(Color.orange);
			g.fillRect(80, 170, 40, 30);
			g.drawString("Jeroen", 80, 220 );
		}
		if (gewichtJeroen == 40){
			g.setColor(Color.orange);
			g.fillRect(80, 160, 40, 40);
			g.drawString("Jeroen", 80, 220 );
		}
		if (gewichtJeroen == 50){
			g.setColor(Color.orange);
			g.fillRect(80, 150, 40, 50);
			g.drawString("Jeroen", 80, 220 );
		}
		if (gewichtJeroen == 60){
			g.setColor(Color.orange);
			g.fillRect(80, 140, 40, 60);
			g.drawString("Jeroen", 80, 220 );
		}
		if (gewichtJeroen == 70){
			g.setColor(Color.orange);
			g.fillRect(80, 130, 40, 70);
			g.drawString("Jeroen", 80, 220 );
		}
		if (gewichtJeroen == 80){
			g.setColor(Color.orange);
			g.fillRect(80, 120, 40, 80);
			g.drawString("Jeroen", 80, 220 );
		}
		if (gewichtJeroen == 90){
			g.setColor(Color.orange);
			g.fillRect(80, 110, 40, 90);
			g.drawString("Jeroen", 80, 220 );
		}
		if (gewichtJeroen == 100){
			g.setColor(Color.orange);
			g.fillRect(80, 100, 40, 100);
			g.drawString("Jeroen", 80, 220 );
		}
		else {
			g.setColor(Color.orange);
			g.fillRect(80, 200, 40, 1);
			g.drawString("Jeroen", 80, 220 );
		}

		// Hans
		if (gewichtHans == 0){
			g.setColor(Color.green);
			g.fillRect(140, 200, 40, 1);
			g.drawString("Hans", 140, 220 );
		}
		if (gewichtHans == 10){
			g.setColor(Color.green);
			g.fillRect(140, 190, 40, 10);
			g.drawString("Hans", 140, 220 );
		}
		if (gewichtHans == 20){
			g.setColor(Color.green);
			g.fillRect(140, 180, 40, 20);
			g.drawString("Hans", 140, 220 );
		}
		if (gewichtHans == 30){
			g.setColor(Color.green);
			g.fillRect(140, 170, 40, 30);
			g.drawString("Hans", 140, 220 );
		}
		if (gewichtHans == 40){
			g.setColor(Color.green);
			g.fillRect(140, 160, 40, 40);
			g.drawString("Hans", 140, 220 );
		}
		if (gewichtHans == 50){
			g.setColor(Color.green);
			g.fillRect(140, 150, 40, 50);
			g.drawString("Hans", 140, 220 );
		}
		if (gewichtHans == 60){
			g.setColor(Color.green);
			g.fillRect(140, 140, 40, 60);
			g.drawString("Hans", 140, 220 );
		}
		if (gewichtHans == 70){
			g.setColor(Color.green);
			g.fillRect(140, 130, 40, 70);
			g.drawString("Hans", 140, 220 );
		}
		if (gewichtHans == 80){
			g.setColor(Color.green);
			g.fillRect(140, 120, 40, 80);
			g.drawString("Hans", 140, 220 );
		}
		if (gewichtHans == 90){
			g.setColor(Color.green);
			g.fillRect(140, 110, 40, 90);
			g.drawString("Hans", 140, 220 );
		}
		if (gewichtHans == 100){
			g.setColor(Color.green);
			g.fillRect(140, 100, 40, 100);
			g.drawString("Hans", 140, 220 );
		}
		else {
			g.setColor(Color.green);
			g.fillRect(140, 200, 40, 1);
			g.drawString("Hans", 140, 220 );
		}
	}
}