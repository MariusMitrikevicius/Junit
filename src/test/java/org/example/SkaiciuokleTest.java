package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkaiciuokleTest {

    @Test
    void tikrinkSudeti() {
        Skaiciuokle skaiciuokle = new Skaiciuokle(5, 3);
        int gauta = skaiciuokle.sudetis();
        assertEquals(TestUtils.EXPECTED_SUM, gauta);
    }

    @Test
    void tikrinkAtimti() {
        Skaiciuokle skaiciuokle = new Skaiciuokle(10, 4);
        int gauta = skaiciuokle.atimtis();
        assertEquals(TestUtils.EXPECTED_DIFFERENCE, gauta);
    }

    @Test
    void tikrinkDaugyba() {
        Skaiciuokle skaiciuokle = new Skaiciuokle(6, 7);
        int gauta = skaiciuokle.daugyba();
        assertEquals(TestUtils.EXPECTED_PRODUCT, gauta);
    }

    @Test
    void tikrinkDalyba() {
        Skaiciuokle skaiciuokle = new Skaiciuokle(20, 5);
        double gauta = skaiciuokle.dalyba();
        assertEquals(TestUtils.EXPECTED_QUOTIENT, gauta, TestUtils.TOLERANCE);
    }

    @Test
    void tikrinkDalybaIsNulio() {
        Skaiciuokle skaiciuokle = new Skaiciuokle(10, 0);
        assertThrows(ArithmeticException.class, skaiciuokle::dalyba);
    }

}