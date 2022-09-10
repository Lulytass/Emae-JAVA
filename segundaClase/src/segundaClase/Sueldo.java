package segundaClase;

import java.util.Scanner;

public class Sueldo {

	Scanner teclado = new Scanner(System.in);

	public void sueldoEmpleado() {

		int horast = 0;
		float costoh = 0;
		float sueldo = 0;
		System.out.print("Ingrese horas trabajadas");
		horast = teclado.nextInt();
		System.out.print("Ingrese el valor de la hora");
		costoh = teclado.nextFloat();
		sueldo = horast * costoh;
		System.out.print("El sueldo total es :");
		System.out.print(sueldo);
	}

}
