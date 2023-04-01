package Part3Array;

import java.util.Arrays;

public class SummeGrossKleinDurchschnitt {
    public static void main(String[] args) {
        //alle Zahlen eines int-Arrays aufsummiert und am Ende auf der Konsole ausgibt
        //Finden Sie nun die größte und die kleinste Zahl
        //Berechnen Sie nun den Durchschnitt
        int[] zahlen = {12, 23, 52, 68};
        System.out.println(Arrays.toString(zahlen));
        int summe = 0;
        int kleinste = zahlen[2];
        int groesste = 0;
        int durchschnitt = 0;
        //in einer schleife, element für element durchgehen
        for (int num : zahlen) {
            //summe
            summe = summe + num;
            //kleinste zahl
            if (kleinste > num) {
                kleinste = num;
            }
            //grösste zahl
            if (groesste < num) {
                groesste = num;
            }
        }
        //durchschnitt
        durchschnitt= summe/ zahlen.length;
        System.out.println("Summe: " + summe);
        System.out.println("Kleinste zahl: " + kleinste);
        System.out.println("grösste zahl: " + groesste);
        System.out.println("Durchschnitt: " + durchschnitt);

    }
}
