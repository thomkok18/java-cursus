// Hoofdstuk 14
package Opdrachten.Java.H14;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht2 extends Applet {
    String[] cijfers = {"Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Koningin", "Koning"};
    String[] kleuren = {"Ruiten", "Klaver", "Harten", "Schoppen"};
    String[] nieuwDeck, deck = new String[52], speler1 = new String[13], speler2 = new String[13], speler3 = new String[13], speler4 = new String[13];
    int aantalRijen, aantalKaarten, speler, index, y;
    Button deelKnop;
    boolean geklikt;

    // Een (lege) methode die de Applet gaat initialiseren.
    public void init() {
        setSize(600, 400);
        index = 0;
        geklikt = false;
        aantalRijen = 4;
        aantalKaarten = 13;
        deelKnop = new Button("Deel Kaart");
        deelKnop.addActionListener(new DeelKnopLuisteraar());
        add(deelKnop);
    }

    public String trekKaart() {
        int random = new Random().nextInt(deck.length);
        String getrokkenKaart = deck[random];
        nieuwDeck = new String [deck.length - 1];
        int hulpindex = 0;
        for (int vulDeck = 0; vulDeck < deck.length; vulDeck++) {
            if (vulDeck != random) {
                nieuwDeck[hulpindex] = deck[vulDeck];
                hulpindex++;
            }
        }
        deck = nieuwDeck;
        return getrokkenKaart;
    }

    class DeelKnopLuisteraar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            deck = new String[52];
            index = 0;
            for (int kleur = 0; kleur < kleuren.length; kleur++) {
                String kleurString = kleuren[kleur];
                for (int cijfer = 0; cijfer < cijfers.length; cijfer++) {
                    String cijferString = cijfers[cijfer];
                    String kaart = kleurString + " " + cijferString;
                    deck[index] = kaart;
                    index++;
                }
            }
            index = 0;
            geklikt = true;
            if (index < deck.length) {
                for (int verdelen = 0; verdelen < aantalKaarten; verdelen++) {
                    speler1[verdelen] = trekKaart();
                    speler2[verdelen] = trekKaart();
                    speler3[verdelen] = trekKaart();
                    speler4[verdelen] = trekKaart();
                    index++;
                }
            }
            repaint();
        }
    }

    // Een methode die de inhoud van het scherm tekent.
    public void paint(Graphics g) {
        int x = 80;
        y = 80;
        speler = 1;
        if (geklikt == true) {
            for (int spelers = 0; spelers < 4; spelers++) {
                g.drawString("Speler " + speler, x, 60);
                speler++;
                x += 120;
            }
            for (int uitdelen = 0; uitdelen < aantalKaarten; uitdelen++) {
                g.drawString("" + speler1[uitdelen], 80, y);
                g.drawString("" + speler2[uitdelen], 200, y);
                g.drawString("" + speler3[uitdelen], 320, y);
                g.drawString("" + speler4[uitdelen], 440, y);
                y += 20;
            }
        }
    }
}