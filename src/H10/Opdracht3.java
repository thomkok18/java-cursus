// Hoofdstuk 10
package H10;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht3 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht3 extends Applet {
	TextField tekstvak;
	Button knop;
	int Getal;
	String Dagen;
	String Maandnaam;
	Label label;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		label = new Label("Voer het maandgetal in");
		add(label);
		tekstvak = new TextField("", 30);
		add(tekstvak);
		knop = new Button("Ok");
		knop.addActionListener( new knopListener() );
		add(knop);
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		if (Getal > 0) {
			g.drawString("Maand: " + Maandnaam, 50, 60 );	
			g.drawString("Aantal dagen: " + Dagen, 50, 80 );
		}
	}

	class knopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {

			String TekstvakGetal = tekstvak.getText();
			Getal = Integer.parseInt(TekstvakGetal);
			switch(Getal){
			case 1:
				Maandnaam = "januari";
				Dagen = "31";
				break;
			case 2:
				Maandnaam = "februari";
				Dagen = "28";
				break;
			case 3:
				Maandnaam = "maart";
				Dagen = "31";
				break;
			case 4:
				Maandnaam = "april";
				Dagen = "30";
				break;
			case 5:
				Maandnaam = "mei";
				Dagen = "31";
				break;
			case 6:
				Maandnaam = "juni";
				Dagen = "30";
				break;
			case 7:
				Maandnaam = "juli";
				Dagen = "31";
				break;
			case 8:
				Maandnaam = "augustus";
				Dagen = "30";
				break;
			case 9:
				Maandnaam = "september";
				Dagen = "31";
				break;
			case 10:
				Maandnaam = "oktober";
				Dagen = "30";
				break;
			case 11:
				Maandnaam = "november";
				Dagen = "31";
				break;
			case 12:
				Maandnaam = "december";
				Dagen = "30";
				break;
			default:
				Maandnaam = "U hebt een verkeerd nummer ingetikt!";
				Dagen = "0";
				break;
			}
			repaint();
		}
	}
}