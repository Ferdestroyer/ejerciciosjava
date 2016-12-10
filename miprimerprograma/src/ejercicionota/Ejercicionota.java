package ejercicionota;

import java.util.Scanner;

//Autor: Fernando Gracia Bernad
//Descripcion:
//*****************************************************************************************************************************************************************************************************************************
//•	Lea de teclado dos cadenas (String). El contenido pueden ser dos fechas o una fecha y un número entero.
//•	La fecha podrá venir en formato AAAAMMDD ó DDMMAAAA con alguno de los siguientes 4 separadores -./: entre el día, el mes y el año, siempre será el mismo en cada fecha que se introduzca.
//•	Se deben tener en cuenta todas las validaciones de fechas. 
//•	Si son dos fechas, el programa calculará y escribirá la diferencia en días entre la fecha mayor y la menor.
//•	Si es una fecha y un número, calculará la nueva fecha tras añadir el número introducido a la fecha (será una fecha anterior si el número es negativo o posterior si es positivo). Además dirá el día de la semana que es. 
//*****************************************************************************************************************************************************************************************************************************
public class Ejercicionota {

	public static void main(String[] args) {
		
		String valor1="";
		String valor2="";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una fecha o un numero entero");
		valor1=teclado.nextLine();	
		System.out.println("Introduce una fecha o un numero entero");
		valor2=teclado.nextLine();	
		int longitud1=valor1.length();
		int longitud2=valor2.length();
		
		if (longitud1<=10 && longitud2<=10){
			int pos1a=valor1.indexOf('-');
			int pos2a=valor1.indexOf('.');
			int pos3a=valor1.indexOf('/');
			int pos4a=valor1.indexOf(':');
			int pos1b=valor2.indexOf('-');
			int pos2b=valor2.indexOf('.');
			int pos3b=valor2.indexOf('/');
			int pos4b=valor2.indexOf(':');
			int pos1a1=valor1.indexOf('/', pos1a+1);
			int pos2a1=valor1.indexOf('/', pos2a+1);
			int pos3a1=valor1.indexOf('/', pos3a+1);
			int pos4a1=valor1.indexOf('/', pos4a+1);
			int pos1b1=valor1.indexOf('/', pos1b+1);
			int pos2b1=valor1.indexOf('/', pos2b+1);
			int pos3b1=valor1.indexOf('/', pos3b+1);
			int pos4b1=valor1.indexOf('/', pos4b+1);
			//El if definitivo, el pilar de la creación
			if(((pos1a==2 && pos1a1==5) || (pos1a==2 && pos1a1==4) || (pos2a==2 && pos2a1==5) || (pos2a==2 && pos2a1==4) || (pos3a==2 && pos3a1==5) || (pos3a==2 && pos3a1==4) || (pos4a==2 && pos4a1==5) || (pos4a==2 && pos4a1==4) || (pos1a==1 && pos1a1==3) || (pos1a==1 && pos1a1==4) || (pos2a==1 && pos2a1==3) || (pos2a==1 && pos2a1==4) || (pos3a==1 && pos3a1==3) || (pos3a==1 && pos3a1==4) || (pos4a==1 && pos4a1==3) || (pos4a==1 && pos4a1==4)) && ((pos1b==2 && pos1b1==5) || (pos1b==2 && pos1b1==4) || (pos2b==2 && pos2b1==5) || (pos2b==2 && pos2b1==4) || (pos3b==2 && pos3b1==5) || (pos3b==2 && pos3b1==4) || (pos4b==2 && pos4b1==5) || (pos4b==2 && pos4b1==4) || (pos1b==1 && pos1b1==3) || (pos1b==1 && pos1b1==4) || (pos2b==1 && pos2b1==3) || (pos2b==1 && pos2b1==4) || (pos3b==1 && pos3b1==3) || (pos3b==1 && pos3b1==4) || (pos4b==1 && pos4b1==3) || (pos4b==1 && pos4b1==4))){
				System.out.println("exito");
				
			}
			else{
				System.out.println("error");
			}
			
		}
	}

}
