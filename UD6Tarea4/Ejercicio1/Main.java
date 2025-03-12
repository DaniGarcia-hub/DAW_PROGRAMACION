package UD6Tarea4.Ejercicio1;

import java.util.*;

public class Main {
    static Map<String, CuerpoCeleste> sistemaSolar = new HashMap<>();
    static Set<CuerpoCeleste> planetas = new HashSet<>();

    public static void main(String[] args) {
        // i.
        CuerpoCeleste planeta1 = new Planeta("Mercurio", 88);
        planetas.add(planeta1);
        sistemaSolar.put("Mercurio", planeta1);
        // ii.
        planetas.add(new Planeta("Venus", 225));
        planetas.add(new Planeta("La Tierra", 365));
        planetas.add(new Planeta("Marte", 687));
        planetas.add(new Planeta("Jupiter", 4332));
        planetas.add(new Planeta("Saturno", 10759));
        planetas.add(new Planeta("Urano", 30660));
        planetas.add(new Planeta("Neptuno", 165));
        planetas.add(new Planeta("Pluton", 248));

        // Se meten todos los planetas que hay en el sistema solar, haciendo uso de un bucle.
        for (CuerpoCeleste cuerpo : planetas){
            sistemaSolar.put(cuerpo.getNombre(), cuerpo);
        }

        // iii.
        CuerpoCeleste luna1 = new Luna("Luna", 27);
        sistemaSolar.put(luna1.getNombre(), luna1);
        sistemaSolar.get("La Tierra").addSatelite(luna1);

        // iv.
        CuerpoCeleste luna2 = new Luna("Deimos", 1.3);
        CuerpoCeleste luna3 = new Luna("Phobos", 0.3);
        sistemaSolar.put(luna2.getNombre(), luna2);
        sistemaSolar.put(luna3.getNombre(), luna3);
        sistemaSolar.get("Marte").addSatelite(luna2);
        sistemaSolar.get("Marte").addSatelite(luna3);

        // v.
        CuerpoCeleste luna4 = new Luna("Io", 1.8);
        CuerpoCeleste luna5 = new Luna("Europa", 3.5);
        CuerpoCeleste luna6 = new Luna("Ganymede", 7.1);
        CuerpoCeleste luna7 = new Luna("Callisto", 16.7);
        sistemaSolar.put(luna4.getNombre(), luna4);
        sistemaSolar.put(luna5.getNombre(), luna5);
        sistemaSolar.put(luna6.getNombre(), luna6);
        sistemaSolar.put(luna7.getNombre(), luna7);
        sistemaSolar.get("Jupiter").addSatelite(luna4);
        sistemaSolar.get("Jupiter").addSatelite(luna5);
        sistemaSolar.get("Jupiter").addSatelite(luna6);
        sistemaSolar.get("Jupiter").addSatelite(luna7);

        // vi.
        System.out.println("RESULTADO EJ 6:");
        imprimirPlanetas(planetas);
        System.out.println("\n[=============================================================================]");

        // vii.
        System.out.println("RESULTADO EJ 7:");
        sistemaSolar.get("Marte").recorrerSatelites();
        System.out.println("\n[=============================================================================]");

        // viii.
        Set<CuerpoCeleste> lunas = new HashSet<>();
        for (CuerpoCeleste planeta : planetas){
            lunas.addAll(planeta.getSatelites());
        }

        // ix.
        int i = 1;
        System.out.println("RESULTADO EJ 9:");
        for (CuerpoCeleste luna : lunas){
            System.out.println(i + " | " + luna);
            i++;
        }
        System.out.println("\n[=============================================================================]");

        // x.
        CuerpoCeleste planeta2 = new Planeta("Plutón", 884);
        planetas.add(planeta2);
        System.out.println("RESULTADO EJ 10:");
        imprimirPlanetas(planetas);
        System.out.println("\n[=============================================================================]");


        // Si se crea al subconjunto porque no es el mismo objeto. El contenido es diferente, por lo que es otro objeto diferente.

        // xi.
        CuerpoCeleste planeta3 = new PlanetaEnano("Plutón", 884);
        planetas.add(planeta3); // No debe permitir su creación, porque no se puede repetir datos en un SET.
        System.out.println("RESULTADO EJ 11:");
        imprimirPlanetas(planetas);
        System.out.println("\n[=============================================================================]");


        // xii.
        // Creando una nueva colección, para realizar diferencias entre dos colecciones.
        Set<CuerpoCeleste> segundaLista = new HashSet<>();
        segundaLista.add(new Planeta("Kepler-22b", 2282.3));
        segundaLista.add(new Planeta("Proxima Centauri", 1263.53));
        segundaLista.add(new Planeta("Gliese 581c", 592.52));
        segundaLista.add(new Planeta("TOI-700 d", 824.6));
        segundaLista.add(new Planeta("Marte", 687));
        segundaLista.add(new Planeta("Jupiter", 4332));
        // Intersección:
        Set<CuerpoCeleste> intersecction = new HashSet<>(planetas);
        intersecction.retainAll(segundaLista);
        System.out.println("INTERSECCIÓN:");
        System.out.println(intersecction);
        System.out.println("\n[=============================================================================]");

        // Diferencia:
        Set<CuerpoCeleste> diferencia = new HashSet<>(planetas);
        diferencia.removeAll(segundaLista);
        System.out.println("DIFERENCIA:");
        System.out.println(diferencia);
        System.out.println("\n[=============================================================================]");

    }

    public static void imprimirPlanetas(Set<CuerpoCeleste> planetas){
        System.out.println("PLANETAS REGISTRADOS:");
        System.out.println("----------------------------------------------------------------------------");
        for (CuerpoCeleste planeta : planetas){
            System.out.println(planeta);
            if (!planeta.getSatelites().isEmpty()){
                planeta.recorrerSatelites();
            }
            System.out.println("----------------------------------------------------------------------------");
        }
    }
}
