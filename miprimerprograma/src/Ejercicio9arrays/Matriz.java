package Ejercicio9arrays;

public class Matriz {
	
	private	String m[][]={{"1","2","3","4","5","6","7","A","B","C"}, {"1","2","3","4","5","6","7","A","B","C"}, {"1","2","3","4","5","6","7","A","B","C"}, {"1","2","3","4","5","6","7","A","B","C"}};
	
		
	public  Matriz(){
		
	}
	
		

    public void Aleatorio(){
    	 String aleatorio;
    	 aleatorio="";
    	 String palo;
    	 palo="";
    	
         for (int i = 0; i < 4; i++) {
			 
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
			 
			 
			 for (int j = 0; j < 10; j++) { 
				 aleatorio=m[i][j];
				 System.out.println("Ha salido el "+aleatorio+" de " +palo);

			 }	
			 int sorteoi,sorteoj;
			 for (int k= 0; k < 10; k++){
				 
				 sorteoi=(int) (Math.random()*4);

				 sorteoj=(int) (Math.random()*10);
				 if (sorteoi==0){
					 palo="oros"; 
				 }

				 else if (sorteoi==1){
					 palo="copas"; 
				 }

				 else if (sorteoi==2){
					 palo="espadas";  
				 }

				 else if (sorteoi==3){
					 palo="bastos"; 
				 }
				 System.out.println("ha salido "+m[sorteoi][sorteoj]+" de " +palo);

				 
			 }	 
			 }
			 
      }
		 
    }
		
	
	


