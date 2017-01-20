package Ejercicio1arrays;

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

	public void imprimeVector(){
		System.out.println();
		for(int k=0; k<v.length; k++){
			System.out.print(v[k]+" * ");
		}
		System.out.println();
	}
}

