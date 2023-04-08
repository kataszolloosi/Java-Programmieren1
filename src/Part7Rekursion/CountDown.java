package Part7Rekursion;

public class CountDown {
    public static void main(String[] args) {
    rekursion(10);
    }
    public static void rekursion(int counter) {
        //abbruchbedingung
        if(counter == 0) {
            System.out.println("Wir sind hier fertig, der Counter hat den Wert "+counter+" erreicht!");
            return;
        }
        //logik der rekursion
        System.out.println("Der Countdown lauft, nur noch t-"+counter+" Sekunden");
        //Wert für abbruchbendingung verändern
        //counter--; //counter=counter-1;
        //selbsaufruf
        rekursion(counter-1);
    }
}
