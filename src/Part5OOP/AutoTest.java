package Part5OOP;

public class AutoTest {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", "Camry", 2018, 0);
        Auto auto2 = new Auto("BMW","M550i",2020,0);
        auto1.gasGeben(100);
        System.out.println(auto1.toString());
        System.out.println("\nNun kommt ein Reh auf die Fahrbahn --> BREMSEN!");
        auto1.bremsen(60);
        System.out.println(auto1.toString());
        auto2.gasGeben(260);
        System.out.println(auto2.toString());
    }
}
