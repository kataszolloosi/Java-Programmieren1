package Part6Methodenüberladung;

public class Rechner {
    public int addieren(int a, int b) {
        System.out.println(a+b);
        return a+b;
    }
    public double addieren(double a, double b) {
        System.out.println(a+b);
        return a+b;
    }
    public int addieren(int a,int b,int c) {
        System.out.println(a+b+c);
        return a+b+c;
    }
    public double addieren(double a,double b,double c) {
        System.out.println(a+b+c);
        return a+b+c;
    }
}
