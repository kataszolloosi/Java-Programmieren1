package Part4Multiarray;

public class EinzelneSummeVergleichen {
    //Berechnen Sie in einem zweidimensionalen int-Array die Summen aller einzelnen eindimensionalen Arrays und vergleichen Sie diese miteinander.
    //Geben Sie am Ende aus ob alle eindimensionalen Arrays die gleiche Summe haben oder nicht
    public static void main(String[] args) {
        //arrays erstellen
//        int [][] array = {{2, 5, 3, 2}, {6, 4, 2}, {2, 10}, {2, 2, 2, 6}};
        int[][] array = {{2, 4, 3, 2}, {6, 3, 2}, {2, 10}, {2, 2, 2, 6}};
        //speichern wir die einzelnen summen der 4 arrays
        int[] summe = new int[array.length];
        //damit alle felder von array durchgehen können
        int counter = 0;
        //berechnung und vergleich der summen
        for (int [] eindimensional : array) {
            int hilfsvariableSumme = 0;
            //alle einzelne Werte holen und zusammenzählen
            for (int einzelneWerte : eindimensional) {
                hilfsvariableSumme+= einzelneWerte;
            }
            summe[counter] = hilfsvariableSumme;
            counter++;
        }
        //prüfen und ausgaben
        if (summe[0] ==summe[1] && summe[0] ==summe[2] && summe[0] ==summe[3]) {
            System.out.println("alle hat gleiche summe");
        } else {
            System.out.println("alle hat verschiedene summe");
        }



    }
}
