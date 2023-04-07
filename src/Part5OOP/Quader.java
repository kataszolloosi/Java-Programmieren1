package Part5OOP;

public class Quader {
    //attribute
    private double laenge;
    private double breite;
    private double hoehe;
    //konstruktor
    public Quader(double laenge, double breite, double hoehe) {
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }
    public double grundFlaeche() {
        double flaeche = laenge*breite;
        return flaeche;
    }
    public void skaliere(double faktor) {
       laenge*=faktor;
       breite*=faktor;
       hoehe*=faktor;
    }
    public double volumen() {
        double volumen = laenge*breite*hoehe;
        return volumen;
    }
    public double oberFlaeche() {
        double oberFlaeche = 2* (laenge*breite+laenge*hoehe+breite*hoehe);
        return oberFlaeche;
        //return 2 * (laenge * breite + laenge * hoehe + breite * hoehe);
    }
}
