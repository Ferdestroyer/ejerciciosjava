package codigoprincipal;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n, par, suma=0;
	
		System.out.println("dame un numero:");
		n=teclado.nextInt();
		 if (n % 2==0) {
			 par=n;
		 }else {
			 par=n+1;
		 }
		for (int i=1; i<=n; i++) {
			//System.out.println (par);
			suma=suma+par;
			par=par+2;
			
		}//for
		 System.out.println ("****"+suma);//la ponemos fuera del bucle para que nos muestre solo la suma. y no las parciales.
		 
	}//main
} //class
