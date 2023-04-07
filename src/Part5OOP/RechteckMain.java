package Part5OOP;

public class RechteckMain {
    public static void main(String[] args) {
        Rechteck r1 = new Rechteck(3.2, 4.1);
        Rechteck r2 = new Rechteck(3.0,4.0);

        System.out.println("Das erste Objekt hat einen Umfang von: "+r1.getPerimeter());
        System.out.println("Das zweite Objekt hat eine Flaeche von: "+r2.getArea());
        System.out.println("Das erste Objekt hat bisher eine Width von "+r1.getBreite()+" und eine Height von "+r1.getHoehe());
        System.out.println("Das zweite Objekt hat bisher eine Width von "+r2.getBreite()+" und eine Height von "+r2.getHoehe());

        r1.setBreite(4.0);
        r1.setHoehe(5.0);
        System.out.println("Objekt 2 hat nun eine Flaeche von "+r2.getArea()+"m2 und einen Umfang von "+r2.getPerimeter());
        System.out.println("Dabei wurden folgende Werte zur Berechnung genutzt -> Width: "+r2.getBreite()+" und Height: "+r2.getHoehe());
    }
}
