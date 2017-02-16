package Empresa;

import colección.Fecha;

public class Trabajador {
	private int identificador;
	private String nombre;
	private char estadocivil;
	private char turno;
	private int titulacion;
	private int anios;
	
	public Trabajador(){
	nombre="";
	estadocivil=' ';
	turno=' ';
	titulacion=0;
	anios=0;
		
	}

	public Trabajador(int identificador, String nombre, char estadocivil, char turno, int titulacion, int anios) {

		this.identificador = identificador;
		this.nombre = nombre;
		this.estadocivil = estadocivil;
		this.turno = turno;
		this.titulacion = titulacion;
		this.anios = anios;
	}
	
	public Trabajador mostrartrabajador(){
		
		
		
		
		
		
		return trabajador;
		
	}
	
	public Trabajador visualizar(){
		
		
		
		
		
		
		return trabajador;
		
	}
	
	public Trabajador calcular(){

		int Salariob=425;
		if (turno=='N'){
			Salariob=Salariob+100;
		}

		if (anios>0){
			Salariob=(Salariob+(anios*75));
		}
		if (titulacion>0){
			switch (titulacion) {
			case 0:
				Salariob=Salariob+250;
			case 1:
				Salariob=Salariob+500;
			case 2:
				Salariob=Salariob+1000;
			case 3:
				Salariob=Salariob+1250;
			case 4:
				Salariob=Salariob+1500;
				if (estadocivil=='C'){
					Salariob=(Salariob-(Salariob/100*10));

				}
			}
		}
		


		return trabajador;

	}
	
	
}
