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
        List<Student> list = new ArrayList<>(Arrays.asList(student));

        System.out.println("Studente: " + list);

        //List<String> lista1 = new ArrayList<>();

        list.add(new Student("Nicola", 30));
        list.add(new Student("Gabriele", 26));
        list.add(new Student("Simone", 25));


        System.out.println("Studente aggiornato: " + list);
    }
}


