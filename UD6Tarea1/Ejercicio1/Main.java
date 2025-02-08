package UD6Tarea1.Ejercicio1;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
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
                case 3:
                    Contacto obtenerContacto = telefono1.queryContact(solicitarNombreContacto());
                    if (obtenerContacto != null){
                        telefono1.updateContact(obtenerContacto, registrarContacto());
                    } else {
                        System.err.println("No se puede actualizar un contacto que no existe.");
                    }
                    break;
                case 4:
                    int contactNumber = telefono1.findContact(solicitarNombreContacto());
                    if (contactNumber < 0){
                        System.err.println("No se ha encontrado el contacto a borrar.");
                    } else {
                        telefono1.removeContact(telefono1.getMyContacts().get(contactNumber));
                        System.out.println("CONTACTO ELIMINADO.");
                    }
                    break;
                case 5:
                    mostrarMenuBusqueda();
                    switch (resultadoScannerInt()){
                        case 1:
                            obtenerDatosContactoOnly(telefono1, telefono1.findContact(solicitarNombreContacto()));
                            break;
                        case 2:
                            obtenerDatosContactoOnly(telefono1, telefono1.findContactByNumber(solicitarNumeroTelefono()));
                            break;
                        case 3:
                            boolean ejecucionCorrecta = false;
                            int opc = -1;
                            do {
                                mostrarMenuCondiciones();
                                opc = resultadoScannerInt();
                                if (opc > 0 && opc < 5){
                                    ejecucionCorrecta = true;
                                } else {
                                    System.err.println("Opción incorrecta.");
                                }
                            } while (!ejecucionCorrecta);
                            for (Contacto contactWithCondition : telefono1.findByCode(opc)){
                                System.out.println(contactWithCondition.toString());
                            }
                            break;
                        default:
                            System.err.println("Opción incorrecta.");
                    }
                    break;
                case 6:
                    Collections.sort(telefono1.getMyContacts());
                    System.out.println("¡LISTA DE CONTACTOS ORDENADA!");
                    telefono1.printContacts();
                    break;
                case 7:
                    System.out.println("Cantidad de contactos registrados: " + telefono1.getMyContacts().size() + " contactos registrados.");
                    break;
                case 8:
                    telefono1.deleteAllContacts();
                    System.out.println("Todos los contactos eliminados.");
                    break;
                default:
                    System.err.println("Opción incorrecta.");
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
                8. Borrar lista de contactos.""");
    }

    public static int resultadoScannerInt(){
        boolean introduccionCorrecta = false;
            while(!introduccionCorrecta){
                try {
                    return sc.nextInt();
                }catch (InputMismatchException e){
                    System.err.println("Valor introducido incorrecto.");
                }
            }
        return -1;
    }

    public static Contacto registrarContacto(){
        String numTel = "";
        System.out.println("Introduce el nombre del nuevo contacto:");
        String name = sc.next();
        do {
            System.out.println("Introduce el nuevo telefono a registrar:");
            numTel = sc.next();
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

    public static String solicitarNombreContacto(){
        System.out.println("Introduce el nombre del contacto:");
        return sc.next();
    }

    public static String solicitarNumeroTelefono(){
        String numTel = "";
        do {
            System.out.println("Introduce el número de teléfono:");
            numTel = sc.next();
        } while (!comprobarCondicionesTel(numTel));
        return numTel;
    }

    public static void mostrarMenuBusqueda(){
        System.out.println("""
                Se dispone de diferentes formas de buscar contactos. Búsqueda por:
                1. Nombre de contacto.
                2. Teléfono de contacto.
                3. Patrón clave. (Ejemplo: Empiecen por A).""");
    }

    public static int obtenerDatosContactoOnly(TelefonoMovil telefono, int posicionContacto){
        if (posicionContacto >= 0){
            System.out.println(telefono.getMyContacts().get(posicionContacto));
            return 0;
        } else {
            System.err.println("Contacto no encontrado.");
            return -1;
        }
    }

    public static void mostrarMenuCondiciones(){
        System.out.println("""
                Formas disponibles para realizar una búsqueda más precisa:
                1. Empieza por X.
                2. Termina por Y.
                3. Contiene Z.
                4. Contiene números en el nombre del contacto.""");
    }
}
