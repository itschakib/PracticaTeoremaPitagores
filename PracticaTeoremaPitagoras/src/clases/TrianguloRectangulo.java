package clases;

/**
 * los triangulos rectangulos tienen dos catetos se llamara
 */
public class TrianguloRectangulo {
	private double a; // Cateto a
	private double b; // Cateto b
	private double c; // Hipotenusa

	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
		this.c= Hipotenusa();
	}

	/**
	 * Constructor con parámetros.
	 * 
	 * @param a Cateto 
	 * @param b Cateto 
	 * @throws IllegalArgumentException si alguno de los catetos es menor o igual a 0
	 *                                  
	 */
	public TrianguloRectangulo(double a, double b) {
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException("los catetos bien ser mayores de 0 ");
		}
		this.a = a;
		this.b = b;
		this.c = Hipotenusa(); 
	}
    /**
     * Calcula  el area del triangulo 
     * 
     * @return  area de triangullo
     */
    public double area() {
        return (a * b) / 2;
    }
    /**
     * Calcula la hipotenusa del triangulo
     * 
     * @return la hipotenusa
     */
    public double Hipotenusa() {
        return Math.sqrt((a * a) + (b * b));
    }
    /**
     * Devuelve el perimetro de triangulo
     * 
     * @return suma de los tres lados: a + b + c
     */
    public double perimetro() {
        return a + b + c;
    }

    /** getter y setter
     * 
     * 
     * @return obtiene valor del cateto a
     */
    public double getA() {
        return a;
    }
    /**
     * Modifica a
     * Se recalcula la hipotenusa despuese del cambio
     * 
     * @param es nuevo valor de  cateto a 
     * @throws IllegalArgumentException si a es menor o igual a 0
     */
    public void setA(double a) {
        this.a = a;
      Hipotenusa(); // para actualizar la c automatico
    }
    /** 
     * 
     * 
     * @return obtiene valor del cateto b
     */
    public double getB() {
        return b;
    }
    /**
     * Modifica b
     * Se recalcula la hipotenusa despuese del cambio
     * 
     * @param es nuevo valor de  cateto b
     * @throws IllegalArgumentException si b es menor o igual a 0
     */
    public void setB(double b) {
        this.b = b;
        Hipotenusa(); // para actualizar la c automatico
    }

    /**
     * Representa el triangulo
     * 
     * @return cadena con los valores de a,b y c
     */
    @Override
    public String toString() {
        return "TrianguloRectangulo [cateto A=" + a + ",cateto B=" + b + ",Hipotenusa C=" + c + "]";
 }


}
