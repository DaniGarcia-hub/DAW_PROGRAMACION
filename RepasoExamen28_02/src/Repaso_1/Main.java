package Repaso_1;

import Repaso_1.srcArmas.*;
import Repaso_1.srcEntidades.*;

import java.util.Random;
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

        listadoHeroes.registrarNuevoHeroe(new Arquero("Periko", 2, 134.25, 25.5, listadoArmas.getArmas().getFirst()));
        listadoHeroes.registrarNuevoHeroe(new Arquero("Alberto", 3, 154.25, 15.2, listadoArmas.getArmas().getFirst()));

        gremios[0].nuevoHeroeGremio(listadoHeroes.personas.getFirst());

        boolean finalizarPrograma = false;
        System.out.println("""
                BIENVENID@ A UN JUEGO MUY ESPECIAL.
                
                Se trata de un juego donde se podrán enfrentar increibles heroes contra grandes bosses. A continuación, se muestra los siguientes pasos a escoger.""");
        while (!finalizarPrograma){
            mostrarOpcInicial();
            switch (solicitarOPC()){
                case 8:
                    System.out.println("Saliendo del programa...");
                    finalizarPrograma = true;
                    break;
                case 1:
                    condicionesCrearHeroe();
                    System.out.println("------------------------");
                    Solicitudes.mostrarTiposHeroes();
                    int tipoHeroe = Solicitudes.solicitarTipoHeroe();
                    String nombre = Solicitudes.solicitarNombre();
                    int nivel = Solicitudes.solicitarNivel();
                    listadoArmas.mostrarArmasRegistradas();
                    Arma arma = Solicitudes.solicitarArma(listadoArmas);
                    double vidaInicial = VIDA_INICIAL;
                    switch (tipoHeroe){
                        case 0:
                            vidaInicial = (double) Math.round((vidaInicial * Math.pow((1+AUMENTO_VIDAXNIVELSIMPLE), nivel - 1))*100 / 100);
                            double fuerza = 3 + (nivel*INCREMENTO_ATRIBUTOSESPECIFICOS);
                            listadoHeroes.registrarNuevoHeroe(new Guerrero(nombre, nivel, vidaInicial, fuerza, arma));
                            break;
                        case 1:
                            double precision = 5 + (nivel*INCREMENTO_ATRIBUTOSESPECIFICOS);
                            listadoHeroes.registrarNuevoHeroe(new Arquero(nombre, nivel, vidaInicial, precision, arma));
                            break;
                        case 2:
                            double sigilo = 5 + (nivel*INCREMENTO_ATRIBUTOSESPECIFICOS);
                            listadoHeroes.registrarNuevoHeroe(new Asesino(nombre, nivel, vidaInicial, sigilo, arma));
                            break;
                        case 3:
                            vidaInicial = (double) Math.round((vidaInicial * Math.pow((1+AUMENTO_VIDAXNIVELSIMPLE), nivel - 1))*100 / 100);
                            double mana = 3 + (nivel+INCREMENTO_ATRIBUTOSESPECIFICOS);
                            listadoHeroes.registrarNuevoHeroe(new Mago(nombre, nivel, vidaInicial, mana, arma));
                            break;
                    }
                    System.out.println("INFORMACIÓN HÉROE CREADO:");
                    listadoHeroes.personas.getLast();
                    break;
                case 2:
                    Solicitudes.mostrarTiposArmas();
                    int tipoArma = Solicitudes.solicitarTipoArma();
                    nombre = Solicitudes.solicitarNombre();
                    double dmg = Solicitudes.solicitarDMG();
                    int durabilidad = Solicitudes.solicitarDurabilidad();
                    Solicitudes.mostrarAtributosEspeciales();
                    int opcAtributo = Solicitudes.solicitarAtributoEspecial();
                    String atributoEspecial = "";
                    switch (opcAtributo){
                        case 0:
                            atributoEspecial = "FUEGO";
                            dmg = dmg + (dmg * INCREMENTO_FUEGO);
                            break;
                        case 1:
                            atributoEspecial = "HIELO";
                            dmg = dmg + (dmg*INCREMENTO_HIELO);
                            break;
                        case 2:
                            atributoEspecial = "VENENO";
                            dmg = dmg + (dmg*INCREMENTO_VENENO);
                            break;
                        case 3:
                            atributoEspecial = "DEBILIDAD";
                            dmg = dmg + (dmg*INCREMENTO_DEBILIDAD);
                            break;
                        default:
                            atributoEspecial = "NINGUNO";
                    }
                    if (tipoArma == 0 || tipoArma == 1){
                        String tipoMunicion = Solicitudes.solicitarTipoMunicion();
                        int cantidadMunicion = Solicitudes.solicitarCantidadMunicion();
                        if (tipoArma == 0){
                            listadoArmas.registrarNuevaArma(new Arco(nombre, dmg, durabilidad, atributoEspecial, cantidadMunicion, tipoMunicion));
                        } else {
                            listadoArmas.registrarNuevaArma(new Ballesta(nombre, dmg, durabilidad, atributoEspecial, cantidadMunicion, tipoMunicion));
                        }
                    } else {
                        switch (tipoArma){
                            case 2:
                                boolean sangrado = Solicitudes.solicitarSangrado();
                                if (sangrado) dmg = dmg + (dmg*INCREMENTO_SANGRADO);
                                listadoArmas.registrarNuevaArma(new Cuchillo(nombre, dmg, durabilidad, atributoEspecial, sangrado));
                                break;
                            case 3:
                                listadoArmas.registrarNuevaArma(new Espada(nombre, dmg, durabilidad, atributoEspecial));
                                break;
                        }
                    }
                    break;
                case 3:
                    int heroeSeleccionado = -1;
                    String nombreBuscado = "";
                    do {
                        try {
                            System.out.println("Seleccione el héroe:");
                            listadoHeroes.mostrarHeroesRegistrados();
                            heroeSeleccionado = solicitarOPC()-1;
                            nombreBuscado = listadoHeroes.personas.get(heroeSeleccionado).getNombre();
                        } catch (IndexOutOfBoundsException e){
                            System.err.println("ERROR. El héroe introducido no existe.");
                        }
                    } while (Validaciones.queryHeroe(nombreBuscado, listadoHeroes) == null);
                    System.out.println("Escoga el gremio al que introducir el héroe:");
                    mostrarGremios(gremios);
                    int indexGremio = Solicitudes.solicitarGremio(gremios);
                    gremios[indexGremio].nuevoHeroeGremio(listadoHeroes.personas.get(heroeSeleccionado));
                    System.out.println("INFORMACIÓN. RESULTADO:");
                    System.out.println("Gremio: " + gremios[indexGremio].getNombreGremio() + " | " + gremios[indexGremio].personasGremio.getLast());
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
                case 7:
                    if (listadoHeroes.personas.size() == 1){
                        System.err.println("ERROR. No se puede luchar con solo 1 héroe registrado.");
                        break;
                    }
                    int heroePrincipalINT = -1;
                    int heroeSecundarioINT = -1;
                    boolean personajeCorrecto = false;
                    mostrarInfoPelea();
                    listadoHeroes.mostrarHeroesRegistrados();
                    do {
                        System.out.println("Introduce el nombre del héroe principal que va a luchar:");
                        heroePrincipalINT = solicitarOPC()-1;
                        if (heroePrincipalINT >= 0 && heroePrincipalINT < listadoHeroes.personas.size()){ // COMPROBAR SI EL HÉROE EXISTE.
                            if (listadoHeroes.personas.get(heroePrincipalINT).getArma().getDurabilidad() == 0){ // COMPROBANDO DURABILIDAD DEL ARMA.
                                System.err.println("ERROR. Un héroe con un arma rota no puede luchar.");
                            } else {
                                personajeCorrecto = true;
                            }
                        } else {
                            System.err.println("ERROR. Personaje introducido inválido.");
                        }
                    } while (!personajeCorrecto);
                    personajeCorrecto = false;
                    do {
                        System.out.println("Introduce el personaje con el que luchará:");
                        heroeSecundarioINT = solicitarOPC()-1;
                        if (heroeSecundarioINT >= 0 && heroeSecundarioINT < listadoHeroes.personas.size()){ // COMPROBAR SI EL HÉROE EXISTE.
                            if (listadoHeroes.personas.get(heroeSecundarioINT).getArma().getDurabilidad() == 0){ // COMPROBANDO DURABILIDAD DEL ARMA.
                                System.err.println("ERROR. Un héroe con un arma rota no puede luchar.");
                            } else {
                                personajeCorrecto = true;
                            }
                        } else {
                            System.err.println("ERROR. Personaje introducido inválido.");
                        }
                    } while (!personajeCorrecto);

                    Persona heroePrincipal = listadoHeroes.personas.get(heroePrincipalINT); // SE OBTIENE DIRECTAMENTE EL HÉROE.
                    Persona heroeSecundario = listadoHeroes.personas.get(heroeSecundarioINT); // SE OBTIENE DIRECTAMENTE EL HÉROE.
                    Random random = new Random();
                    boolean quienEmpieza = random.nextBoolean();
                    boolean turnoHeroePrincipal = quienEmpieza ? true : false;
                    boolean ganadorBoolean = true; // TRUE = Heroe Principal.
                    boolean finalizarPartida = false;
                    Persona ganador = null;

                    double dmgQuitar = -5;
                    double vidaRestantePrincipal = heroePrincipal.getHP();
                    double vidaRestanteSecundario = heroeSecundario.getHP();

                    int contadorRonda = 1;

                    while (!finalizarPartida){
                        if (turnoHeroePrincipal){
                            if (vidaRestantePrincipal != 0){
                                if (heroePrincipal.getArma().getDurabilidad() != 0){
                                    System.out.println("----- RONDA " + contadorRonda + " -----");
                                     dmgQuitar = heroePrincipal.atacar();
                                    System.out.println(heroePrincipal.getNombre() + " está atacando... Golpea a " + heroeSecundario.getNombre());
                                    System.out.println("Daño proporcionado: " + dmgQuitar);
                                    vidaRestanteSecundario = vidaRestanteSecundario-dmgQuitar;
                                    if (vidaRestanteSecundario < 0){
                                        vidaRestanteSecundario = 0;
                                    }
                                    heroeSecundario.setHP(vidaRestanteSecundario);
                                    System.out.println("HP restante de " + heroeSecundario.getNombre() + ": " + vidaRestanteSecundario);
                                    turnoHeroePrincipal = false;
                                    contadorRonda++;
                                    System.out.println("--------------------");
                                } else {
                                    System.err.println("Ohh NOO! ¡La arma está rota! Me da que " + heroePrincipal.getNombre() + " ha perdido...");
                                    ganadorBoolean = false;
                                    finalizarPartida = true;
                                }
                            } else {
                                System.err.println("Vaya... " + heroePrincipal.getNombre() + " ha muerto...");
                                ganadorBoolean = false;
                                finalizarPartida = true;
                            }
                        } else {
                            if (vidaRestanteSecundario != 0){
                                if (heroeSecundario.getArma().getDurabilidad() != 0){
                                    System.out.println("----- RONDA " + contadorRonda + " -----");
                                    dmgQuitar = heroeSecundario.atacar();
                                    System.out.println(heroeSecundario.getNombre() + " está atacando... Golpea a " + heroePrincipal.getNombre());
                                    System.out.println("Daño proporcionado: " + dmgQuitar);
                                    vidaRestantePrincipal = vidaRestantePrincipal-dmgQuitar;
                                    if (vidaRestantePrincipal < 0){
                                        vidaRestantePrincipal = 0;
                                    }
                                    heroeSecundario.setHP(vidaRestantePrincipal);
                                    System.out.println("HP restante de " + heroePrincipal.getNombre() + ": " + vidaRestantePrincipal);
                                    turnoHeroePrincipal = true;
                                    contadorRonda++;
                                    System.out.println("--------------------");
                                } else {
                                    System.err.println("Ohh NOO! ¡La arma está rota! Me da que " + heroeSecundario.getNombre() + " ha perdido...");
                                    finalizarPartida = true;
                                }
                            } else {
                                System.err.println("Vaya... " + heroeSecundario.getNombre() + " ha muerto...");
                                finalizarPartida = true;
                            }
                        }
                    }
                    ganador = ganadorBoolean ? heroePrincipal : heroeSecundario;
                    System.out.println("GANADOR:");
                    System.out.println(ganador);

                    ganador.setNivel(ganador.getNivel()+1);
                    System.out.println("¡SUBIDA DE NIVEL PARA " + ganador.getNombre() + "! | NUEVO NIVEL: " + ganador.getNivel());
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        }
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
                7. Hacer una pelea entre héroes.
                8. Salir del programa.""");
    }

    public static int solicitarOPC(){
        Scanner sc = new Scanner(System.in);
        int opc = -1;
        boolean formatoCorrecto = false;
        do {
            try {
                System.out.println("Escoge una opción:");
                String entrada = sc.nextLine().trim();
                opc = Integer.parseInt(entrada);
                formatoCorrecto = true;
            } catch (NumberFormatException e){
                System.err.println("Tipo de dato proporcionado incorrecto. (Se necesita tipo número).");
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

    public static void mostrarInfoPelea(){
        System.out.println("""
                PELEA DE HÉROES:
                
                Se trata de un modo de juego, donde tras escoger dos héroes para una pelea, se enfrentarán haciendo uso
                de sus increibles armas en una pelea. A continuación, se mostrarán la lista de héroes disponibles:""");
    }
}
