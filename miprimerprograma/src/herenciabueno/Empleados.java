package herenciabueno;

import java.util.Scanner;


public class Empleados {


private String nombre;
private int sueldo;

public Empleados() {
	nombre="";
	sueldo=0;
}


public Empleados(String nombre, int sueldo) {
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

public Empleados crearempleado(){
	Empleados empleado;
	Scanner teclado = new Scanner (System.in);
	System.out.println("Introduce el nombre: ");
	String nombre = teclado.next();
	System.out.println("Introduce el sueldo : ");
	int sueldo = teclado.nextInt();
	empleado=new Empleados (nombre, sueldo);
	return empleado;	
}

public void imprimir(){
	
	System.out.print(" Nombre " + nombre);
	
	System.out.print(" sueldo: " + sueldo);

	System.out.println();
}	



}
