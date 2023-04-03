package Part3Array;

public class GroessteElement {
    //Schreibe ein Programm, das ein Array von 5 Gleitkommazahlen erzeugt
    // und das größte Element im Array findet und ausgibt
    public static void main(String[] args) {
        //array erzeugen und befüllen
        double[] zahlen = {1.2,2.5,3.6,4.7,5.9};
        //hilfsvariable um das grösste finden
        double groesste =0;
        //schleife zum befüllen
        for (double num :zahlen) {
            if (groesste < num) {
                groesste =num;
            }
        }
        System.out.println(groesste);
    }
}
