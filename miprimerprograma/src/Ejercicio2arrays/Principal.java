package Ejercicio2arrays;

import java.util.Scanner;

import Ejercicio1arrays.Vector;

public class Principal {

	public static void main(String[] args) {
		int mo, desde, hasta;
		Vector2 vector;
		Scanner teclado = new Scanner(System.in);
		System.out.println("DOBLE ARRAY MAGICO DE NUMEROS CON LA SUMA DE UN TERCERO");
		System.out.println();
		System.out.println();
		System.out.println("Introduce el tamaño de tus arrays");
		mo=teclado.nextInt();
		
		System.out.println("Introduce desde que numero coge un valor aleatorio");
		desde=teclado.nextInt();

		System.out.println("Introduce hasta que numero coge un valor aleatorio");
		hasta=teclado.nextInt();
		vector=new Vector2(mo,desde,hasta);
		System.out.println("Valores generados en los Arrays:");
		vector.imprime1Vector();
		vector.imprime2Vector();
		vector.imprime3Vector();
		
		
		
	}

}
