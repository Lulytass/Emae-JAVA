import java.util.Scanner;

public class AlumnosConNotas {
	public String[] nombres = new String[4];
	public float[] notas = new float[4];

	void cargar() {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("Ingrese un nombre: ");
			nombres[i] = teclado.nextLine();
		}
		for (int j = 0; j < 4; j++) {
			System.out.print("Ingrese la nota de "+nombres[j]);
			notas[j] = teclado.nextInt();
			}
	}

	void mostrar() {
		for (int i = 0; i < 4; i++) {
			System.out.println("El alumno " + nombres[i] + " se saco un " + notas[i]);
		}
	}

	void ordenarPorNota() {
		float auxNota;
		String auxNom;
		for (int i = 0; i < 3; i++) {
			for(int j=i+1;j<4;j++) {
				if(notas[i]>notas[j]) {
					auxNota=notas[i];
					notas[i]=notas[j];
					notas[j]=auxNota;
					auxNom=nombres[i];
					nombres[i]=nombres[j];
					nombres[j]=auxNom;
				}
			}
		}
	}
}
