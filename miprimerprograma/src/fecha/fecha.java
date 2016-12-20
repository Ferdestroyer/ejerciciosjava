package fecha;

public class fecha {
private int anyo;
private int mes;
private int dia;


public fecha() {
	anyo= 1;
	mes = 1;
	dia = 1;

}

public fecha(int anyo, int mes, int dia) {
	boolean validacion= true;
	if(anyo<=0 || mes>12 || mes<=0 || dia<=0 || dia >31){
		validacion= false;
	}
	else{
		if(mes==2 && anyo%4==0 && dia >29){
			validacion= false;
		}
		else if(mes==2 && anyo%4!=0 && dia>28){
			validacion= false;
		} 
		else if(mes!=1 || mes!=3 || mes!=5 || mes!=7 || mes!=8 || mes!=10 || mes!=12 && dia>30){
			validacion= false;
		}
		else if(mes!=4 || mes!=6 || mes!=9 || mes!=11 && dia>31){
			validacion= false;
		}
	}//else
	if(validacion){
		this.anyo=anyo;
		this.mes=mes;
		this.dia=dia;
	}
	else{
		this.anyo=1;
		this.mes=1;
		this.dia=1;		
	}

}//fecha
		
public int getAnyo() {
	return anyo;
}

public void setAnyo(int anyo) {
	this.anyo = anyo;
}

public int getMes() {
	return mes;
}

public void setMes(int mes) {
	this.mes = mes;
}

public int getDia() {
	return dia;
}

public void setDia(int dia) {
	this.dia = dia;
}



}
