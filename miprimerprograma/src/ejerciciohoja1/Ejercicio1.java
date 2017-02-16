package ejerciciohoja1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
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
}		
		
