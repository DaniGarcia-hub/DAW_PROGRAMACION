package Repaso_1;

import Repaso_1.srcEntidades.TiposHeroes;

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
            }
        }
        if (!opcEncontrada) System.err.println("ERROR. Tipo de héroe inválido.");
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
        if (nivel < 1){
            System.err.println("ERROR. El mínimo de nivel que puede tener un personaje es 1.");
            return false;
        } else if (nivel > MAX_NIVELINICIAL) {
            System.err.println("ERROR. El máximo de nivel que puede tener un personaje en su creación es 5.");
            return false;
        }
        return true;
    }

    protected static boolean validarArma(int opcUsuario, ListadoArmas armasDisponibles){
        if (armasDisponibles.getArmas().get(opcUsuario) == null){
            System.err.println("ERROR. El arma introducida no existe.");
            return false;
        }
        return true;
    }
}
