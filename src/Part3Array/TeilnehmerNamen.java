package Part3Array;

import java.util.Arrays;

public class TeilnehmerNamen {
    public static void main(String[] args) {
        //datentyp[] - [15] ich weiss nur wie viel daten gibt es im array
        String [] name = new String[15];
        name[0] = "Aurelie";   //wert an der ersten stelle
        name[1] = "Teresa";
        name[2] = "Faro";
        name[3] = "Michi";
        name[4] = "Marlies";
        name[5] = "Veronika";
        name[6] = "Jana";
        name[7] = "Yasmine";
        name[8] = "Sofia";
        name[9] = "Myla";
        name[10] = "Cheda";
        name[11] = "Victoria";
        name[12] = "Ksenija";
        name[13] = "Kata";
        name[14] = "Nora";
        //das gesamte array als string ausgeben
        System.out.println(Arrays.toString(name));
    }
}
