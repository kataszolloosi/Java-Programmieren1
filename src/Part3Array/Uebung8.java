package Part3Array;

import java.util.Scanner;

public class Uebung8 {
    //Schreiben Sie ein Programm, das die Elemente eines Arrays mit 10 ganzen Zahlen von der Konsole einliest
    //und dann das größte Element findet und ausgibt
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //array länge
        int[] zahlen = new int[10];
        //kleinste finden mit default wert--wir wissen noch nicht der inhalt
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < zahlen.length; i++) {
            System.out.println("Geben sie die " + (i + 1) + ". zahl ein: ");
            zahlen[i] = scanner.nextInt();
            //gleich mitprüfen, ob die zahl die grösste ist
            if (zahlen[i] > max) {
                max = zahlen[i];
            }
        }
        System.out.println("Das grösste element: " + max);

    }
}
