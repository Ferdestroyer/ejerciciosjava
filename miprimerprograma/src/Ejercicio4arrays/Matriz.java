package Ejercicio4arrays;

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
	
	
	public void imprimeMatriz(){
		System.out.println();
		for(int k=0; k<m.length; k++){
			for(int l=0; l<m.length; l++){
			System.out.print(m[k][l]+" * ");
			}
		}
		System.out.println();
	}
	
	
}

