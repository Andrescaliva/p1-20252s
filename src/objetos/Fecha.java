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
	
	public static boolean bisiesto(int anio) {
		if(anio%4==0 && anio%100!=0) {
			return true;
		}
		if(anio%400==0) {
			return true;
		}
		return false;
	}

}
