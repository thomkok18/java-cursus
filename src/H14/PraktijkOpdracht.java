// Hoofdstuk 14
package H14;

// Importeer de benodigde klassen uit de Java bibliotheek.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class PraktijkOpdracht extends Applet {
    String[] cijfers = {"Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Koningin", "Koning"};
    String[] kleuren = {"Ruit", "Klaver", "Harten", "Schoppen"};
    String[] afgegeven;
    double randomCijfers, randomKleuren;
    int randomCijfer, randomKleur, aantalRijen, aantalKaarten, speler, x, y;
    Button deelKnop;

    // Een (lege) methode die de Applet gaat initialiseren.
    public void init() {
        setSize(600, 400);
        afgegeven = new String[52];
        aantalRijen = 4;
        aantalKaarten = 13;
        y = 80;
        x = 20;
        deelKnop = new Button("Deel Kaart");
        deelKnop.addActionListener(new DeelKnopLuisteraar());
        add(deelKnop);
    }

    class DeelKnopLuisteraar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            randomCijfers = Math.random();
            randomCijfer = (int) (randomCijfers * 13);
            randomKleuren = Math.random();
            randomKleur = (int) (randomKleuren * 4);
            repaint();
        }
    }

    // Een methode die de inhoud van het scherm tekent.
    public void paint(Graphics g) {
        y = 80;
        x = 20;
        speler = 1;
        for (int rijen = 0; rijen < aantalRijen; rijen++) {
            g.drawString("Speler " + speler ,x, 60);
            speler++;
            for (int kaart = 0; kaart < aantalKaarten; kaart++) {
                g.drawString("" + kleuren[randomKleur] + ", " + cijfers[randomCijfer], x, y);
                y += 20;
            }
            x += 150;
            y = 80;
        }
    }
}