import java.util.Scanner;

public class Palindromo {
	String palabra;
	void pedirPalabra() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		palabra = teclado.nextLine();
		palabra = palabra.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
		.replace("ú", "u").replace(" ", "");
		System.out.println(palabra + " es palindromo? " + esPalin(palabra));
	}
	
	 boolean esPalin (String p){
		String alReves;
		alReves = new StringBuilder(p).reverse().toString();
		return alReves.equals(p);
	}
}
