package Ejercicio7arrays;

public class Matriz {
	
	private	int m[][];
	
		
	public  Matriz(){
		m=new int [5][5];
	}
	
		
	public Matriz(int desde, int hasta){
		
		m=new int [5][5];
		for (int i=0; i<5; i++) {
			for (int k=0; k<5; k++) {
			m[i][k]=(int) (Math.random()*(hasta-desde+1)+desde);
			}
		}
	}
	
	public void Intercambiar(int fila1, int fila2){
		for (int i = 0; i <= 4; i++) {
			int aux = m[fila1 -1][i];
			m[fila1 -1][i] = m[fila2 -1][i];
			m[fila2 -1][i] = aux;
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

