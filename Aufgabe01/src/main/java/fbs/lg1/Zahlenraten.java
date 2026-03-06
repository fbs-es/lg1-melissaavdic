package fbs.lg1;

import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {

    Scanner scanner = new Scanner(System.in);

    public void starten() {

        System.out.println("Spielmodus wählen: ");
        System.out.println("1 - Mensch vs Computer");
        System.out.println("2 - Computer vs Mensch");

        int modus = scanner.nextInt();
        System.out.println("Gewählter Modus: " + modus);

        if (modus == 1) {
            menschraten();
        } else if (modus == 2) {
            computerraten();
        } else {
            System.out.println("Gibt es nicht.");
        }
    }

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

        if (differenz < 5) {
            return "Sehr Heiß!";
        }
        if (differenz <= 10) {
            return "Heiß!";
        }
        if (differenz <= 15) {
            return "Warm!";
        }
        if (differenz <= 20) {
            return "Kalt!";
        }
        return "Sehr Kalt!";
    }

    public void menschraten() {
        Mensch mensch = new Mensch(scanner);

        int zahl = zahlGenerator();
        int rate = 0;
        int versuche = 0;

        System.out.println("Willkommen zu Ratespiel!");
        System.out.println("Gib eine Zahl von 1-100: ");

        while (rate != zahl) {

            rate = mensch.rateZahl();
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
    }

    public void computerraten() {
        Computer computer = new Computer();

        int versuche = 0;

        System.out.println("Denk an eine Zahl zwischen 1 - 100.");

        while (true) {
            int rate = computer.rateZahl();
            versuche++;

            System.out.println("Computer rät: " + rate);
            System.out.println("Ist die Zahl größer (-1), kleiner (1) oder richtig (0)?");

            int antwort = scanner.nextInt();

            if (antwort == -1) {
                computer.groesser(rate);
                System.out.println("Die Zahl ist größer.");
            } else if (antwort == 1) {
                computer.kleiner(rate);
                System.out.println("Die Zahl ist kleiner.");
            } else {
                System.out.println("Computer hat gewonnen nach " + versuche + " Versuchen!");
                break;
            }
        }
    }
}
