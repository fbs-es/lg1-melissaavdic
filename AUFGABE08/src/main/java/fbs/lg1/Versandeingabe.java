package fbs.lg1;

import fbs.lg1.groesse.Groesse;
import fbs.lg1.versand.InAusland;
import fbs.lg1.versand.Versandart;

import java.util.Scanner;

public class Versandeingabe {

    private Scanner scanner = new Scanner(System.in);

    public Groesse leseGroesse() {
        System.out.println("Groesse eingeben (S, M, L):");
        String eingabe = scanner.nextLine().trim().toUpperCase();
        System.out.println(" ");
        return Groesse.valueOf(eingabe);
    }

    public InAusland leseInAusland() {
        System.out.println("Zielort eingeben (INLAND, AUSLAND):");
        String eingabe = scanner.nextLine().trim().toUpperCase();
        System.out.println(" ");
        return InAusland.valueOf(eingabe);
    }

    public Versandart leseVersandart() {
        System.out.println("Versandart eingeben (NORMAL, EXPRESS):");
        String eingabe = scanner.nextLine().trim().toUpperCase();
        System.out.println(" ");
        return Versandart.valueOf(eingabe);
    }
}
