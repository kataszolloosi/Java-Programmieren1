package Part2;

public class forLoop {
    public static void main(String[] args) {
        //for
        //Schreiben Sie ein Programm, das die Zahlen 1 bis 10 ausgibt
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("----------------");
        //nur alle geraden Zahlen zwischen 1 und 30 ausgibt
        for (int i = 0; i < 31; i += 2) { //i=i+2
            System.out.println(i);
        }
        System.out.println("----------------");
        //verschachtelte for schleife
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
        int rows =5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
