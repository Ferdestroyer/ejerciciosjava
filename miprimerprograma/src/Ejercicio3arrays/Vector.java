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
	

	public void busqueda(){
		for(int i=0;i<(v.length-1);i++){
			for(int j=i+1;j<v.length;j++){
				if(v[i]>v[j]){
				//Intercambiamos valores
					int variableauxiliar=v[i];
					System.out.print(variableauxiliar);
			}
				else if(v[i]<v[j]){
					int variableauxiliar1=v[i];
					System.out.print(variableauxiliar1);
				}
				
		}
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

