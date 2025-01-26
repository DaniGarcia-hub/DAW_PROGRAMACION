package UD5Tarea2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Cama cama = new Cama("patata", "2", 1, 2, 1);
        Lampara lampara = new Lampara("chorizo", true, 10);
        Techo techo = new Techo(3, 2);
        Pared pared1 = new Pared("Norte");
        Pared pared2 = new Pared("Sur");
        Pared pared3 = new Pared("Este");
        Pared pared4 = new Pared("Oeste");

        Habitacion habitacion = new Habitacion("Cuarto Pepe", pared1, pared2, pared3, pared4, techo, cama, lampara);

        System.out.println(habitacion.getLampara() + "\n"); // Mostrará el código del objeto, pero para que se vea que funciona.
        habitacion.hacerLaCama();
        System.out.println("--------"); // Separador.
        habitacion.getLampara().encender();
        System.out.println("--------"); // Separador.
        System.out.println("Calificacion: " + habitacion.getLampara().getCalificacion());
    }
}
