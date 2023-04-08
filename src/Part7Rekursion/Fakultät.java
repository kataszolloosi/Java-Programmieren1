package Part7Rekursion;

public class Fakultät {
    public static void main(String[] args) {
        double zahl = 5; // Die Zahl, von der die Fakultaet berechnet werden soll

        //Erstmaliger Rekursionsaufruf
        double fakultaet = berechneFakultaet(zahl);

        //Ausgabe des abschliessenden Return-Values der Fakultaet
        System.out.println("Die Fakultät von " + zahl + " ist: " + fakultaet);

    }

    public static double berechneFakultaet(double n) {
        //Abbruchbedingung
        if (n == 0) {
            return 1;
        } else {
            //Rueckgabe falls noch nicht bei 0 angekommen
            return n * berechneFakultaet(n - 1);
        }
    }
}
