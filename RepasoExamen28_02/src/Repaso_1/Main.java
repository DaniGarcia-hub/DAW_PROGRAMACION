package Repaso_1;

import Repaso_1.srcEntidades.*;
import Repaso_1.Solicitudes.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                case 6:
                    finalizarPrograma = true;
                    break;
                case 1:
                    Solicitudes.solicitarTipoHeroe();
                    Solicitudes.solicitarNombre();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
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
                3. Eliminar un héroe.
                4. Buscar un héroe y mostrar sus detalles.
                5. Listar todos los héroes registrados en un gremio.
                6. Salir del programa.""");
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
}
