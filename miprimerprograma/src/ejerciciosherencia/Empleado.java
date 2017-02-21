package ejerciciosherencia;

import java.util.Scanner;

public class Empleado {
	private String nombre;
	private int sueldo;
	
	public Empleado(String nombre, int sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getSueldo() {
		return sueldo;
	}


	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}


	public Empleado() {	
		nombre="";
		sueldo=0;
	}

	public Empleado verificarempleado(){
		Empleado verificar;
		String identificador;
		Scanner teclado = new Scanner (System.in);
		System.out.println("¿Empleado o jefe?: ");

		if (identificador.equalsIgnoreCase("EMPLEADO")){
			verificar.mostrarempleado();
		}		

		else if (identificador.equalsIgnoreCase("JEFE")){
			

		}

		else{
			System.out.println("Error, no has introducido empleado o jefe");
		}


		return identificador;
	}

	
	public Empleado mostrarempleado(){
		String identificador;
		identificador="";
		Empleado empleado;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce el nombre: ");
		String nombre = teclado.next();
		System.out.println("Introduce el sueldo : ");
		int sueldo = teclado.nextInt();
		empleado=new Empleado (nombre, sueldo);
		return empleado;

	
		
	}

	public void imprimir(){
		
		System.out.print("Nombre " + nombre);
		
		System.out.print(" sueldo: " + sueldo);

		System.out.println();
	}	

	
}

