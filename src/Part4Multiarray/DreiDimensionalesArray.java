package Part4Multiarray;

import java.util.Random;
public class DreiDimensionalesArray {
    //Erstelle ein dreidimensionales Array mit den Dimensionen 4x3x2
    //fülle jedes Element mit einer zufälligen double Zahl zwischen 0.0 und 1.0 auf
    //summe, durchschnitt, max, min
    public static void main(String[] args) {
        //array erstellen
        double[][][] array = new double[4][3][2];
        //hilfsvariable
        double summe = 0.0;
        double durchschnitt = 0;
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        //zufallzahlen
        Random random = new Random();
        //array ausfüllen
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextDouble();
                }
            }
        }
        //summe
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextDouble();
                    summe += array[i][j][k];
                }
            }
        }
        System.out.println("summe: " + summe);
        //durchschnitt
        durchschnitt = summe / (array.length * array[0].length * array[0][0].length);
        System.out.println("durchschnitt: " + durchschnitt);
        //max
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextDouble();
                    if (array[i][j][k] > max) {
                        max = array[i][j][k];
                    }
                }
            }
        }
        System.out.println("Max: " + max);
        //min
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextDouble();
                    if (array[i][j][k] < min) {
                    }
                    min = array[i][j][k];
                }
            }
        }
        System.out.println("Min: " + min);

    }
}
