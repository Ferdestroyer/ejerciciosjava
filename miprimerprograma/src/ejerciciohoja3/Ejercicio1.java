package ejerciciohoja3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

	String frase="";
	int contador;
	contador=1;
	String frasefinal="";
	Scanner teclado = new Scanner(System.in);

	System.out.println("introduce la frase");
		frase=teclado.nextLine();
		
		int longitud;
		longitud=frase.length();
		do{
		
			frasefinal=frase.substring(0,contador);
			contador=contador+1;
			System.out.println(frasefinal);
			
		}while (contador>=longitud);
		
		
		
		

	}

}
