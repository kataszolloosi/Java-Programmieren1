package Part2Schleife;

import java.nio.file.Paths;
import java.util.Scanner;

public class WortCounter {
    public static void main(String[] args) throws Exception {
        //txt datei erreichen
        String file = "C:\\Users\\katas\\OneDrive\\Asztali gép\\faust.txt";
        //mittels scanner text inhalt auslesen
        Scanner buchText = new Scanner(Paths.get(file));
        //benutzer fragen, welches wort
        System.out.println("Geben Sie bitte einen Wort ein:");
        Scanner scanner = new Scanner(System.in);
        //benutzereingabe speichern
        String gesuchtesWort = scanner.next();
        //egal gross oder kleinschreiben
        gesuchtesWort = gesuchtesWort.toLowerCase();
        //counter für zählende wörter anlegen
        int countWort = 0;
        //solange etwas auszulesen gibt
        while (buchText.hasNext()) {
            //einzelne nächste wört auslesen
            String word = buchText.next();
            //egal gross oder klein
            word = word.toLowerCase();
            if (word.equals(gesuchtesWort)) {
                countWort++;
            }
        } //finale ausgabe der gezählten ergebnisse
        System.out.println("Das Wort '" + gesuchtesWort + "' " + countWort + " mal in Diesem Dokument gefunden.");

    }
}
