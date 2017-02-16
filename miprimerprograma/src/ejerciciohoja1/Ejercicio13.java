package ejerciciohoja1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int a=0;
		int n;
		
		System.out.println("dame un numero:");
		n=teclado.nextInt();
		
		for (int i=1; i<=n; i++) {
			a=a+i;
			 
		}//for
		 System.out.println (a);
	}//main
} //class
