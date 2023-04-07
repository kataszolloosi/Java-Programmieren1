package Part5OOP;

public class Auto {
    //attribute
    private String marke;
    private String modell;
    private int jahr;
    private double geschwindigkeit;

    public Auto(String marke, String modell, int jahr, double geschwindigkeit) {
        this.marke = marke;
        this.modell = modell;
        this.jahr = jahr;
        this.geschwindigkeit = 0.0;
    }
    public double gasGeben(double geschw){
        geschwindigkeit+=geschw;
        return geschwindigkeit;
    }
    public double bremsen(double geschw) {
        geschwindigkeit-=geschw;
        return geschwindigkeit;
    }
    public String toString(){
        System.out.println("Marke: "+marke+ ", Modell: "+modell+", Jahr: "+jahr+", Geschwindigkeit: "+geschwindigkeit);
        return null;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }
}
