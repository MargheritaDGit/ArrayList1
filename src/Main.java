/*Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Margherita", 29);
        List<Student> list = Arrays.asList(student);

        System.out.println("Studente: " + list);

        List<String> lista1 = new ArrayList<>();
        lista1.add(student.name);
        lista1.add(String.valueOf(student.age));
        lista1.add("H 1.60");
        lista1.add("Occhi marroni");
        lista1.add("Capelli castani");
        lista1.add("id: 934");

        System.out.println("Studente aggiornato: " + lista1);
    }
}


