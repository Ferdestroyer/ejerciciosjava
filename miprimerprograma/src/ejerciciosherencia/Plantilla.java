package ejerciciosherencia;

import java.util.Scanner;


public class Plantilla {
	
	private Empleado [] plantilla;


	private int indice=0;


	public Plantilla() {

		plantilla=new Empleado[100];

	}

	public int getIndice() {
		return indice;
	}	
	
	public Empleado getEmpleado(int posicion){
		return plantilla[posicion];
	}


	public void setIndice(int indice) {
		this.indice = indice;
	}

	public void añadirempleado(Empleado empleado){
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
		Empleado empleado = new Empleado();

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System.in);
		int menu=0;
		while(menu!=-1){

			System.out.println("Menu de administracion de una empresa");
			System.out.println("¿Que quieres hacer?");
			System.out.println("Opcion1: Añadir empleados");
			System.out.println("Opcion2: Borrar empleados");
			System.out.println("Opcion3: Ver empleado //añadir empleados primero");
			System.out.println("Opcion4: Ver plantilla // añadir empleados primero");
			System.out.println("Opcion5: Salir");
			menu=teclado.nextInt();
			
			if (menu==1){
				System.out.println("¿Cuantos empleados quieres añadir?");
				int nempleados = teclado.nextInt();
				for (int i=0;i<nempleados;i++){
					Empleado empleado1 = empleado.mostrarempleado();
					añadirempleado(empleado1);
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
