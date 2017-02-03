package Ejercicio8arrays;

import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		int mo, desde, hasta, alumno;
		Matriz m1, intercambio;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Asignaturas y alumnos con sus notas");
		System.out.println();
		System.out.println();
		
		System.out.println("Introduce desde que numero coge un valor aleatorio");
		desde=teclado.nextInt();

		System.out.println("Introduce hasta que numero coge un valor aleatorio");
		hasta=teclado.nextInt();
		m1=new Matriz(desde,hasta);
		System.out.println();
		System.out.println("Matriz de asignaturas y notas:");
		m1.imprimeMatriz();
		System.out.println();
		System.out.println("Introduce el numero del alumno");
		alumno=teclado.nextInt();
	}

}
