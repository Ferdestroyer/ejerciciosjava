package ejerciciohoja3;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String frase;
		int mayusculas=0;
		int minusculas=0;
		char letra;
		String mayuscula;
		String minuscula;
		int index;	
		index=0;

		do { 
			System.out.println("introduce una frase");
			frase=teclado.nextLine();		
		}while (frase.length()>80);
		letra=frase.charAt(index);
		
		index++;
				
		if ('A'<=letra&&'Z'>=letra ||'Ñ'==letra)
			mayusculas=mayusculas++;
		mayuscula=mayusculas+ "    ";

		if ('a'<=letra&&'z'>=letra ||'ñ'==letra)
			minusculas=minusculas++;
		minuscula=minusculas+ "  ";


		System.out.println("Letras mayusculas "+mayuscula);
		System.out.println("Letras minusculas "+minuscula);
	} //main
}//class