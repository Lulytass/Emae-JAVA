import java.util.Scanner;

public class Paises {
	public String[] nomPaises = new String[5];

	void cargarVector() {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {

			System.out.print("Ingrese un pais");
			nomPaises[i] = teclado.nextLine();

		}
	}

	void mostrar() {
		for (int i = 0; i < 5; i++) {

			System.out.println(nomPaises[i]);

		}
	}

	void ordenar() {

		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (nomPaises[i].compareTo(nomPaises[j]) > 0) {
					String aux;
					aux = nomPaises[i];
					nomPaises[i] = nomPaises[j];
					nomPaises[j] = aux;
				}
			}
		}
	}
}
