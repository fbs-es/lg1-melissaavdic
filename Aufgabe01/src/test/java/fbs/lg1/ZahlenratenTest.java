package fbs.lg1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ZahlenratenTest {
    Zahlenraten spiele = new Zahlenraten();

    @Test
    void IstZahlRandom() {
        int zahl = spiele.zahlGenerator();
        assertTrue(zahl >= 0 && zahl <= 100);
    }

    @ParameterizedTest
    @CsvSource({
            "16, 56, -1",
            "100, 100, 0",
            "84, 25, 1"
    })
    void testRichtigGerraten(int rate, int zahl, int expected) {
        int result = spiele.RichtigGerraten(rate, zahl);
        assertEquals(expected, result);
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
}
