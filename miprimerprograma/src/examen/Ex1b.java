package examen;
import java.util.Scanner;

import javax.swing.SingleSelectionModel; 
public class Ex1b {

	public static void main(String[] args) {

		/* 
		 * Imprime una secuencia a partir de un n�mero N. 
		 * Ejemplo para N=3 
		 *   * 
		 *  ** 
		 * *** 
		 */ 
		Scanner teclado = new Scanner(System.in); 
		int numero; 
		String salida="";
		System.out.print("Teclea un n�mero mayor que 0 ");
		numero = teclado.nextInt(); 
		if (numero<1){
			System.out.println("N�mero err�neo");
		} else {
			for ( int i = 0; i < numero; i++ ) 
				salida += " "; 

			for ( int i = 0; i < numero; i++ ) { 
				salida = salida.substring(1, numero) + "*"; 
				System.out.println(salida); 
			} 
		} 
	}
} 

