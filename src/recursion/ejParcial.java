package recursion;

public class ejParcial {
	public static String repetirLetras(String s) {
		//Caso base
		if(s.isEmpty()||s.length()==1) {
			return s;
		}
		//Caso recursivo
		if(!recursionString.esVocal(s.charAt(0))&&!recursionString.esVocal(s.charAt(1))) {
			return ""+s.charAt(0)+s.charAt(0)+s.charAt(0)+repetirLetras(recursionString.resto(s));
		}
		if(recursionString.esVocal(s.charAt(0))&&recursionString.esVocal(s.charAt(1))) {
			return ""+s.charAt(0)+s.charAt(0)+repetirLetras(recursionString.resto(s));
		}
		return ""+s.charAt(0)+repetirLetras(recursionString.resto(s));
	}
	
	public static String eliminarVocalesYRevertir(String s) {
		//Caso base
		if(s.isEmpty()) {
			return "";
		}
		//Caso recursivo
		if(!recursionString.esVocal(s.charAt(0))) { //Si es distinto a una vocal, se devuelve las consonantes invertidas
			return eliminarVocalesYRevertir(recursionString.resto(s))+s.charAt(0);
		}
		else {
			return eliminarVocalesYRevertir(recursionString.resto(s)); //Devuelve el resto de la cadena, caso contrario
		}
		
	}
	
	public static boolean contieneCantidadDeChar(String s, char c, int n) {
		//Caso base
		if(s.isEmpty()) {
			return false;
		}
		//Caso recursivo
		if(n<=0) {
			return true;
		}
		if(s.charAt(0)==c) {
			return contieneCantidadDeChar(recursionString.resto(s),c,n-1);
		}
		return contieneCantidadDeChar(recursionString.resto(s),c,n);
	}
	
	public static String tomarCaracteresDesde(String s, int desde, int cant) {
		//Caso base
		if(s.isEmpty()||desde>=s.length()||cant==0) {
			return "";
		}
		//Caso recursivo
		if(desde>0) {
			return tomarCaracteresDesde(recursionString.resto(s),desde-1,cant);
		}
		return s.charAt(0)+tomarCaracteresDesde(recursionString.resto(s),desde,cant-1);
		
	}
	
	public static boolean reverso(String s1, String s2) {
		//Caso base
		if(s1.equals("")&&s2.equals("")) {
			return true;
		}
		//Caso recursivo
		if(s1.length()!=s2.length()) {
			return false;
		}
		if(s1.charAt(0)!=s2.charAt(s2.length()-1)) {
			return false;
		}
		return reverso(recursionString.resto(s1),s2.substring(0, s2.length()-1));
		
	}
	
	public static boolean estaContenida(String s, String a, int p) {
		//Casos base
		if(a.length()==0) {
			return true;
		}
		if(a.length()>0&&s.equals("")) {
			return false;
		}
		if(s.length()<a.length()) {
			return false;
		}
		if(s.length()-p<a.length()) {
			return false;
		}
		//Casos recursivos
		if(p>0) {
			return estaContenida(recursionString.resto(s),a,p-1);
		}else if(s.charAt(0)==a.charAt(0)) {
			return estaContenida(recursionString.resto(s),recursionString.resto(a),0);
		}else {//s.charAt(0)!=a.charAt(0)
			return estaContenida(recursionString.resto(s),a,0);
		}
	}

}
