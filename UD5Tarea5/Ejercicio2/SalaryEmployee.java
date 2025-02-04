package UD5Tarea5.Ejercicio2;

public class SalaryEmployee extends Employee{
    protected double salarioSemanal;

    public SalaryEmployee(String nombre, String cargo, double salarioSemanal){
        super(nombre, cargo);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double calculateWeeklyPay(){
        return salarioSemanal;
    }
}
