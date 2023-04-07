package Part5OOP;

public class TeilnehmerMain {
    public static void main(String[] args) {
        Teilnehmer t1 = new Teilnehmer("Kata", 31, "Ankerstrasse 4");
        Teilnehmer t2 = new Teilnehmer("Peter", 37, "Hoferplatz 3");
        //information ausgabe
        t1.teilnehmerInfo();
        t2.teilnehmerInfo();

        t1.hatFrageGestellt();
        t2.hatFrageGestellt();

        t1.ausgabeFrageCounter();
        t2.ausgabeFrageCounter();

        t1.setName("Kathi");
        t1.teilnehmerInfo();


    }
}
