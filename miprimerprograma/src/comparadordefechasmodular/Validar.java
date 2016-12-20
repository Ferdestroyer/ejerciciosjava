package comparadordefechasmodular;

public class Validar {

private	int anio0, mes0, dia0, anio1, mes1, dia1;


public Validar() {
	anio0 = 1;
	mes0 = 1;
	dia0 = 1;
	anio1 = 1;
	mes1 = 1;
	dia1 = 1;
}


public Validar(int anio0, int mes0, int dia0, int anio1, int mes1, int dia1) {
	this.anio0 = anio0;
	this.mes0 = mes0;
	this.dia0 = dia0;
	this.anio1 = anio1;
	this.mes1 = mes1;
	this.dia1 = dia1;
}


public int getAnio0() {
	return anio0;
}


public void setAnio0(int anio0) {
	this.anio0 = anio0;
}


public int getMes0() {
	return mes0;
}


public void setMes0(int mes0) {
	this.mes0 = mes0;
}


public int getDia0() {
	return dia0;
}


public void setDia0(int dia0) {
	this.dia0 = dia0;
}


public int getAnio1() {
	return anio1;
}


public void setAnio1(int anio1) {
	this.anio1 = anio1;
}


public int getMes1() {
	return mes1;
}


public void setMes1(int mes1) {
	this.mes1 = mes1;
}


public int getDia1() {
	return dia1;
}


public void setDia1(int dia1) {
	this.dia1 = dia1;
}

public String Validacionfechas{
	int total=0, i, dat0, dat1;
	dat0= anio0*1000+mes0*100+dia0;
	dat1= anio1*1000+mes1*100+dia1;
	if (dat1<dat0) System.out.println("Error. Fecha hasta menor que fecha desde");
	else{		
		if (anio1>anio0){//fechas en años distintos

			for (i=anio0+1 ; i<anio1 ; i++){//suma de años
				total = total + 365;
				if (i%4==0)	total = total + 1;
			}
			for (i=mes0+1; i<13; i++){//suma de meses de año de inicio
				if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31;
				if (i==4 ||i==6||i==9||i==11) total=total+30;
				if (i==2) total=total+28;
				if (i==2 && anio0%4==0) total=total+1;
			}
			for (i=1; i<mes1; i++){//suma de meses de año de fin
				if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31;
				if (i==4 ||i==6||i==9||i==11) total=total+30;
				if (i==2) total=total+28;
				if (i==2 && anio1%4==0) total=total+1;
			}
			i=mes0;//días mes de inicio
			if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31-dia0;
			if (i==4 ||i==6||i==9||i==11) total=total+30-dia0;
			if (i==2) total=total+28-dia0;
			if (i==2 && anio0%4==0) total=total+1;
			total=total+dia1;//días de mes final

		} else{
			if (anio0==anio1){//fechas en el mismo año
				for (i=mes0+1; i<mes1; i++){//suma de meses intermedios
					if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31;
					if (i==4 ||i==6||i==9||i==11) total=total+30;
					if (i==2) total=total+28;
					if (i==2 && anio0%4==0) total=total+1;
				}
				if (mes0==mes1) {//mismo año, mismo mes
					total=dia1-dia0;
				}	else{
					i=mes0;//mes de inicio
					if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31-dia0;
					if (i==4 ||i==6||i==9||i==11) total=total+30-dia0;
					if (i==2) total=total+28-dia0;
					if (i==2 && anio0%4==0) total=total+1;
					total=total+dia1;//días mes final
				}
			}
		}
		System.out.println("Dias transcurridos "+total);
	}
	
}
}