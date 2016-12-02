// Hoofdstuk 14
package Opdrachten.H14;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.util.Random;

// Een klasse met de naam Opdracht1 van het type Applet.
@SuppressWarnings("serial")
public class PraktijkOpdracht extends Applet {
    private Image smiley;
    private URL pad;
    Label label;
    TextField tekstvak;
    double random;
    int aantalRijen, aantalSmileys, computerGetal, x, y, spelerGetal;
    Button speelKnop;
    boolean foutmelding, geklikt, klaar, start;
    String error, computerString;

    // Een (lege) methode die de Applet gaat initialiseren.
    public void init() {
        setSize(600, 400);
        foutmelding = false;
        geklikt = false;
        klaar = false;
        start = false;
        aantalSmileys = 23;
        aantalRijen = 6;
        error = "";
        label = new Label("Hoeveel smileys neem je (één, twee of drie)?");
        add(label);
        tekstvak = new TextField("", 3);
        add(tekstvak);
        speelKnop = new Button("      Speel      ");
        speelKnop.addActionListener(new speelKnopLuisteraar());
        add(speelKnop);
        pad = PraktijkOpdracht.class.getResource("/Opdrachten/H14/Smileys/Smiley-Neutraal.png");
        smiley = getImage(pad, "Smiley-Neutraal.png");
    }

    class speelKnopLuisteraar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (klaar == true) {
                    // Spel opnieuw starten
                    speelKnop.setLabel("Speel");
                    pad = PraktijkOpdracht.class.getResource("/Opdrachten/H14/Smileys/Smiley-Neutraal.png");
                    smiley = getImage(pad, "Smiley-Neutraal.png");
                    aantalSmileys = 23;
                    klaar = false;
                }
                if (klaar == false) {
                    // Speler is aan zet
                    error = "";
                    if (start == false) {
                        spelerGetal = Integer.parseInt(tekstvak.getText());
                    }
                    if (spelerGetal == 1 || spelerGetal == 2 || spelerGetal == 3) {
                        if (aantalSmileys != 0) {
                            if (spelerGetal >= aantalSmileys) {
                                spelerGetal = aantalSmileys;
                                computerString = "Ha!!! Je hebt verloren.";
                                pad = PraktijkOpdracht.class.getResource("/Opdrachten/H14/Smileys/Smiley-Win.png");
                                smiley = getImage(pad, "Smiley-Win.png");
                                klaar = true;
                                start = true;
                                speelKnop.setLabel("Nieuw spel?");
                            }
                        }
                        aantalSmileys = aantalSmileys - spelerGetal;

                        if (aantalSmileys != 0) {
                            if (computerGetal >= aantalSmileys) {
                                computerGetal = aantalSmileys;
                                computerString = "Hmmm... je hebt gewonnen.";
                                pad = PraktijkOpdracht.class.getResource("/Opdrachten/H14/Smileys/Smiley-Verloren.png");
                                smiley = getImage(pad, "Smiley-Verloren.png");
                                klaar = true;
                                start = true;
                                speelKnop.setLabel("Nieuw spel?");
                            }
                        }
                        if (klaar == false) {
                            // Computer is aan zet
                            if (aantalSmileys % 4 == 0 + 1) {
                                random = Math.random();
                                computerGetal = new Random().nextInt(3) + 1;
                                pad = PraktijkOpdracht.class.getResource("/Opdrachten/H14/Smileys/Smiley-Neutraal.png");
                                smiley = getImage(pad, "Smiley-Neutraal.png");
                            } else {
                                pad = PraktijkOpdracht.class.getResource("/Opdrachten/H14/Smileys/Smiley-Blij.png");
                                smiley = getImage(pad, "Smiley-Blij.png");
                            }
                            if (aantalSmileys % 4 == 0 + 2) {
                                computerGetal = 1;

                            }
                            if (aantalSmileys % 4 == 0 + 3) {
                                computerGetal = 2;
                            }
                            if (aantalSmileys % 4 == 0) {
                                computerGetal = 3;

                            }
                            if (start == true) {
                                start = false;
                                computerGetal = 0;
                                aantalSmileys = 23;
                                pad = PraktijkOpdracht.class.getResource("/Opdrachten/H14/Smileys/Smiley-Neutraal.png");
                                smiley = getImage(pad, "Smiley-Neutraal.png");
                            }
                        }
                        aantalSmileys = aantalSmileys - computerGetal;
                        geklikt = true;
                        tekstvak.setText("");
                        repaint();
                    } else {
                        foutmelding = true;
                        geklikt = true;
                        error = "De variable klopt niet.";
                        tekstvak.setText("");
                        repaint();
                    }
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
        if (klaar == false) {
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
                        if (spelerGetal <= aantalSmileys) {
                            g.drawImage(smiley, x, y, 40, 40, this);
                            x += 50;
                        }
                    }
                    foutmelding = false;
            }
        }
        if (klaar == true) {
            if (aantalSmileys <= 0) {
                g.drawString("" + computerString, 50, 50);
                x = 50;
                y = 80;
                g.drawImage(smiley, x, y, 120, 120, this);
                tekstvak.setText("");
            }
        }
    }
}