package ejerciciohoja2;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
			
		
	int numero=0;
	int contador = 2;
	boolean primo=true;
	
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduce el numero a comprobar");
	numero=teclado.nextInt();
		  
	while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		}

			System.out.println(primo);
		}
}