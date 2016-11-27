// Hoofdstuk 14
package Creaties.Dobbelstenen;

// Importeer de benodigde klassen uit de Java bibliotheek.
import javafx.scene.control.ComboBox;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class Dobbelstenen extends Applet {
    private Image afbeeldingWit, afbeeldingBlauw, afbeeldingGroen, afbeeldingRood, afbeeldingGeel;
    private URL pad;
    Button gooiKnop;

    // Een (lege) methode die de Applet gaat initialiseren.
    public void init() {
        setSize(500, 200);
        gooiKnop = new Button("Gooi");
        gooiKnop.addActionListener(new GooiKnopLuisteraar());
        add(gooiKnop);
    }

    class GooiKnopLuisteraar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double randomWit = Math.random();
            int worpWit = (int) (randomWit * 6);
            pad = Dobbelstenen.class.getResource("/Creaties/KleurDobbelstenen/Wit/dobbel" + worpWit + ".jpg");
            afbeeldingWit = getImage(pad, "dobbel"+ worpWit +".jpg");

            double randomBlauw = Math.random();
            int worpBlauw = (int) (randomBlauw * 6);
            pad = Dobbelstenen.class.getResource("/Creaties/KleurDobbelstenen/Blauw/dobbel" + worpBlauw + ".jpg");
            afbeeldingBlauw = getImage(pad, "dobbel"+ worpBlauw +".jpg");

            double randomGroen = Math.random();
            int worpGroen = (int) (randomGroen * 6);
            pad = Dobbelstenen.class.getResource("/Creaties/KleurDobbelstenen/Groen/dobbel" + worpGroen + ".jpg");
            afbeeldingGroen = getImage(pad, "dobbel"+ worpGroen +".jpg");

            double randomRood = Math.random();
            int worpRood = (int) (randomRood * 6);
            pad = Dobbelstenen.class.getResource("/Creaties/KleurDobbelstenen/Rood/dobbel" + worpRood + ".jpg");
            afbeeldingRood = getImage(pad, "dobbel"+ worpRood +".jpg");

            double randomGeel = Math.random();
            int worpGeel = (int) (randomGeel * 6);
            pad = Dobbelstenen.class.getResource("/Creaties/KleurDobbelstenen/Geel/dobbel" + worpGeel + ".jpg");
            afbeeldingGeel = getImage(pad, "dobbel"+ worpGeel +".jpg");

            repaint();
        }
    }

    // Een methode die de inhoud van het scherm tekent.
    public void paint(Graphics g) {
        int x = 40;
            g.drawImage(afbeeldingWit, x, 40, 50, 50, this);
        x += 80;
            g.drawImage(afbeeldingBlauw, x, 40, 50, 50, this);
        x += 80;
            g.drawImage(afbeeldingGroen, x, 40, 50, 50, this);
        x += 80;
            g.drawImage(afbeeldingRood, x, 40, 50, 50, this);
        x += 80;
            g.drawImage(afbeeldingGeel, x, 40, 50, 50, this);
    }
}