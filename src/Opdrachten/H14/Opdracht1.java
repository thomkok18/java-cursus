// Hoofdstuk 14
package Opdrachten.H14;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht1 extends Applet {
    String[] cijfers = {"Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Koningin", "Koning", "Joker"};
    String[] kleuren = {"Ruiten", "Klaver", "Harten", "Schoppen"};
    double randomCijfers, randomKleuren;
    int randomCijfer, randomKleur;
    Button deelKnop;

    // Een (lege) methode die de Applet gaat initialiseren.
    public void init() {
        setSize(400, 200);
        deelKnop = new Button("Deel Kaart");
        deelKnop.addActionListener(new DeelKnopLuisteraar());
        add(deelKnop);
    }

    class DeelKnopLuisteraar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            randomCijfers = Math.random();
            randomCijfer = (int) (randomCijfers * 14);
            randomKleuren = Math.random();
            randomKleur = (int) (randomKleuren * 4);
            repaint();
        }
    }

    // Een methode die de inhoud van het scherm tekent.
    public void paint(Graphics g) {
        if (randomCijfer == 13) {
            g.drawString("" + cijfers[13], 20, 20);
        } else {
            g.drawString("" + kleuren[randomKleur] + ", " + cijfers[randomCijfer], 20, 20);
        }
    }
}