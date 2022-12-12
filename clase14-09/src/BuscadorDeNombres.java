import java.util.Scanner;

public class BuscadorDeNombres {
	String nomUsuario;
	String  arr[]= {"Laura","Matias","Federico","Pamela","Adrian","Tomas"};

	Scanner teclado = new Scanner(System.in);
	
	void pedirNombre() {
		System.out.print("Ingrese el nombre que quiere buscar: ");
		nomUsuario = teclado.nextLine();
	}
	
	void buscador() {
		int i,pos=0;
		boolean bool=false;
		for(i=0;i<arr.length;i++){
			if(arr[i].equals(nomUsuario)==true) {
				bool=true;
				pos=i;
			}
		}
		if(bool == true) {
			System.out.print("El nombre esta en la ubicacion "+pos);
		}else {
			System.out.print("El nombre no existe");
		}
		
	}
}
