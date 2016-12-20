package programacionmodular;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String dni, nombre, direccion;
		persona person1=new persona();
		person1.escribe();
		System.out.println(" escribe el dni ");
		dni=teclado.next();
		System.out.println(" escribe el nombre ");
		nombre=teclado.next();
		System.out.println(" escribe la direccion ");
		direccion=teclado.next();
		person1.setDni(dni);
		person1.setNombre(nombre);
		person1.setDireccion(direccion);
		person1.escribe();
	}

}
