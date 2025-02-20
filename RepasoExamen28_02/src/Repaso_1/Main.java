package Repaso_1;

import Repaso_1.srcArmas.*;
import Repaso_1.srcEntidades.*;
import Repaso_1.Solicitudes.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // CONSTANTES ATRIBUTOS (HP, FUERZA, MANA, ETC.ETC.ETC.)
        final double VIDA_INICIAL = 100;
        final double AUMENTO_VIDAXNIVELSIMPLE = 0.10;
        final double AUMENTO_VIDAXNIVELAVANZADO = 0.05;
        final double INCREMENTO_ATRIBUTOSESPECIFICOS = 0.05;

        final double INCREMENTO_FUEGO = 0.05;
        final double INCREMENTO_VENENO = 0.05;
        final double INCREMENTO_DEBILIDAD = 0.03;
        final double INCREMENTO_HIELO = 0.03;

        final double INCREMENTO_SANGRADO = 0.02;
        // -----------------------------------------------------

        Scanner sc = new Scanner(System.in);

        ListadoGremio[] gremios = new ListadoGremio[7]; // En este juego solo van a existir 7 gremios.
        gremios[0] = new ListadoGremio(1, "Fénix Ardiente");
        gremios[1] = new ListadoGremio(2, "Hermandad del Viento Helado");
        gremios[2] = new ListadoGremio(3, "Orden de la Sombra Eterna");
        gremios[3] = new ListadoGremio(4, "Confraternidad del Roble Antiguo");
        gremios[4] = new ListadoGremio(5, "Alianza del Amanecer Dorado");
        gremios[5] = new ListadoGremio(6, "Cofradía del Mar Profundo");
        gremios[6] = new ListadoGremio(7, "Sindicato del Relámpago Carmesí");

        ListadoHeroes listadoHeroes = new ListadoHeroes(1, "Cacerolas");
        ListadoArmas listadoArmas = new ListadoArmas(1, "ArmasGuays");

        listadoHeroes.registrarNuevoHeroe(new Arquero("Delfo", 21, 238.54, 38, listadoArmas.armas.getFirst()));

        gremios[0].nuevoHeroeGremio(listadoHeroes.personas.getFirst());

        boolean finalizarPrograma = false;
        System.out.println("""
                BIENVENID@ A UN JUEGO MUY ESPECIAL.
                
                Se trata de un juego donde se podrán enfrentar increibles heroes contra grandes bosses. A continuación, se muestra los siguientes pasos a escoger.""");
        while (!finalizarPrograma){
            mostrarOpcInicial();
            switch (solicitarOPC()){
                case 7:
                    finalizarPrograma = true;
                    break;
                case 1:
                    Solicitudes.mostrarTiposHeroes();
                    String tipoHeroe = Solicitudes.solicitarTipoHeroe();
                    String nombre = Solicitudes.solicitarNombre();
                    int nivel = Solicitudes.solicitarNivel();
                    listadoArmas.mostrarArmasRegistradas();
                    Arma arma = Solicitudes.solicitarArma(listadoArmas);
                    double vidaInicial = VIDA_INICIAL;
                    switch (tipoHeroe){
                        case "GUERRERO":
                            vidaInicial = (double) Math.round((vidaInicial * Math.pow((1+AUMENTO_VIDAXNIVELSIMPLE), nivel - 1))*100 / 100);
                            double fuerza = 3 + (nivel*INCREMENTO_ATRIBUTOSESPECIFICOS);
                            listadoHeroes.registrarNuevoHeroe(new Guerrero(nombre, nivel, vidaInicial, fuerza, arma));
                            break;
                        case "ARQUERO":
                            double precision = 5 + (nivel*INCREMENTO_ATRIBUTOSESPECIFICOS);
                            listadoHeroes.registrarNuevoHeroe(new Arquero(nombre, nivel, vidaInicial, precision, arma));
                            break;
                        case "ASESINO":
                            double sigilo = 5 + (nivel*INCREMENTO_ATRIBUTOSESPECIFICOS);
                            listadoHeroes.registrarNuevoHeroe(new Asesino(nombre, nivel, vidaInicial, sigilo, arma));
                            break;
                        case "MAGO":
                            vidaInicial = (double) Math.round((vidaInicial * Math.pow((1+AUMENTO_VIDAXNIVELSIMPLE), nivel - 1))*100 / 100);
                            double mana = 3 + (nivel+INCREMENTO_ATRIBUTOSESPECIFICOS);
                            listadoHeroes.registrarNuevoHeroe(new Mago(nombre, nivel, vidaInicial, mana, arma));
                            break;
                    }
                    break;
                case 2:
                    Solicitudes.mostrarTiposArmas();
                    String tipoArma = Solicitudes.solicitarTipoArma();
                    nombre = Solicitudes.solicitarNombre();
                    double dmg = Solicitudes.solicitarDMG();
                    int durabilidad = Solicitudes.solicitarDurabilidad();
                    Solicitudes.mostrarAtributosEspeciales();
                    String atributoEspecial = Solicitudes.solicitarAtributoEspecial();
                    dmg = switch (atributoEspecial) {
                        case "FUEGO" -> dmg + (dmg * INCREMENTO_FUEGO);
                        case "HIELO" -> dmg + (dmg * INCREMENTO_HIELO);
                        case "VENENO" -> dmg + (dmg * INCREMENTO_VENENO);
                        case "DEBILIDAD" -> dmg + (dmg * INCREMENTO_DEBILIDAD);
                        default -> dmg;
                    };
                    if (tipoArma.equalsIgnoreCase("ARCO") || tipoArma.equalsIgnoreCase("BALLESTA")){
                        String tipoMunicion = Solicitudes.solicitarTipoMunicion();
                        int cantidadMunicion = Solicitudes.solicitarCantidadMunicion();
                        if (tipoArma.equalsIgnoreCase("ARCO")){
                            listadoArmas.registrarNuevaArma(new Arco(nombre, dmg, durabilidad, atributoEspecial, cantidadMunicion, tipoMunicion));
                        } else {
                            listadoArmas.registrarNuevaArma(new Ballesta(nombre, dmg, durabilidad, atributoEspecial, cantidadMunicion, tipoMunicion));
                        }
                    } else {
                        switch (tipoArma){
                            case "CUCHILLO":
                                boolean sangrado = Solicitudes.solicitarSangrado();
                                if (sangrado) dmg = dmg + (dmg*INCREMENTO_SANGRADO);
                                listadoArmas.registrarNuevaArma(new Cuchillo(nombre, dmg, durabilidad, atributoEspecial, sangrado));
                                break;
                            case "ESPADA":
                                listadoArmas.registrarNuevaArma(new Espada(nombre, dmg, durabilidad,atributoEspecial));
                                break;
                        }
                    }
                    break;
                case 3:
                    int heroeSeleccionado = -1;
                    do {
                        System.out.println("Seleccione el héroe:");
                        listadoHeroes.mostrarHeroesRegistrados();
                        heroeSeleccionado = solicitarOPC()-1;
                    } while (Validaciones.queryHeroe(listadoHeroes.personas.get(heroeSeleccionado).getNombre(), listadoHeroes) == null);
                    System.out.println("Escoga el gremio al que introducir el héroe:");
                    mostrarGremios(gremios);
                    gremios[Solicitudes.solicitarGremio(gremios)].nuevoHeroeGremio(listadoHeroes.personas.get(heroeSeleccionado));
                    break;
                case 4:
                    System.out.println("Introduce el nombre del heroe que desea borrar:");
                    nombre = sc.nextLine();
                    Persona busqueda = Validaciones.queryHeroe(nombre, listadoHeroes);
                    if (busqueda != null){
                        Persona busquedaEnGremio = Validaciones.queryHeroeGremio(nombre, gremios);
                        if (busquedaEnGremio != null){
                            for (ListadoGremio gremio : gremios){
                                gremio.personasGremio.remove(busquedaEnGremio);
                            }
                        }
                        listadoHeroes.personas.remove(busqueda);
                        System.out.println("HEROE ELIMINADO.");
                    } else {
                        System.err.println("ERROR. No se puede borrar un heroe que no existe.");
                    }
                    break;
                case 5:
                    System.out.println("Introduce el nombre del heroe que desea buscar:");
                    nombre = sc.nextLine();
                    busqueda = Validaciones.queryHeroe(nombre, listadoHeroes);
                    if (busqueda != null){
                        System.out.println("INFORMACIÓN HEROE:");
                        System.out.println(busqueda);
                    } else {
                        System.err.println("ERROR. El heroe no existe.");
                    }
                    break;
                case 6:
                    System.out.println("Escoga el gremio del que listar los héroes:");
                    mostrarGremios(gremios);
                    gremios[Solicitudes.solicitarGremio(gremios)].mostrarHeroesGremio();
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        }
        System.out.println("Saliendo del programa...");
    }

    public static void mostrarOpcInicial(){
        System.out.println("""
                MENÚ INICIAL (OPCIONES):
                1. Añadir nuevo héroe.
                2. Añadir una arma nueva al arsenal.
                3. Registrar un héroe en un gremio.
                4. Eliminar un héroe.
                5. Buscar un héroe y mostrar sus detalles.
                6. Listar todos los héroes registrados en un gremio.
                7. Salir del programa.""");
    }

    public static int solicitarOPC(){
        Scanner sc = new Scanner(System.in);
        int opc = -1;
        boolean formatoCorrecto = false;
        do {
            try {
                System.out.println("Escoge una opción:");
                opc = sc.nextInt();
                formatoCorrecto = true;
            } catch (InputMismatchException e){
                System.out.println("Tipo de dato proporcionado incorrecto. (Se necesita tipo número).");
                sc.nextLine();
            }
        } while (!formatoCorrecto);
        return opc;
    }

    public static void condicionesCrearHeroe(){
        System.out.println("""
                CONDICIONES CREACIÓN HÉROE:
                    - Escoge un tipo de héroe válido.
                    - Tamaño máximo nombre: 35 carácteres.
                    - Nivel máximo inicial: 5
                    - Por cada nivel, el HP aumentará un 10%.
                    - Al superar los 1k de vida, el incremento de HP será en un 5%.
                    - Se listará las armas disponibles para cada héroe.""");
    }

    public static void mostrarGremios(ListadoGremio[] gremios){
        int i = 0;
        System.out.println("LISTADO DE GREMIOS:");
        for (ListadoGremio gremio : gremios){
            System.out.println((i+1) + " | " + gremio);
            i++;
        }
    }
}
