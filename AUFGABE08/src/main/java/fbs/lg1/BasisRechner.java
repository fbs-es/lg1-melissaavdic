package fbs.lg1;

import fbs.lg1.groesse.Groesse;

public class BasisRechner {

    public double berechnePreis(Groesse groesse) {
        switch (groesse) {

            case S:
                return 5.0;

            case M:
                return 10.0;

            case L:
                return 15.0;

            default:
                throw new IllegalArgumentException("Unbekannte Groesse: " + groesse);
        }
    }
}
