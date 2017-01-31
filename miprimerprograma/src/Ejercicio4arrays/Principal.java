package Ejercicio4arrays;

import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		int mo, desde, hasta;
		Matriz m1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("MATRIZ MAGICA DE 5X5");
		System.out.println();
		System.out.println();
		
		System.out.println("Introduce desde que numero coge un valor aleatorio");
		desde=teclado.nextInt();

		System.out.println("Introduce hasta que numero coge un valor aleatorio");
		hasta=teclado.nextInt();
		m1=new Matriz(desde,hasta);
		System.out.println("Valores generados en la Matriz:");
		System.out.println();
		System.out.println("Matriz:");
		m1.imprimeMatriz();
		m1.Buscar();
		
		
	}

}
