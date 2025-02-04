package UD5Tarea5.Ejercicio2;

public class HourlyEmployee extends Employee{
    protected int horasTrabajadas;
    protected double tasaPago;

    public HourlyEmployee(String nombre, String cargo, int horasTrabajadas, double tasaPago){
        super(nombre, cargo);
        this.horasTrabajadas = horasTrabajadas;
        this.tasaPago = tasaPago;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTasaPago() {
        return tasaPago;
    }

    public void setTasaPago(double tasaPago) {
        this.tasaPago = tasaPago;
    }

    @Override
    public double calculateWeeklyPay(){
        return horasTrabajadas * tasaPago;
    }
}
