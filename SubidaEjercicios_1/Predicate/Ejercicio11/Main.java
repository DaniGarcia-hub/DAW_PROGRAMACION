package Predicate.Ejercicio11;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Ciudad ciudad1 = new Ciudad("Elche", 150000);
        Ciudad ciudad2 = new Ciudad("Madrid", 613245613);
        Ciudad ciudad3 = new Ciudad("Barcelona", 16513452);
        Ciudad ciudad4 = new Ciudad("Bilbao", 3516165);
        Ciudad ciudad5 = new Ciudad("Ourense", 165615);
        Ciudad ciudad6 = new Ciudad("Vigo", 1594134165);
        Ciudad ciudad7 = new Ciudad("Alicante", 6543165);
        Ciudad ciudad8 = new Ciudad("Badajoz", 13116);
        Ciudad ciudad9 = new Ciudad("Valencia", 45495694);
        Ciudad ciudad10 = new Ciudad("Sevilla", 86113);
        List<Ciudad> ciudades = List.of(ciudad1, ciudad2, ciudad3, ciudad4, ciudad5, ciudad6, ciudad7, ciudad8, ciudad9, ciudad10);

        Predicate<Ciudad> ciudadEmpiezaConE = ciudad -> ciudad.getNombre().toUpperCase().startsWith("E");
        Predicate<Ciudad> poblacionMayorQue = ciudad -> ciudad.getNumHabitantes() > 100000;
        Predicate<Ciudad> combinarAmbos = ciudadEmpiezaConE.and(poblacionMayorQue);

        impresionCiudades(ciudades, combinarAmbos);
    }

    public static void impresionCiudades(List<Ciudad> ciudades, Predicate<Ciudad> predicado){
        ciudades.stream().filter(predicado).forEach(ciudad -> System.out.println(ciudad));
    }
}
