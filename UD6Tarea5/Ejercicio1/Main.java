package UD6.UD6Tarea5.Ejercicio1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Parada> paradas = new HashSet<>();
        Set<Linea> lineas = new HashSet<>();
        Parada parada001 = new Parada("001", "Centre-Doctor Caro", "C/Doctor Caro", 75);
        Parada parada002 = new Parada("002", "Blasco Ibáñez,22", "C/Vicente Blasco Ibález, 22", 60);
        Parada parada003 = new Parada("003", "Blasco Ibáñez 80", "C/Vicente Blasco Ibáñez, 80", 40);
        Parada parada004 = new Parada("004", "Inem Carrús", "C/Inem Carrús", 50);
        Parada parada005 = new Parada("005", "Moreno Sastre, 62", "C/Pedro Moreno Sastre, 62", 80);

        Parada parada071 = new Parada("071", "Reina Victoria", "C/Jorge Juan-Reina Victoria", 50);
        Parada parada335 = new Parada("335", "Gabriel Miró", "C/Gabriel Miró", 100);
        Parada parada346 = new Parada("346", "Passeig de Germanies", "C/Passeig de Germanies", 70);
        Parada parada347 = new Parada("347", "Federico G. Lorca", "C/Federico G. Lorca - Asilo", 50);

        Parada parada115 = new Parada("115", "Centre-Avg. C.Valenciana", "/C Centre-Avg. C.Valenciana", 125);
        Parada parada089 = new Parada("089", "Avinguda Llibertat, 21", "C/ Avinguda Llibertat, 21", 40);
        Parada parada090 = new Parada("090", "Renfe-Parc Municipal", "C/ Renfe-Parc Municipal", 80);
        Parada parada117 = new Parada("117", "Virgen de la Cabeza", "C/ Virgen de la Cabeza - Ll. del Pensionista", 40);

        Parada parada056 = new Parada("056", "Cristobal Sanz", "C/ Cristobal Sanz", 40);

        paradas.add(parada001);
        paradas.add(parada002);
        paradas.add(parada003);
        paradas.add(parada004);
        paradas.add(parada005);
        paradas.add(parada071);
        paradas.add(parada335);
        paradas.add(parada346);
        paradas.add(parada347);
        paradas.add(parada115);
        paradas.add(parada089);
        paradas.add(parada090);
        paradas.add(parada117);
        paradas.add(parada056);

        Linea lineaA = new Linea("A");
        lineaA.getListaParadas().agregarNuevaParada("001", "Centre-Doctor Caro", "C/Doctor Caro", 75);
        lineaA.getListaParadas().agregarNuevaParada("002", "Blasco Ibáñez,22", "C/Vicente Blasco Ibález, 22", 60);
        lineaA.getListaParadas().agregarNuevaParada("003", "Blasco Ibáñez 80", "C/Vicente Blasco Ibáñez, 80", 40);
        lineaA.getListaParadas().agregarNuevaParada("004", "Inem Carrús", "C/Inem Carrús", 50);
        lineaA.getListaParadas().agregarNuevaParada("005", "Moreno Sastre, 62", "C/Pedro Moreno Sastre, 62", 80);
//        lineaA.getParadas().put(parada001.getNumero(), parada001);
//        lineaA.getTiempoParadas().put(parada001.getNumero(), 75);
//
//        lineaA.getParadas().put(parada002.getNumero(), parada002);
//        lineaA.getTiempoParadas().put(parada002.getNumero(), 60);
//
//        lineaA.getParadas().put(parada003.getNumero(), parada003);
//        lineaA.getTiempoParadas().put(parada003.getNumero(), 40);
//
//        lineaA.getParadas().put(parada004.getNumero(), parada004);
//        lineaA.getTiempoParadas().put(parada004.getNumero(), 50);
//
//        lineaA.getParadas().put(parada005.getNumero(), parada005);
//        lineaA.getTiempoParadas().put(parada005.getNumero(), 80);

        Linea lineaI = new Linea("I");
        lineaI.getListaParadas().agregarNuevaParada("003", "Blasco Ibáñez 80", "C/Vicente Blasco Ibáñez, 80", 50);
        lineaI.getListaParadas().agregarNuevaParada("071", "Reina Victoria", "C/Jorge Juan-Reina Victoria", 100);
        lineaI.getListaParadas().agregarNuevaParada("335", "Gabriel Miró", "C/Gabriel Miró", 70);
        lineaI.getListaParadas().agregarNuevaParada("346", "Passeig de Germanies", "C/Passeig de Germanies", 50);
        lineaI.getListaParadas().agregarNuevaParada("347", "Federico G. Lorca", "C/Federico G. Lorca - Asilo", 120);
