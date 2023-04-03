package Part3Array;

public class SummeAlle {
    //Schreibe ein Programm, das ein Array von 12 Ganzzahlen erzeugt
    // und eine Summe aller Elemente im Array berechnet
    public static void main(String[] args) {
        int[] zahlen = {1,5,13,25,36,45,56,74,85,99,102,111};
        //hilfsvariable für summe
        int summe =0;
        for (int element : zahlen) {
            summe += element;
        }
        System.out.println(summe);
    }
}
