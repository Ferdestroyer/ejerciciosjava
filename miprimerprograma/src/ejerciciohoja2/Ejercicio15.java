package ejerciciohoja2;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		int numero1=0;
		int numero2=0;
		int numeroaux=0;
		int cont;
		cont=0;
		int cont1;
		cont1=0;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce el primer numero");
		numero1=teclado.nextInt();
		System.out.println("introduce el segundo numero");
		numero2=teclado.nextInt();
		
		//filtro para poder hacer el for bien
		if (numero1>numero2){
			numeroaux=numero2;
			numero2=numero1;
			numero1=numeroaux;
		}
			
		
		
		for (int i=numero1; i<=numero2; i++){
			
			if (i>=0){
			cont=cont+1;
			System.out.printf("%3d \n", i);
			
			}
			
			if (i%2==0 && i>=0){
				cont1=cont1+1;
				
			}
			
		}
		
		System.out.println(cont+" numeros naturales");
		System.out.println(cont1+" numeros pares");

	}

}
