package Ejercicio8arrays;

public class Matriz {
	
	private	int m[][];
	
		
	public  Matriz(){
		m=new int [10][10];
	}
	
		
	public Matriz(int desde, int hasta){
		
		m=new int [10][10];
		for (int i=0; i<10; i++) {
			//m[i][0]=i+1;
			for (int k=0; k<10; k++) {
			m[i][k]=(int) (Math.random()*(hasta-desde+1)+desde);
			}
		}
	}
	/*
	public void Intercambiar(int fila1, int fila2){
		for (int i = 0; i <= 4; i++) {
			int aux = m[fila1 -1][i];
			m[fila1 -1][i] = m[fila2 -1][i];
			m[fila2 -1][i] = aux;
		}
	}
	*/

	public void Buscarasig(int asignatura){
		int p[];
		p=new int [10];
		int totalsig;
		totalsig=0;
		float mediasig;
			for (int k=0; k<10; k++) {
				int i=asignatura-1;
				//guardo las notas de la asignatura en un array para luego calcular la media
				p[k]=m[i][k];
				totalsig=totalsig+p[k];
				System.out.printf(" %4d",m[i][k]);
			}
			mediasig=(float)totalsig/10;
			System.out.println();
			System.out.println();
			System.out.println("Media de la asignatura "+asignatura+" : "+mediasig);
		}
	
	public void Buscaral(int alumno){
		int q[];
		q=new int [10];
		int totalalum;
		totalalum=0;
		float medialum;
			for (int k=0; k<10; k++) {
				int i=alumno-1;
				//guardo las notas del alumno en un array para luego calcular la media
				q[k]=m[k][i];
				totalalum=totalalum+q[k];
				System.out.printf(" %4d",m[k][i]);
			}
			medialum=(float)totalalum/10;
			System.out.println();
			System.out.println();
			System.out.println("Media del alumno "+alumno+" : "+medialum);
		}
		
		
		
	
	
	public void imprimeMatriz(){
		System.out.println();
		 for (int i = 0; i < m.length; i++) {  
			 for (int j = 0; j < m[0].length; j++) {  
			 System.out.printf(" %4d",m[i][j]);  
			}  
			  System.out.println("");  
		}  
	}
	
	
}

