package objetos;

import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		Point p1 =new Point(2,7);
		Point p2 = new Point(3,4);
		System.out.println("La distancia entre los dos puntos es de: "+Objetos.distancia(p1, p2));

	}

}
