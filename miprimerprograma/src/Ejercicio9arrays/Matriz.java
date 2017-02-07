package Ejercicio9arrays;

public class Matriz {
	
	private	String m[][];
	
		
	public  Matriz(){
		String m[][]={{"1","2","3","4","5","6","7","A","B","C"}, {"1","2","3","4","5","6","7","A","B","C"}, {"1","2","3","4","5","6","7","A","B","C"}, {"1","2","3","4","5","6","7","A","B","C"}};
	}
	
		

    public void Aleatorio(){
    	 String aleatorio;
    	 aleatorio="";
    	 String palo;
    	 palo="";
		 for (int i = 0; i < m.length; i++) {
			 if (i==0){
				palo="oros"; 
			 }
			 
			 else if (i==1){
				palo="copas"; 
			 }
			 
			 else if (i==2){
				 palo="espadas";  
			 }
			 
			 else if (i==3){
				 palo="bastos"; 
			 }
			 
			 for (int j = 0; j < m[0].length; j++) { 
				 aleatorio=m[i][j];
				 
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

