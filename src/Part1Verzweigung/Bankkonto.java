package Part1Verzweigung;

import java.util.Scanner;

public class Bankkonto {
    //Schreiben Sie ein Java-Programm, das Bankkontotransaktionen simuliert
    //ein Menü mit Optionen für die Durchführung von Transaktionen präsentieren
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your account balance: ");
        int balance = scanner.nextInt();
        int choice = 0;

        //menu erstellen
        int eingabe;
        while (choice != 4) {

            System.out.println("Menu: ");
            System.out.println("1. Deposit");  //befizetes
            System.out.println("2. Withdraw");   //felvetel
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("how much is your deposit? ");
                eingabe = scanner.nextInt();
                balance = balance + eingabe;
                System.out.println("your new balance: " + balance);
            } else if (choice == 2) {
                System.out.println("how much is your withdraw? ");
                eingabe = scanner.nextInt();
                balance = balance - eingabe;
                System.out.println("your new balance: " + balance);
            } else if (choice == 3) {
                System.out.println("your balance: " + balance);
            } else if (choice == 4) {
                System.out.println("Goodbye");
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
