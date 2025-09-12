package excepciones;

import java.util.Scanner;

public class Excepciones {
	// máximo de un arreglo
	// lanzar una excepción cuando el arreglo es vacío
	public static int maximo(int[] a) {
		if(a.length==0) {
			throw new RuntimeException("El arrreglo esta vacio");
		}
	   int max = a[0];
	   for (int i = 0; i < a.length; i++) {
	      if (a[i] > max) {
	         max = a[i];
	      }
	   }
	   return max;
	}

	// Suma entre 0 y n
	public static int sumarHasta(int n) {
		if(n<0) {
			throw new RuntimeException("El numero es negativo");
		}
	   if (n == 0) {
	      return 0;
	   }
	   return n + sumarHasta(n - 1);
	}

	// Potencia a ** b
	public static int potencia(int a, int b) {
	   if (b == 0) {
	      return 1;
	}
	   return a * potencia(a, b - 1);
	}

	// Suma entre a y b
	public static int sumaEntre(int a, int b) {
	   if (a == b) {
	      return a;
	   }
	   return a + sumaEntre(a + 1, b);
	}

	public static void main(String[] args) throws Exception {

	   int[] arr = new int[0];

	   //
	   // Usar try/catch para la siguiente línea
	   try {
		   System.out.println("maximo del arreglo: " + maximo(arr));
	   }
	   catch(Exception ex) {
		   System.out.println("Se produjo un error: "+ex.getMessage());
	   }
	   //
	 

	   int n ;
	   boolean check=false;

	   //
	   // Usar try/catch para la siguiente línea. Probarlo con n = -10
	   while(!check) {
		   try {
			   Scanner sc=new Scanner(System.in);
			   System.out.println("Ingrese un numero mayor a 0: ");
			   n=sc.nextInt();
			   System.out.println("sumarHasta(" + n + ") = " + sumarHasta(n));
			   check=true;
			   sc.close();
		   }
		   catch(Exception ex) {
			   System.out.println("Se produjo un error"+ex.getMessage());
		   }
	   }
	   //

	

	   int a = 2;
	   int b = 5;

	   System.out.println("potencia(" + a + ", " + b + ") = " + potencia(a, b));

	   a = 5;
	   b = 7;

	   System.out.println("sumaEntre(" + a + ", " + b + ") = " + sumaEntre(a, b));

	}

}
