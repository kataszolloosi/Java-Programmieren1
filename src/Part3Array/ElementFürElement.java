package Part3Array;

public class ElementFürElement {
    //Schreibe ein Programm, das ein Array von 10 Ganzzahlen erzeugt
    // und diese anschließend Element für Element in der Konsole ausgibt
    public static void main(String[] args) {
        int[] zahlen = {1,3,5,7,9,12,15,52,69,77};
        for (int i=0; i<zahlen.length; i++) {
            //element für element ausgeben
            System.out.println(zahlen[i]);
        }
    }
}
