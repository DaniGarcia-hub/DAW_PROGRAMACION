// DANIEL JOSÉ GARCÍA QUIRANT - 1ºJ DAW

import java.util.ArrayList;

public class Escritor {
    private String nombre;
    private ArrayList<Libro> librosAutor;

    public Escritor(String nombre){
        this.nombre = nombre;
        this.librosAutor = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibrosAutor() {
        return librosAutor;
    }

    public void AddLibro(Libro libro){
        this.librosAutor.add(libro);
    }

    public boolean RemLibro(int isbn){
        if (librosAutor.isEmpty()){
            System.err.println("ERROR. La lista está vacía.");
            return false;
        } else {
            Libro busqueda = BuscarLibro(isbn);
            if (busqueda == null){
                System.err.println("ERROR. Libro no encontrado.");
                return false;
            } else {
                librosAutor.remove(busqueda);
                return true;
            }
        }
    }

    public Libro BuscarLibro(int isbn){
        for (Libro libro : librosAutor){
            if (libro.getIsbn() == isbn){
                return libro;
            }
        }
        return null;
    }

    public Libro BuscarLibro(String nombre){
        for (Libro libro : librosAutor){
            if (libro.getNombre().equalsIgnoreCase(nombre)){
                return libro;
            }
        }
        return null;
    }

    public void recorrerListadoLibros(){
        int i = 0;
        for (Libro libro : librosAutor){
            System.out.println((i+1) + " | " +  libro);
            i++;
        }
    }

    public void libroMasEconomico(){
        double precioMasBarato = librosAutor.getFirst().getPrecio();
        for (Libro value : librosAutor) {
            double precio = value.getPrecio();
            if (value.getPrecio() < precioMasBarato) {
                precioMasBarato = precio;
            }
        }
        for (Libro libro : librosAutor){
            if (libro.getPrecio() == precioMasBarato){
                System.out.println("LIBRO MÁS ECONÓMICO:");
                System.out.println("Nombre: " + libro.getNombre() + " | Precio: " + libro.getPrecio());
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Escritor" +
                " | Nombre: " + nombre;
    }
}
