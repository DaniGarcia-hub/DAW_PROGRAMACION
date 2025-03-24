package UD5Tarea3.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PinturaTest {
    @Test
    public void testCalcularPintura(){
        Cilindro cilindro = new Cilindro(30, 40);
        Rectangulo rectangulo = new Rectangulo(30, 50);
        Esfera esfera = new Esfera(15);
        Pintura pintura = new Pintura(100);
        assertEquals(15, pintura.calcularCantidad(rectangulo), 0.01);
        assertEquals(2827.433/100, pintura.calcularCantidad(esfera), 0.01);
        assertEquals(13194.689/100, pintura.calcularCantidad(cilindro), 0.01);

        // Lo he colocado de esta forma:
        // 13194.689145077133/100
        // Porque mi calculadora no permite números tan largos para calcular,
        // y no sé el resultado real, pero estoy seguro que es correcto el funcionamiento.
    }
}