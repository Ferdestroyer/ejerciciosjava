package Empresa;


public class Principal {

	public static void main(String[] args) {
		

		Plantilla c = new Plantilla();
		String fich;
		char sep;
		
		fich=Fichero.nombreFichero();
		sep=Fichero.separadorFichero();
		Fichero fichero=new Fichero(fich);
		fichero.leeFichero(c,sep);
		
		c.menu();
		
		fichero.escribeFichero(c,sep);
		
	}

}
