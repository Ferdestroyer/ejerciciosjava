package Ejercicio2arrays;

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
	public Vector suma2vectores(Vector OtroVector){
		Vector sumar=null;
		Vector sumar=new Vector(v.length);
		return sumar;
		if(v.length==OtroVector.v.length){
			for(int i=0; i<v.length; i++){
				sumar.v[i]=v[i]+OtroVector.v[i];
			}
			return sumar;
		}
		
	}
/*
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
*/
	public void imprimeVector(){
		System.out.println();
		for(int k=0; k<v.length; k++){
			System.out.print(v[k]+" * ");
		}
		System.out.println();
	}
	
	
}

