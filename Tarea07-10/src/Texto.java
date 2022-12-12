import java.util.Scanner;

public class Texto {
	void pedirTexto() {
		String texto;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un texto: ");
		texto = teclado.nextLine();
		imprimir(texto);
	}
	void imprimir(String t) {
		System.out.println("El texto era: "+t);
	}
}
