package fbs.lg1;

import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {
    public int zahlGenerator() {
        Random random = new Random();
        return (int) (random.nextInt(100) + 1);
    }

    public int RichtigGerraten(int rate, int zahl) {
        if (rate < zahl)
            return -1;

        if (rate > zahl)
            return 1;
        return 0;
    }

    public String HeissKalt(int rate, int zahl) {
        int differenz = Math.abs(rate - zahl);

        if (differenz < 5)
            return "Sehr Heiß!";
        if (differenz <= 10)
            return "Heiß!";
        if (differenz <= 15)
            return "Warm!";
        if (differenz <= 20)
            return "Kalt!";
        return "Sehr Kalt!";
    }

    public void starten() {
        Scanner scanner = new Scanner(System.in);

        int zahl = zahlGenerator();
        int rate = 0;
        int versuche = 0;

        System.out.println("Willkommen zu Ratespiel!");
        System.out.println("Gib eine Zahl von 1-100: ");

        while (rate != zahl) {
            rate = scanner.nextInt();
            versuche++;
            int ergebnis = RichtigGerraten(rate, zahl);

            if (ergebnis == -1) {
                System.out.println(HeissKalt(rate, zahl));
                System.out.println("Die Zahl ist größer!");
            } else if (ergebnis == 1) {
                System.out.println(HeissKalt(rate, zahl));
                System.out.println("Die Zahl ist kleiner!");
            } else {
                System.out.println("Gewonnen! Deine Versuche: " + versuche);
                break;
            }
        }
        scanner.close();
    }
}
