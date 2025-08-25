package recursion;

public class recursionArrays {
	//Funciones auxiliares
	public static void imprimirRango(int[]a,int d, int h) {
		//Caso base
		if(d>h||h<0||d>a.length) {
			return;
		}
		//caso recursivo
		System.out.print(a[d]+" ");
		imprimirRango(a,d+1,h);
    }
	
	public static int sumaRango(int[]a,int d, int h) {
		//Caso base
		if(d>h||h<0||d>a.length) {
			return 0;
		}
		return a[d]+sumaRango(a,d+1,h);
		
	}
	
	public static void impirmir(int[] a) {
		imprimirRango(a,0,a.length-1);
	}
	
	public static int suma(int[] a) {
		return sumaRango(a,0,a.length-1);
	}

}
