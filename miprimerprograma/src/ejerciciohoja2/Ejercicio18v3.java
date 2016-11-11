package ejerciciohoja2;

import java.util.Scanner;

public class Ejercicio18v3 {

	public static void main(String[] args) {
		String frase;
		String letra;
		int cont;
		int posicion=0;
		cont=0;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce la frase");
		frase=teclado.nextLine();
		System.out.println("introduce la letra");
		letra=teclado.next();
		
		//bucle definitivo para contar una letra de un string metodo no forzado (super rapido)
		
		  posicion = frase.indexOf(letra); 
		
		 while (posicion!=-1) {
		      cont++; 
		      posicion = frase.indexOf(letra, posicion + 1); 
		      
		    }
		
			System.out.println("la letra "+letra+" aparece " +cont+" veces");
			
	}

}