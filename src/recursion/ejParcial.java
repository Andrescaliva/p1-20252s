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

}
