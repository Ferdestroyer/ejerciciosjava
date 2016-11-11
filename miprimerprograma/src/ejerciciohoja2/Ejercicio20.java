package ejerciciohoja2;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		long numero=0;
		long factorial=1;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce el numero a factorizar");
		numero=teclado.nextInt();
		
		//bucle para factorizar
		
	    while ( numero!=0) {
	        factorial=factorial*numero;
	        numero--; //resta 1 al numero
	      }
	    
	    System.out.println(factorial);
		
	}

}
