package Part1Verzweigung;

public class Scanner {
    //Schreiben Sie ein Java-Programm, das den Benutzer auffordert, seinen Namen und sein
    //Alter einzugeben, und dann eine Meldung ausgibt, die lautet: "Hallo, [Name]! Du bist
    //[Alter] Jahre alt."
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("bitte ihre vorname: ");
        String vorname = scanner.next();
        System.out.println("bitte ihre nachname: ");
        String nachname = scanner.next();

        System.out.println("bitte ihre alter: ");
        int alter = scanner.nextInt();

        System.out.println("Hallo " + vorname + " " + nachname + "! Du bist " + alter + " jahre alt.");
    }
}
