package ejerciciohoja2;

public class Ejercicio5 {

	public static void main(String[] args) {
		int cont;
		cont=0;
		
	for (int i=1; i<=100; i++) {
			
			if (i%2!=0){
				cont=cont+1;
				System.out.printf("%3d \n", i);
			}
			
		}
	System.out.print("Numero de impares: "+cont);
	
	}

}
