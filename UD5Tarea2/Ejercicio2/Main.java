package UD5Tarea2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Alberto", "655486183", 27);
        Persona persona2 = new Persona("Alba", "632864837", 26);

        Foto foto = new Foto("perro", "PNG", 500, 350);
        Video video = new Video("Carnaval", "MP4", 6, 1080);

        Whatsapp app = new Whatsapp(foto, video);

        app.activarAPP();
        System.out.println("Estado APP: " + app.estadoAPP());

        app.getFoto().hacerFoto();
        app.log().registrarFoto(app.getFoto());
        System.out.println();
        app.getVideo().grabar();
        System.out.println();
        app.getVideo().grabar();

        app.empezarLlamada(persona1, persona2);

        app.llamada().alternarMuteo();
        app.llamada().alternarAltavoz();

        app.llamada().alternarAltavoz();
        app.llamada().alternarMuteo();

        app.mostrarRegistroArchivos();
    }
}
