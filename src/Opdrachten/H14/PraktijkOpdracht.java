// Hoofdstuk 14
package Opdrachten.H14;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class PraktijkOpdracht extends Applet {
    private Image smiley;
    private URL pad;
    String[] smileyArray;
    int aantalRijen, aantalSmileys, x, y;
    Button SpeelKnop;

    // Een (lege) methode die de Applet gaat initialiseren.
    public void init() {
        setSize(600, 400);
        smileyArray = new String[23];
        SpeelKnop = new Button("Speel");
        SpeelKnop.addActionListener(new SpeelKnopLuisteraar());
        add(SpeelKnop);
        pad = PraktijkOpdracht.class.getResource("/Opdrachten/H14/Smileys/Smiley-Neutraal.png");
        smiley = getImage(pad, "Smiley-Neutraal.png");
    }

    class SpeelKnopLuisteraar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }

    // Een methode die de inhoud van het scherm tekent.
    public void paint(Graphics g) {
        aantalRijen = 6;
        aantalSmileys = 4;
        x = 20;
        y = 0;
        for (int rijen = 0; rijen < aantalRijen; rijen++) {
            y += 50;
            x = 20;
            if (rijen == 5) {
                aantalSmileys = 3;
            }
            for (int smileys = 0; smileys < aantalSmileys; smileys++) {
                g.drawImage(smiley, x, y, 40, 40, this);
                x += 50;
            }
        }
    }
}