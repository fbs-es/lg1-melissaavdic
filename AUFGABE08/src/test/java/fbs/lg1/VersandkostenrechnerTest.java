package fbs.lg1;

import fbs.lg1.groesse.Groesse;
import fbs.lg1.versand.InAusland;
import fbs.lg1.versand.Versandart;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class VersandkostenrechnerTest {

    private final Versandkostenrechner rechner = new Versandkostenrechner();

    @Test
    void s_inland_normal_gibt5Euro() {
        assertThat(rechner.berechneGesamtpreis(Groesse.S, InAusland.INLAND, Versandart.NORMAL)).isEqualTo(5.0);
    }

    @Test
    void s_inland_express_gibt15Euro() {
        assertThat(rechner.berechneGesamtpreis(Groesse.S, InAusland.INLAND, Versandart.EXPRESS)).isEqualTo(15.0);
    }

    @Test
    void s_ausland_normal_gibt15Euro() {
        assertThat(rechner.berechneGesamtpreis(Groesse.S, InAusland.AUSLAND, Versandart.NORMAL)).isEqualTo(15.0);
    }

    @Test
    void s_ausland_express_gibt30Euro() {
        assertThat(rechner.berechneGesamtpreis(Groesse.S, InAusland.AUSLAND, Versandart.EXPRESS)).isEqualTo(30.0);
    }

    @Test
    void m_inland_normal_gibt10Euro() {
        assertThat(rechner.berechneGesamtpreis(Groesse.M, InAusland.INLAND, Versandart.NORMAL)).isEqualTo(10.0);
    }

    @Test
    void l_ausland_express_gibt40Euro() {
        assertThat(rechner.berechneGesamtpreis(Groesse.L, InAusland.AUSLAND, Versandart.EXPRESS)).isEqualTo(40.0);
    }
}
