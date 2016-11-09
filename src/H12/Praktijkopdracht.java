// Hoofdstuk 12
package H12;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//Een klasse met de naam Praktijkopdracht van het type Applet.
@SuppressWarnings("serial")
public class Praktijkopdracht extends Applet {
	boolean tienGegevens;
	int gegeven;
	int knop[], y;
	Button Ok;
	TextField naamTekstvak, telefoonTekstvak;
	String gegevens;
	String s;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(400,200);

		y = 50;

		tienGegevens = false;

		knop = new int[10];
		Ok = new Button("Ok");
		add(Ok);
		Ok.addActionListener( new OkListener());

		naamTekstvak = new TextField("Vul uw naam in", 20);
		add(naamTekstvak);
		telefoonTekstvak = new TextField("Vul uw telefoonnummer in", 20);
		add(telefoonTekstvak);
	}

	public void paint(Graphics g) {
		if(tienGegevens) {
			g.drawString("" + gegeven + gegevens , 20, y);
			tienGegevens = false;
		}else {
			g.drawString("", 20, 50);
		}
	}

	class OkListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			String s = telefoonTekstvak.getText();
			gegeven = Integer.parseInt(s);

			for (int teller = 0; teller < 10; teller++){
				if (teller == 10) {
					Ok.setEnabled(false);
				}
			}
			for (int teller = 0; teller < knop.length; teller ++) {	
				y += 50;
				if(tienGegevens) {
					teller = 0;
					tienGegevens = false;
				}
			}
			naamTekstvak.setText("Vul uw naam in");
			telefoonTekstvak.setText("Vul uw telefoonnummer in");
			repaint();
		}
	}
}