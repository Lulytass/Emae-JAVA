public class Matriz {
	int[][] matriz = new int[3][3];
	int aux = 0;

	void cargar() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				aux = (int) (Math.random() * 99);
				matriz[i][j] = aux;
			}
		}
	}

	void mostrar() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
