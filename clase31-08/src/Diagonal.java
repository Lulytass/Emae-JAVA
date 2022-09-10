import java.util.Scanner;

public class Diagonal {
	void diagPrincipal() {
		int [][] numeros = new int[4][4];
		int [] diag = new int [4];
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<4;i++) {
		  for(int j=0;j<4;j++) {
			System.out.print("Ingrese un numero de cuatro cifras: ");
			numeros[i][j]=teclado.nextInt();
		}
		}
		for(int i=0;i<4;i++) {
			diag[i]=numeros[i][i];		
		}
		System.out.print("La diagonal principal es: " + diag[0]+" - "+ diag[1]+" - "+ diag[2]+" - "+ diag[3]);
	}
}
