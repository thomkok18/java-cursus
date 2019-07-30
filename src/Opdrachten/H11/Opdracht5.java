// Hoofdstuk 11
package Opdrachten.H11;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht5 van het type Applet.
public class Opdracht5 extends Applet {
    int teller, a, b = 1, c = 0;
    TextField tekstvak;
    Button knop;
    String s;

    // Een (lege) methode die de Applet gaat initialiseren.
    public void init() {
        setSize(200, 500);
        tekstvak = new TextField("", 10);
        add(tekstvak);
        knop = new Button("Ok");
        knop.addActionListener( new knopListener() );
        add(knop);
    }

    // Een methode die de inhoud van het scherm tekent.
    public void paint(Graphics g) {
        int y = 60;
        for(teller = 1; teller <= 10; teller++) {
            b = teller;
            c = a * b;
            g.drawString("" + c, 50 , y);
            y += 20;
        }
    }
    class knopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            a = Integer.parseInt(s);
            tekstvak.setText("");
            repaint();
        }
    }
}