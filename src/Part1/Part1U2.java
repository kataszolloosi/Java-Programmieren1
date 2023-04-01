package Part1;

import java.util.Scanner;

public class Part1U2 {
    //Schreiben Sie ein Java-Programm, das den Benutzer auffordert, eine Zahl zwischen 1
    //und 10 (einschließlich) einzugeben, und dann das englische Wort für diese Zahl ausgibt.
    //Wenn der Benutzer eine ungültige Zahl eingibt, sollte das Programm eine Fehlermeldung
    //ausgeben und den Benutzer auffordern, erneut eine gültige Zahl einzugeben
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nummer =0;
        //Das Programm sollte den Benutzer so lange auffordern, eine gültige Zahl einzugeben
        while (nummer < 1 || nummer > 10) {
            System.out.println("bitte ein zahl zwischen 1 und 10: ");
            nummer = scanner.nextInt();
            if (nummer < 1 || nummer > 10) {
                System.out.println("ungültige zahl. bitte ein zahl zwischen 1 und 10: ");
            }
        }
                switch (nummer) {
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eigth");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                    case 10:
                        System.out.println("ten");
                        break;
                }

    }
}
