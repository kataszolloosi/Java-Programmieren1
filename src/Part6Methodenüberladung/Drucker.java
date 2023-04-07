package Part6Methodenüberladung;

public class Drucker {
    public String drucken(String a) {
        System.out.println(a);
        return a+a;
    }
    public int drucken(int a) {
        System.out.println(a);
        return a;
    }
    public double drucken(double a) {
        System.out.println(a);
        return a;
    }
    public boolean drucken(boolean a) {
        System.out.println(a);
        return a;
    }

}
