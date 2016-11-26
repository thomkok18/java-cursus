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
    String[] dobbelsteen;
    double random;
    int worp;
    private Image afbeelding;
    private URL pad;
    Button gooiKnop;

    // Een (lege) methode die de Applet gaat initialiseren.
    public void init() {
        setSize(400, 200);
        dobbelsteen = new String[6];
        for (int i = 0; i < dobbelsteen.length; i++) {
            pad = Dobbelstenen.class.getResource("/Creaties/Dobbelsteen/dobbel" + i + ".jpg");
            afbeelding = getImage(pad, "dobbel"+ i +".jpg");
        }
//        gooiKnop = new Button("Gooi");
//        gooiKnop.addActionListener(new DobbelKnopLuisteraar());
//        add(gooiKnop);
    }

//    class DobbelKnopLuisteraar implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            random = Math.random();
//            worp = (int) (random * 6 + 1);
//            repaint();
//        }
//    }

    // Een methode die de inhoud van het scherm tekent.
    public void paint(Graphics g) {
        g.drawString(pad.toString(), 20, 10 );
        g.drawImage(afbeelding, 20, 20, 400, 300, this);
    }
}