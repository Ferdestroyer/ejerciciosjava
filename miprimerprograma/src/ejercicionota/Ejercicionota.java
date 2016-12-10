package ejercicionota;

import java.util.Scanner;

//Autor: Fernando Gracia Bernad
//Descripcion:
//*****************************************************************************************************************************************************************************************************************************
//�	Lea de teclado dos cadenas (String). El contenido pueden ser dos fechas o una fecha y un n�mero entero.
//�	La fecha podr� venir en formato AAAAMMDD � DDMMAAAA con alguno de los siguientes 4 separadores -./: entre el d�a, el mes y el a�o, siempre ser� el mismo en cada fecha que se introduzca.
//�	Se deben tener en cuenta todas las validaciones de fechas. 
//�	Si son dos fechas, el programa calcular� y escribir� la diferencia en d�as entre la fecha mayor y la menor.
//�	Si es una fecha y un n�mero, calcular� la nueva fecha tras a�adir el n�mero introducido a la fecha (ser� una fecha anterior si el n�mero es negativo o posterior si es positivo). Adem�s dir� el d�a de la semana que es. 
//*****************************************************************************************************************************************************************************************************************************
public class Ejercicionota {

	public static void main(String[] args) {
		
		String valor1=""; //variable "valor1" de tipo cadena con valor NULL
		String valor2=""; //variable "valor2" de tipo cadena con valor NULL
		Scanner teclado = new Scanner(System.in); //Llamada funcion coger valor por teclado
		System.out.println("Introduce una fecha o un numero entero"); //Imprimir por pantalla: "Introduce una fecha o un numero entero"
		valor1=teclado.nextLine(); //Pedir valor por teclado y guardarlo en "valor1"
		System.out.println("Introduce una fecha o un numero entero");
		valor2=teclado.nextLine();	//Pedir valor por teclado y guardarlo en "valor2"
		int longitud1=valor1.length(); //leemos la longitud de valor1 y la guardamos en longitud1
		int longitud2=valor2.length(); //leemos la longitud de valor 2 y la guardamos en longitud2
		
		if (longitud1<=10 && longitud2<=10){ //condicion en que la longitud de ambos debe ser <=10 
			int pos1a=valor1.indexOf('-');	//buscar el primer valor "-" de la cadena 1 y guardar la posicion en pos1a
			int pos2a=valor1.indexOf('.');  //buscar el primer valor "." de la cadena 1 y guardar la posicion en pos2a
			int pos3a=valor1.indexOf('/');  //buscar el primer valor "/" de la cadena 1 y guardar la posicion en pos3a
			int pos4a=valor1.indexOf(':');  //buscar el primer valor ":" de la cadena 1 y guardar la posicion en pos4a
			int pos1b=valor2.indexOf('-');  //buscar el primer valor "-" de la cadena 2 y guardar la posicion en pos1b
			int pos2b=valor2.indexOf('.');  //buscar el primer valor "." de la cadena 2 y guardar la posicion en pos2b
			int pos3b=valor2.indexOf('/');  //buscar el primer valor "/" de la cadena 2 y guardar la posicion en pos3b
			int pos4b=valor2.indexOf(':');  //buscar el primer valor ":" de la cadena 2 y guardar la posicion en pos4b
			int pos1a1=valor1.indexOf('-', pos1a+1); //buscar el siguiente valor "-" partiendo de pos1a+1 de la cadena 1 y guardar la posicion en pos1a1
			int pos2a1=valor1.indexOf('.', pos2a+1); //buscar el siguiente valor "." partiendo de pos2a+1 de la cadena 1 y guardar la posicion en pos2a1
			int pos3a1=valor1.indexOf('/', pos3a+1); //buscar el siguiente valor "/" partiendo de pos3a+1 de la cadena 1 y guardar la posicion en pos3a1
			int pos4a1=valor1.indexOf(':', pos4a+1); //buscar el siguiente valor ":" partiendo de pos4a+1 de la cadena 1 y guardar la posicion en pos4a1
			int pos1b1=valor2.indexOf('-', pos1b+1); //buscar el siguiente valor "-" partiendo de pos1b+1 de la cadena 2 y guardar la posicion en pos1b1
			int pos2b1=valor2.indexOf('.', pos2b+1); //buscar el siguiente valor "." partiendo de pos2b+1 de la cadena 2 y guardar la posicion en pos2b1
			int pos3b1=valor2.indexOf('/', pos3b+1); //buscar el siguiente valor "/" partiendo de pos3b+1 de la cadena 2 y guardar la posicion en pos3b1
			int pos4b1=valor2.indexOf(':', pos4b+1); //buscar el siguiente valor ":" partiendo de pos4b+1 de la cadena 2 y guardar la posicion en pos4b1
			
			//Condici�n con operadores l�gicos que se encarga de analizar la condici�n 2 (DDMMAAAA) del ejercicio
			
			
			if((pos1a==2 && pos1a1==5) || (pos2a==2 && pos2a1==5) || (pos3a==2 && pos3a1==5) || (pos4a==2 && pos4a1==5) && (pos1b==2 && pos1b1==5) || (pos2b==2 && pos2b1==5) || (pos3b==2 && pos3b1==5) || (pos4b==2 && pos4b1==5)){
				System.out.println("exito");
				
			}//if 2
			else if((pos1a==2 && pos1a1==4) || (pos2a==2 && pos2a1==4) || (pos3a==2 && pos3a1==4) || (pos4a==2 && pos4a1==4) && (pos1b==2 && pos1b1==4) || (pos2b==2 && pos2b1==4) || (pos3b==2 && pos3b1==4) || (pos4b==2 && pos4b1==4)){
				System.out.println("exito");
			}//else if1
			
			else if((pos1a==1 && pos1a1==4) || (pos2a==1 && pos2a1==4) || (pos3a==1 && pos3a1==4) || (pos4a==1 && pos4a1==4) && (pos1b==1 && pos1b1==4) || (pos2b==1 && pos2b1==4) || (pos3b==1 && pos3b1==4) || (pos4b==1 && pos4b1==4)){
				System.out.println("exito");
			}//else if2
			
			else if((pos1a==1 && pos1a1==3) ||  (pos2a==1 && pos2a1==3) ||  (pos3a==1 && pos3a1==3) ||  (pos4a==1 && pos4a1==3) && (pos1b==1 && pos1b1==3) ||  (pos2b==1 && pos2b1==3) ||  (pos3b==1 && pos3b1==3) ||  (pos4b==1 && pos4b1==3)){
				System.out.println("exito");
			}//else if3
			//Condici�n con operadores l�gicos que se encarga de analizar la condici�n 2 (AAAAMMDD) del ejercicio
			
			else if(((pos1a==4 && pos1a1==6) || (pos1a==4 && pos1a1==7) || (pos2a==4 && pos2a1==6) || (pos2a==4 && pos2a1==7) || (pos3a==4 && pos3a1==6) || (pos3a==4 && pos3a1==7) || (pos4a==4 && pos4a1==6) || (pos4a==4 && pos4a1==7)) && ((pos1b==4 && pos1b1==6) || (pos1b==4 && pos1b1==7) || (pos2b==4 && pos2b1==6) || (pos2b==4 && pos2b1==7) || (pos3b==4 && pos3b1==6) || (pos3b==4 && pos3b1==7) || (pos4b==4 && pos4b1==6) || (pos4b==4 && pos4b1==7))){
				
				System.out.println("bien");
			}//else if2
			else{
				System.out.println("error");
			}//else
			
		}//if main
	}//main

}//class
