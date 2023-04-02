package Part4Multiarray;

import java.util.Arrays;

public class Dim4Array {
    //Erstellen Sie ein 4-Dimensionales Array
    //Geben Sie die Werte nun EINZELN auf die Konsole aus
    //ausgeben
    public static void main(String[] args) {
        //Erstellen eines 4-Dim Arrays
        int[][][][] arr = new int[4][3][2][2];
        int elementeCounter = 0; //Hilfsvariable fuer erste Schleife
        int elementCounter2 = 0; //Hilfsvariable fuer zweite Schleife

        // Einzelne Werte auf die Konsole ausgeben
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    for (int l = 0; l < arr[i][j][k].length; l++) {
                        //System.out.print(arr[i][j][k][l]+" ");
                        elementeCounter++;
                    }
                }
            }
        }

        // Das gleiche, nur mit einer For:Each
        for (int[][][] i : arr) {
            for (int[][] j : i) {
                for (int[] k : j) {
                    for (int l : k) {
                        elementCounter2++;
                    }
                }
            }
        }

        System.out.println("Es gibt "+elementeCounter+" Elemente in diesem Array");
        System.out.println("Es gibt "+elementCounter2+" Elemente in der For-Each-Schleife");
    }
}
