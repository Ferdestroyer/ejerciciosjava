package ejerciciohoja2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int numeroteclado=0;
		int cont;
		cont=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el numero:");
		numeroteclado=teclado.nextInt();
		
	for (int i=1; i<=numeroteclado; i++) {
			
				cont=cont+1;
				System.out.printf("%3d \n", i);
			
		}
	System.out.print("Numero naturales: "+cont);
	
	}

}
