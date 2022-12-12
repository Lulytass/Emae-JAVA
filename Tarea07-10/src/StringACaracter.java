import java.util.Scanner;

public class StringACaracter {
	void IngresarPalabra() {
		String palabra;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		palabra = teclado.nextLine();
		mostrarCaracteres(palabra);
	}
	void mostrarCaracteres(String s) {
		char [] arr= s.toCharArray(); 
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
