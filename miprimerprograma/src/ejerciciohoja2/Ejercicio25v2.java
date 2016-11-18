package ejerciciohoja2;

import java.util.Scanner;

public class Ejercicio25v2 {

	public static void main(String[] args) {
		
		String numero="";
		int longitud=0;
		String millares="";
		String centenas="";
		String decenas="";
		String unidades="";
		String romano="";
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero que quieres convertir en romano");
		numero=teclado.next();
		longitud=numero.length();
		
			switch(longitud){
				case 1:
				romano="M";
				break;
				case 2:
					romano="MM";
		break;
	case 3:
		romano="MMM";
		break;
	case 4:
		romano="MMMM";
		break;
			
		
			millares=numero.substring(0,1);	//guardar letra o numero del string segun la posicion
			int m = Integer.parseInt(millares); //conversion de String a int
			centenas=numero.substring(1,2);	//guardar letra o numero del string segun la posicion
			int c = Integer.parseInt(centenas); //conversion de String a int
			decenas=numero.substring(2,3);	//guardar letra o numero del string segun la posicion
			int d = Integer.parseInt(decenas); //conversion de String a int
			unidades=numero.substring(3,4);	//guardar letra o numero del string segun la posicion
			int u = Integer.parseInt(unidades); //conversion de String a int
			
		
		
			switch(m){  
			
			case 1:
				romano="M";
				break;
			case 2:
				romano="MM";
				break;
			case 3:
				romano="MMM";
				break;
			case 4:
				romano="MMMM";
				break;
				
			}
			
				
			switch(c){  
			
			case 1:
				romano=romano+"C";
				break;
			case 2:
				romano=romano+"CC";
				break;
			case 3:
				romano=romano+"CCC";
				break;
			case 4:
				romano=romano+"CD";
				break;
			case 5:
				romano=romano+"D";
				break;
			case 6:
				romano=romano+"DC";
				break;
			case 7:
				romano=romano+"DCC";
				break;
			case 8:
				romano=romano+"DCCC";
				break;
			case 9:
				romano=romano+"CM";
				break;
			}
			
			
			switch(d){  
			
			case 1:
				romano=romano+"X";
				break;
			case 2:
				romano=romano+"XX";
				break;
			case 3:
				romano=romano+"XXX";
				break;
			case 4:
				romano=romano+"XL";
				break;
			case 5:
				romano=romano+"L";
				break;
			case 6:
				romano=romano+"LX";
				break;
			case 7:
				romano=romano+"LXX";
				break;
			case 8:
				romano=romano+"LXXX";
				break;
			case 9:
				romano=romano+"XC";
				break;
				
			}
			
			
			switch(u){  
			
			case 1:
				romano=romano+"I";
				break;
			case 2:
				romano=romano+"II";
				break;
			case 3:
				romano=romano+"III";
				break;
			case 4:
				romano=romano+"IV";
				break;
			case 5:
				romano=romano+"V";
				break;
			case 6:
				romano=romano+"VI";
				break;
			case 7:
				romano=romano+"VII";
				break;
			case 8:
				romano=romano+"VIII";
				break;
			case 9:
				romano=romano+"IX";
				break;
			}
			
		}
		
		
		System.out.println(romano);
		
		
		
		
		

	}

	}

