// Hoofdstuk 14
package Opdrachten.H14;

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
    String[] deck , nieuwDeck, speler1 = new String[13], speler2 = new String[13], speler3 = new String[13], speler4 = new String[13];
    int aantalRijen, aantalKaarten, speler, x, y;
    Button deelKnop;
    String kaart;

    // Een (lege) methode die de Applet gaat initialiseren.
    public void init() {
        setSize(600, 400);
        deck = new String[52];
        int index = 0;
        for (int kleur = 0; kleur < kleuren.length; kleur++) {
            String kleurString = kleuren[kleur];
            for (int cijfer = 0; cijfer < cijfers.length; cijfer++) {
                String cijferString = cijfers[cijfer];
                String kaart = kleurString + " " + cijferString;
                deck[index] = kaart;
                index++;
            }
        }

        for (int i = 0; i < aantalKaarten; i++) {
            speler1[i] = trekKaart();
            speler2[i] = trekKaart();
            speler3[i] = trekKaart();
            speler4[i] = trekKaart();
        }

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
        int index = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                nieuwDeck[index] = deck[i];
                index++;
            }
        }
        deck = nieuwDeck;
        return getrokkenKaart;
    }

    class DeelKnopLuisteraar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kaart = trekKaart();
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
            for (int i = 0; i < aantalKaarten; i++) {
                g.drawString("" + kaart, x, y);
                y += 20;
            }
            x += 150;
            y = 80;
        }
    }
}