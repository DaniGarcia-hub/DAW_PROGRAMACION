package UD5Tarea5.Ejercicio7;

public class Estudiante implements Comparable<Estudiante> {
    protected String nombre;
    protected int edad, altura;

    public Estudiante(String nombre, int edad, int altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int compareTo(Estudiante o){
        boolean condicionAltura = this.altura != o.getAltura();

        if (condicionAltura){
            return Integer.compare(o.getAltura(), this.altura);
        }

        return Integer.compare(o.getEdad(), this.edad);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }
}
