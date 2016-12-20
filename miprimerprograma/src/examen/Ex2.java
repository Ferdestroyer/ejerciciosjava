package examen;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		final String CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";
		String letraDNI=""; // letra dni introducido
		char letra=' '; // letra de control
		int numero=0; //n�mero del dni
		boolean correcto = true;

		do {
			if (!correcto){ // mensaje para repetir lectura de datos
				System.out.println("DNI err�neo: "+numero+letraDNI+" Teclee de nuevo");
			}
			correcto = true; 
			System.out.print("Introduce el n�mero del DNI: ");
			// leo el N�mero
			numero = teclado.nextInt();
			if (numero<1 || numero>99999999) {
				correcto = false;
			}else {// leo la letra
				System.out.print("Introduce la letra del DNI: ");

				letraDNI = teclado.nextLine().toUpperCase();
				letraDNI = teclado.nextLine().toUpperCase();
				letra = letraDNI.charAt(0);
				// Compruebo que c�digo de control es correcto 
				correcto = letra == CONTROL.charAt(numero % 23);		            	
			}

		} while ( ! correcto );
		System.out.printf("DNI correcto: %08d %1c",numero,letra);
	}

} 



