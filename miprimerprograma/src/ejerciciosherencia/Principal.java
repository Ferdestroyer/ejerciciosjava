package ejerciciosherencia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String entidad;
		entidad="";
		Empleado empleado;
		Jefe jefe;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce que quieres buscar (empleado), (jefe)");
		entidad=teclado.nextLine();
		
		if (entidad.equalsIgnoreCase("EMPLEADO")){
			empleado = new Empleado();
			empleado.mostrarempleado();
		}		

		else if (entidad.equalsIgnoreCase("JEFE")){
			jefe = new Jefe(); 
			jefe.mostrarjefe();
		}
		
		else{
			System.out.println("Error, no has introducido empleado o jefe");
		}
	}

}
