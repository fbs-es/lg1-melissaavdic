package fbs.lg1;

import fbs.lg1.groesse.Groesse;
import fbs.lg1.versand.InAusland;
import fbs.lg1.versand.Versandart;

public class Versandkostenrechner {

    private final BasisRechner basisRechner;
    private final Zuschlagrechner zuschlagrechner;

    public Versandkostenrechner() {
        this.basisRechner = new BasisRechner();
        this.zuschlagrechner = new Zuschlagrechner();
    }

    public double berechneGesamtpreis(Groesse groesse, InAusland region, Versandart versandart) {
        double basispreis = basisRechner.berechnePreis(groesse);
        double zuschlag = zuschlagrechner.berechneZuschlag(region, versandart);
        return basispreis + zuschlag;
    }
}
