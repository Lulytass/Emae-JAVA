import java.util.Scanner;

public class PaisCapitalContinente {
	String[][] paCapCont = new String[3][3];

	void cargar() {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Ingrese un Pais su Capital y Continente: ");
				paCapCont[i][j] = teclado.nextLine();
			}
		}
	}

	void ordenar() {
		for(int i=0; i<2;i++) {
			for(int j=i+1; j<3;j++) {
				if(paCapCont[i][0].compareTo(paCapCont[j][0])>0) {
					 String[] aux= paCapCont[i];
					 paCapCont[i]=paCapCont[j];
					 paCapCont[j]=aux;
				}
			}
			
		}
	}
	
	void mostrar() {
		System.out.printf("%18s%18s%18s\n", "PAIS", "CAPITAL", "CONTINENTE");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%18s",paCapCont[i][j]);
			}
			System.out.println("");
		}
	}
}
