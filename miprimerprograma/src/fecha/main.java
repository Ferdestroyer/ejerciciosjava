package fecha;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		fecha fecha1;
		int dia, mes, anyo;
		do{
		Scanner teclado = new Scanner(System.in);
		System.out.println(" escribe el año");
		anyo=teclado.nextInt();
		System.out.println(" escribe el mes ");
		mes=teclado.nextInt();
		System.out.println(" escribe el dia ");
		dia=teclado.nextInt();
		fecha1=new fecha(anyo, mes, dia);
		}while(fecha1.getAnyo()==1 && fecha1.getMes()==1 && fecha1.getDia()==1);
	}

}
