package fecha;

import java.util.Scanner;


public class main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		fecha fecha;
		fecha fecha2;
		int anio, mes, dia, anio2, mes2, dia2;
		do{
		System.out.print("Introduce el año desde: ");
		anio = teclado.nextInt();
		System.out.print("Introduce el mes desde: ");
		mes = teclado.nextInt();
		System.out.print("Introduce el día desde: ");
		dia = teclado.nextInt();
		System.out.print("Introduce el año hasta: ");
		anio2 = teclado.nextInt();
		System.out.print("Introduce el mes hasta: ");
		mes2 = teclado.nextInt();
		System.out.print("Introduce el día hasta: ");
		dia2 = teclado.nextInt();
		fecha=new fecha(anio, mes, dia);
		fecha2=new fecha(anio2, mes2, dia2);
	 }while(fecha.getAnio()==1 && fecha.getMes()==1 && fecha.getDia()==1 && fecha2.getAnio()==1 && fecha2.getMes()==1 && fecha2.getDia()==1);
		
		fecha.imprimir();
		fecha2.imprimir();
		diferencia= new diferencia (anio, mes, dia, anio2, mes2, dia2);
}

}
