package fbs.lg1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ComputerTest {

    @ParameterizedTest
    @CsvSource({
            "50, 75",
            "25, 63"
    })
    void testGroesser(int rate, int expected) {
        Computer computer = new Computer();
        computer.groesser(rate);
        int neueRate = computer.rateZahl();

        assertEquals(expected, neueRate);
    }

    @ParameterizedTest
    @CsvSource({
            "50, 25",
            "75, 37"
    })
    void testKleiner(int rate, int expected) {
        Computer computer = new Computer();
        computer.kleiner(rate);
        int neueRate = computer.rateZahl();

        assertEquals(expected, neueRate);
    }

    @ParameterizedTest
    @CsvSource({
            "50, 51",
            "25, 26",
            "43, 44"
    })
    void testGroesserFehler(int rate, int expected) {
        Computer computer = new Computer();
        computer.groesser(rate);
        int neueRate = computer.rateZahl();

        assertFalse(neueRate < expected);
    }

    @ParameterizedTest
    @CsvSource({
            "50, 49",
            "75, 74",
            "63, 62"
    })
    void testKleinerFehler(int rate, int expected) {
        Computer computer = new Computer();
        computer.kleiner(rate);
        int neueRate = computer.rateZahl();

        assertFalse(neueRate > expected);
    }
}
