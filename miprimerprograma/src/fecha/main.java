package fecha;

import java.util.Scanner;

import comparadordefechasmodular.Validar;

public class main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Validar Validar1=new Validar();
		int anio, mes, dia, anio2, mes2, dia2;
		System.out.print("Introduce el a�o desde: ");
		anio = teclado.nextInt();
		System.out.print("Introduce el mes desde: ");
		mes = teclado.nextInt();
		System.out.print("Introduce el d�a desde: ");
		dia = teclado.nextInt();
		System.out.print("Introduce el a�o hasta: ");
		anio2 = teclado.nextInt();
		System.out.print("Introduce el mes hasta: ");
		mes2 = teclado.nextInt();
		System.out.print("Introduce el d�a hasta: ");
		dia2 = teclado.nextInt();
	}

}
