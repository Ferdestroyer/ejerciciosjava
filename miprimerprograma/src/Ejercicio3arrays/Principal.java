package Ejercicio3arrays;

import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		int mo, desde, hasta;
		Vector v1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("VECTOR MAGICO QUE ENCUENTRA EL MENOR Y EL MAYOR E IMPRIME LAS POSICIONES");
		System.out.println();
		System.out.println();
		System.out.println("Introduce el tamaño de tus arrays");
		mo=teclado.nextInt();
		
		System.out.println("Introduce desde que numero coge un valor aleatorio");
		desde=teclado.nextInt();

		System.out.println("Introduce hasta que numero coge un valor aleatorio");
		hasta=teclado.nextInt();
		v1=new Vector(mo,desde,hasta);
		System.out.println("Valores generados en los Arrays:");
		System.out.println();
		System.out.println("Vector 1:");
		v1.imprimeVector();
		v1.Buscar();
		
		
	}

}
