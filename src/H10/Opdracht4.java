// Hoofdstuk 10
package H10;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht4 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht4 extends Applet {
	TextField tekstvak1;
	TextField tekstvak2;
	Button knop1;
	Button knop2;
	int Getal;
	String Dagen;
	String Maandnaam;
	String Schrikkeljaar;
	Label label1;
	Label label2;
	int Jaartal = 1;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		label1 = new Label("Voer het maandgetal in");
		add(label1);
		tekstvak1 = new TextField("", 30);
		add(tekstvak1);
		knop1= new Button("Maand");
		knop1.addActionListener( new knopListener1() );
		add(knop1);	    
		label2 = new Label("Voer het jaar in");
		add(label2);
		tekstvak2 = new TextField("", 30);
		add(tekstvak2);
		knop2 = new Button("Jaar");
		knop2.addActionListener( new knopListener2() );
		add(knop2);
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		if (Getal > 0) {
			g.drawString("Maand: " + Maandnaam, 50, 60 );
			g.drawString("Schrikkeljaar: " + Schrikkeljaar, 50, 80 );
			g.drawString("Aantal dagen: " + Dagen, 50, 100 );

		}
	}

	class knopListener1 implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {

			String TekstvakGetal = tekstvak1.getText();
			Getal = Integer.parseInt(TekstvakGetal);
			switch(Getal){
			case 1:
				Maandnaam = "januari";
				Dagen = "31";
				break;
			case 2:        		 
				if ( (Jaartal % 4 == 0 && !(Jaartal % 100 == 0)) || 
						Jaartal % 400 == 0 ) {
					Maandnaam = "februari";
					Dagen = "29";
				}
				else {
					Maandnaam = "februari";
					Dagen = "28";
				}
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

	class knopListener2 implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {

			String TekstvakGetal = tekstvak2.getText();
			Jaartal = Integer.parseInt(TekstvakGetal);
			if ( (Jaartal % 4 == 0 && !(Jaartal % 100 == 0)) || 
					Jaartal % 400 == 0 ) {
				Schrikkeljaar = ""+ Jaartal + " is een schrikkeljaar";
				if (Getal == 2) {
					Maandnaam = "februari";
					Dagen = "29";
				}
			}
			else {
				Schrikkeljaar = ""+ Jaartal + " is geen schrikkeljaar";
				if (Getal == 2) {
					Maandnaam = "februari";
					Dagen = "28";
				}
			}
			repaint();
		}
	}
}