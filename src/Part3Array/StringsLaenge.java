package Part3Array;

public class StringsLaenge {
    //Schreibe ein Programm, das ein Array von 8 Strings erzeugt
    //und die Länge jedes Strings im Array ausgibt
    public static void main(String[] args) {
        String[] strings = new String[8];
        strings[0] = "hallo";
        strings[1] = "das";
        strings[2] = "ist";
        strings[3] = "ein";
        strings[4] = "string";
        strings[5] = "array";
        strings[6] = "gut";
        strings[7] = "geschafft";
        //Die Länge jeden einzelnen Strings herausfinden und gleichzeitig ausgeben
        for(int i=0; i< strings.length; i++) {
            System.out.println(strings[i].length());
        }
    }
}
