package Ejercicio1arrays;

public class Vector {
	
	private	int n[];
	
	public  Vector(int mo){
		n=new int [mo];

	}
	
	public  Vector(int mo, int m){
		n=new int [mo];
		for (int i=0; i<mo; i++) {
			n[i]=m;
		}


	}
		
	public Vector(int mo, int desde, int hasta){
		for (int i=0; i<mo; i++) {
			n[i]=(int) (Math.random()*(hasta-desde+1)+desde);
		}
		
	}
	
	
		
}

