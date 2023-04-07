package Part5OOP;

public class QuaderMain {
    public static void main(String[] args) {
        Quader q1 = new Quader(3.0,2.0,4.0);

        System.out.println("Grundfläche: "+q1.grundFlaeche());
        System.out.println("Volumen: "+q1.volumen());
        System.out.println("Oberfläche: "+q1.oberFlaeche());
        q1.skaliere(2);
        System.out.println("Grundflaeche nach skalierung: " + q1.grundFlaeche());
        System.out.println("Volumen nach skalierung: "+q1.volumen());
        System.out.println("Oberfläche nach skalierung: "+q1.oberFlaeche());
    }
}
