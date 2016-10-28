package ejerciciohoja2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		String peticion;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce S o N:");
		do{
			
			peticion=teclado.nextLine();
			
			
			}while (!peticion.equalsIgnoreCase("N") && !peticion.equalsIgnoreCase("S"));
		
		System.out.println("Enhorabuena has introducido: "+peticion);
	}


}
