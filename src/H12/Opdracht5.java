// Hoofdstuk 12
package H12;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//Een klasse met de naam Opdracht4 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht5 extends Applet {
	boolean gevonden;
	double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 };
	double gezocht;
	Button Ok;
	TextField tekstvak;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(400,200);
		gezocht = 0;
		gevonden = false;
		Ok = new Button("Ok");
		add(Ok);
		Ok.addActionListener( new OkListener());
		tekstvak = new TextField("", 20);
		add(tekstvak);
	}

	class OkListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			String s = tekstvak.getText();
			gezocht = Double.parseDouble(s);
			int teller = 0;
			while(teller < salaris.length) {
				if(salaris[teller] == gezocht) {
					gevonden = true;
					break;
				}
				teller ++;
			}
			tekstvak.setText("");
			repaint();
		}
	}


	public void paint(Graphics g) {
		if(gevonden) {
			g.drawString("De waarde is gevonden.", 20, 50);
			gevonden = false;
		}else {
			g.drawString("De waarde is niet gevonden.", 20, 50);
		}
	}
}