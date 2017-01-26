package Ejercicio2arrays;

public class Vector2 {
	
	private	int v1[];
	private int v2[];
	private int v3[];
		
	public  Vector2(int mo){
		v1=new int [mo];
		v2=new int [mo];
		v3=new int [mo];
	}
	
	public  Vector2(int mo, int m){
		v1=new int [mo];
		v2=new int [mo];
		v3=new int [mo];
		for (int i=0; i<mo; i++) {
			v1[i]=m;
			v2[i]=m;
			v3[i]=m;
		}


	}
		
	public Vector2(int mo, int desde, int hasta){
		
		v1=new int [mo];
		v2=new int [mo];
		v3=new int [mo];
		for (int i=0; i<mo; i++) {
			v1[i]=(int) (Math.random()*(hasta-desde+1)+desde);
			v2[i]=(int) (Math.random()*(hasta-desde+1)+desde);
		}
	}

	public void Sumar(){
		for(int i=0; i<v3.length; i++){
			v3[i]=v1[i]+v2[i];
		}
		
	}
	
	public void Ordenar(){
		for(int i=0; i<v3.length; i++){
			for (int j=0; j<v3.length; j++){
				if (v3[j]>v3[j+1]){
					int aux=v3[j+1]
				}
			}
		}
		
	}

	public void imprime1Vector(){
		System.out.println("Array 1");
		for(int k=0; k<v1.length; k++){
			System.out.print(v1[k]+" * ");
		}
		System.out.println();
	}
	public void imprime2Vector(){
		System.out.println("Array 2");
		for(int l=0; l<v2.length; l++){
			System.out.print(v2[l]+" * ");
		}
		System.out.println();
	}
	public void imprime3Vector(){
		System.out.println("Array 3 (Suma de los arrays 1 y 2 con los numeros ordenados)");
		for(int m=0; m<v3.length; m++){
			System.out.print(v3[m]+" * ");
		}
		System.out.println();
	}
}

