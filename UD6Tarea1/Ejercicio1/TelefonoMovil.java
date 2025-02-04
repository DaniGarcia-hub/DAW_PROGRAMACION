package UD6Tarea1.Ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TelefonoMovil {
    private String myNumber;
    private ArrayList<Contacto> myContacts;

    public TelefonoMovil(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contacto newContact){
        if (!myContacts.contains(newContact)){
            myContacts.add(newContact);
            return true;
        } else {
            System.out.println("El contacto ya está registrado.");
            return false;
        }
    }

    public boolean updateContact(Contacto wrongContact, Contacto newContact){
        if ((myContacts.contains(wrongContact)) && (!myContacts.contains(newContact))){
            myContacts.set(myContacts.indexOf(wrongContact), newContact);
            return true;
        } else {
            System.out.println("El contacto no existe o ya se encuentra registrado.");
            return false;
        }
    }

    public boolean removeContact(Contacto contactToDelete){
        if (myContacts.contains(contactToDelete)){
            myContacts.remove(contactToDelete);
            return true;
        } else {
            System.out.println("No se ha encontrado el contacto a eliminar.");
            return false;
        }
    }

    public int findContact(Contacto contactToFind){
        if (!myContacts.contains(contactToFind)){
            return -1;
        } else {
            return myContacts.indexOf(contactToFind);
        }
    }

    public int findContact(String nameContact){
        for (Contacto contact : myContacts){
            if (contact.getName().equals(nameContact)){
                return myContacts.indexOf(contact);
            }
        }

        return -1;
    }

    public int findContactByNumber(String numTel){
        for (Contacto contact : myContacts){
            if (contact.getPhoneNumber().equals(numTel)){
                return myContacts.indexOf(contact);
            }
        }

        return -1;
    }

    public ArrayList<Contacto> findByCode(int condition){
        ArrayList<Contacto> contactsFilterdByCode = new ArrayList<>();
        switch (condition){
            case 1, 2, 3:
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce la condición por la que filtrar (No CaseSensitive):");
                char letterCondition = sc.nextLine().charAt(0);
                sc.close();

                if (condition == 3){
                    for (int i = 0; i < myContacts.size(); i++){
                        String contact = myContacts.get(i).getName();

                        for (int j = 0; j < contact.length(); j++){
                            if (contact.charAt(j) == letterCondition){
                                contactsFilterdByCode.add(myContacts.get(i));
                                break;
                            }
                        }
                    }
                } else {
                    for (int i = 0; i < myContacts.size(); i++){
                        String contact = myContacts.get(i).getName();

                        if (contact.charAt(condition == 1 ? 0: contact.length()-1) == letterCondition){
                            contactsFilterdByCode.add(myContacts.get(i));
                        }
                    }
                }
                break;
            case 4:
                for (int i = 0; i < myContacts.size(); i++){
                    String contact = myContacts.get(i).getName();

                    for (int j = 0; j < contact.length(); j++){
                        if (Character.isDigit(contact.charAt(j))){
                            contactsFilterdByCode.add(myContacts.get(i));
                        }
                    }
                }
                break;
        }

        return contactsFilterdByCode;
    }

    public Contacto queryContact(String nameContact){
        int contactPosition = findContact(nameContact);
        if (contactPosition >= 0){
            return myContacts.get(contactPosition);
        }

        System.out.println("Nombre de contacto no encontrado.");
        return null;
    }

    public Contacto queryContactNumber(String numTel){
        int contactPosition = findContactByNumber(numTel);

        if (contactPosition >= 0){
            return myContacts.get(contactPosition);
        }

        System.out.println("Número de contacto no encontrado.");
        return null;
    }

    public void printContacts(){
        System.out.println("Lista de contactos:");
        for (int i = 0; i < myContacts.size(); i++){
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " --> " + myContacts.get(i).getPhoneNumber());
        }
        System.out.println();
    }

    public ArrayList<Contacto> getMyContacts() {
        return myContacts;
    }
}

/* PENDIENTE DE:
    - Buscar por telefono.
    - Ordenador por nombre.
    - Borrar all.
    - Numero de contactos.
    - Busqueda por clave. (Por posicion, o que empiece por...).
 */