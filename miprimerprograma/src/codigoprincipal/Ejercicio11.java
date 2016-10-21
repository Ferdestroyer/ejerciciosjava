package codigoprincipal;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		String gradosuperior;
		String bachiller;
		String pruebadeacceso;

		System.out.println ("풲ienes el bachiller?, responde si o no"); //pregunta si tiene bachiller
		Scanner siono = new Scanner(System.in); //nos guarda lo que escribamos por teclado

		bachiller=siono.nextLine(); //le da a bachiller el valor por teclado

		while (!bachiller.equalsIgnoreCase("SI") && !bachiller.equalsIgnoreCase("NO")){
			System.out.println ("풲ienes el bachiller?, responde si o no");
			bachiller=siono.nextLine();
		}//while
		

			if (bachiller.equalsIgnoreCase("SI")) //le decimos que si bachiller es = a si de todas las formas posibles a escribirlo
			{
				gradosuperior="si"; //
				System.out.println (gradosuperior+" puedes hacer Grado superior");
			}
			else {

				System.out.println ("풲ienes la prueba de acceso?, responde si o no"); //texto que indica que escribamos el mes
				Scanner siono1 = new Scanner(System.in); //nos guarda lo que escribamos por teclado
				pruebadeacceso=siono1.nextLine();
				
				while (!pruebadeacceso.equalsIgnoreCase("SI") && !pruebadeacceso.equalsIgnoreCase("NO")){
					System.out.println ("풲ienes la prueba de acceso?, responde si o no");
					pruebadeacceso=siono1.nextLine();
				}//while
				
				
				
				if (pruebadeacceso.equalsIgnoreCase("SI")){
					System.out.println (pruebadeacceso+" puedes hacer Grado superior");

				}
				else{
					gradosuperior="no";
					System.out.println (gradosuperior+" puedes hacer Grado superior");		
				}
			}//if externo
	}

}
