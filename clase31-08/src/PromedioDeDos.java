import java.util.Scanner;

public class PromedioDeDos {
	void cargar() {
		Scanner teclado = new Scanner(System.in);
		float[] notas1 = new float[5];
		float[] notas2 = new float[5];
		float prom1 = 0;
		float prom2=0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Ingrese las notas del primer curso: ");
			notas1[i] = teclado.nextFloat();
			prom1 += notas1[i];
		}
		for (int i = 0; i < 5; i++) {
			System.out.print("Ingrese las notas del segundo curso: ");
			notas2[i] = teclado.nextFloat();
			prom2 += notas2[i];
		}
		
		System.out.print("Promedio curso 1 : "+prom1/5+"\n"+"Promedio curso 2: "+prom2/5+"\n");
		if(prom1 < prom2)
			System.out.print("El segundo curso tiene el promedio mas alto");
		else
			System.out.print("El primer curso tiene el promedio mas alto");
	}
}
