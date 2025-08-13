package introduccion;

public class Cadenas {
	public static int cantidadE(String s) {
		int contador=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='e'||s.charAt(i)=='E') {
				contador++;
			}
		}
		return contador;
	}
	
	public static boolean tieneE(String s) {
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='e'||s.charAt(i)=='E') {
				return true;
			}
		}
		return false;
	}
}
