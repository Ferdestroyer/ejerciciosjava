package colecci�n;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coleccion c = new Coleccion();
		String fich;//MAAG
		char sep;//MAAG
		
		fich=Fichero.nombreFichero();//MAAG nombre con la ruta completa
		sep=Fichero.separadorFichero();//MAAG separador de campos
		Fichero fichero=new Fichero(fich);
		fichero.leeFichero(c,sep);//MAAG carga el fichero en la colecci�n
		
		c.menu();
		
		fichero.escribeFichero(c,sep);//MAAG vuelca la colecci�n en el fichero
		
	}

}
