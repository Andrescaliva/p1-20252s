package recursion;

public class recursionEnteros {
	
	public static int sumaDeUnoHasta(int n) {
		//Caso base
		if(n<=1) {
			return n;
		}
		//Caso recursivo
		return sumaDeUnoHasta(n-1)+1;
	}
	
	public static void imprimirHasta(int n) {
		if(n<=1) {
			System.out.println(n);
			return;
		}
		imprimirHasta(n-1);
		System.out.println(n);
	}

}
