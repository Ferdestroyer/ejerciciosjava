package ejerciciohoja2;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		int numero;
		int max;
		int min;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce el numero");
		numero=teclado.nextInt();
		max=numero;
		min=numero;
		
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
		System.out.println("el maximo es: " +max);
		System.out.println("el minimo es: " +min);
		
	}

}
