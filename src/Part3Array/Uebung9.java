package Part3Array;

public class Uebung9 {
    //Schreiben ein Programm, das ein Array von 6 Ganzzahlen erzeugt
    //und das kleinste Element im Array findet und ausgibt
    public static void main(String[] args) {
        int[] zahlen = {1,3,6,9,12,15};
        //wir haben schon zahlen im array, so default wert ist ein von array
        int min = zahlen[0];

        for (int i=0; i< zahlen.length; i++) {
            if (zahlen[i]<min) {
                zahlen[i] =min;
            }
        }
        System.out.println("Die kleinste zahl: " + min);
    }
}
