// Hoofdstuk 11
package H11;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Praktijkopdracht van het type Applet.
@SuppressWarnings("serial")
public class Praktijkopdracht extends Applet {
	TextField tekstvak;
	String sTafelfout, sTafel1, sTafel2, sTafel3, sTafel4, sTafel5, sTafel6, sTafel7, sTafel8, sTafel9, sTafel10;
	Label label;
	Button knop;
	int getal, cijfer, geklikt;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		sTafelfout = "";
		geklikt = 0;
		cijfer = 0;
		getal = 0;
		setSize(600, 500);
		label = new Label("Voer de tafel in");
		add (label);
		knop = new Button("Ok");
		knop.addActionListener( new okListener() );
		add(knop);
		tekstvak = new TextField("", 20);
		add(tekstvak);
		tekstvak.addActionListener( new TekstvakListener() );
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		if (geklikt == 1) {
			g.drawString("Tafel van 1 X 5 = " + sTafel1, 50, 60 );
			g.drawString("Tafel van 2 X 5 = " + sTafel2, 50, 80 );
			g.drawString("Tafel van 3 X 5 = " + sTafel3, 50, 100 );
			g.drawString("Tafel van 4 X 5 = " + sTafel4, 50, 120 );
			g.drawString("Tafel van 5 X 5 = " + sTafel5, 50, 140 );
			g.drawString("Tafel van 6 X 5 = " + sTafel6, 50, 160 );
			g.drawString("Tafel van 7 X 5 = " + sTafel7, 50, 180 );
			g.drawString("Tafel van 8 X 5 = " + sTafel8, 50, 200 );
			g.drawString("Tafel van 9 X 5 = " + sTafel9, 50, 220 );
			g.drawString("Tafel van 10 X 5 = " + sTafel10, 50, 240 );
		}
	}

	class okListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			cijfer = Integer.parseInt(tekstvak.getText());
			if (cijfer >= 1 && cijfer <= 10){
				getal =  cijfer + getal;
				tekstvak.setText("");
				if (cijfer > 0){
					sTafel1 = cijfer * 1 + "";
					sTafel2 = cijfer * 2 + "";
					sTafel3 = cijfer * 3 + "";
					sTafel4 = cijfer * 4 + "";
					sTafel5 = cijfer * 5 + "";
					sTafel6 = cijfer * 6 + "";
					sTafel7 = cijfer * 7 + "";
					sTafel8 = cijfer * 8 + "";
					sTafel9 = cijfer * 9 + "";
					sTafel10 = cijfer * 10 + "";
				}
			} else { 
				sTafelfout = "Foute invoer";
				tekstvak.setText("");
			}
			geklikt = 1;
			repaint();
		}
	}
	class TekstvakListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			tekstvak.getText();
			if (cijfer > 0){
				sTafel1 = cijfer * 1 + "";
				sTafel2 = cijfer * 2 + "";
				sTafel3 = cijfer * 3 + "";
				sTafel4 = cijfer * 4 + "";
				sTafel5 = cijfer * 5 + "";
				sTafel6 = cijfer * 6 + "";
				sTafel7 = cijfer * 7 + "";
				sTafel8 = cijfer * 8 + "";
				sTafel9 = cijfer * 9 + "";
				sTafel10 = cijfer * 10 + "";
			} else { 
				sTafelfout = "Foute invoer";
				tekstvak.setText("");
			}
			repaint();
		}
	}
}