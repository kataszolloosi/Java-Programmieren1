package Part3Array;

import java.util.Arrays;
import java.util.Scanner;

public class DynamischArray {
    public static void main(String[] args) {
        //array-grösse dynamisch erstellen-benutzer sagt wie viel daten gibt es im array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eingeben wie gross das Array werden soll: ");
        int arrayGroesse = scanner.nextInt();
        //array mit der grösse erzeugen, die uns der benutzer in der konsole eingibt
        String [] name = new String[arrayGroesse];
        //befüllen array durch den benutzer
        for(int i=0; i< name.length; i++) {
            System.out.println("bitte name "+i+" eingeben");
            name[i] = scanner.next();
        } //array als string ausgeben
        System.out.println(Arrays.toString(name));

    }
}
