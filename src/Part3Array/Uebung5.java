package Part3Array;

import java.util.Random;

public class Uebung5 {
    //Schreibe ein Programm, das ein Array von 15 Zufallszahlen zwischen 1 und 100 erzeugt
    // und alle Elemente, einzeln im Array ausgibt
    public static void main(String[] args) {
        //array mit 15 zahlen erstellen
        int [] zahlen = new int[15];
        //Zufallszahlen einlesen
        Random random = new Random();
        //array mit zufallzahlen ausfüllen bis 100
        for (int i =0; i < zahlen.length;i++) {
            zahlen[i] = random.nextInt(100);
        } //element für element ausgeben
        for (int i =0; i< zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }
}
