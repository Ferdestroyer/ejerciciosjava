package Ejercicio2arrays;

import java.util.Scanner;

import Ejercicio1arrays.Vector;

public class Principal {

	public static void main(String[] args) {
		int mo, desde, hasta;
		Vector v1, v2, v3;
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
		v1=new Vector(mo,desde,hasta);
		v2=new Vector(mo,desde,hasta);
		v3=v1.suma2vectores(v2);
		System.out.println("Valores generados en los Arrays:");
		System.out.println();
		System.out.println("Vector 1:");
		v1.imprimeVector();
		System.out.println();
		System.out.println("Vector 2:");
		v2.imprimeVector();
		System.out.println();
		System.out.println("Suma de los valores sin ordenar");
		v3.imprimeVector();
		System.out.println();
		System.out.println("Suma de los valores ordenado");
		
		
		
	}

}
