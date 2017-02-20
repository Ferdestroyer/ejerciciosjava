package ejerciciosherencia;

public class Jefe extends Empleado {
	private String titulo;
	private String departamento;
	
	public Jefe(String nombre, int sueldo, String titulo, String departamento) {
		super(nombre, sueldo);
		this.titulo = titulo;
		this.departamento = departamento;
	}

	public Jefe() {
		
	}

}
