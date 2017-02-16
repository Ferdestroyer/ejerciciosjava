package Ejercicio10arrays;

public class Matriz {
	
	private	String m[];
	
		
	public  Matriz(){
		m=new String[14];
		m[0]="oros";
		m[1]="copas";
		m[2]="espadas";
		m[3]="bastos";
		m[4]="1";
		m[5]="2";
		m[6]="3";
		m[7]="4";
		m[8]="5";
		m[9]="6";
		m[10]="7";
		m[11]="A";
		m[12]="B";
		m[13]="C";
	}
	
		

	public void Aleatorio(){
		String palo;
		String numero;
		for (int i=0; i<4; i++){
			palo=m[i];
			for (int j=4; j<14; j++){
			numero=m[j];
			System.out.println("Ha salido el "+numero+" de " +palo);
			}
			
		}



	}
		
	
}


