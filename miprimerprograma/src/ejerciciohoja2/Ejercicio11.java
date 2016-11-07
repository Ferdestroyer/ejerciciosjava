package ejerciciohoja2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int cont;
		cont=0;
		int numero=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		numero=teclado.nextInt();
		
		for (int i=3; i<numero; i++){
			
			if (i%3==0){
				
				cont=cont+1;
			}
		}
		System.out.println(cont+" multiplos de 3 encontrados desde el numero");
		

	}

}
