package objetos;

import java.awt.*;

public class Objetos {
	public static void mover(Rectangle caja, int dx, int dy) {
		caja.x += dx;
		caja.y += dy;
	}
	
	public static double distancia(Point p1, Point p2) {
		double dx=p1.x-p2.x;
		double dy=p1.y-p2.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	
	public static double diagonal(Rectangle r) {
		Point P=new Point(r.x,r.y);
		Point Q=new Point(r.x+r.width,r.y+r.height);
		return distancia (P,Q);
		
	}
	
	public static Point centro(Rectangle r) {
		int x=r.x+r.width/2; 
		int y=r.y+r.height/2;
		Point centro = new Point(x,y);
		return centro;
	}
	
	public static boolean estaDentro(Point p, Rectangle r) {
		return r.x<=p.x && p.x<=r.x+r.width && r.y<=p.y && 	p.y<=r.y+r.height;
	}
	
	public static Point puntoMedio(Point p1, Point p2) {
		int PromX=p1.x+p2.x/2; 
		int PromY=p1.y+p2.y/2;
		Point medio = new Point(PromX,PromY);
		return medio;
	}
	
	public static Rectangle encuadrar(Rectangle r1, Rectangle r2) {
		int x=Math.min(r1.x, r2.x);
		int y= Math.min(r1.y, r2.y);
		int ancho=Math.max(r1.x+r1.width,r2.x+r2.width)-x;
		int largo=Math.max(r1.y+r1.height,r2.y+r2.height)-y;
		Rectangle encuadrado = new Rectangle(x,y,ancho,largo);
		return encuadrado;
	}
	
	
	
	public static Rectangle interseccion(Rectangle r1, Rectangle r2) {
		int x=Math.max(r1.x,r2.x);
		int y=Math.max(r1.y, r2.y);
		int anchoIntersec=Math.min(r1.x+r1.width, r2.x+r2.width)-x;
		int largoIntersec=Math.min(r1.y+r1.height, r2.y+r2.height)-y;
		Rectangle Interseccion = new Rectangle(x,y,anchoIntersec,largoIntersec);
		if(anchoIntersec>0&&largoIntersec>0) {
			return Interseccion;
		}
		return null;
	}

}
