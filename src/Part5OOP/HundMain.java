package Part5OOP;


import java.util.Scanner;

public class HundMain {
    public static void main(String[] args) {
        Hund h1 = new Hund("Pacal", 3, "mops", "braun");
        Hund h2 =new Hund("Mylo", 7, "terrier", "weiss");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kann der Hund Stökchen bringen? (bitte nur true oder false eingeben: ");

        h1.stoekchenBringen(scanner.nextBoolean());

        h1.bellen();

        h1.setFarbe("gestreift");
        h1.getFarbe();
        System.out.println(h1.getFarbe());
    }
}
