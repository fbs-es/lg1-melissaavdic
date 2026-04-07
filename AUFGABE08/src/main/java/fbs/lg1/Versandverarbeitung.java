package fbs.lg1;

import fbs.lg1.groesse.Groesse;
import fbs.lg1.versand.InAusland;
import fbs.lg1.versand.Versandart;

public class Versandverarbeitung {

    private final Versandeingabe eingabe = new Versandeingabe();
    private final Versandkostenrechner rechner = new Versandkostenrechner();

    public void verarbeite() {
        Groesse groesse = eingabe.leseGroesse();
        InAusland region = eingabe.leseInAusland();
        Versandart versandart = eingabe.leseVersandart();

        double gesamtpreis = rechner.berechneGesamtpreis(groesse, region, versandart);

        System.out.println(" ");
        System.out.println("Versandkosten");
        System.out.println("Größe: " + groesse);
        System.out.println("Zielort: " + region);
        System.out.println("Versandart: " + versandart);
        System.out.println("Gesamtpreis: " + gesamtpreis + " EURO");
    }
}
