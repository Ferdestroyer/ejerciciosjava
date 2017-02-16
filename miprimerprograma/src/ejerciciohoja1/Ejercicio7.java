package ejerciciohoja1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int chicos = 0; //niños en el curso actual
		int chicas = 0; //niñas en el curso actual
		float porcentajechico = 0; //formula porcentaje chico
		float porcentajechica = 0; //formula porcentaje chica
		int sumatotal = 0;
		DecimalFormat formatter = new DecimalFormat("#.##"); //nos redondea y nos saca un numero float en decimal
		 System.out.println ("Por favor introduzca el numero de chicos");
	        
	       Scanner chicos1 = new Scanner(System.in); //pide por teclado los chicos

	       chicos=chicos1.nextInt(); 

	       System.out.println ("Por favor introduzca el numero de chicas"); 

	       Scanner chicas1 = new Scanner(System.in); //pide por teclado las chicas
	       chicas=chicas1.nextInt();
	       sumatotal=chicos+chicas; //suma de chicos y chicas
	       porcentajechico = (chicos*100f)/sumatotal; //calculo el pocentaje de chicos
	       porcentajechica = (chicas*100f)/sumatotal; //calculo el porcentaje de chicas
	       System.out.println ("el "+formatter.format(porcentajechico)+ " % son chicos"); //escribo por pantalla el % de chicos
	       System.out.println ("el "+formatter.format(porcentajechica)+ " % son chicas"); //escribo por pantalla el % de chicas
	}

}
