package codigoprincipal;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		float a = 0;
		float b = 0;
	    float suma=a+b;
	    float resta=a-b;
	    float multi=a*b;
	    float div=a/b;
		
		 System.out.println ("Empezamos el programa");

	       System.out.println ("Por favor introduzca el primer numero:");
	        
	       Scanner numero1 = new Scanner(System.in);

	       a=numero1.nextFloat(); 

	       System.out.println ("Por favor introduzca el segundo numero:");

	       Scanner numero2 = new Scanner(System.in);
	       b=numero2.nextFloat();
	       
	       if (b < 0) {
	    	   System.out.println ("Error, el segundo numero no puede ser 0");
	       } 
	       
	       suma=a+b;
		   resta=a-b;
		   multi=a*b;
		   div=a/b;

			
	   	System.out.println("la suma es " +suma);
		System.out.println("la resta es " +resta);
		System.out.println("la multiplicacion es " +multi);
		System.out.println("la division es " +div);

	}

}
