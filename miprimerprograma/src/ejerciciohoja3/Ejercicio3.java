package ejerciciohoja3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		String frase, letra;
		int cont=0;

		System.out.println("Frase: ");
		frase=teclado.nextLine();
		System.out.println("Letra: ");
		letra=teclado.next();//Usar letra como char, buscar el método para pedir por teclado una variable char

		for (int i=0; i<frase.length();i++){ //longitud frase
			if (frase.charAt(i) == letra.charAt(0)){
				cont=cont+1;
			}
		}

		System.out.println(cont);

  }
}