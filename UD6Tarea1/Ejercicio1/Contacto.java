package UD6Tarea1.Ejercicio1;

public class Contacto implements Comparable<Contacto>{
    private String name, phoneNumber;

    public Contacto(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacto createContact(String name, String phoneNumber){
        return new Contacto(name, phoneNumber);
    }

    @Override
    public String toString() {
        return "Datos Contacto | " +
                "Nombre de contacto: " + name+
                " | Número de teléfono: " + phoneNumber;
    }

    @Override
    public int compareTo(Contacto o) {
        int result = name.compareToIgnoreCase(o.name);

        if (result == 0){
            result = phoneNumber.compareTo(o.phoneNumber);
        }

        return result;
    }
}
