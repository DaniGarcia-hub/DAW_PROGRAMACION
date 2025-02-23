package Repaso_1;

import java.util.Scanner;

import Repaso_1.srcArmas.Arma;
import Repaso_1.srcArmas.AtributosEspeciales;
import Repaso_1.srcArmas.TiposArmas;
import Repaso_1.srcEntidades.TiposHeroes;
import Repaso_1.Color;

import static Repaso_1.Main.solicitarOPC;

public class Solicitudes {
    // DATOS HÉROES.
    static Scanner sc = new Scanner(System.in);

    protected static void mostrarTiposHeroes(){
        System.out.println("TIPOS DE HÉROES DISPONIBLES:");
        int i = 0;
        for (TiposHeroes tipoHeroe : TiposHeroes.values()){
            System.out.println((i+1) + " | " + tipoHeroe);
            i++;
        }
    }
    protected static void mostrarTiposArmas(){
        System.out.println("TIPOS DE ARMAS:");
        int i = 0;
        for (TiposArmas tipoArma : TiposArmas.values()){
            System.out.println((i+1) + " | " + tipoArma);
            i++;
        }
    }
    protected static void mostrarAtributosEspeciales(){
        System.out.println("ATRIBUTOS ESPECIALES:");
        int i = 0;
        for (AtributosEspeciales atributo : AtributosEspeciales.values()){
            System.out.println((i+1) + " | " + atributo);
            i++;
        }
    }

    protected static int solicitarTipoHeroe(){
        int seleccionTipo = -1;
        do {
            try {
                System.out.println("Seleccione el tipo de héroe (Ej. 2):");
                String entrada = sc.nextLine().trim();
                seleccionTipo = Integer.parseInt(entrada)-1;
            } catch (NumberFormatException e){
                System.out.println(Color.COLOR_RED + "Formato incorrecto. Se solicita tipo número." + Color.COLOR_RESET);
            }

        } while (!Validaciones.validarTipoHeroe(seleccionTipo));
        return seleccionTipo;
    }

    protected static int solicitarTipoArma(){
        int seleccionTipo = -1;
        do {
            try {
                System.out.println("Seleccione el tipo de arma (Ej.3):");
                String entrada = sc.nextLine().trim();
                seleccionTipo = Integer.parseInt(entrada)-1;
            } catch (NumberFormatException e){
                System.out.println(Color.COLOR_RED + "Formato incorrecto. Se solicita tipo número." + Color.COLOR_RESET);
            }
        } while (!Validaciones.validarTipoArma(seleccionTipo));
        return seleccionTipo;
    }

    protected static String solicitarNombre(ListadoHeroes listadoHeroes){
        String nombre = "";
        do {
            System.out.println("Introduce el nombre (Ej. Gladiador Tolomeo):");
            nombre = sc.nextLine();
        } while (!Validaciones.validarNombre(nombre, listadoHeroes));
        return nombre;
    }

    protected static int solicitarNivel(){
        int nivelHeroe = -1;
        do {
            try {
                System.out.println("Introduce el nivel inicial del héroe (Ej. 2):");
                String entrada = sc.nextLine().trim();
                nivelHeroe = Integer.parseInt(entrada);
            }catch (NumberFormatException e){
                System.out.println(Color.COLOR_RED + "Formato incorrecto. Se solicita tipo número." + Color.COLOR_RESET);
            }
        } while (!Validaciones.validarNivel(nivelHeroe));
        return nivelHeroe;
    }

    protected static Arma solicitarArma(ListadoArmas armasDisponibles){
        int armaSeleccionada = -1;
        do {
            try {
                System.out.println("Seleccione un arma por su código (Ej. 2):");
                String entrada = sc.nextLine().trim();
                armaSeleccionada = Integer.parseInt(entrada)-1;
            } catch (NumberFormatException e){
                System.out.println(Color.COLOR_RED + "Formato incorrecto. Se solicita tipo número" + Color.COLOR_RESET);
            }
        } while (!Validaciones.validarArma(armaSeleccionada, armasDisponibles));
        return armasDisponibles.getArmas().get(armaSeleccionada);
    }

    protected static double solicitarDMG(){
        double dmg = -1;
        do {
            try {
                System.out.println("Introduce el daño del arma(5-30):");
                String entrada = sc.nextLine().trim();
                dmg = Double.parseDouble(entrada);
            } catch (NumberFormatException e){
                System.out.println(Color.COLOR_RED + "Formato incorrecto. Se solicita tipo número, permitido decimales." + Color.COLOR_RESET);
            }
        } while (!Validaciones.validarDMG(dmg));
        return dmg;
    }

    protected static int solicitarDurabilidad(){
        int durabilidad = -1;
        do {
            try {
                System.out.println("Introduce la durabilidad del arma (0-100):");
                String entrada = sc.nextLine().trim();
                durabilidad = Integer.parseInt(entrada);
            } catch (NumberFormatException e){
                System.out.println(Color.COLOR_RED + "Formato incorrecto. Se solicita tipo número" + Color.COLOR_RESET);
            }
        } while (!Validaciones.validarDurabilidad(durabilidad));
        return durabilidad;
    }

    protected static int solicitarAtributoEspecial(){
        int atributoEspecial = -1;
        do {
            try {
                System.out.println("Introduce el atributo especial:");
                String entrada = sc.nextLine().trim();
                atributoEspecial = Integer.parseInt(entrada)-1;
            } catch (NumberFormatException e){
                System.out.println(Color.COLOR_RED + "Formato incorrecto. Se solicita tipo número." + Color.COLOR_RESET);
            }
        } while (!Validaciones.validarAtributoEspecial(atributoEspecial));
        return atributoEspecial;
    }

    protected static String solicitarTipoMunicion(){
        System.out.println("Introduce el tipo de munición. (Ej. Flechas):");
        String tipoMunicion = sc.nextLine();
        return tipoMunicion;
    }

    protected static int solicitarCantidadMunicion(){
        int cantidadMunicion = -1;
        do {
            try {
                System.out.println("Introduce la cantidad de munición. (0-130):");
                String entrada = sc.nextLine().trim();
                cantidadMunicion = Integer.parseInt(entrada);
            } catch (NumberFormatException e){
                System.out.println(Color.COLOR_RED + "Formato incorrecto. Se solicita tipo número" + Color.COLOR_RESET);
            }
        } while (!Validaciones.validarCantidadMunicion(cantidadMunicion));
        return cantidadMunicion;
    }
    protected static boolean solicitarSangrado(){
        boolean sangrado = false;
        boolean correctaEjecucion = false;
        do {
            try {
                System.out.println("¿Tiene habilidad de sangrado? (true/false):");
                String entrada = sc.nextLine().trim();
                sangrado = Boolean.parseBoolean(entrada);
                correctaEjecucion = true;
            } catch (NumberFormatException e){
                System.out.println(Color.COLOR_RED + "Formato incorrecto. Se solicita boolean." + Color.COLOR_RESET);
            }
        } while (!correctaEjecucion);
        return sangrado;
    }
    protected static int solicitarGremio(ListadoGremio[] gremios){
        boolean ejecucionCorrecta = false;
        int gremioSeleccionado = -1;
        do {
            gremioSeleccionado = solicitarOPC() - 1;
            if (gremioSeleccionado >= 0 && gremioSeleccionado < gremios.length){
                ejecucionCorrecta = true;
            } else {
                System.out.println(Color.COLOR_RED + "ERROR. El gremio introducido no existe." + Color.COLOR_RESET);
            }
        } while (!ejecucionCorrecta);
        return gremioSeleccionado;
    }
}

/*
- COMPROBAR
 */