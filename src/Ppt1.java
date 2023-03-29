import java.util.Scanner;

public class Ppt1 {
    public static void main(String[] args) {
        // Sie schreiben ein Programm welches Ihnen die exakte Strafe
        //bei einer Geschwindigkeitsüberschreitung berechnet
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie ihre geschwindigkeit ein: ");
        int geschwindigkeit = scanner.nextInt();
        int erlaubt = 50;
        int ueberschreitung = geschwindigkeit- erlaubt;
        double strafe = 0;

        if(ueberschreitung <=0 ) {
            System.out.println("Gute fahrt!");
        } else if (geschwindigkeit <11) {
            System.out.println("die überschreitung beträgt " + ueberschreitung + " km/h - schriftliche verwarnung!");
        } else if (ueberschreitung <71) {
            System.out.println("die überschreitung bträgt " + ueberschreitung + " km/h -  es werden 30€ fällig");
            strafe = strafe+30;  //strafe+=30;
        } else if (ueberschreitung < 81) {
            System.out.println("die überschreitung bträgt " + ueberschreitung + " km/h - es werden 50€ fällig");
            strafe = strafe + 50;
        } else if (ueberschreitung < 101) {
            System.out.println("die überschreitung bträgt " + ueberschreitung + " km/h - es werden 100€ fällig");
            strafe = strafe +100;
        } else if (ueberschreitung < 151) {
            System.out.println("die überschreitung bträgt " + ueberschreitung + " km/h - es werden 500€ fällig");
            strafe = strafe +500;
        } else if (ueberschreitung > 150) {
            System.out.println("die überschreitung bträgt " + ueberschreitung + " km/h - es werden 1500€ fällig");
            strafe = strafe + 1500;
        }

        System.out.println("Geben sie ihre gemesste alkoholpegel ein: ");
        double alkoholpegel = scanner.nextDouble();

        if(alkoholpegel < 0.5) {
            System.out.println("alles in ordnung");
        } else if (alkoholpegel <=1.0){
            System.out.println("Die alkoholpegel beträgt " + alkoholpegel + " promille - es werden 50€ fällig");
            strafe = strafe+50;
        } else if(alkoholpegel<=2.0) {
            System.out.println("Die alkoholpegel beträgt " + alkoholpegel + " promille - es werden 150€ fällig");
            strafe=strafe+150;
        } else if (alkoholpegel>2.0){
            System.out.println("Die alkoholpegel beträgt " + alkoholpegel + " promille - es werden 2500€ fällig");
            strafe = strafe + 2500;
        }

        System.out.println("finale strafe: " + strafe);

        System.out.println("Welche motane ist es? ");
        String monate = scanner.next();

        switch (monate.toLowerCase()) {   //egal groß oder klein schreibe ich ein
            case "januar":
            case "februar":
                System.out.println("keine rabatte möglich");
                break;
            case "marz":
            case "april":
                System.out.println("10% rabatt auf die gesamte strafe");
                strafe = strafe * 0.9;
                break;
            case "mai":
            case "juni":
                System.out.println("15% rabatt auf die gesamte strafe");
                strafe = strafe * 0.85;
                break;
            case "juli":
            case "august":
                System.out.println("20% rabatt auf die gesamte strafe");
                strafe = strafe * 0.8;
                break;
            case "september":
            case "oktober":
                System.out.println("25% rabatt auf die gesamte strafe");
                strafe = strafe * 0.75;
                break;
            case "november":
            case "dezember":
                System.out.println("30% rabatt auf die gesamte strafe");
                strafe = strafe * 0.7;
                break;
        }

            System.out.println("finale strafe nach dem rabatt: " + strafe);

    }
}
