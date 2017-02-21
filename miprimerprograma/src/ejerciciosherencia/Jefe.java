package ejerciciosherencia;

import java.util.Scanner;

public class Jefe extends Empleado {
	private String titulo;
	private String departamento;
	
	public Jefe(String nombre, int sueldo, String titulo, String departamento) {
		super(nombre, sueldo);
		this.titulo = titulo;
		this.departamento = departamento;
	}

	public Jefe() {
		titulo="";
		departamento="";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Jefe mostrarjefe(){
		Jefe jefe;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce el nombre: ");
		String nombre = teclado.next();
		System.out.println("Introduce el sueldo : ");
		int sueldo = teclado.nextInt();
		System.out.println("Introduce el titulo : ");
		String titulo = teclado.next();
		System.out.println("Introduce el departamento : ");
		String departamento  = teclado.next();
		jefe=new Jefe (nombre, sueldo, titulo, departamento);
		return jefe;
		
	}
	
	
}
