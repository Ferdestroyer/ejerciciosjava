package ejerciciohoja1;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		String alumno=("");
		float nota1=0;
		float nota2=0;
		float nota3=0;
		float media=0;


		//suma=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el nombre:");
		alumno=teclado.nextLine();


		while (!alumno.equalsIgnoreCase("")) {
			System.out.println("dame una nota:");
			nota1=teclado.nextFloat();
			if (nota1<0 || (nota1>10)) {
				System.out.println("error");

			} else {
				System.out.println("dame una nota:");
				nota2=teclado.nextFloat();
				if (nota2<0 || (nota2>10)) {
					System.out.println("error");
					
				} else {
					System.out.println("dame una nota:");
					nota3=teclado.nextFloat();
					
					if (nota3<0 || (nota3>10)) {
						System.out.println("error");
					} else {
						media=(float) (0.1*nota1+0.4*nota2+0.5*nota3);
						System.out.println("Media "+media);
					}
				}
				alumno=teclado.nextLine();				
				System.out.println("Introduce el nombre:");
				alumno=teclado.nextLine();
			}
		} //while		



		//System.out.println (suma);
	}//main
} //class