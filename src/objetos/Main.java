package objetos;

import java.awt.*;

public class Main {

	public static void main(String[] args) {
		/*Point p1 =new Point(15,5);
		Point p2 = new Point(3,4);
		Rectangle caja = new Rectangle(10,10,40,20);
		Rectangle caja2 = new Rectangle(20,5,20,20);
		Objetos.mover(caja, 50, 50);
		System.out.println("La distancia entre los dos puntos es de: "+Objetos.distancia(p1, p2));
		System.out.println(Objetos.estaDentro(p1, caja));
		System.out.println(Objetos.encuadrar(caja, caja2));*/
		Fecha f= new Fecha(31,12,2025);
		f.imprimir();
		f.avanzarDia();
		f.imprimir();

	}

}
