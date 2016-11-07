package ejerciciohoja2;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		int numero1=0;
		int numero2=0;
		int numeroaux=0;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce el numero minimo");
		numero1=teclado.nextInt();
		System.out.println("introduce el numero maximo");
		numero2=teclado.nextInt();
		
		//filtro para poder hacer el for bien
		if (numero1<numero2){
			numeroaux=numero1;
			numero2=numero1;
			numero1=numeroaux;
		}
			
		
		
		for (int i=1; i<5; i++){
			System.out.println("introduce el numero");
			numero=teclado.nextInt();
			
			if (numero>max){
				max=numero;
			}
			
			if (numero<=min){
				min=numero;
			}
			
		}
		

	}

}
