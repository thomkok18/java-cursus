// Hoofdstuk 10
package Opdrachten.Java.H10;

// Importeer de benodigde klassen uit de Java bibliotheek.

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht2 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht2 extends Applet {
    TextField tekstvak;
    Button okKnop;
    int hoogsteGetal, laagsteGetal, getal;
    boolean geklikt, foutmelding;
    String error;

    // Een (lege) methode die de Applet gaat initialiseren.
    public void init() {
        hoogsteGetal = 0;
        laagsteGetal = 0;
        getal = 0;
        geklikt = false;
        foutmelding = false;
        tekstvak = new TextField("", 30);
        add(tekstvak);
        okKnop = new Button("Ok");
        okKnop.addActionListener(new KnopListener());
        add(okKnop);
    }

    // Een methode die de inhoud van het scherm tekent.
    public void paint(Graphics g) {
        if (foutmelding == false) {
            g.drawString("Hoogste Getal: " + hoogsteGetal, 50, 60);
            g.drawString("Laagste Getal: " + laagsteGetal, 50, 80);
        } else {
            g.drawString("" + error, 50, 60);
            foutmelding = false;
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String tekstvakGetal = tekstvak.getText();
                getal = Integer.parseInt(tekstvakGetal);
                    if (getal > hoogsteGetal && getal != Integer.MAX_VALUE && getal < Integer.MAX_VALUE) {
                        hoogsteGetal = getal;
                    }
                    if (getal < laagsteGetal && getal != Integer.MIN_VALUE && getal > Integer.MIN_VALUE) {
                        laagsteGetal = getal;
                    }
                    if (geklikt == false) {
                        laagsteGetal = hoogsteGetal;
                    }
                    tekstvak.setText("");
                    geklikt = true;
                    foutmelding = false;
                    repaint();
            } catch (NumberFormatException exc) {
                foutmelding = true;
                error = "De variable klopt niet.";
                tekstvak.setText("");
                repaint();
            }
        }
    }
}
