// DANIEL JOSÉ GARCÍA QUIRANT - 1ºJ DAW

// SE HA CREADO LA CLASE ABSTRACTA, PORQUE EN NINGUN MOMENTO SE INSTANCIA ESTA CLASE...
// Y ADEMÁS, CUANDO SE CREA UN ARTICULO, UN ARTICULO SIEMPRE ES DE UN TIPO (PRENDA ROPA, MOVIL, ETC.), POR LO QUE
// NO TIENE SENTIDO QUE SE PUEDA INSTANCIAR SIMPLEMENTE ELLA SOLA...

public abstract class Articulo{
    protected int numref; // ¡ÚNICO!
    protected double precio;
    protected String nombre; // Titulo del articulo...

    public Articulo(int numref, String nombre, double precio){
        this.numref = numref;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getNumref() {
        return numref;
    }

    public void setNumref(int numref) {
        this.numref = numref;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Articulo" +
                " | Num Ref: " + numref +
                " | Nombre: " + nombre +
                " | Precio: " + precio;
    }
}
