import java.util.Scanner;

public class Ordenar {
	void cargarYOrdenar() {
		int aux;
		Scanner teclado = new Scanner(System.in);
		int[] datos = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print("Ingreso un numero: ");
			datos[i] = teclado.nextInt();
		}
		for (int j = 0; j < 9; j++)
			for (int z = j + 1; z < 10; z++)
				if (datos[j] > datos[z]) {
					aux = datos[j];
					datos[j] = datos[z];
					datos[z] = aux;
				}

		for (int x = 0; x < 10; x++) {
			System.out.print(datos[x] + "\n5");
		}

	}
}
