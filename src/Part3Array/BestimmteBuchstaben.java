package Part3Array;

public class BestimmteBuchstaben {
    //Schreibe ein Programm, das ein Array von 10 Strings erzeugt
    // und diejenigen Strings im Array ausgibt, die mit einem bestimmten Buchstaben beginnen
    public static void main(String[] args) {
        //string array erstellen
        String[] strings = {"hallo", "kata", "hilfe", "halloween", "brazil", "nora", "hanuka", "ostern","hamlet", "frühling"};
        //bestimmte buchstaben auswählen
        char startBuchstaben = 'h';
        //array ausfüllen
        for (int i=0; i< strings.length; i++){
            //prüfen ob die erste stelle ist "h" steht--deshalb charAt(0)
            if(strings[i].charAt(0) ==startBuchstaben){
                System.out.println(strings[i] + " beginnt mit " + startBuchstaben);
            }
        }
    }
}
