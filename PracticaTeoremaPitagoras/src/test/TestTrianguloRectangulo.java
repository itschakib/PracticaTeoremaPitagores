package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import clases.TrianguloRectangulo;
public class TestTrianguloRectangulo {

    @Test
    public void testTrianguloPorDefecto() {
        TrianguloRectangulo t = new TrianguloRectangulo();
        
        assertEquals(0.5, t.area(), 0.01);
        assertEquals(1.41, t.hipotenusa(), 0.01);
        assertEquals(3.91, t.perimetro(), 0.01);
    }

    @Test
    public void testTrianguloConValores() {
        TrianguloRectangulo t = new TrianguloRectangulo(3, 4);
        assertEquals(6.0, t.area(), 0.01);
        assertEquals(5.0, t.hipotenusa(), 0.01);
        assertEquals(12.0, t.perimetro(), 0.01);
    }
}
