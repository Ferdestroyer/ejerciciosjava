package ejerciciohoja3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

	String frase="";
	int contador;
	contador=0;
	int longitud=0;
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("introduce la frase");
		frase=teclado.nextLine();
		
		int mayus;
		mayus=frase.length();
		do{
			longitud=frase.indexOf(contador);
			char letra=frase.charAt(contador);
			contador=contador+1;
			if (letra)
		
		}while (contador<=10);
		
		
		
		

	}

}