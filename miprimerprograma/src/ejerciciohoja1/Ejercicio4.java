package ejerciciohoja1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		float a = 0;
		float b = 0;
		float c = 0;

	       System.out.println ("Por favor introduzca el primer numero:");
	        
	       Scanner numero1 = new Scanner(System.in);

	       a=numero1.nextFloat(); 

	       System.out.println ("Por favor introduzca el segundo numero:");

	       Scanner numero2 = new Scanner(System.in);
	       b=numero2.nextFloat();
	       
	       System.out.println ("Por favor introduzca el tercer numero:");

	       Scanner numero3 = new Scanner(System.in);
	       c=numero3.nextFloat();
	       
	       
	       
	       if (a>b && a>c){
	    	   System.out.println ("el numero mayor es "+a);
	       }
	    	   else if(b>a && b>c){
	    		 
	    			   System.out.println ("el numero mayor es "+b);
	    		   }
	    		   				 
	    		   else if(c>a && c>b){
	    			
	    				System.out.println ("el numero mayor es "+c);
	    			}
	    	   }
	}
	    	   
	    	   
	       
		
		
		
		
	


