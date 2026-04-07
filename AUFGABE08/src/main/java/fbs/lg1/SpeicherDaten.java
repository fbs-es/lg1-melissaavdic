package fbs.lg1;

public class SpeicherDaten {

    private boolean isGefahrengut;
    private double gewicht;
    private double laenge;
    private double breite;
    private double hoehe;
    private boolean zerbrechlich;

    public SpeicherDaten(boolean gefahrgut, double gewicht, double laenge, double breite, double hoehe,
            boolean zerbrechlich) {

        this.isGefahrengut = gefahrgut;
        this.gewicht = gewicht;
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
        this.zerbrechlich = zerbrechlich;
    }

    public boolean isGefahrengut() {
        return isGefahrengut;
    }

    public double nimmGewicht() {
        return gewicht;
    }

    public double nimmLaenge() {
        return laenge;
    }

    public double nimmBreite() {
        return breite;
    }

    public double nimmHoehe() {
        return hoehe;
    }

    public boolean isZerbrechlich() {
        return zerbrechlich;
    }
}