//        lineaI.getParadas().put(parada003.getNumero(), parada003);
//        lineaI.getTiempoParadas().put(parada003.getNumero(), 50);
//
//        lineaI.getParadas().put(parada071.getNumero(), parada071);
//        lineaI.getTiempoParadas().put(parada071.getNumero(), 100);
//
//        lineaI.getParadas().put(parada335.getNumero(), parada335);
//        lineaI.getTiempoParadas().put(parada335.getNumero(), 70);
//
//        lineaI.getParadas().put(parada346.getNumero(), parada346);
//        lineaI.getTiempoParadas().put(parada346.getNumero(), 50);
//
//        lineaI.getParadas().put(parada347.getNumero(), parada347);
//        lineaI.getTiempoParadas().put(parada347.getNumero(), 120);

        Linea lineaJ = new Linea("J");
        lineaJ.getListaParadas().agregarNuevaParada("115", "Centre-Avg. C.Valenciana", "/C Centre-Avg. C.Valenciana", 125);
        lineaJ.getListaParadas().agregarNuevaParada("002", "Blasco Ibáñez,22", "C/Vicente Blasco Ibález, 22", 75);
        lineaJ.getListaParadas().agregarNuevaParada("089", "Avinguda Llibertat, 21", "C/ Avinguda Llibertat, 21", 40);
        lineaJ.getListaParadas().agregarNuevaParada("090", "Renfe-Parc Municipal", "C/ Renfe-Parc Municipal", 80);
        lineaJ.getListaParadas().agregarNuevaParada("117", "Virgen de la Cabeza", "C/ Virgen de la Cabeza - Ll. del Pensionista", 40);
//        lineaJ.getParadas().put(parada115.getNumero(), parada115);
//        lineaJ.getTiempoParadas().put(parada115.getNumero(), 125);
//
//        lineaJ.getParadas().put(parada002.getNumero(), parada002);
//        lineaJ.getTiempoParadas().put(parada002.getNumero(), 75);
//
//        lineaJ.getParadas().put(parada089.getNumero(), parada089);
//        lineaJ.getTiempoParadas().put(parada089.getNumero(), 40);
//
//        lineaJ.getParadas().put(parada090.getNumero(), parada090);
//        lineaJ.getTiempoParadas().put(parada090.getNumero(), 80);
//
//        lineaJ.getParadas().put(parada117.getNumero(), parada117);
//        lineaJ.getTiempoParadas().put(parada117.getNumero(), 40);

        Linea lineaF = new Linea("F");
        lineaF.getListaParadas().agregarNuevaParada("115", "Centre-Avg. C.Valenciana", "/C Centre-Avg. C.Valenciana", 125);
        lineaF.getListaParadas().agregarNuevaParada("002", "Blasco Ibáñez,22", "C/Vicente Blasco Ibález, 22", 45);
        lineaF.getListaParadas().agregarNuevaParada("056", "Cristobal Sanz", "C/ Cristobal Sanz", 40);
        lineaF.getListaParadas().agregarNuevaParada("089", "Avinguda Llibertat, 21", "C/ Avinguda Llibertat, 21", 75);
        lineaF.getListaParadas().agregarNuevaParada("090", "Renfe-Parc Municipal", "C/ Renfe-Parc Municipal", 70);
