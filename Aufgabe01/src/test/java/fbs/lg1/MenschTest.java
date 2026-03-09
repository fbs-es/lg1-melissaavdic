package fbs.lg1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MenschTest {

    Zahlenraten spiele = new Zahlenraten();

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
            "16, 56, 1",
            "100, 100, -1",
            "84, 25, 0"
    })
    void testRichtigGerratenFehler(int rate, int zahl, int wrongexpected) {

        int result = spiele.RichtigGerraten(rate, zahl);
        assertNotEquals(wrongexpected, result);
    }
}
