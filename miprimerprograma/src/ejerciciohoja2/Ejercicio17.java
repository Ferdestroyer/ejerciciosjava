package ejerciciohoja2;

import java.util.Scanner;

public class Ejercicio17 {

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
		
		
		if(numero2>=numero1){
		
		
			for (int i=numero1; i<=numero2; i++){
			
			
				if (i%2==0){
				cont=cont+1;
				cont1=cont1+i;
				System.out.printf("%3d \n", i);
				}
			
			}
		}
			
			
		System.out.println(cont+" numeros multiplos de 2");
		System.out.println(cont1+" suma de multiplos de 2");
		
	}

}