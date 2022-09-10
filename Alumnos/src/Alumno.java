import java.util.Scanner;

public class Alumno {
	public void ingresarAl() {
	Scanner teclado = new Scanner(System.in);
	float not1=0;
	float not2=0;
	float not3=0;
	float prom=0;
	String nombre;
	System.out.print("ingrese el nombre del alumno: ");
	nombre= teclado.nextLine();
	System.out.print("ingrese la primer nota");
	not1=teclado.nextFloat();
	System.out.print("ingrese la primer nota");
	not2=teclado.nextFloat();
	System.out.print("ingrese la primer nota");
	not3=teclado.nextFloat();	
	prom=(not1+not2+not3)/3;
	System.out.print("El promedio del alumno es: ");
	System.out.print(prom);
	}
}
