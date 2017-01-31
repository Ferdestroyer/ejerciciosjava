package Ejercicio5arrays;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		int desde, hasta;
		Vector v1, v2, comparar;
		Scanner teclado = new Scanner(System.in);
		System.out.println("DOBLE ARRAY MAGICO DE NUMEROS que comprobara para cada uno de los elementos  del primer vector cuántas veces está en el segundo");
		System.out.println();
		System.out.println();
		
		System.out.println("Introduce desde que numero coge un valor aleatorio");
		desde=teclado.nextInt();

		System.out.println("Introduce hasta que numero coge un valor aleatorio");
		hasta=teclado.nextInt();
		v1=new Vector(desde,hasta);
		v2=new Vector(desde,hasta);
		System.out.println("Valores generados en los Arrays:");
		System.out.println();
		System.out.println("Vector 1:");
		v1.imprimeVector();
		System.out.println();
		System.out.println("Vector 2:");
		v2.imprimeVector();
		System.out.println();
		v1.Contar(v2);
	
		
		
	}

}
