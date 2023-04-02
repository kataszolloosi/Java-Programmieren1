package Part3Array;

public class Uebung10 {
    //Schreibe ein Programm, das ein Array von 9 Gleitkommazahlen erzeugt
    //und das durchschnittliche Element im Array berechnet und ausgibt
    public static void main(String[] args) {
        double[] zahlen = {1.2,2.5,3.6,4.8,5.9,7.2,8.1,9.9,0.4};
        double summe =0;
        double durchschnitt =0;

        for (double num : zahlen) {
            summe = summe+ num;
        }
        durchschnitt = summe / zahlen.length;
        System.out.println("Durchschnitt: " + durchschnitt);
    }
}
