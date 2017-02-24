package herenciabueno2;

import java.util.Scanner;

public class Jefe extends Empleados {
String titulo;
String nombredep;


public Jefe(String nombre, int sueldo, String titulo, String nombredep) {
	super(nombre, sueldo);
	this.titulo = titulo;
	this.nombredep = nombredep;
}

public Jefe() {
titulo="";
nombredep="";
}

public void crearempleado(){

	Scanner teclado = new Scanner (System.in);
	System.out.println("Introduce el nombre: ");
	String nombre = teclado.next();
	System.out.println("Introduce el sueldo : ");
	int sueldo = teclado.nextInt();
	System.out.println("Introduce el titulo: ");
	String titulo = teclado.next();
	System.out.println("Introduce el nombre del departamento : ");
	String nombredep = teclado.next();

}





public String getTitulo() {
	return titulo;
}


public void setTitulo(String titulo) {
	this.titulo = titulo;
}


public String getNombredep() {
	return nombredep;
}


public void setNombredep(String nombredep) {
	this.nombredep = nombredep;
}

public void imprimir(){
	
	System.out.print(" Nombre " + getNombre());
	
	System.out.print(" sueldo: " + getSueldo());
		
	System.out.print(" titulo " + titulo);
	
	System.out.print(" nombre departamento: " + nombredep);

	System.out.println();
}	


	
}
