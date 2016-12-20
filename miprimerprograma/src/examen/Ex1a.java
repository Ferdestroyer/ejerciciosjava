package examen;
import java.util.Scanner;

import javax.swing.SingleSelectionModel; 
public class Ex1a {

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
		System.out.print("Teclea un número mayor que 0 ");
		numero = teclado.nextInt(); 
		if (numero<1){
			System.out.println("Número erróneo");
		} else {
			for ( int i = 0; i < numero; i++ ) { 
				// Imprimo blancos 
				for ( int j = i; j < numero - 1; j++ ) 
					System.out.print(' '); 
				// Imprimo asteriscos 
				for ( int j = numero - i; j <= numero; j++ ) 
					System.out.print('*'); 

				System.out.println(); 
			} 
		}
	} 

}
