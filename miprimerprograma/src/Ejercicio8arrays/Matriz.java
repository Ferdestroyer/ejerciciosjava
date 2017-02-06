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
		
			for (int k=0; k<10; k++) {
				int i=asignatura-1;
				System.out.printf(" %4d",m[i][k]);
			}
			
		}
	
	public void Buscaral(int alumno){
		int q[];
		q=new int [10];
		
			for (int k=0; k<10; k++) {
				int i=alumno-1;
				System.out.printf(" %4d",m[k][i]);
			}
			
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

