package codigoprincipal;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		String mes; //cadena de texto indicando el mes
		float importe=0; //numero con decimales indicando el importe
		float importedescuento=0; //variable para calcular el importe descuento
		
		System.out.println ("Introduzca el importe"); //texto que indica que escribamos el importe
		 Scanner importe1 = new Scanner(System.in); //nos guarda lo que escribamos por teclado

	       importe=importe1.nextFloat(); //decimos que guarde lo del scanner en la variable importe
		
		 System.out.println ("Por favor introduzca el mes:"); //texto que indica que escribamos el mes
		 Scanner mes1 = new Scanner(System.in); //nos guarda lo que escribamos por teclado

	       mes=mes1.nextLine(); //decimos al mes que sea = a lo que ponemos por teclado
		
		if (mes.equalsIgnoreCase("OCTUBRE")) //decimos que si mes sea igual a octubre con o sin mayusculas
		
			{
				importedescuento=importe-(importe/100*15); //calculamos el 15% del importe y se lo quitamos al importe
				System.out.println ("el importe es: "+importedescuento); //texto que nos indica el importe con el descuento aplicado
			}
				else{ //si no se cumple la condicion de el if
					System.out.println ("el importe es: "+importe);	//imprimimos solos el importe
				
					}
				
		
		

	}

}
