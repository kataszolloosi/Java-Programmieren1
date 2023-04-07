package Part5OOP;

import java.util.Scanner;

public class KatzeMain {
    public static void main(String[] args) {
        Katze k1 = new Katze("Cirmi", 5, "mischling");
        Katze k2 = new Katze("Elemer", 13, "maine coon");
        System.out.println(k1.getName());
        System.out.println(k2.getName());

        k1.hundWeglaufen();

        k2.knurren();
        k2.setName("Tihamer");
        System.out.println(k2.getName());
    }
}
