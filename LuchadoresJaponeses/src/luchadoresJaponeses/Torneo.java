package luchadoresJaponeses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Torneo {

	private int cantidad;
	private Luchador[] luchadores;
	private int[] domina;

	public Torneo(String path) throws FileNotFoundException {

		Scanner sc = new Scanner(new File(path));
		sc.useLocale(Locale.ENGLISH);

		cantidad = sc.nextInt();
		luchadores = new Luchador[cantidad];
		domina = new int[cantidad];

		for (int i = 0; i < luchadores.length; i++) {

			luchadores[i] = new Luchador(sc.nextInt(), sc.nextInt());
		}

		sc.close();

	}

	public void resolver() throws IOException {

		PrintWriter pw = new PrintWriter(new FileWriter("luchadores.out"));

		for (int i = 0; i < cantidad; i++) {

			for (int j = i + 1; j < cantidad; j++) {

				if (luchadores[i].Domina(luchadores[j])) {

					domina[i]++;
				}

				if (luchadores[j].Domina(luchadores[i])) {
					domina[j]++;
				}

			}

		}

		for (int i = 0; i < cantidad; i++) {
			pw.println(domina[i]);
		}

		pw.close();

	}

}
