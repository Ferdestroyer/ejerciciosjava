package ejerciciohoja2;

public class Ejercicio21 {

	public static void main(String[] args) {
	
		int sumapares=0;
		int sumaimpares=0;
		int cont;
		cont=0;
		
		
		
		
		
	for (int i=1; i<=1000; i++) {
			
		if (i%2==0){
			
			sumapares=sumapares+i;
			
			}
		else{
			sumaimpares=sumaimpares+i;
		}
		System.out.printf("%3d \n", i);
		}
	System.out.println(sumapares+" suma de pares");
	System.out.println(sumaimpares+" suma de impares");
	}
	
}


		
		
		
		
		
