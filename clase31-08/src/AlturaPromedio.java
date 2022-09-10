import java.util.Scanner;

public class AlturaPromedio {
	public void cargar() {
		int altos=0,bajos=0;
	float [] altura = new float [5];
	float suma=0, prom=0;
	Scanner teclado = new Scanner(System.in);
	for(int i=0;i<5;i++) {
		System.out.print("Ingrese una altura");
		altura[i]=teclado.nextFloat();
		suma+=altura[i];
	}
	prom=suma/5;
	for(int i=0;i<5;i++) {
		if(prom<altura[i]) 
			altos++;
		else
			bajos++;
		
	}
	System.out.print("Hay "+altos+" personas mas altas que el promedio y "+bajos+" mas bajos que el promedio, siendo este "+prom);
	}
}
