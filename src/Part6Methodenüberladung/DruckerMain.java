package Part6Methodenüberladung;

public class DruckerMain {
    public static void main(String[] args) {
        Drucker drucker = new Drucker();

        drucker.drucken("s");
        drucker.drucken(7);
        drucker.drucken(7.2);
        drucker.drucken(false);
    }
}
