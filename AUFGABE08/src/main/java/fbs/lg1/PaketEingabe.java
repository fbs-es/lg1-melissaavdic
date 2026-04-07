package fbs.lg1;

import java.util.Scanner;

public class PaketEingabe {

    public SpeicherDaten paketErstellen(Scanner scanner) throws GefahrgutException {

        System.out.println("Enthält das Paket Gefahrgut? True oder False eineben!");
        boolean gefahrgut = scanner.nextBoolean();

        if (gefahrgut) {
            throw new GefahrgutException("Annahme verweigert wegen Gefahrgut! Programm wird beendet!");
        }

        System.out.println("");

        System.out.println("Gewicht vom Paket in kg: ");
        double gewicht = scanner.nextDouble();

        System.out.println("");

        System.out.println("Länge vom Paket in cm: ");
        double laenge = scanner.nextDouble();

        System.out.println("");

        System.out.println("Breite vom Paket in cm: ");
        double breite = scanner.nextDouble();

        System.out.println("");

        System.out.println("Höhe vom Paket in cm: ");
        double hoehe = scanner.nextDouble();

        System.out.println("");

        System.out.println("Ist der Inhalt vom Paket zerbrechlich? True oder False eingeben!");
        boolean zerbrechlich = scanner.nextBoolean();

        System.out.println("");

        return new SpeicherDaten(gefahrgut, gewicht, laenge, breite, hoehe, zerbrechlich);
    }
}
