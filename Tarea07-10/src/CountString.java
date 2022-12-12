import java.util.Scanner;

public class CountString {
	String palabra = " ";

	void pedirPalabra() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		palabra = teclado.nextLine();
		if (palabra == " ") {
			System.out.println("No ingreso ninguna palabra o caracter");
		}
		while (palabra == " ") {
			System.out.println("Ingrese una palabra: ");
			palabra = teclado.nextLine();
		}
		System.out.println("Ingrese el caracter a buscar: ");
		char caracter =  teclado.next().charAt(0);	
		int repetidos = contarCaracter(palabra, caracter);
		System.out.println("se repite el caractes "+repetidos+" veces.");
	}

	int contarCaracter(String p, char x) {
		int cant=0;
		char [] arr= p.toCharArray(); 
		
		for(int i=0;i<arr.length;i++) {
			if(x == arr[i]) {
				cant++;
			}else if(arr.length == 1) {
				System.out.println("El unico caracter ingresado es "+ p);
			}
		}
		return cant;
	}
}
