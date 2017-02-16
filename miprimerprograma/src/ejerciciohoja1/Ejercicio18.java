package ejerciciohoja1;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a;
		int suma;
		
		suma=0;
		
		System.out.println("dame un numero:");
		a=teclado.nextInt();
		for (int i=0; i<101; i++) {
			if (i % 2==0 || i % 3==0){	
				suma=suma+1;

			}
			  //System.out.println (suma);
		
		}//for
		System.out.println (suma);
	}//main
} //class
