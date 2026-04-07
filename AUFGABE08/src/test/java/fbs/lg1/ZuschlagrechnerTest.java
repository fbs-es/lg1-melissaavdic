package fbs.lg1;

import fbs.lg1.versand.InAusland;
import fbs.lg1.versand.Versandart;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ZuschlagrechnerTest {

    private final Zuschlagrechner rechner = new Zuschlagrechner();

    @Test
    void inland_normal_gibt0Euro() {
        assertThat(rechner.berechneZuschlag(InAusland.INLAND, Versandart.NORMAL)).isEqualTo(0.0);
    }

    @Test
    void inland_express_gibt10Euro() {
        assertThat(rechner.berechneZuschlag(InAusland.INLAND, Versandart.EXPRESS)).isEqualTo(10.0);
    }

    @Test
    void ausland_normal_gibt10Euro() {
        assertThat(rechner.berechneZuschlag(InAusland.AUSLAND, Versandart.NORMAL)).isEqualTo(10.0);
    }

    @Test
    void ausland_express_gibt25Euro() {
        assertThat(rechner.berechneZuschlag(InAusland.AUSLAND, Versandart.EXPRESS)).isEqualTo(25.0);
    }
}
