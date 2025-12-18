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
	
	public static boolean inversos(String s1, String s2) {
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
		return inversos(recursionString.resto(s1),s2.substring(0, s2.length()-1));
		
	}
	
	public static String cambiarConsonante(String s, char r) {
		//Caso base
		if(s.length()<2) {
			return s;
		}
		
		String aux=recursionString.resto(s);
		char auxiliar=aux.charAt(0);
		//Caso recursivo
		if(!recursionString.esVocal(s.charAt(0))&&!recursionString.esVocal(auxiliar)) {
			return ""+s.charAt(0)+r+cambiarConsonante(recursionString.resto(aux), r);
		}else {
			return ""+s.charAt(0)+cambiarConsonante(aux,r);
		}
		
	}
	
	public static int cantidadValles(String s) {
		//Caso base
		if(s.length()<2) {
			return 0;
		}
		//caso rescursivo
		if(s.length()>=2&&s.charAt(0)==s.charAt(1)) {
			return cantidadValles(recursionString.resto(s))+1;
		}
		return cantidadValles(recursionString.resto(s));
	}
	
	public static String eliminarLetraRodeada(String s, char a, char b, char c) {
		if(s.length()<=2) {
			return s;
		}
		if(a==s.charAt(1)&b==s.charAt(0)&&c==s.charAt(2)) {
			return ""+s.charAt(0)+eliminarLetraRodeada(recursionString.resto(recursionString.resto(s)),a,b,c);
		}
		return ""+s.charAt(0)+eliminarLetraRodeada(recursionString.resto(s),a,b,c);
	}
	
	public static String eliminarLetraEntreIguales(String s, char a) {
		if(s.length()<=2) {
			return s;
		}
		if(s.charAt(1)==a) {
			return ""+s.charAt(0)+eliminarLetraEntreIguales(recursionString.resto(recursionString.resto(s)),a);
		}
		return ""+s.charAt(0)+eliminarLetraEntreIguales(recursionString.resto(s),a);
	}
	
	
	public static String eliminarDuplicadosConsecutivosIguales(String s) {
		//Caso base
		if(s.length()<=1) {
			return s;
		}
		if(recursionString.resto(s).length()>0&&s.charAt(0)==recursionString.resto(s).charAt(0)) {
			return eliminarDuplicadosConsecutivosIguales(recursionString.resto(s));
		}
		return s.charAt(0)+eliminarDuplicadosConsecutivosIguales(recursionString.resto(s));
	}
	
	public static String invertirPares(String s) {
		//CASO BASE
		if(s.length()<=1) {
			return s;
		}
		//Caso recursivo
		return s.charAt(1)+""+s.charAt(0)+invertirPares(recursionString.resto(recursionString.resto(s)));
	
	}

}
