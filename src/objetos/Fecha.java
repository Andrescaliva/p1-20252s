package objetos;

public class Fecha {
	//VARIABLES DE INSTANCIA
	int dia;
	int mes;
    int anio;
	
	//CONSTRUCTORES
	public Fecha(int dia, int mes, int anio) {
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
	
	//METODOS DE INSTANCIA
	public void imprimir() {
		System.out.println(this.dia+"/"+this.mes+"/"+this.anio);
	}
	
	@Override
	public String toString() {
		return this.dia+"/"+this.mes+"/"+this.anio;
	}

	public static boolean bisiesto(int anio) {
		if(anio%4==0 && anio%100!=0) {
			return true;
		}
		if(anio%400==0) {
			return true;
		}
		return false;
	}
	
	
	public static int diasDelMes(int mes, int anio){
		if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12) {
			return 31;
		}
		else  if(mes==4||mes==6||mes==9||mes==11){
			return 30;
		}
		else if(mes==2 && bisiesto(anio)){
			return 29;
		}
		else {
			return 28;
		}
	}
	
	public boolean esValida() {
		if(anio<0) {
			return false;
		}
		if(mes<1||mes>12) {
			return false;
		}
		if(dia<1||dia>diasDelMes(mes,anio)) {
			return false;
		}
		return true;
	
	}
	
	public void avanzarDia() {
		if(this.dia==diasDelMes(this.anio,this.mes)) {
			this.dia=1;
			if(this.mes==12) {
				this.mes=1;
				this.anio++;
			}else{
				this.mes++;
			}
		}
		else {
			this.dia++;
		}
	}

}
