package Ejercicio9arrays;

public class Matriz {
	
	private	String m[][];
	
		
	public  Matriz(){
		String m[][]={{"1","2","3","4","5","6","7","A","B","C"}, {"1","2","3","4","5","6","7","A","B","C"}, {"1","2","3","4","5","6","7","A","B","C"}, {"1","2","3","4","5","6","7","A","B","C"}};
	}
	
		

    public void Aleatorio(){
    	
		for (int k=0; k<10; k++) {
			int i=asignatura-1;
			//guardo las notas de la asignatura en un array para luego calcular la media
			p[k]=m[i][k];
			totalsig=totalsig+p[k];
			System.out.printf(" %4d",m[i][k]);
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

