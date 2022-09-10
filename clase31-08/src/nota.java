import java.util.Scanner;

public class nota {
	public int prom = 0;
	public int[] notas = new int[3];

	public void promedio() {
		for (int j = 0; j < 3; j++) {

			Scanner teclado = new Scanner(System.in);
			System.out.print("Ingrese una nota: \n");
			notas[j] = teclado.nextInt();
			prom = prom + notas[j];
		}
		System.out.print("El promedio es: " + prom / 3);

	}
}
