package ejerciciohoja1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int numero1=0;
		int numero2=0;
		
		
		System.out.println ("Introduce el primer numero:"); //texto que indica que escribamos el numero
		Scanner numero = new Scanner(System.in); //nos guarda lo que escribamos por teclado

	       numero1=numero.nextInt(); //decimos que el numero 1 sea = a lo que ponemos por teclado
	      
	       numero2=(numero1%2); //decimos que numero2 es = al resto de numero1 entre 2
	       
	       if (numero2==0){		//si el resto es = a 0
	    	   
	    	   System.out.println (+numero1+" es par");		//el numero es par
	       }
	       else{									
	    	   
	    	   System.out.println (+numero1+" es impar");	//el numero es impar
	       }
	       
	}

}
