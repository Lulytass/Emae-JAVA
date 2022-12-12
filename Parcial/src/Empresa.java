import java.util.Scanner;

public class Empresa {
	Scanner teclado = new Scanner(System.in);
	String nombre = "";
	int sueldoT = 5000, dni = 0, sueldo = 5000, ant = 0;
	boolean desc = false;

	void cargar() {
		System.out.print("Ingrese nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Ingrese DNI: ");
		dni = teclado.nextInt();
		System.out.print("Ingrese antiguedad: ");
		ant = teclado.nextInt();
	}

	void sueldo() {
		if (ant >= 1) {
			sueldoT += sueldo * (0.15 * ant);
		}
		if (sueldoT > 80000) {
			sueldoT -= sueldoT * 0.05;
			desc=true;
		}
	}

	void mostrar() {
		int antEn3=ant+3;
		if(desc==true) {
			System.out.println("Al empleado se le aplica descuento");

		}
		System.out.println("El empleado cobrara este mes "+sueldoT);
		System.out.print("Sus proximos sueldos seran: ");
		do{
			ant++;
			sueldoT=5000;
			sueldo();
			System.out.print("$"+sueldoT+" ");
		}while(antEn3>ant);
		
	}

}
