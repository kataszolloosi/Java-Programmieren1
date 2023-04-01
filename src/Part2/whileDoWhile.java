package Part2;

import java.util.Scanner;

public class whileDoWhile {

    public static void main(String[] args) {
        //while
        //Schreiben Sie ein Programm, das den Benutzer nach einer ganzen Zahl fragt
        // und dann die Summe aller Zahlen von 1 bis zur eingegebenen Zahl berechnet und ausgibt
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int eingabe = scanner.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= eingabe) {
            sum += i;
            i++;   //sum=sum+i;
        }
        System.out.println("Die summe der Zahlen von 1 bis " + eingabe + " ist " + sum);
        System.out.println("-------------------");

        //do-while
        //den Benutzer nach einem Passwort fragt und solange nach einem Passwort fragt,
        //bis das richtige Passwort eingegeben wurde
        String passwort = "geheim";
        String input;

        do {
            System.out.println("Enter your password: ");
            input = scanner.next();
        } while (!input.equals(passwort));
        System.out.println("Das passwort is korrekt.");

    }
}
