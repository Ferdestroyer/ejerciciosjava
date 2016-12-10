package ejerciciohoja3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String frase;
		char Ultimaletra;
		int ultimaPosicion;
		int posicion=0;

		System.out.println("introduce una frase");
		frase=teclado.nextLine();

		while (frase.length()>20){
			System.out.println("Frase demasiado larga");
		}
		while (posicion<frase.length()-1){
			ultimaPosicion=frase.length()-1;
			Ultimaletra=frase.charAt(ultimaPosicion);
			frase=Ultimaletra + frase.substring(0, ultimaPosicion);
			System.out.println(frase);
			posicion++;
		}


	}
}