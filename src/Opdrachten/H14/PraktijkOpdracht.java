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
    Label label;
    TextField tekstvak;
    double random;
    int aantalRijen, aantalSmileys, computerGetal, winnendGetal, x, y;
    Button SpeelKnop;
    boolean foutmelding, geklikt;
    String error;

    // Een (lege) methode die de Applet gaat initialiseren.
    public void init() {
        setSize(600, 400);
        foutmelding = false;
        geklikt = false;
        aantalSmileys = 23;
        aantalRijen = 6;
        error = "";
        label = new Label("Hoeveel smileys neem je (één, twee of drie)?");
        add(label);
        tekstvak = new TextField("", 3);
        add(tekstvak);
        SpeelKnop = new Button("Speel");
        SpeelKnop.addActionListener(new SpeelKnopLuisteraar());
        add(SpeelKnop);
        pad = PraktijkOpdracht.class.getResource("/Opdrachten/H14/Smileys/Smiley-Neutraal.png");
        smiley = getImage(pad, "Smiley-Neutraal.png");
    }

    class SpeelKnopLuisteraar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                // Speler is aan zet
                error = "";
                int getal = Integer.parseInt(tekstvak.getText());
                if (getal == 1 || getal == 2 || getal == 3) {
                    aantalSmileys = aantalSmileys - getal;

                    if (aantalSmileys % 4 == 0 + 1) {
                        random = Math.random();
                        computerGetal = (int) (random * 3);
                        aantalSmileys = aantalSmileys - computerGetal;
                        pad = PraktijkOpdracht.class.getResource("/Opdrachten/H14/Smileys/Smiley-Blij.png");
                        smiley = getImage(pad, "Smiley-Blij.png");
                    } else {
                        pad = PraktijkOpdracht.class.getResource("/Opdrachten/H14/Smileys/Smiley-Neutraal.png");
                        smiley = getImage(pad, "Smiley-Neutraal.png");
                    }
                    // Computer is aan zet
                    if (aantalSmileys == 2 || aantalSmileys == 6 || aantalSmileys == 10 || aantalSmileys == 14 || aantalSmileys == 18 || aantalSmileys == 22) {
                        computerGetal = 1;
                        aantalSmileys = aantalSmileys - computerGetal;
                    }
                    if (aantalSmileys == 3 || aantalSmileys == 7 || aantalSmileys == 11 || aantalSmileys == 15 || aantalSmileys == 19) {
                        computerGetal = 2;
                        aantalSmileys = aantalSmileys - computerGetal;
                    }
                    if (aantalSmileys == 4 || aantalSmileys == 8 || aantalSmileys == 12 || aantalSmileys == 16 || aantalSmileys == 20) {
                        computerGetal = 3;
                        aantalSmileys = aantalSmileys - computerGetal;
                    }

                    geklikt = true;
                    repaint();
                } else {
                    foutmelding = true;
                    geklikt = true;
                    error = "De variable klopt niet.";
                    tekstvak.setText("");
                    repaint();
                }
                } catch(NumberFormatException exc){
                    foutmelding = true;
                    geklikt = true;
                    error = "De variable klopt niet.";
                    tekstvak.setText("");
                    repaint();
                }
            }
        }

    // Een methode die de inhoud van het scherm tekent.
    public void paint(Graphics g) {
        aantalRijen = 6;
        x = 50;
        y = 40;
        if (foutmelding == false) {
            if (geklikt == true) {
                g.drawString("De computer heeft " + computerGetal + " smileys weggehaald", 50, 50);
            }
            g.drawString("Aantal smileys: " + aantalSmileys + " . Jouw beurt.", 50, 70);
            for (int smileys = 0; smileys < (aantalSmileys); smileys++) {
                if (smileys % 4 == 0) {
                    x = 50;
                    y += 50;
                }
                g.drawImage(smiley, x, y, 40, 40, this);
                x += 50;
            }
        } else {
            g.drawString("" + error, 50, 50);
            for (int smileys = 0; smileys < (aantalSmileys); smileys++) {
                if (smileys % 4 == 0) {
                    x = 50;
                    y += 50;
                }
                g.drawImage(smiley, x, y, 40, 40, this);
                x += 50;
            }
            foutmelding = false;
        }
        tekstvak.setText("");
    }
}