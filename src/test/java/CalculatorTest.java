import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertTrue(Calculator.Add(1, 1) == 2);
    }

    @Test
    void falseAdd() {
        assertFalse(Calculator.Add(1, 1) == 0);
    }

    @Test
    void sub() {
        assertTrue(Calculator.Sub(1, 1) == 0);
    }

    @Test
    void falseSub() {
        assertFalse(Calculator.Sub(1, 1) == 2);
    }

    @Test
    void multi() {
        assertTrue(Calculator.multi(2, 4) == 8);
    }

    @Test
    void falseMulti() {
        assertFalse(Calculator.multi(2, 4) == 16);
    }

    @Test
    void divide() {
        assertTrue(Calculator.divide(10, 5) == 2);
    }

    @Test
    void falseDivide() {
        assertFalse(Calculator.Add(10, 5) == 0);
    }
}