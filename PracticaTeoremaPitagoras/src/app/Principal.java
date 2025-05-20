package app;

import clases.TrianguloRectangulo;

public class Principal {
	public static void main(String[] args) {
// triangle con catetos entre 0 y 10
		TrianguloRectangulo t1 = new TrianguloRectangulo(3, 4);
		// triangle por defecto
		TrianguloRectangulo t2 = new TrianguloRectangulo();
		// Calculamos área y perímetro sin imprimir
		double area1 = t1.area();
		double perimetro1 = t1.perimetro();
		double area2 = t2.area();
		double perimetro2 = t2.perimetro();
		System.out.println();
	}
}
