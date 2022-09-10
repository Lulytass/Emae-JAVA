package promedioPropio;

import java.util.Scanner;

public class PromedioAlumno {
	private float n1,n2,n3,n4,n5;
	private String nombre;
	
	public float getN2() {
		return n2;
	}
	public void setN2(float n2) {
		this.n2 = n2;
	}
	public float getN1() {
		return n1;
	}
	public void setN1(float n1) {
		this.n1 = n1;
	}
	public float getN3() {
		return n3;
	}
	public void setN3(float n3) {
		this.n3 = n3;
	}
	public float getN4() {
		return n4;
	}
	public void setN4(float n4) {
		this.n4 = n4;
	}
	public float getN5() {
		return n5;
	}
	public void setN5(float n5) {
		this.n5 = n5;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void promedio() {
		Scanner teclado =new Scanner(System.in);
		float prom=0;
		System.out.print("Ingrese el nombre del alumno: ");
		nombre = teclado.nextLine();
		System.out.print("Ingrese la primer nota: ");
		n1 = teclado.nextFloat();
		System.out.print("Ingrese la segunda: ");
		n2 = teclado.nextFloat();
		System.out.print("Ingrese la tercer: ");
		n3 = teclado.nextFloat();
		System.out.print("Ingrese la cuarta: ");
		n4 = teclado.nextFloat();
		System.out.print("Ingrese la quinta: ");
		n5 = teclado.nextFloat();
		prom=(n1+n2+n3+n4+n5)/5;
		System.out.print("El promedio de "+nombre+" en la carrera es: "+prom);
	}
}
