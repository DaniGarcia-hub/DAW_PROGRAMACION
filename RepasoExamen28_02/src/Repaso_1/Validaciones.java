package Repaso_1;

import Repaso_1.srcArmas.TiposArmas;
import Repaso_1.srcEntidades.Persona;
import Repaso_1.srcEntidades.TiposHeroes;
import Repaso_1.srcArmas.AtributosEspeciales;
import Repaso_1.Color;

public class Validaciones {
    private static final int MAX_35CARACTERS = 35;
    private static final int MAX_NIVELINICIAL = 5;

    private static boolean comprobarSoloTexto(String texto){
        for (int i = 0; i < texto.length(); i++){
            if (!Character.isLetter(texto.charAt(i))){
                if (Character.isSpaceChar(texto.charAt(i))){
                    continue;
                }
                return false;
            }
        }
        return true;
    }
    protected static boolean validarTipoHeroe(int guerrero){
        if (guerrero >= 0 && guerrero < TiposHeroes.values().length){
            return true;
        } else {
            System.out.println(Color.COLOR_RED + "ERROR. Tipo de héroe introducido inválido." + Color.COLOR_RESET);
            return false;
        }
    }
    protected static boolean validarTipoArma(int arma){
        if (arma >= 0 && arma < TiposArmas.values().length){
            return true;
        } else {
            System.out.println(Color.COLOR_RED + "ERROR. Tipo de arma introducida inválida." + Color.COLOR_RESET);
            return false;
        }
    }
    protected static boolean validarNombre(String nombre, ListadoHeroes listadoHeroes){
        boolean resultado = true;
        if (nombre.isEmpty()){
            System.out.println(Color.COLOR_RED + "ERROR. El nombre no puede estar vacío." + Color.COLOR_RESET);
            resultado = false;
        } else if (nombre.length() > MAX_35CARACTERS) {
            System.out.println(Color.COLOR_RED + "ERROR. La cantidad máxima de carácteres permitidos son de 35 carácteres." + Color.COLOR_RESET);
            resultado = false;
        } else if (!comprobarSoloTexto(nombre)) {
            System.out.println(Color.COLOR_RED + "ERROR. Solo se permiten letras." + Color.COLOR_RESET);
            resultado = false;
        } else if(queryHeroe(nombre, listadoHeroes) != null){
            System.out.println(Color.COLOR_RED + "ERROR. El nombre ya está en uso." + Color.COLOR_RESET);
            resultado = false;
        }
        return resultado;
    }
    protected static boolean validarNivel(int nivel){
        if (nivel >= 1 && nivel <= MAX_NIVELINICIAL){
            return true;
        }
        System.out.println(Color.COLOR_RED + "ERROR. El mínimo de nivel que puede tener es 1, y el máximo 5." + Color.COLOR_RESET);
        return false;
    }
    protected static boolean validarArma(int opcUsuario, ListadoArmas armasDisponibles){
        if (opcUsuario >= 0 && opcUsuario < armasDisponibles.armas.size()) return true;
        System.out.println(Color.COLOR_RED + "ERROR. El arma escogida no existe." + Color.COLOR_RESET);
        return false;
    }
    protected static boolean validarDMG(double dmg){
        if (dmg >= 5 && dmg <= 30){
            return true;
        }
        System.out.println(Color.COLOR_RED + "ERROR. Daño introducido fuera de los límites permitidos." + Color.COLOR_RESET);
        return false;
    }
    protected static boolean validarDurabilidad(int durabilidad){
        if (durabilidad >= 0 && durabilidad <= 100) return true;
        System.out.println(Color.COLOR_RED + "ERROR. Durabilidad introducida fuera de los límites permitidos." + Color.COLOR_RESET);
        return false;
    }
    protected static boolean validarAtributoEspecial(int atributo){
        if (atributo >= 0 && atributo < AtributosEspeciales.values().length) return true;
        System.out.println(Color.COLOR_RED + "ERROR. El atributo especial no existe." + Color.COLOR_RESET);
        return false;
    }
    protected static boolean validarCantidadMunicion(int cantidad){
        if (cantidad >= 0 && cantidad <= 130) return true;
        System.out.println(Color.COLOR_RED + "ERROR. La cantidad de munición está fuera de los límites." + Color.COLOR_RESET);
        return false;
    }

    // COMPROBAR QUE EXISTE UN HÉROE:
    public static Persona queryHeroe(String nombre, ListadoHeroes listadoHeroes){
        Persona resultado = null;
        for (Persona heroe : listadoHeroes.personas){
            if (heroe.getNombre().equalsIgnoreCase(nombre)){
                resultado = heroe;
                break;
            }
        }
        return resultado;
    }

    // COMPROBBAR EXISTENCIA HEROE EN GREMIO.
    public static Persona queryHeroeGremio(String nombre, ListadoGremio[] gremios){
        Persona busqueda = null;
        for (ListadoGremio gremio : gremios){
            for (Persona heroe : gremio.personasGremio){
                if (heroe.getNombre().equalsIgnoreCase(nombre)){
                    busqueda = heroe;
                    break;
                }
            }
            if (busqueda != null) break;
        }
        return busqueda;
    }
}
