package fbs.lg1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ZahlenratenTest {
    Zahlenraten spiele = new Zahlenraten();

    @Test
    void IstZahlRandom() {
        int zahl = spiele.zahlGenerator();
        assertTrue(zahl >= 1 && zahl <= 100);
    }

    @ParameterizedTest
    @CsvSource({
            "60, 63, Sehr Heiß!",
            "50, 60, Heiß!",
            "16, 1, Warm!",
            "78, 58, Kalt!",
            "60, 85, Sehr Kalt!"
    })
    void testHeissKalt(int rate, int zahl, String expected) {
        String result = spiele.HeissKalt(rate, zahl);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "60, 63, Kalt!",
            "50, 60, Sehr Kalt!",
            "16, 1, Kalt!",
            "78, 58, Heiß!",
            "60, 85, Warm!"
    })
    void testHeissKaltFehler(int rate, int zahl, String wrongexpected) {

        int results = spiele.RichtigGerraten(rate, zahl);
        assertNotEquals(wrongexpected, results);
    }
}
