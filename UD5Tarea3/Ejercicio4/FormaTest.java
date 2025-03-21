package UD5Tarea3.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormaTest {
    @Test
    public void testToString(){
        Cilindro cilindro = new Cilindro(30, 40);
        Rectangulo rectangulo = new Rectangulo(30, 50);
        Esfera esfera = new Esfera(15);
        assertEquals("Forma{nombre='Rectangulo'}", rectangulo.toString());
        assertEquals("Forma{nombre='Esfera'}", esfera.toString());
        assertEquals("Cilindro{radio=30.0, altura=40.0, nombre='Cilindro'}", cilindro.toString());
    }

    @Test
    public void testDevolverArea(){
        Cilindro cilindro = new Cilindro(30, 40);
        Rectangulo rectangulo = new Rectangulo(30, 50);
        Esfera esfera = new Esfera(15);
        assertEquals(1500, rectangulo.area());
        assertEquals(2827.4333882308138, esfera.area());
        assertEquals(113097.33552923254, cilindro.area());
    }


}