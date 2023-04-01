package Part3Array;

import java.util.Arrays;

public class GeradeZahlen {
    //Erstellen Sie ein Array und befüllen Sie dieses mit allen geraden Zahlen von 2 bis 200
    public static void main(String[] args) {
        //array mit passende grösse erstellen
        int[] zahlen = new int[100];
        int geradeZahl = 2;
        //schleife zum befüllen
        for (int i = 0; i < 100; i++) {
            //wir machen aus geradeZahl ein int-Array
            zahlen[i] = geradeZahl;
            //geradeZahl um 2 erhöhen
            geradeZahl += 2;
        } //array als string ausgeben
        System.out.println(Arrays.toString(zahlen));
    }
}
