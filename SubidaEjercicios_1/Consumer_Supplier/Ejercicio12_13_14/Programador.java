package Consumer_Supplier.Ejercicio12_13_14;

public class Programador {
    private String nombre, fechaInicio;
    private Double salario;

    public Programador(String nombre){
        this.nombre = nombre;
    }

    public Programador(String nombre, Double salario, String fechaInicio){
        this.nombre = nombre;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "nombre='" + nombre + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", salario=" + salario +
                '}';
    }
}
