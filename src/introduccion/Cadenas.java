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
	
	public static boolean sonIguales(String s1, String s2) {
		if(s1.length()!=s2.length()){
			return false;
		}
		for(int i=0;i<s1.length()-1;i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean esDuodroma(String s) {
		if(s.length()%2!=0) {
			return false;
		}
		
		for(int i=0;i<s.length();i+=2) {
			if(s.charAt(i)!=s.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean esPrefijo(String prefijo, String s) {
		if(prefijo==null || s==null) {
			return false;
		}
		
		if(prefijo.length()>s.length()) {
			return false;
		}
		
		for(int i=0; i<prefijo.length();i++) {
			if(prefijo.charAt(i)!=s.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	
	public static boolean esPrefijoDesde(String prefijo, String s, int posicion) {
		//revisa si la longitud de prefijo es largo que la de la cadena
		if(s.length()-posicion<prefijo.length()) {
			return false;
		}
		//Recorre la cadena a partir de la posicion indicada
		for(int i=0; i<prefijo.length();i++) {
			if(prefijo.charAt(i)!=s.charAt(posicion+i)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean esSubstring(String s1, String s2) {
		if(s1==null) {
			return false;
		}
		if(s1.length()>s2.length()) {
			return false;
		}
		for(int i=0; i<=s2.length()-s1.length();i++) {
			boolean coincidenciaString=true;
			for(int j=0;j<s1.length();j++) {
				if(s2.charAt(i+j)!=s1.charAt(j)) {
					coincidenciaString=false;
					break;
				}
			}
			if(coincidenciaString) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean esPalindromo(String s) {
		for(int i=0, j=s.length()-1; i<j; i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
