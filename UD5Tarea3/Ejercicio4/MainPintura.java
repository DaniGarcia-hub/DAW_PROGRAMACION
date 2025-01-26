package UD5Tarea3.Ejercicio4;

public class MainPintura {
    public static void main(String[] args) {
        Pintura pintura = new Pintura(250);

        Forma esfera = new Esfera(15);
        Forma rectangulo = new Rectangulo(20, 35);
        Forma cilindro = new Cilindro(10, 30);

        System.out.println(pintura.calcularCantidad(rectangulo));
        System.out.println(pintura.calcularCantidad(esfera));
        System.out.println(pintura.calcularCantidad(cilindro));
    }
}
