package DAT100Innlevering1; //Må legges til om man lager class i ny package.

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class O1 {
	static int mengdestudenter = 10;
	public static void main(String[] args) {
		for (int i = 1; i <= mengdestudenter; i++) {
			int gyldig = 0;
			while (gyldig == 0) {
				String KarakterIn = showInputDialog("Hva er student "+ i + " sin karakter?:");
				int Karakter = parseInt(KarakterIn);
				if (Karakter >= 90 && Karakter <= 100) { //if Karakter er fra 90-100
					System.out.println("karakter: A");
					gyldig = 1;
				}
				else if (Karakter >= 80 && Karakter <= 89) { //if Karakter er fra 80-89
					System.out.println("karakter: B");
					gyldig = 1;
				}
				else if (Karakter >= 60 && Karakter <= 79) { //if Karakter er fra 60-79
					System.out.println("karakter: C");
					gyldig = 1;
				}
				else if (Karakter >= 50 && Karakter <= 59) { //if Karakter er fra 50-59
					System.out.println("karakter: D");
					gyldig = 1;
				}
				else if (Karakter >= 40 && Karakter <= 49) { //if Karakter er fra 40-49
					System.out.println("karakter: E");
					gyldig = 1;
				}
				else if (Karakter >= 0 && Karakter <= 39) { //if Karakter er fra 0-39
					System.out.println("karakter: F");
					gyldig = 1;
				}
				else {
					System.out.println("FEIL: Ugyldig nummer.");
				}
			}
		}

	}

}