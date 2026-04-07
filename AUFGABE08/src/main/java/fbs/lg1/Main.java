package fbs.lg1;

import java.util.Scanner;

import fbs.lg1.entscheidung.Entscheidung;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PaketEingabe eingabe = new PaketEingabe();
        SpeicherDaten paket = null;

        try {
            paket = eingabe.paketErstellen(scanner);
        } catch (GefahrgutException e) {
            System.out.println(e.getMessage());
            scanner.close();
            return;
        }
        PruefePaket pruefe = new PruefePaket();
        Entscheidung entscheidung = pruefe.pruefePaket(paket);

        if (entscheidung == Entscheidung.ANGENOMMEN) {
            System.out.println("Paket angenommen!");
        } else if (entscheidung == Entscheidung.SCHALTER) {
            System.out.println("Maße unpassend! Bitte zu Schalter!");
        } else if (entscheidung == Entscheidung.ABGELEHNT) {
            System.out.println("Paket abgelehnt!");
        }
        Versandverarbeitung versand = new Versandverarbeitung();
        versand.verarbeite();

        scanner.close();

    }
}
