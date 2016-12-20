package examen;
import java.util.Scanner; 
public class Ex4 {

	public static void main(String[] args) { 

		final String VALIDOS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.-_@"; 
		Scanner teclado = new Scanner(System.in); 

		String entrada;    // cadena de entrada 
		boolean correcto;  // lo es? 
		int posicionAt=0;    // posición del símbolo @ 

		int aux = 0;       // auxiliar para operaciones 
		String auxcad="";     // cadena auxiliar 
		do{

			System.out.print("Introduzca un e-mail válido: "); 
			entrada = teclado.nextLine(); 

			// Compruebo longitud 
			correcto = entrada.length() <= 254; 
			if (!correcto) System.out.println("email demasiado largo");
			// Todos los caracteres son válidos? 
			
				auxcad = entrada.toUpperCase(); 
				aux = 0; 
				while ( correcto && aux < auxcad.length() ) { //busca caracteres erróneos
					if ( VALIDOS.indexOf(auxcad.charAt(aux)) == -1 ) { 
						System.out.println("Carácter no válido "+auxcad.charAt(aux));
						correcto = false; 
					}
					aux++; 
				} 

				// Compruebo que no contiene dos puntos consecutivos 
				// Afecta tanto a la parte local como a la de dominio 
				if ( entrada.indexOf("..") >= 0 ) { 
					System.out.println("Error, el email contiene dos puntos consecutivos");
					correcto = false; 
				}
				// Compruebo que contiene 1 @ y obtengo la parte local 

				posicionAt = entrada.indexOf("@"); 
				// la parte local puede ser de hasta 64 caracteres 
				if ( posicionAt > 0 && posicionAt <= 64) { 
					auxcad = entrada.substring(0, posicionAt); 
				} else {
					if (posicionAt==-1) System.out.println("Error, el email no lleva @");
					else System.out.println("Error, la parte local es demasiado larga");
					correcto = false; 
				}
				if (posicionAt>0 && entrada.indexOf("@",posicionAt+1)>0) {
					System.out.println("Error, el email tiene más de 1 @");
					correcto = false;
				}

				// Compruebo que la parte local no empieza ni termina por punto 
				if ( auxcad.startsWith(".") || auxcad.endsWith(".") ) { 
					System.out.println("Error, la parte local del email empieza o acaba por .");
					correcto = false; 
				}
				// Obtengo la parte de dominio 
				auxcad = entrada.substring(posicionAt+1); 

				// Compruebo que no contiene un subrayado (_) 
				if ( auxcad.indexOf("_") >= 0 ) {
					System.out.println("Error, la parte dominio del email contiene _");
					correcto = false; 
				}
				// Compruebo que la parte de dominio no empieza ni termina por punto 
				if ( auxcad.startsWith(".") || auxcad.endsWith(".") ) {
					System.out.println("Error, la parte dominio del email empieza o acaba por .");
					correcto = false; 
				}
				// Cada etiqueta de dominio debe tener 63 caracteres o menos 
				aux = 1; 
				while ( correcto && aux > 0 ) { 
					aux = auxcad.indexOf("."); 
					if ( aux < 64 && aux > 0) 
						auxcad = auxcad.substring(aux+1); 
					else {
						if (aux > 64 || (aux == -1 && auxcad.length()>63)) {
							System.out.println("Error, la parte dominio tiene etiquetas mayores que 63");
							correcto = false;
						}
					}
				} 
		}while(!correcto);
		System.out.println("El correo " + entrada + " es válido.");  
	} 
}

