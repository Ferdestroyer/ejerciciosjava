package Empresa;

import java.util.Scanner;

public class Trabajador {
	private int identificador;
	private String nombre;
	private String estadocivil;
	private String turno;
	private int titulacion;
	private int anios;
	private int salariob;
	
	public Trabajador(){
	nombre="";
	estadocivil="";
	turno="";
	titulacion=0;
	anios=0;
	salariob=425;
	}

	public Trabajador(int identificador, String nombre, String estadocivil, String turno, int titulacion, int anios, int salariob) {

		this.identificador = identificador;
		this.nombre = nombre;
		this.estadocivil = estadocivil;
		this.turno = turno;
		this.titulacion = titulacion;
		this.anios = anios;
		this.salariob = salariob;
	}
	
	public Trabajador mostrartrabajador(){
		Scanner teclado = new Scanner (System.in);
		Trabajador trabajador;
		int identificador = 0;
		identificador++;
		System.out.println("Introduce el nombre: ");
		String nombre = teclado.next();
		System.out.println("Introduce el estado civil (): ");
		String estadocivil = teclado.next();
		System.out.println("Introduce el turno de trabajo: ");
		String turno = teclado.next();
		System.out.println("Introduce la titulacion: ");
		int titulacion = teclado.nextInt();
		System.out.println("Introduce los años: ");
		int anios = teclado.nextInt();
		int salariob=calcular();
		 
		trabajador = new Trabajador(identificador, nombre, estadocivil, turno, titulacion, anios, salariob);
		
		return trabajador;
		
	}
	
	public String escribeFichero(char sep){
		String linea="";
			linea=identificador+sep+nombre+sep+estadocivil+sep+turno+sep+titulacion+sep+anios+sep+salariob;
		return linea;
	}
	

	
	public int calcular(){

		if (turno=="N"){
			salariob=salariob+100;
		}

		if (anios>0){
			salariob=(salariob+(anios*75));
		}
		if (titulacion>0){
			switch (titulacion) {
			case 0:
				salariob=salariob+250;
			case 1:
				salariob=salariob+500;
			case 2:
				salariob=salariob+1000;
			case 3:
				salariob=salariob+1250;
			case 4:
				salariob=salariob+1500;
				if (estadocivil=="C"){
					salariob=(salariob-(salariob/100*10));

				}
			}
		}
		return salariob;
	}
	
	public void imprimir(){
		
		System.out.print("Codigo del empleado: " + identificador);
		
		System.out.print(" Nombre: " + nombre);

		System.out.print(" Estado civil: " + estadocivil);

		System.out.print(" Turno: "+ turno);

		System.out.print(" Titulación: " + titulacion);

		System.out.print(" Años: " + anios);
	
		System.out.print(" Salario: " + salariob);
		System.out.println();
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(int titulacion) {
		this.titulacion = titulacion;
	}

	public int getAnios() {
		return anios;
	}

	public void setAnios(int anios) {
		this.anios = anios;
	}

	public int getSalariob() {
		return salariob;
	}

	public void setSalariob(int salariob) {
		this.salariob = salariob;
	}


}
