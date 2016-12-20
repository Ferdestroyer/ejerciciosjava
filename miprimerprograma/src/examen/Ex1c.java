package examen;
import java.util.Scanner;

import javax.swing.SingleSelectionModel; 
public class Ex1c {

	public static void main(String[] args) {

		/* 
		 * Imprime una secuencia a partir de un número N. 
		 * Ejemplo para N=3 
		 *   * 
		 *  ** 
		 * *** 
		 */ 
		Scanner teclado = new Scanner(System.in); 
		int numero; 
		String salida="";
		System.out.print("Teclea un número mayor que 0 ");
		numero = teclado.nextInt(); 
		if (numero<1){
			System.out.println("Número erróneo");
		} else {
			for ( int i = 1; i < numero; i++ ) 
				salida += " "; 
			salida += "*";
			System.out.println(salida); 

			for ( int i = 1; i < numero; i++ ) { 
				salida = salida.replace(" *", "**"); 
				System.out.println(salida); 
			} 
		} 
	}
} 