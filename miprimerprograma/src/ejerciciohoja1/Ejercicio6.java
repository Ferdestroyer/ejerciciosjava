package ejerciciohoja1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		float a = 0;
		float potencia = 0;
		double raiz = 0;
		System.out.println ("Por favor introduzca el primer numero:");
        
	       Scanner numero1 = new Scanner(System.in);

	       a=numero1.nextFloat(); 
	       if (a <= 0) {
	    	   System.out.println ("error del programa");
	    	   System.exit(0);
	       }
	       else {
	    	   potencia = a*a;
	    	   raiz = Math.sqrt(a);
	    	   System.out.println ("La potencia es " +potencia);
	    	   System.out.println ("La raiz es " +raiz);
	    	   
	       }

	      
	}

}
