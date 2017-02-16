package ejerciciohoja1;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {

	int dia=0;
	int mes=0;
	int ano=0;
	String mestexto="";
	
	System.out.println ("Introduce el dia");
	Scanner valor = new Scanner(System.in); 
	dia=valor.nextInt();
	
	System.out.println ("Introduce el mes");
	mes=valor.nextInt();
	System.out.println ("Introduce el año");
	ano=valor.nextInt();
	
	switch (mes) {
	
	case 1:
	mestexto="Enero";
	break;
	case 2:
	mestexto="Febrero";
	break;
	case 3:
	mestexto="Marzo";
	break;
	case 4:
	mestexto="Abril";
	break;
	case 5:
	mestexto="Mayo";
	break;
	case 6:
	mestexto="Junio";
	break;
	case 7:
	mestexto="Julio";
	break;
	case 8:
	mestexto="Agosto";
	break;
	case 9:
	mestexto="Septiembre";
	break;
	case 10:
	mestexto="Octubre";
	break;
	case 11:
	mestexto="Noviembre";
	break;
	case 12:
	mestexto="Diciembre";
	break;
	}
	
	System.out.println ("fecha: "+dia+" "+mestexto+" de "+ano);
	
	
	}
	
	
}
