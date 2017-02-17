package Empresa;

import java.util.Scanner;


public class Plantilla {

	private Trabajador [] plantilla;

	private int indice=0;


	public Plantilla() {

		plantilla=new Trabajador[100];

	}

	public int getIndice() {
		return indice;
	}
	
	
	public Trabajador getTrabajador(int posicion){
		return plantilla[posicion];
	}


	public void setIndice(int indice) {
		this.indice = indice;
	}

	public void añadirtrabajador(Trabajador trabajador){
		plantilla[indice]=trabajador;
		indice++;
	}
	public void borrartrabajador(int indice){
		plantilla[indice-1]=null;
		while (this.indice>=indice){
			plantilla[indice-1]=plantilla[indice];
			indice++;
		}
		this.indice--;
	}
	public void imprimir(){
		for(int i=0;i<indice;i++){
			System.out.print("Trabajador " + (i+1));
			plantilla[i].imprimir();
			System.out.println();
		}
	}
	public void menu(){
		Trabajador trabajador = new Trabajador();

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System.in);
		int menu=0;
		while(menu!=-1){

			System.out.println("Menu Plantilla de trabajadores");
			System.out.println("¿Que quieres hacer?");
			System.out.println("Opcion1: Añadir trabajador");
			System.out.println("Opcion2: Borrar trabajador");
			System.out.println("Opcion3: Ver trabajador //añadir trabajadores primero");
			System.out.println("Opcion4: Ver plantilla // añadir trabajadores primero");
			System.out.println("Opcion5: Salir");
			menu=teclado.nextInt();
			
			if (menu==1){
				System.out.println("¿Cuantos trabajadores quieres añadir?");
				int ntrabajadores = teclado.nextInt();
				for (int i=0;i<ntrabajadores;i++){
					Trabajador trabajador1 = trabajador.mostrartrabajador();
					añadirtrabajador(trabajador1);
				}
			}
			if (menu==2){
				System.out.println("¿Cuantos trabajadores quieres borrar?");
				int ntrabajadores = teclado.nextInt();
				for (int i=0;i<ntrabajadores;i++){
					System.out.println("¿Que trabajador quieres borrar?");
					int borrar = teclado.nextInt();
					borrartrabajador(borrar);
				}
			}
			if (menu==3){
				System.out.println("¿Que trabajador quieres ver?");
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
