package Consumer_Supplier.Ejercicio12_13_14;

import java.time.LocalTime;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Programador> crearProgramador1 = () ->  new Programador("nuevoProgramador", 0.0, "04/04/2025");
        Programador programador1 = crearProgramador1.get();
        System.out.println(programador1);

        Supplier<Programador> crearProgramador2 = () -> new Programador("nuevoProgramador");
        Programador programador2 = crearProgramador2.get();
        System.out.println(programador2);

        Programador programador3 = fabricaProgramadores(null, crearProgramador2);
        System.out.println(programador3);
    }

    public static Programador fabricaProgramadores(Programador persona, Supplier<Programador> expresion){
        Programador objPersona = persona;
        if (objPersona == null){
            objPersona = expresion.get();
        }
        if (objPersona.getSalario() == null){
            objPersona.setSalario(50000.00);
        }
        if (objPersona.getFechaInicio() == null){
            objPersona.setFechaInicio(LocalTime.now().toString());
        }
        return objPersona;
    }
}
