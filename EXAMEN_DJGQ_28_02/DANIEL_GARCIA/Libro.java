// DANIEL JOSÉ GARCÍA QUIRANT - 1ºJ DAW

public class Libro extends Articulo{
    protected int isbn, numpag;
    protected Autor autor;

    public Libro(int numref, String nombre, double precio, int isbn,  int numpag,  Autor autor){
        super(numref, nombre, precio);
        this.isbn = isbn; // ¡ÚNICO!
        this.numpag = numpag;
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

    @Override
    public String toString() {
        return "Libro" +
                " | Num Ref: " + numref +
                " | Nombre: " + nombre +
                " | Precio: " + precio +
                " | ISBN: " + isbn +
                " | Num Pag: " + numpag +
                " | Autor: " + autor.getNombre() +
                " | Email Autor: " + autor.getEmail();
    }
}
