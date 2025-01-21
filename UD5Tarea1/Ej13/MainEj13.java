package Ej13;

public class MainEj13 {
    public static void main(String[] args) {
        Cilindro cilindro1 = new Cilindro(23.5, 5);

        System.out.println("CILINDRO");
        System.out.println("Uso del método (Area). Área del cilindro: " + cilindro1.getArea());
        System.out.println("Uso del método (Volume). Volumen del cilindro: " + cilindro1.getVolume());

        Circulo circulo1 = new Circulo(3.6);
        System.out.println("\nCIRCULO");
        System.out.println("Uso del método (Area). Área del circulo: " +  circulo1.getArea());
    }
}
