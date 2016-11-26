// Hoofdstuk 14
package Creaties.Dobbelstenen;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class Dobbelstenen extends Applet {
    String[] cijfers = {"Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Koningin", "Koning", "Joker"};
    String[] kleuren = {"Ruiten", "Klaver", "Harten", "Schoppen"};
    double random;
    int worp;
    Button gooiKnop;

    // Een (lege) methode die de Applet gaat initialiseren.
    public void init() {
        setSize(400, 200);
        gooiKnop = new Button("Gooi");
        gooiKnop.addActionListener(new DobbelKnopLuisteraar());
        add(gooiKnop);
    }

    class DobbelKnopLuisteraar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            random = Math.random();
            worp = (int) (random * 6);
            repaint();
        }
    }

    // Een methode die de inhoud van het scherm tekent.
    public void paint(Graphics g) {
        g.drawString("" + worp, 50, 50);
    }
}