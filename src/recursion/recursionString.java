package recursion;

public class recursionString {
	//Funciones auxiliares
	public static String resto(String s) { 
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) { //arranca en la posición 1 dejando afuera la posición 0
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}
	
	public static boolean esVocal(char c) { 
		String vocales = "aeiouAEIOU";
		if (vocales.indexOf(c) == -1) { 
			return false;
		}
		return true;
	}
	
	public static int longitud(String s) {
		if(s.equals("")) {
			return 0;
		}
		return 1+longitud(resto(s));
	}
	
	
	public static void imprimirEspaciado(String s) {
		if(s.equals("")) {
			return;
		}
		System.out.println(s.charAt(0)+"");
		imprimirEspaciado(resto(s));
	}
	
	public static void imprimirAsterisco (String s){
		if(s.length()==1) {
			System.out.println(s);
		}
		System.out.println(s.charAt(0)+"*");
		imprimirAsterisco(resto(s));
	}
	
	public static String reverso(String s) {
		if(s.isEmpty()) {
			return "";
		}
		else {
			return reverso(resto(s))+s.charAt(0);
		}
	}
	
	
	public static String combinar(String s, String t){
		//CASO BASE
		if(s.isEmpty()){
			return t;
		}
		if(t.isEmpty()) {
			return s;
		}
		//Caso recursivo
		if(s.charAt(0)<t.charAt(0)) {
			return s.charAt(0)+combinar(resto(s),resto(t));
		}
		else {
			return t.charAt(0)+combinar(resto(s),resto(t)); 
		}
	}
}
