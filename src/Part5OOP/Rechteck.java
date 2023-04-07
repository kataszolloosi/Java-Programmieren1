package Part5OOP;

public class Rechteck {
    //attribute
    private double breite;
    private double hoehe;

    //konstruktor
    public Rechteck(double breite, double hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }
    public double getArea() {
        double area = breite * hoehe;
        return area;
    }
    public double getPerimeter () {
        return 2* (breite+hoehe); //Man kann es auch so schreiben
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }
}
