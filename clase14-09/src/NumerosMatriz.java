import java.util.Scanner;

public class NumerosMatriz {
	int cant = 0,sumados=0;
	Scanner teclado = new Scanner(System.in);
	public int[][] numeros;
	void ingresarLargo() {
		System.out.print("Ingrese cuantos datos van a tener las columnas: ");
		cant = teclado.nextInt();
	}

	

	void cargar() {
		numeros = new int[2][cant];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < cant; j++) {
				System.out.print("Ingrese un numero: ");
				numeros[i][j] = teclado.nextInt();
			}
		}
	}
	void mostrar() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < cant; j++) {
				System.out.print(numeros[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	void sumar() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < cant; j++) {
				sumados+= numeros[i][j];
				
			}
		}
		System.out.print("La suma total de los elementos es: "+sumados);
	}
}
