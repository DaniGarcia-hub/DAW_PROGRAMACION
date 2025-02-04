package UD6Tarea1.Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean finalizarPrograma = false;
        TelefonoMovil telefono1 = new TelefonoMovil("655605806");

        while (!finalizarPrograma){
            mostrarMenuInicial();
            switch (resultadoScannerInt()){
                case 0:
                    finalizarPrograma = true;
                    break;
                case 1:
                    telefono1.printContacts();
                    break;
                case 2:
                    telefono1.addNewContact(registrarContacto());
                    break;
            }
        }
    }

    public static void mostrarMenuInicial(){
        System.out.println("""
                PROGRAMA PARA REGISTRAR CONTACTOS Y/O INICIALIZAR TELEFONOS MÓVILES.
                
                Opciones:
                0. Salir.
                1. Imprimir contactos.
                2. Agregar nuevo contacto.
                3. Actualizar un contacto existente.
                4. Eliminar contacto de una lista.
                5. Buscar/Encontrar un contacto.
                6. Ordenar lista de contactos.
                7. Cantidad de contactos registrados.
                8. Borrar lista de contactos.
                9. Imprimir lista de opciones.""");
    }

    public static int resultadoScannerInt(){
        Scanner sc = new Scanner(System.in);
        boolean introduccionCorrecta = false;

        try{
            while(!introduccionCorrecta){
                introduccionCorrecta = true;
                return sc.nextInt();
            }
        } catch (InputMismatchException e){
            System.err.println("Valor introducido incorrecto.");
        }

        sc.close();
        return -1;
    }

    public static Contacto registrarContacto(){
        Scanner sc = new Scanner(System.in);
        String numTel = "";

        System.out.println("Introduce el nombre del contacto:");
        String name = sc.nextLine();

        do {
            System.out.println("Introduce el telefono a registrar:");
            numTel = sc.nextLine();
        } while (!comprobarCondicionesTel(numTel));

        return new Contacto(name, numTel);
    }

    public static boolean comprobarCondicionesTel(String numTel){
        if (numTel.length() != 9){
            System.err.println("El número introducido no cumple los requisitos de un número de teléfono español. (9 dígitos).");
            return false;
        } else {
            for (int i = 0; i < numTel.length(); i++){
                if (!Character.isDigit(numTel.charAt(i))){
                    System.err.println("Un número de teléfono solo permiten números.");
                    return false;
                }
            }

            return true;
        }
    }
}
