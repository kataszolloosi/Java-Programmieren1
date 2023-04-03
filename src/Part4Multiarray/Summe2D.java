package Part4Multiarray;

public class Summe2D {
    //Berechnen Sie in einem zweidimensionalen double-Array die Summen aller dort eingetragenen Elemente
    public static void main(String[] args) {
        //2D array erstellen
        double[][] zahlen = {{8.8, 12}, {134, 67.92, 45, 32.4, 76}, {1}, {0, 0.56}};
        //hilfsvariable
        double summe = 0;
        //2D -- 2 for:each schleife
        System.out.println("---------For:Each schleife----");
        for (double[] i : zahlen) {  //erste dimension
            for (double j : i) {     //zweite dimension
                //hier bekommen wir die einzelnen werte
                summe = summe + j;
            }
        }
        System.out.println("Summe: " + summe);
        System.out.println();

        System.out.println("-----------For schleife------");
        //hilfsvariable
        double summe2 =0;
        //2D--2 for schleife
        for (int i =0; i< zahlen.length; i++) {
            for (int j=0; j<zahlen[i].length; j++) {
                summe2=summe2+zahlen[i][j];
            }
        }
        System.out.println("Summe: " + summe2);
    }
}
