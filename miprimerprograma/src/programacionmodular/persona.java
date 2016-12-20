package programacionmodular;

public class persona {
private String dni;
private String nombre;
private String direccion;
	public persona() {
		dni = "";
		nombre = "";
		direccion = " ";
	}
	public persona(String dni, String nombre, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String escribe(){
		System.out.println("Nombre "+nombre +" Dni" +dni+" Direcion"+direccion);
		return " Nombre "+nombre +" Dni " +dni+" Direcion "+direccion;
	}
}
