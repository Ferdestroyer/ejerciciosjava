package ejerciciohoja2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
	
		int numero=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		numero=teclado.nextInt();
		
		if (numero >=0){
			
			System.out.println(numero+" es positivo");
			
		}
		else{
			
			System.out.println(numero+" es negativo");
		}
		

	}

}
