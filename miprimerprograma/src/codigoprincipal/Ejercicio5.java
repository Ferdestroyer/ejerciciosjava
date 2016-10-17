package codigoprincipal;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		float a = 0;
		float b = 0;
		float c = 0;
		float producto = 0;
		float suma = 0;
	
	       System.out.println ("Por favor introduzca el primer numero:");
	        
	       Scanner numero1 = new Scanner(System.in);

	       a=numero1.nextFloat(); 

	       System.out.println ("Por favor introduzca el segundo numero:");

	       Scanner numero2 = new Scanner(System.in);
	       b=numero2.nextFloat();
	       
	       System.out.println ("Por favor introduzca el tercer numero:");

	       Scanner numero3 = new Scanner(System.in);
	       c=numero3.nextFloat();
	       
	       producto = a*b*c;
	       suma = a+b+c;
	       
			if (a < 0){
				System.out.println ("el producto es: "+producto);}
			else {
				System.out.println ("la suma es: "+suma);}


	}	
}


