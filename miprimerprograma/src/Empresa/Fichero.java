package Empresa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;



public class Fichero {
	
	String archivo;//atributo de Fichero que será de la clase Fichero donde agruparemos 
	//todos los métodos relacionados con File
	
	public Fichero(){
	      archivo = null;
	}
	public Fichero(String nombre){
	      archivo = nombre;
	}

	public static String nombreFichero() {
		Scanner teclado = new Scanner (System.in);
		String nombre;
		System.out.println("Nombre del fichero (incluye la ruta y doble contrabarra) " );
		nombre=teclado.nextLine();
		return nombre;
	}
	
	public static char separadorFichero() {
		Scanner teclado = new Scanner (System.in);
		char separador;
		System.out.println("Carácter de separación entre atributos " );
		separador=teclado.nextLine().charAt(0);
		return separador;
	}
	public void leeFichero(Plantilla col, char separador){
		FileReader fr = null;
		BufferedReader br = null;
		Trabajador trbj=new Trabajador();
		int pos, desde, cont;
		int identificador=0;
		String nombre="";
		String estadocivil="";
		String turno="";
		int titulacion=0;
		int anios=0;
		int salariob=425;
		String trozo;

	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null){
	        	// System.out.println(linea);
	        	 pos=-1;
	        	 cont=1;
	        	 
	        		 pos++;
	        		 desde=pos;
	        		 pos=linea.indexOf(separador,pos);
	        		 if(pos==-1){
	        			 trozo=linea.substring(desde);
	        		 }else{
	        			 trozo=linea.substring(desde, pos);
	        		 }
	        		 switch (cont){
	        		 case 1:
	        			 identificador=Integer.parseInt(trozo);
	        			 break;
	        		 case 2:
	        			 nombre=trozo;
	        			 break;
	        		 case 3:
	        			 estadocivil=trozo;
	        			 break;
	        		 case 4:
	        			 turno=trozo;
	        			 break;
	        		 case 5:
	        			 titulacion=Integer.parseInt(trozo);
	        			 break;
	        		 case 6:
	        			 anios=Integer.parseInt(trozo);
	        			 break;
	        		 case 7:
	        			 salariob=Integer.parseInt(trozo);
	        			 break;
	        		 }
	        		 cont++;
	        	 
	        	 trbj= new Trabajador(identificador, nombre, estadocivil, turno, titulacion, anios, salariob);
	        	 col.añadirtrabajador(trbj);
	         }
	         System.out.println("Fin de lectura de fichero. Registros "+ (col.getIndice()));
	         
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }

	}
	
	public void escribeFichero(Plantilla col, char separador){
        FileWriter fw = null;
        PrintWriter pw = null;
        String linea=""; 
        //Disco disc=new Disco;
        int cont=col.getIndice();
        try
        {
            pw = new PrintWriter(archivo);
            
            for (int i = 0; i < cont; i++){
            	
               linea=col.getTrabajador(i).escribeFichero(separador);
               //pw.write(linea,0,linea.length());
           		pw.write(linea);
            	pw.write("\r\n");
  
            
            }
            System.out.println("Escritos "+cont+ " registros en el fichero");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != pw)
              pw.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }

		
		
	}

}

