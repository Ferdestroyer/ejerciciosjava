package Ejercicio3arrays;

public class Vector {
	
	private	int v[];
	
		
	public  Vector(int mo){
		v=new int [mo];
	}
	
	public  Vector(int mo, int m){
		v=new int [mo];
		for (int i=0; i<mo; i++) {
			v[i]=m;
		}


	}
		
	public Vector(int mo, int desde, int hasta){
		
		v=new int [mo];
		for (int i=0; i<mo; i++) {
			v[i]=(int) (Math.random()*(hasta-desde+1)+desde);
		}
	}
	

	public void Buscar(){
		
		int mayor = v[0], menor = v[0];
		for(int i=0;i<(v.length-1);i++){
			
				if(v[i] > mayor){
				
					mayor= v[i];
					
			}
				if(v[i] < menor){
					menor= v[i];
					
				}
				
		}
			System.out.println("El mayor del vector es: " + mayor + " en la posicion " );
			System.out.println("El menor del vector es: " + menor + " en la posicion " );
	
}
	
	
	public void imprimeVector(){
		System.out.println();
		for(int k=0; k<v.length; k++){
			System.out.print(v[k]+" * ");
		}
		System.out.println();
	}
	
	
}

