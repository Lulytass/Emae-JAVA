import java.util.Scanner;

public class MayusYMin {
	String palabra;
	void ingresar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese una frase o texto: ");
		palabra = teclado.nextLine();
		
		contar(palabra);
	}
	void contar(String p) {
		
		int cantMin=0, cantMay=0;
		
		char[] arrMin = p.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("!", "").replace("?", "").toCharArray();
		char[] arr = p.replace(" ", "").replace(".", "").replace(",", "").replace("!", "").replace("?", "").toCharArray();
		int largo = p.replace(" ", "").replace(".", "").replace(",", "").replace("!", "").replace("?", "").length();
		for(int i= 0; i < largo ; i++) {
			if(arr[i] == arrMin[i]) {
				cantMin++;
			}else {
				cantMay++;
			}
		}
		System.out.println(p+" tiene "+cantMin+" letran en minuscula y "+cantMay+ " letras en mayuscula");
	}
	
}
