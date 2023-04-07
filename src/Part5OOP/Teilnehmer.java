package Part5OOP;

public class Teilnehmer {
    //attribute
    String name;
    int alter;
    String adresse;
    int counter;
    //konstruktor
    public Teilnehmer(String name, int alter, String adresse) {
        this.name = name;
        this.alter = alter;
        this.adresse = adresse;
         }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void hatFrageGestellt() {
        counter++;
    }
    public void ausgabeFrageCounter(){
        System.out.println(name+" hat bisher "+counter+" Fragen gestellt.");
    }
    public void teilnehmerInfo() {
        System.out.println("Name: "+name+" Alter: "+alter+" Adresse: "+adresse);
    }
}
