package ejerciciohoja1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) throws IOException{
		try{
			Scanner teclado = new Scanner(System.in);	
			float a;
			float b;
			float c;
			System.out.println("dame un numero con decimales:");
			a=teclado.nextFloat();
			System.out.println("dame un numero con decimales:");
			b=teclado.nextFloat();
			System.out.print ("a:"+a);
			System.out.print (" b:"+b);

			c=a;
			a=b;
			b=c;

			System.out.print (" a:"+a);
			System.out.print (" b:"+b);
		}
		catch(InputMismatchException e){
			System.out.println ("Error, has introducido un caracter erroneo");
			System.exit(0);
		}



	}
}		
		
