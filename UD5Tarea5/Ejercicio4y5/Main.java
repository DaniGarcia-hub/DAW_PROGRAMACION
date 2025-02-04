package UD5Tarea5.Ejercicio4y5;

public class Main {
    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo(4, 15, 5);
        Triangulo triang1 = new Triangulo(3, 20, 10);

        System.out.println("----RECT1----");
        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter());
        System.out.println("----RECT1----");

        System.out.println("------ TRIANG");
        System.out.println(triang1.getArea());
        System.out.println(triang1.getPerimeter());
        System.out.println("---TRIANG---");

        Rectangulo rect2 = new Rectangulo(4, 2, 3);
        System.out.println("----RECT2---");
        System.out.println(rect2.getArea());
        System.out.println(rect2.getPerimeter());
        System.out.println("-----RECT2----");
        rect2.redimensionar(2);
        System.out.println(rect2.getArea());
        System.out.println(rect2.getPerimeter());
    }
}
