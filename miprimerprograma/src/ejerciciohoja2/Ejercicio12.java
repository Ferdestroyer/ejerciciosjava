package ejerciciohoja2;

public class Ejercicio12 {

	public static void main(String[] args) {
		
			int cont1;
			cont1=0;
			int cont2;
			cont2=0;
			
			for (int i=1; i<=100; i++) {
				
				if(i%2==0){
					cont1=cont1+1;
				}
				else{
					cont2=cont2+1;
				}
				System.out.printf("%3d \n", i);
				System.out.println(cont1+" suma de pares");
				System.out.println(cont2+" suma de impares");
			}
			

		}

	}