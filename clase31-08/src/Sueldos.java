import java.util.Scanner;

public class Sueldos {
 public void cargarSueldos() {
	 int n;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Cuantos sueldos se van a cargar: ");
		n=teclado.nextInt();
		int [] sueldo = new int [n];
		for(int i=0;i<n;i++) {
			System.out.print("Ingrese un sueldo: ");
			sueldo[i]=teclado.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(sueldo[i]+"\n");
			
		}
 }
}
