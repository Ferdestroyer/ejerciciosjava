package ejerciciohoja2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		String frases;
		int cont;
		cont=0;
		
		Scanner teclado = new Scanner(System.in);
		
		do{
			
		System.out.println("Introduce la frase:");
		frases=teclado.nextLine();
		cont=cont+1;
		
		
		}while (!frases.equalsIgnoreCase(""));
	
		cont=cont-1;
		
		System.out.print("Numero de frases: "+cont);
	
	}

}
