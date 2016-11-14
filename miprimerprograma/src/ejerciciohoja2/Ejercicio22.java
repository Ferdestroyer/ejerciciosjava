package ejerciciohoja2;

import java.util.Scanner;

public class Ejercicio22 {

		public static void main(String[] args) {
			String frases;
			
			Scanner teclado = new Scanner(System.in);
			
				
			System.out.println("Introduce la frase:");
			frases=teclado.nextLine();
			System.out.println(frases);

			for (int i=1; i<5; i++) {
				
				frases="    "+frases;
				System.out.println(frases);
			}
			
		
		}

	}