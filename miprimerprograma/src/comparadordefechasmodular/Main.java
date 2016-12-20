package comparadordefechasmodular;

import java.util.Scanner;

import programacionmodular.persona;



public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Validar Validar1=new Validar();
		int anio0, mes0, dia0, anio1, mes1, dia1;
		System.out.print("Introduce el año desde: ");
		anio0 = teclado.nextInt();
		Validar1.setAnio0(anio0);
		System.out.print("Introduce el mes desde: ");
		mes0 = teclado.nextInt();
		Validar1.setMes0(mes0);
		System.out.print("Introduce el día desde: ");
		dia0 = teclado.nextInt();
		Validar1.setDia0(dia0);
		System.out.print("Introduce el año hasta: ");
		anio1 = teclado.nextInt();
		Validar1.setAnio1(anio1);
		System.out.print("Introduce el mes hasta: ");
		mes1 = teclado.nextInt();
		Validar1.setMes1(mes1);
		System.out.print("Introduce el día hasta: ");
		dia1 = teclado.nextInt();
		Validar1.setDia1(dia1);
	}

}
