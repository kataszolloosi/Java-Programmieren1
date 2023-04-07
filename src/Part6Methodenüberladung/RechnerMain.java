package Part6Methodenüberladung;

public class RechnerMain {
    public static void main(String[] args) {
        Rechner rechner = new Rechner();

        rechner.addieren(3,2);
        rechner.addieren(3.1,2.9);
        rechner.addieren(1,2,4);
        rechner.addieren(1.2,2.3,4.5);
    }
}
