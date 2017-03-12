package herenciabueno2;

import java.util.Scanner;

import herenciabueno.Empleados;
import herenciabueno.Jefe;


public class Plantilla {
	
	private Empleados [] plantilla;


	private int indice=0;


	public Plantilla() {

		plantilla=new Empleados[100];

	}

	public int getIndice() {
		return indice;
	}	
	
	public Empleados getEmpleado(int posicion){
		return plantilla[posicion];
	}


	public void setIndice(int indice) {
		this.indice = indice;
	}

	public void añadirempleado(Empleados empleado){
		plantilla[indice]=empleado;
		indice++;
	}
	public void añadirempleado(Jefe empleado){
		plantilla[indice]=empleado;
		indice++;
	}
	public void borrarempleado(int indice){
		plantilla[indice-1]=null;
		while (this.indice>=indice){
			plantilla[indice-1]=plantilla[indice];
			indice++;
		}
		this.indice--;
	}
	public void imprimir(){
		for(int i=0;i<indice;i++){
			System.out.print("Empleado " + (i+1));
			plantilla[i].imprimir();
			System.out.println();
		}
	}


	

	public void menu(){
		Empleados empleado = new Empleados();
		Jefe jefe = new Jefe();

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System.in);
		int menu=0;
		while(menu!=-1){

			System.out.println("Menu de administracion de una empresa");
			System.out.println("¿Que quieres hacer?");
			System.out.println("Opcion1: Añadir empleados");
			System.out.println("Opcion2: Borrar empleados");
			System.out.println ("Opcion3: Ver empleado //añadir empleados primero");
			System.out.println("Opcion4: Ver plantilla // añadir empleados primero");
			System.out.println("Opcion5: Salir");
			menu=teclado.nextInt();
			
			if (menu==1){
				System.out.println("¿EMPLEADO o JEFE?");
				String identificador=teclado.next();
				if (identificador.equalsIgnoreCase("EMPLEADO")){
					System.out.println("¿Cuantos empleados quieres añadir?");
					int nempleados = teclado.nextInt();
					for (int i=0;i<nempleados;i++){
						Empleados empleado1 = empleado.crearempleado();
						añadirempleado(empleado1);
					}
				}		

				else if (identificador.equalsIgnoreCase("JEFE")){
					System.out.println("¿Cuantos jefes quieres añadir?");
					int nempleados = teclado.nextInt();
					for (int i=0;i<nempleados;i++){
						Jefe jefe1 = jefe.crearempleado();
						añadirempleado(jefe1);

					}
				}

				else{
					System.out.println("Error, no has introducido empleado o jefe");
				}

				
				
			}
			if (menu==2){
				System.out.println("¿Cuantos empleados quieres borrar?");
				int nempleados = teclado.nextInt();
				for (int i=0;i<nempleados;i++){
					System.out.println("¿Que empleado quieres borrar?");
					int borrar = teclado.nextInt();
					borrarempleado(borrar);
				}
			}
			if (menu==3){
				System.out.println("¿Que empleado quieres ver?");
				int i = teclado.nextInt();
				i= i-1;
				plantilla[i].imprimir();
			}
			if (menu==4){
				imprimir();
			}
			if (menu==5){
				menu=-1;
			}
		}
	}
	
	
}
