// Hoofdstuk 11
package H11;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.applet.Applet;
import java.awt.Graphics;

//Een klasse met de naam Opdracht10 van het type Applet.
@SuppressWarnings("serial")
public class Opdracht9 extends Applet{
	int zwartebox, wittebox;

	//Een (lege) methode die de Applet gaat initialiseren. 
	public void init(){
		setSize(300,300);
		zwartebox = 20;
		wittebox = 19;
	}

	//Een methode die de inhoud van het scherm tekent.	 
	public void paint(Graphics g){
		for(int vier = 0; vier < 4; vier++){
			int y = 50;
			for(int twee = 0; twee < 4; twee++){
				int x = 50;
				for(int evenrij = 0; evenrij < 4; evenrij++){
					g.drawRect(x, y, wittebox, wittebox); x += wittebox;
					g.fillRect(x, y, zwartebox, zwartebox); x += zwartebox;
				}
				y += zwartebox + wittebox;
				x = 50;
			}

			y -= (20+19+20+19+20+19+20);

			for(int twee = 0; twee < 4; twee++){
				int x = 50;
				for(int onevenrij = 0; onevenrij < 4; onevenrij++){
					g.fillRect(x, y, zwartebox, zwartebox); x += zwartebox;
					g.drawRect(x, y, wittebox, wittebox); x += wittebox;
				}
				y += wittebox + zwartebox;
				x = 50;
			}
		}
	}
}