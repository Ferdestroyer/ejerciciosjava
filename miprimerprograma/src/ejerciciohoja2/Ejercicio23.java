package ejerciciohoja2;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		
		int numero=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce en cuantas columnas quieres que aparezcan los valores:");
		numero=teclado.nextInt();
		
		for (int i=1; i<=100; i++) {
			
			System.out.printf("%5d" , i);
			if(i%numero==0){
				System.out.println();
			}
		}
	}

}
