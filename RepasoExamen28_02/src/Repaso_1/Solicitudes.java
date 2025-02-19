package Repaso_1;

import java.util.InputMismatchException;
import java.util.Scanner;

import Repaso_1.srcArmas.Arma;
import Repaso_1.srcEntidades.TiposHeroes;
import Repaso_1.ListadoArmas;

public class Solicitudes {
    // DATOS HÉROES.

    protected static void mostrarTiposHeroes(){
        System.out.println("TIPOS DE HÉROES DISPONIBLES:");
        int i = 0;
        for (TiposHeroes tipoHeroe : TiposHeroes.values()){
            System.out.println((i+1) + " | " + tipoHeroe);
            i++;
        }
    }

    protected static String solicitarTipoHeroe(){
        Scanner sc = new Scanner(System.in);
        String seleccionTipo = "";
        do {
            System.out.println("Seleccione el tipo de héroe:\n");
            seleccionTipo = sc.nextLine();
        } while (!Validaciones.validarTipoHeroe(seleccionTipo));
        sc.close();
        return seleccionTipo;
    }

    protected static String solicitarNombre(){
        Scanner sc = new Scanner(System.in);
        String nombreHeroe = "";
        do {
            System.out.println("Introduce el nombre del héroe:");
            nombreHeroe = sc.nextLine();
        } while (!Validaciones.validarNombre(nombreHeroe));
        sc.close();
        return nombreHeroe;
    }

    protected static int solicitarNivel(){
        Scanner sc = new Scanner(System.in);
        int nivelHeroe = -1;
        do {
            try {
                System.out.println("Introduce el nivel inicial del héroe:");
                nivelHeroe = sc.nextInt();
            }catch (InputMismatchException e){
                System.err.println("Formato incorrecto. Se solicita tipo número.");
                sc.nextLine();
            }
        } while (!Validaciones.validarNivel(nivelHeroe));
        sc.close();
        return nivelHeroe;
    }

    protected static Arma solicitarArma(ListadoArmas armasDisponibles){
        Scanner sc = new Scanner(System.in);
        int armaSeleccionada = -1;
        armasDisponibles.mostrarArmasRegistradas();
        do {
            try {
                System.out.println("Seleccione un arma por su código:");
                armaSeleccionada = (sc.nextInt() - 1);
            } catch (InputMismatchException e){
                System.err.println("Formato incorrecto. Se solicita tipo número");
                sc.nextLine();
            }
        } while (!Validaciones.validarArma(armaSeleccionada, armasDisponibles));
        sc.close();
        return armasDisponibles.getArmas().get(armaSeleccionada);
    }
}
