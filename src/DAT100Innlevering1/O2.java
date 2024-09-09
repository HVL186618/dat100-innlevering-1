package DAT100Innlevering1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {
	double Brutto = 0.0;
	public static void main(String[] args) {
		int gyldig = 0;
        double Brutto = 0.0; //8 og 9 gjør at man ikke må definere de neste inni while og if løkken som double.
        double Skatt = 0.0;
        double SkattIProsent = 0.0;
		while (gyldig == 0) {
			String BruttoIn = showInputDialog("Hvor mange kroner har du i brutto?:");
			Brutto = Double.parseDouble(BruttoIn);
			if (Brutto >= 0 && Brutto <= 208050) {
				Skatt = 0; //15-16, 19-20, 23-24, 27-28 og 31-32 defineres ikke med double først pga linje 8-9.
				gyldig = 1;
			}
			else if (Brutto >= 292851 && Brutto <= 670000) {
				Skatt = 0.04;
				gyldig = 1;
			}
			else if (Brutto >= 670001 && Brutto <= 937900) {
				Skatt = 0.136;
				gyldig = 1;
			}
			else if (Brutto >= 937901 && Brutto <= 1350000) {
				Skatt = 0.166;
				gyldig = 1;
			}
			else if (Brutto >= 1350001) {
				Skatt = 0.176;
				gyldig = 1;
			}
			else {
				System.out.println("Ugyldig.");
			}
		}
		//Text after while.
		double Sum = (Brutto-(Brutto*Skatt));
		Double SkattiProsent = Skatt*100;  //Den eneste som må igjn defineres som double siden den er utenfor loopen.
		System.out.println("Du får " + Sum + " kroner etter å ha betalt " + SkattIProsent + "% i skatt.");
	}

}

