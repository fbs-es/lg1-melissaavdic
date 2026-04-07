package fbs.lg1;

import fbs.lg1.versand.InAusland;
import fbs.lg1.versand.Versandart;

public class Zuschlagrechner {

    public double berechneZuschlag(InAusland zielort, Versandart versandart) {
        if (zielort == InAusland.INLAND && versandart == Versandart.NORMAL) {
            return 0.0;
        } else if (zielort == InAusland.INLAND && versandart == Versandart.EXPRESS) {
            return 10.0;
        } else if (zielort == InAusland.AUSLAND && versandart == Versandart.NORMAL) {
            return 10.0;
        } else if (zielort == InAusland.AUSLAND && versandart == Versandart.EXPRESS) {
            return 25.0;
        } else {
            throw new IllegalArgumentException("Unbekannte Kombination: " + zielort + ", " + versandart);
        }
    }
}
