package Ejercicio7arrays;

import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		int mo, desde, hasta, fila1, fila2;
		Matriz m1, intercambio;
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
		System.out.println("Matriz sin modificar:");
		m1.imprimeMatriz();
	
		System.out.println("numero de fila 1");
		fila1=teclado.nextInt();
		System.out.println("numero de fila 2");
		fila2=teclado.nextInt();
		intercambio=m1;
		intercambio.Intercambiar(fila1,fila2);
		intercambio.imprimeMatriz();
	}

}
