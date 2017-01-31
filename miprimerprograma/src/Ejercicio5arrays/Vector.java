package Ejercicio5arrays;

public class Vector {
	
	private	int v[];
	
		
	public  Vector(){
		v=new int [10];
	}
	
		
	public Vector(int desde, int hasta){
		
		v=new int [10];
		for (int i=0; i<10; i++) {
			v[i]=(int) (Math.random()*(hasta-desde+1)+desde);
		}
	}

	public void Contar(Vector vector2){
		for(int i=0; i<v.length; i++){
			int contador;
			contador=0;
			for(int k=0; k< vector2.v.length;k++){
				if(v[i]==vector2.v[k]){
					contador=contador+1;
				}
			}
			System.out.println("El numero " +v[i]+ " aparece " +contador+ " veces");
			
		}
	}	
	
	public void imprimeVector(){
		System.out.println();
		for(int k=0; k<v.length; k++){
			System.out.print(v[k]+" * ");
		}
		System.out.println();
	}
	
	
}

