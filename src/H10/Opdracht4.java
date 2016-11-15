// Hoofdstuk 10
package H10;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht4 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht4 extends Applet {
	TextField maandTekstvak, jaarTekstvak;
	Button okKnop;
	int maand, jaartal;
	String dagen, maandNaam, schrikkeljaar, error;
	Label maandLabel, jaarLabel;
	boolean foutmelding;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		maand = 0;
		jaartal = 0;
		dagen = "";
		maandNaam = "";
		schrikkeljaar = "";
		error = "";
		setSize(900, 150);
		maandLabel = new Label("Voer het maandgetal in");
		add(maandLabel);
		maandTekstvak = new TextField("", 30);
		add(maandTekstvak);
		jaarLabel = new Label("Voer het jaar in");
		add(jaarLabel);
		jaarTekstvak = new TextField("", 30);
		add(jaarTekstvak);
		okKnop = new Button("Ok");
		okKnop.addActionListener( new OkKnopListener() );
		add(okKnop);
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		if (foutmelding == false) {
			g.drawString("Maand: " + maandNaam, 50, 60 );
			g.drawString("Schrikkeljaar: " + schrikkeljaar, 50, 80 );
			g.drawString("Aantal dagen: " + dagen, 50, 100 );
		} else {
			g.drawString("" + error, 50, 60 );
			foutmelding = false;
		}
	}
	class OkKnopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			String jaarTekstvakGetal = jaarTekstvak.getText();
			jaartal = Integer.parseInt(jaarTekstvakGetal);
			String maandTekstvakGetal = maandTekstvak.getText();
			maand = Integer.parseInt(maandTekstvakGetal);
			switch(maand) {
				case 1:
					maandNaam = "januari";
					dagen = "31";
					break;
				case 2:
					if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
							jaartal % 400 == 0) {
						maandNaam = "februari";
						dagen = "29";
					} else {
						maandNaam = "februari";
						dagen = "28";
					}
					break;
				case 3:
					maandNaam = "maart";
					dagen = "31";
					break;
				case 4:
					maandNaam = "april";
					dagen = "30";
					break;
				case 5:
					maandNaam = "mei";
					dagen = "31";
					break;
				case 6:
					maandNaam = "juni";
					dagen = "30";
					break;
				case 7:
					maandNaam = "juli";
					dagen = "31";
					break;
				case 8:
					maandNaam = "augustus";
					dagen = "30";
					break;
				case 9:
					maandNaam = "september";
					dagen = "31";
					break;
				case 10:
					maandNaam = "oktober";
					dagen = "30";
					break;
				case 11:
					maandNaam = "november";
					dagen = "31";
					break;
				case 12:
					maandNaam = "december";
					dagen = "30";
					break;
				default:
					foutmelding = true;
					error = "U hebt een verkeerd nummer ingetikt!";
					dagen = "0";
					break;
			}
			if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
					jaartal % 400 == 0 ) {
				schrikkeljaar = "" + jaartal + " is een schrikkeljaar";
				if (maand == 2) {
					maandNaam = "februari";
					dagen = "29";
				}
			}
			else {
				schrikkeljaar = "" + jaartal + " is geen schrikkeljaar";
				if (maand == 2) {
					maandNaam = "februari";
					dagen = "28";
				}
			}
			jaarTekstvak.setText("");
			maandTekstvak.setText("");
			repaint();
		}
	}
}