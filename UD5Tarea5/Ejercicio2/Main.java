package UD5Tarea5.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        SalaryEmployee employee1 = new SalaryEmployee("Alberto", "Director", 2859.58);
        HourlyEmployee employee2 = new HourlyEmployee("Eustaquio", "Jefe Equipo Desarrollo Web", 200, 13);

        System.out.println("El empleado " + employee1.getNombre() + " con puesto " + employee1.getCargo() + " cobrará " + employee1.calculateWeeklyPay());

        System.out.println("El empleado " + employee2.getNombre() + " con puesto " + employee2.getCargo() + " cobrará " + employee2.calculateWeeklyPay());
    }
}