//        lineaF.getParadas().put(parada115.getNumero(), parada115);
//        lineaF.getTiempoParadas().put(parada115.getNumero(), 125);
//
//        lineaF.getParadas().put(parada002.getNumero(), parada002);
//        lineaF.getTiempoParadas().put(parada002.getNumero(), 45);
//
//        lineaF.getParadas().put(parada056.getNumero(), parada056);
//        lineaF.getTiempoParadas().put(parada056.getNumero(), 40);
//
//        lineaF.getParadas().put(parada089.getNumero(), parada089);
//        lineaF.getTiempoParadas().put(parada089.getNumero(), 75);
//
//        lineaF.getParadas().put(parada090.getNumero(), parada090);
//        lineaF.getTiempoParadas().put(parada090.getNumero(), 70);

        lineas.add(lineaA);
        lineas.add(lineaI);
        lineas.add(lineaJ);
        lineas.add(lineaF);

        // Paradas de la línea A
        parada001.getLineas().add(lineaA);
        parada002.getLineas().add(lineaA);
        parada003.getLineas().add(lineaA);
        parada004.getLineas().add(lineaA);
        parada005.getLineas().add(lineaA);

// Paradas de la línea I
        parada003.getLineas().add(lineaI);
        parada071.getLineas().add(lineaI);
        parada335.getLineas().add(lineaI);
        parada346.getLineas().add(lineaI);
        parada347.getLineas().add(lineaI);

// Paradas de la línea J
        parada115.getLineas().add(lineaJ);
        parada002.getLineas().add(lineaJ);
        parada089.getLineas().add(lineaJ);
        parada090.getLineas().add(lineaJ);
        parada117.getLineas().add(lineaJ);

// Paradas de la línea F
        parada115.getLineas().add(lineaF);
        parada002.getLineas().add(lineaF);
        parada056.getLineas().add(lineaF);
        parada089.getLineas().add(lineaF);
        parada090.getLineas().add(lineaF);

        // ============================================================================
        // ============================================================================
        // ============================================================================
        // ============================================================================
        // ============================================================================
        // ============================================================================
        // ============================================================================
        // ============================================================================

        boolean acabarPrograma = false;

        while (!acabarPrograma){
            Otros.menuPrincipal();
            switch (Solicitudes.solicitarOpc()){
                case 1:
                    for (Linea linea : lineas){
                        System.out.println("LINEA " + linea.getIdentificador() + "\n-----------");
                        Otros.recorrerDatos(linea.getParadas());
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Elige la parada desde la que partes. (Ejemplo: 005). ");
                    String paradaInicial = Solicitudes.solicitarParada(paradas);
                    Parada parada = null;
                    for (Parada parada2 : paradas){
                        if (parada2.getNumero().equals(paradaInicial)){
                            parada = parada2;
                            break;
                        }
                    }
                    String lineaInicial = "";
                    do {
                        System.out.print("Elige la línea desde la que partes. (Ejemplo: A). ");
                         lineaInicial = Solicitudes.solicitarLinea(lineas);
                    } while (!Validaciones.validarParadaEnLinea(parada, lineaInicial));
                    Linea lineaInicialObj = null;
                    for (Linea linea : lineas){
                        if (linea.getIdentificador().equalsIgnoreCase(lineaInicial)){
                            lineaInicialObj = linea;
                        }
                    }

                    System.out.print("Elige la parada de destino. (Ejemplo: 117). ");
                    String paradaDestino = Solicitudes.solicitarParada(paradas);
                    Parada paradaDestinoObj = null;
                    for (Parada parada2 : paradas){
                        if (parada2.getNumero().equalsIgnoreCase(paradaDestino)){
                            paradaDestinoObj = parada2;
                        }
                    }

                    lineaInicialObj.getListaParadas().ejecutarCalculo(parada, paradaDestinoObj, lineaInicialObj);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    acabarPrograma = true;
                    break;
                default:
                    System.err.println("ERROR. Opción introducida inválida.");
            }
        }
    }
}
