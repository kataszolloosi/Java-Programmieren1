package Part3Array;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        //Das kennen wir bereits - Deklarieren, Initialisieren und befuellen

        //Die bekannte Schreibweise
        String[] name1 = new String[3];
        name1[0] = "Aurelie";
        name1[1] = "Jana";
        name1[2] = "Michelle";

        //Kurzschreibweise bei der Befüllung von Arrays
        String name2[] = {"Aurelie", "Jana", "Michelle"};

        //Strings als ganzes reinhauen
        String temp1 = "Ksenija";
        String temp2 = "Veronika";

        String name3[] = {"Aurelie", temp1, "Sofia", temp2, "Myla"};

        //Ausgabe aller Versionen
        System.out.println(Arrays.toString(name1));
        System.out.println(Arrays.toString(name2));
        System.out.println(Arrays.toString(name3));

        System.out.println("---- ab hier die bekannte For-Schleife ----");

        //Das kennen wir bereits - einfache For-Schleife die uns was ausgibt
        for (int i = 0; i < name3.length; i++) {
            System.out.println(name3[i]);
        }

        System.out.println("---- ab hier die for:each Schleife ----");

        //Kurzschreibweise der Schleife fuer ARRAYS -> for : each
        for (String nameElement : name3) { //gehe jedes Element vom Array name3 einzeln durch
            // und initialisiere die Variable nameElement in jeder Iteration mit dem nächsten Wert aus Array name3
            // D.h.: Die For:each Schleife geht jedes Element im Array name3 einzeln durch und speichert es in nameElement

            System.out.println(nameElement); //Gibt nun in jeder Iteration den aktuellen Wert aus nameElement aus
        }
    }
}
