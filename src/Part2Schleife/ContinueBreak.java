package Part2Schleife;

public class ContinueBreak {
    // Sie sind in einem Lift eines Wolkenkratzers mit 68 Etagen.
    // Nun werden Ihnen alle möglichen Etagen außer die Etagen 10, 19, 28 und 36 und 55 ausgegeben.
    // Zusatz: Falls es sich um ein Haus handelt, sollen nur maximal 4 Etagen ausgegeben werden
    public static void main(String[] args) {
        boolean isHaus = true;
        //unschöne lösung
        for (int i = 1; i < 69; i++) {
            if (i != 10 && i != 19 && i != 28 && i != 36 && i != 55) {
                if (isHaus == true && i < 5) {
                    System.out.println("Etage " + i);
                } else if (isHaus == false) {
                    System.out.println("Etage " + i);
                }
            }
        }
        System.out.println("-----------------------------");
        //schönere lösung
        for (int i = 1; i < 69; i++) {
            if (i == 10 || i == 19 || i == 28 | i == 36 || i == 55) {
                continue;
            }
            System.out.println("Etage " + i);
            if (isHaus == true && i == 4) {
                break;
            }
        }
        System.out.println("------------------------");
        //Flugsitzplätze
        //13 und 17 sind unglückszahlen - nicht ausgeben
        //typ A380 - ausgabe bis 50, wenn nicht a380 - ausgabe bis 19
        boolean typA380 = false;
        for (int i = 1; i<51; i++) {
            if (i==13 || i==17) {
                continue; //überspringe die reihen 13 und 17
            }
            System.out.println("Sitzplaz: " + i);
            if (typA380 ==false && i==19) {
                break; //beende die scleife bei 19 für nicht A380 typ
            }
        }
    }
}
