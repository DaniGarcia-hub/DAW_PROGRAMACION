package Repaso_1;

import java.util.InputMismatchException;
import java.util.Scanner;

import Repaso_1.srcArmas.Arma;
import Repaso_1.srcArmas.AtributosEspeciales;
import Repaso_1.srcArmas.TiposArmas;
import Repaso_1.srcEntidades.TiposHeroes;

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

    protected static String solicitarTipoHeroe(){
        String seleccionTipo = "";
        do {
            System.out.println("Seleccione el tipo de héroe (Ej. Guerrero):");
            seleccionTipo = sc.nextLine().toUpperCase();
            sc.reset();
        } while (!Validaciones.validarTipoHeroe(seleccionTipo));
        return seleccionTipo;
    }

    protected static String solicitarTipoArma(){
        String seleccionTipo = "";
        do {
            System.out.println("Seleccione el tipo de arma:");
            seleccionTipo = sc.nextLine().toUpperCase();
            sc.reset();
        } while (!Validaciones.validarTipoArma(seleccionTipo));
        return seleccionTipo;
    }

    protected static String solicitarNombre(){
        String nombre = "";
        do {
            System.out.println("Introduce el nombre:");
            nombre = sc.nextLine();
            sc.reset();
        } while (!Validaciones.validarNombre(nombre));
        return nombre;
    }

    protected static int solicitarNivel(){
        int nivelHeroe = -1;
        do {
            try {
                System.out.println("Introduce el nivel inicial del héroe:");
                nivelHeroe = sc.nextInt();
                sc.reset();
            }catch (InputMismatchException e){
                System.err.println("Formato incorrecto. Se solicita tipo número.");
                sc.nextLine();
            }
        } while (!Validaciones.validarNivel(nivelHeroe));
        return nivelHeroe;
    }

    protected static Arma solicitarArma(ListadoArmas armasDisponibles){
        int armaSeleccionada = -1;
        do {
            try {
                System.out.println("Seleccione un arma por su código:");
                armaSeleccionada = (sc.nextInt() - 1);
                sc.reset();
            } catch (InputMismatchException e){
                System.err.println("Formato incorrecto. Se solicita tipo número");
                sc.nextLine();
            }
        } while (!Validaciones.validarArma(armaSeleccionada, armasDisponibles));
        return armasDisponibles.getArmas().get(armaSeleccionada);
    }

    protected static double solicitarDMG(){
        double dmg = -1;
        do {
            try {
                System.out.println("Introduce el daño del arma(5-30):");
                dmg = sc.nextDouble();
            } catch (InputMismatchException e){
                System.err.println("Formato incorrecto. Se solicita tipo número, permitido decimales.");
                sc.nextLine();
            }
        } while (!Validaciones.validarDMG(dmg));
        return dmg;
    }

    protected static int solicitarDurabilidad(){
        int durabilidad = -1;
        do {
            try {
                System.out.println("Introduce la durabilidad del arma (0-100):");
                durabilidad = sc.nextInt();
            } catch (InputMismatchException e){
                System.err.println("Formato incorrecto. Se solicita tipo número");
                sc.nextLine();
            }
        } while (!Validaciones.validarDurabilidad(durabilidad));
        return durabilidad;
    }

    protected static String solicitarAtributoEspecial(){
        String atributoEspecial = "";
        do {
            System.out.println("Introduce el atributo especial:");
            atributoEspecial = sc.nextLine().toUpperCase();
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
                cantidadMunicion = sc.nextInt();
            } catch (InputMismatchException e ){
                System.err.println("Formato incorrecto. Se solicita tipo número");
                sc.nextLine();
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
                sangrado = sc.nextBoolean();
                correctaEjecucion = true;
            } catch (InputMismatchException e){
                System.err.println("Formato incorrecto. Se solicita boolean.");
                sc.nextLine();
            }
        } while (!correctaEjecucion);
        return sangrado;
    }
    protected static int solicitarGremio(ListadoGremio[] gremios){
        boolean ejecucionCorrecta = false;
        int gremioSeleccionado = -1;
        do {
            gremioSeleccionado = solicitarOPC() - 1;
            if (gremioSeleccionado >= 0 && gremioSeleccionado < gremios.length) ejecucionCorrecta = true;
        } while (!ejecucionCorrecta);
        return gremioSeleccionado;
    }
}
