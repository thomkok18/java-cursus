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
    private Image afbeeldingWit, afbeeldingBlauw, afbeeldingGroen, afbeeldingRood, afbeeldingGeel, afbeeldingOranje, afbeeldingBruin, afbeeldingPaars, afbeeldingRoze, afbeeldingGrijs;
    private URL pad;
    private Button gooiKnop;

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
            int worpWit = (int) (randomWit * 5);
            pad = Dobbelstenen.class.getResource("/Creaties/KleurDobbelstenen/Wit/dobbel" + worpWit + ".jpg");
            afbeeldingWit = getImage(pad);

            double randomBlauw = Math.random();
            int worpBlauw = (int) (randomBlauw * 6);
            pad = Dobbelstenen.class.getResource("/Creaties/KleurDobbelstenen/Blauw/dobbel" + worpBlauw + ".jpg");
            afbeeldingBlauw = getImage(pad);

            double randomGroen = Math.random();
            int worpGroen = (int) (randomGroen * 6);
            pad = Dobbelstenen.class.getResource("/Creaties/KleurDobbelstenen/Groen/dobbel" + worpGroen + ".jpg");
            afbeeldingGroen = getImage(pad);

            double randomRood = Math.random();
            int worpRood = (int) (randomRood * 6);
            pad = Dobbelstenen.class.getResource("/Creaties/KleurDobbelstenen/Rood/dobbel" + worpRood + ".jpg");
            afbeeldingRood = getImage(pad);

            double randomGeel = Math.random();
            int worpGeel = (int) (randomGeel * 6);
            pad = Dobbelstenen.class.getResource("/Creaties/KleurDobbelstenen/Geel/dobbel" + worpGeel + ".jpg");
            afbeeldingGeel = getImage(pad);

            double randomOranje = Math.random();
            int worpOranje = (int) (randomOranje * 6);
            pad = Dobbelstenen.class.getResource("/Creaties/KleurDobbelstenen/Oranje/dobbel" + worpOranje + ".jpg");
            afbeeldingOranje = getImage(pad);

            double randomBruin = Math.random();
            int worpBruin = (int) (randomBruin * 6);
            pad = Dobbelstenen.class.getResource("/Creaties/KleurDobbelstenen/Bruin/dobbel" + worpBruin + ".jpg");
            afbeeldingBruin = getImage(pad);

            double randomPaars = Math.random();
            int worpPaars = (int) (randomPaars * 6);
            pad = Dobbelstenen.class.getResource("/Creaties/KleurDobbelstenen/Paars/dobbel" + worpPaars + ".jpg");
            afbeeldingPaars = getImage(pad);

            double randomRoze = Math.random();
            int worpRoze = (int) (randomRoze * 6);
            pad = Dobbelstenen.class.getResource("/Creaties/KleurDobbelstenen/Roze/dobbel" + worpRoze + ".jpg");
            afbeeldingRoze = getImage(pad);

            double randomGrijs = Math.random();
            int worpGrijs = (int) (randomGrijs * 6);
            pad = Dobbelstenen.class.getResource("/Creaties/KleurDobbelstenen/Grijs/dobbel" + worpGrijs + ".jpg");
            afbeeldingGrijs = getImage(pad);
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
        x = 40;
        g.drawImage(afbeeldingOranje, x, 120, 50, 50, this);
        x += 80;
        g.drawImage(afbeeldingBruin, x, 120, 50, 50, this);
        x += 80;
        g.drawImage(afbeeldingPaars, x, 120, 50, 50, this);
        x += 80;
        g.drawImage(afbeeldingRoze, x, 120, 50, 50, this);
        x += 80;
        g.drawImage(afbeeldingGrijs, x, 120, 50, 50, this);
    }
}