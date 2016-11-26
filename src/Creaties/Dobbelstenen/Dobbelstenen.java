// Hoofdstuk 14
package Creaties.Dobbelstenen;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class Dobbelstenen extends Applet {
    double random;
    int worp;
    private Image afbeelding;
    private URL pad;
    Button gooiKnop;

    // Een (lege) methode die de Applet gaat initialiseren.
    public void init() {
        setSize(400, 400);
        gooiKnop = new Button("Gooi");
        gooiKnop.addActionListener(new DobbelKnopLuisteraar());
        add(gooiKnop);
    }

    class DobbelKnopLuisteraar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            random = Math.random();
            worp = (int) (random * 6);
                pad = Dobbelstenen.class.getResource("/Creaties/KleurDobbelstenen/Wit/dobbel" + worp + ".jpg");
                afbeelding = getImage(pad, "dobbel"+ worp +".jpg");

            repaint();
        }
    }

    // Een methode die de inhoud van het scherm tekent.
    public void paint(Graphics g) {
        g.drawImage(afbeelding, 40, 40, 50, 50, this);
    }
}