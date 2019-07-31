// Hoofdstuk 13
package Opdrachten.H13;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//Een klasse met de naam Opdracht3 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht2 extends Applet {
	private Button bakstenenknop;
	int breedtesteen, hoogtesteen, aantalVerticaal, aantalHorizontaal;
	private int aantalSteenHorizontaal, aantalSteenVerticaal;
	Color steenkleur, voegKleur;
	boolean tekenmuur;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init(){
		setSize(1200, 700);
		bakstenenknop = new Button("Bakstenen");
		bakstenenknop.addActionListener(new BaksteenLuisteraar());
		add(bakstenenknop);
		tekenmuur = false;
		voegKleur = Color.BLACK;
		repaint();
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g){
		int x = 50;
		int y = 50;
		if (tekenmuur){
			for (aantalVerticaal = 0; aantalVerticaal < aantalSteenVerticaal; aantalVerticaal++){
				for(aantalHorizontaal = 0; aantalHorizontaal < aantalSteenHorizontaal; aantalHorizontaal++){
					g.setColor(steenkleur);
					g.fillRect(x, y, breedtesteen, hoogtesteen);
					g.setColor(voegKleur);
					g.drawRect(x, y, breedtesteen, hoogtesteen);
					x += breedtesteen;
				}
				y += hoogtesteen;
				x = 50;
			}
		}
	}

	class BaksteenLuisteraar implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			breedtesteen = 40;
			hoogtesteen = 30;
			aantalSteenHorizontaal = 25;
			aantalSteenVerticaal = 20;
			steenkleur = Color.RED;
			tekenmuur = true;
			repaint();
		}
	}
}