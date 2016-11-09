// Hoofdstuk 13
package H13;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//Een klasse met de naam Opdracht3 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht3 extends Applet {
	private Button bakstenenknop;
	int breedtesteen, hoogtesteen;
	private int nAantalSteenHor, nAantalSteenver;
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
			for (int i = 0; i < nAantalSteenver; i++){
				for( int j = 0; j < nAantalSteenHor; j++){
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
			nAantalSteenHor = 25;
			nAantalSteenver = 20;
			steenkleur = Color.RED;
			tekenmuur = true;
			repaint();
		}

	}
}