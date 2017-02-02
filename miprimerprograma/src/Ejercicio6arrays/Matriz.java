package Ejercicio6arrays;

public class Matriz {
	
	private	int m[][];
	
		
	public  Matriz(){
		m=new int [10][10];
	}
	
		
	public Matriz(int desde, int hasta){
		
		m=new int [10][10];
		for (int i=0; i<10; i++) {
			for (int k=0; k<10; k++) {
			m[i][k]=(int) (Math.random()*(hasta-desde+1)+desde);
			}
		}
	}
	

	public void Buscar(){
		
		int mayor = m[0][0], menor = m[0][0];
		for(int i=0;i<(m.length-1);i++){
			for(int k=0;k<(m.length-1);k++){
				if(m[i][k] > mayor){
				
					mayor= m[i][k];
					
			}
				if(m[i][k] < menor){
					menor= m[i][k];
					
				}
			}
		}
			System.out.println("El mayor del vector es: " + mayor + " en la posicion " );
			System.out.println("El menor del vector es: " + menor + " en la posicion " );
	
}
	
	public void Sumar(){
		int k=0;
		int l=0;
		for (int i=0; i<10; i++){ 

			for(int j=0; j<l;j++){ 
			k=k+m[i][j]; 
			System.out.println("la suma de la columna "+j+" es: "+k); 
			} 

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

