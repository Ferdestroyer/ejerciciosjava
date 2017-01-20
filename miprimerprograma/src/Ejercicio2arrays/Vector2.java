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
		for (int i=0; i<mo; i++) {
			v1[i]=m;
			v2[i]=m;
		}


	}
		
	public Vector2(int mo, int desde, int hasta){
		
		v1=new int [mo];
		v2=new int [mo];
		v3=new int [mo*2];
		for (int i=0; i<mo; i++) {
			v1[i]=(int) (Math.random()*(hasta-desde+1)+desde);
			v2[i]=(int) (Math.random()*(hasta-desde+1)+desde);
		}
		v3[mo*2]=v1[mo]+v2[mo];
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
		for(int l=0; l<v3.length; l++){
			System.out.print(v3[l]+" * ");
		}
		System.out.println();
	}
}

