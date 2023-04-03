package Part4Multiarray;

import java.util.Random;

public class Spielereien {
    //Erstellen Sie ein 8x8 Array und befüllen Sie dieses Array mit zufälligen ganzen Zahlen zwischen 1 und 100
    //summe, durchschnitt, größte, kleinste
    public static void main(String[] args) {
        //array erstellen
        int[][] array = new int[8][8];
        //zufall zahlen
        Random random = new Random();
        //hilfsvariable
        int summe = 0;
        double durchschnitt = 0;
        int kleinste = Integer.MAX_VALUE;
        int grösste = Integer.MIN_VALUE;
        //schleife zum befüllen
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100)+1;
                summe = summe + array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < kleinste) {
                    kleinste=array[i][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > grösste) {
                    grösste=array[i][j];
                }
            }
        }
        durchschnitt = array.length * array[0].length;
        System.out.println("Summe: " + summe);
        System.out.println("Durchschnitt: " + durchschnitt);
        System.out.println("Größte: " + grösste);
        System.out.println("Kleinste: " + kleinste);

    }
}