package Repaso_1;

import Repaso_1.srcArmas.TiposArmas;
import Repaso_1.srcEntidades.Persona;
import Repaso_1.srcEntidades.TiposHeroes;
import Repaso_1.srcArmas.AtributosEspeciales;

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
    protected static boolean validarTipoHeroe(String nombre){
        boolean opcEncontrada = false;
        for (TiposHeroes tipoHeroe : TiposHeroes.values()){
            if (nombre.equalsIgnoreCase(tipoHeroe.toString())){
                opcEncontrada = true;
                break;
            }
        }
        if (!opcEncontrada) System.err.println("ERROR. Tipo de héroe inválido.");
        return opcEncontrada;
    }
    protected static boolean validarTipoArma(String nombre){
        boolean opcEncontrada = false;
        for (TiposArmas tipoArma: TiposArmas.values()){
            if(nombre.equalsIgnoreCase(tipoArma.toString())){
                opcEncontrada = true;
                break;
            }
        }
        if (!opcEncontrada) System.err.println("ERROR. Tipo de arma inválida.");
        return opcEncontrada;
    }
    protected static boolean validarNombre(String nombre){
        boolean resultado = true;
        if (nombre.isEmpty()){
            System.err.println("ERROR. El nombre no puede estar vacío.");
            resultado = false;
        } else if (nombre.length() > MAX_35CARACTERS) {
            System.err.println("ERROR. La cantidad máxima de carácteres permitidos son de 35 carácteres.");
            resultado = false;
        } else if (!comprobarSoloTexto(nombre)) {
            System.err.println("ERROR. Solo se permiten letras.");
            resultado = false;
        }
        return resultado;
    }
    protected static boolean validarNivel(int nivel){
        if (nivel >= 1 && nivel <= MAX_NIVELINICIAL){
            return true;
        }
        System.err.println("ERROR. El mínimo de nivel que puede tener es 1, y el máximo 5.");
        return false;
    }
    protected static boolean validarArma(int opcUsuario, ListadoArmas armasDisponibles){
        if (armasDisponibles.getArmas().get(opcUsuario) == null){
            System.err.println("ERROR. El arma introducida no existe.");
            return false;
        }
        return true;
    }
    protected static boolean validarDMG(double dmg){
        if (dmg >= 5 && dmg <= 30){
            return true;
        }
        return false;
    }
    protected static boolean validarDurabilidad(int durabilidad){
        if (durabilidad >= 0 && durabilidad <= 100) return true;
        return false;
    }
    protected static boolean validarAtributoEspecial(String atributo){
        boolean opcEncontrada = false;
        for (AtributosEspeciales atributoEspecial : AtributosEspeciales.values()){
            if (atributo.equalsIgnoreCase(atributoEspecial.toString())){
                opcEncontrada = true;
                break;
            }
        }
        if (!opcEncontrada) System.err.println("ERROR. Atributo especial inválido.");
        return opcEncontrada;
    }
    protected static boolean validarCantidadMunicion(int cantidad){
        if (cantidad >= 0 && cantidad <= 130) return true;
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
