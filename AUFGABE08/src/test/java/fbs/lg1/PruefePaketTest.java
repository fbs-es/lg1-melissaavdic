package fbs.lg1;

import fbs.lg1.entscheidung.Entscheidung;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PruefePaketTest {

    private final PruefePaket pruefe = new PruefePaket();

    @Test
    void paketInnerhalb_gibtFalse() {
        assertThat(pruefe.pruefeGewichtGroesse(10.0, 40.0, 40.0, 60.0)).isFalse();
    }

    @Test
    void gewichtZuHoch_gibtTrue() {
        assertThat(pruefe.pruefeGewichtGroesse(99.0, 40.0, 40.0, 60.0)).isTrue();
    }

    @Test
    void laengeZuHoch_gibtTrue() {
        assertThat(pruefe.pruefeGewichtGroesse(10.0, 999.0, 40.0, 60.0)).isTrue();
    }

    @Test
    void breiteZuHoch_gibtTrue() {
        assertThat(pruefe.pruefeGewichtGroesse(10.0, 40.0, 999.0, 60.0)).isTrue();
    }

    @Test
    void hoeheZuHoch_gibtTrue() {
        assertThat(pruefe.pruefeGewichtGroesse(10.0, 40.0, 40.0, 999.0)).isTrue();
    }

    @Test
    void gefahrgut_gibtAbgelehnt() {
        SpeicherDaten paket = new SpeicherDaten(true, 10.0, 10.0, 10.0, 10.0, false);
        assertThat(pruefe.pruefePaket(paket)).isEqualTo(Entscheidung.ABGELEHNT);
    }

    @Test
    void massZuGross_gibtSchalter() {
        SpeicherDaten paket = new SpeicherDaten(false, 999.0, 10.0, 10.0, 10.0, false);
        assertThat(pruefe.pruefePaket(paket)).isEqualTo(Entscheidung.SCHALTER);
    }

    @Test
    void normalesPaket_gibtAngenommen() {
        SpeicherDaten paket = new SpeicherDaten(false, 10.0, 10.0, 10.0, 10.0, false);
        assertThat(pruefe.pruefePaket(paket)).isEqualTo(Entscheidung.ANGENOMMEN);
    }

    @Test
    void zerbrechlichesPaket_gibtAngenommen() {
        SpeicherDaten paket = new SpeicherDaten(false, 10.0, 10.0, 10.0, 10.0, true);
        assertThat(pruefe.pruefePaket(paket)).isEqualTo(Entscheidung.ANGENOMMEN);
    }
}
