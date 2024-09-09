package DAT100Innlevering1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {
		int nummer = 1;
		String HtallInn = showInputDialog("Skriv in helltall:");
		int n = Integer.parseInt(HtallInn);
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				nummer = nummer*i; //1*2*3.... - Printer ut nummer ganget med neste i rekkefølgen.
				System.out.println("Ny nummer blir: " + nummer);
			}
		}
		else {
			System.out.println("FEIL: Ugyldig nummer.");
		}
		System.out.println("Ditt endelige nummer er " + nummer);

	}

}
