package fbs.lg1;

import fbs.lg1.groesse.Groesse;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class BasisRechnerTest {

    private final BasisRechner rechner = new BasisRechner();

    @Test
    void groesseS_gibt5Euro() {
        assertThat(rechner.berechnePreis(Groesse.S)).isEqualTo(5.0);
    }

    @Test
    void groesseM_gibt10Euro() {
        assertThat(rechner.berechnePreis(Groesse.M)).isEqualTo(10.0);
    }

    @Test
    void groesseL_gibt15Euro() {
        assertThat(rechner.berechnePreis(Groesse.L)).isEqualTo(15.0);
    }
}
