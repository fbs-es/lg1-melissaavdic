package fbs.lg1;

import fbs.lg1.entscheidung.Entscheidung;

public class PruefePaket {

    static final double MAX_WEIGHT = 38.5;
    static final double MAX_LENGTH = 80.0;
    static final double MAX_WIDTH = 80.0;
    static final double MAX_HEIGHT = 120.0;

    public boolean pruefeGewichtGroesse(double gewicht, double laenge, double breite, double hoehe) {

        if (gewicht > MAX_WEIGHT || (laenge > MAX_LENGTH || breite > MAX_WIDTH || hoehe > MAX_HEIGHT)) {
            return true;
        }
        return false;
    }

    public Entscheidung pruefePaket(SpeicherDaten paket) {

        if (paket.isGefahrengut()) {
            return Entscheidung.ABGELEHNT;
        } else if (pruefeGewichtGroesse(paket.nimmGewicht(), paket.nimmLaenge(), paket.nimmBreite(),
                paket.nimmHoehe())) {
            return Entscheidung.SCHALTER;
        } else if (paket.isZerbrechlich()) {
            System.out.println("Vermerk: Zerbrechlich!");
            return Entscheidung.ANGENOMMEN;
        } else {
            return Entscheidung.ANGENOMMEN;
        }

    }
}
