package ejerciciohoja3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase, fraseCod="";
		int num, i, letra, opcion;

		do{
			System.out.println("Frase?");
			frase=teclado.nextLine();
		} while (frase.equals(frase.toUpperCase())==false); 

		do{
			System.out.println("1.Codificar");
			System.out.println("2.Descodificar");
			System.out.println("0.Salir");
			opcion=teclado.nextInt();
			switch (opcion) {
			case 0:
				break;
			case 1:
				do{
					System.out.println("numero?");
					num=teclado.nextInt();
				} while(num>10 || num<1); 
				fraseCod="";
				for (i=0; i<frase.length(); i++){
					letra=frase.charAt(i);//como letra es entero guardará el código ASCII
					letra=letra+num;
					fraseCod=fraseCod+(char)letra; //al código ASCII de letra le hacemos un casting para que sea un char			
				}
				System.out.println("Antes de codificar: " + frase);
				System.out.println("Despues de codificar: " + fraseCod);
				break;
			case 2:
				do{
					System.out.println("numero entre 1 y 10?");
					num=teclado.nextInt();
				}while (num>10 || num<1); 
				for (i=frase.length()-1; i>=0; i--){
					letra=frase.charAt(i);//como letra es entero guardará el código ASCII
					letra=letra-num;
					System.out.println("Antes de descodificar: " + fraseCod);
					System.out.println("Despues de descodificar: " + frase);
				}
				break;
			default:
				System.out.println("Opcion erronea");
			}
		}while(opcion!=0);
	}//main
}//class