package Part3Array;

public class Uebung6 {
    //Schreibe ein Programm, das ein Array von 20 Ganzzahlen erzeugt
    // und nur die geraden Zahlen im Array ausgibt
    public static void main(String[] args) {
        int[] zahlen = {1,4,9,12,15,19,24,36,38,47,52,56,59,61,67,68,78,82,83,90};

        for (int i=0; i< zahlen.length; i++) {
            //prüfen ob gerade ist
            if (zahlen[i]%2==0){
                //ausgabe wenn true
                System.out.println(zahlen[i] + " ist gerade");
            } else {
                System.out.println(zahlen[i] + " ist ungerade");
            }
        }

    }
}
