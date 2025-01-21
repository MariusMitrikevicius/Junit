package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkaiciuokleTest {

    @Test
    void tikrinkSudeti() {
        Skaiciuokle skaiciuokle = new Skaiciuokle(5, 3);
        int gauta = skaiciuokle.sudetis();
        int tikejausi = 8;
        tikrinkLygybe(tikejausi, gauta);
    }

    @Test
    void tikrinkAtimti() {
        Skaiciuokle skaiciuokle = new Skaiciuokle(10, 4);
        int gauta = skaiciuokle.atimtis();
        int tikejausi = 6;
        tikrinkLygybe(tikejausi, gauta);
    }

    @Test
    void tikrinkDaugyba() {
        Skaiciuokle skaiciuokle = new Skaiciuokle(6, 7);
        int gauta = skaiciuokle.daugyba();
        int tikejausi = 42;
        tikrinkLygybe(tikejausi, gauta);
    }

    @Test
    void tikrinkDalyba() {
        Skaiciuokle skaiciuokle = new Skaiciuokle(20, 5);
        double gauta = skaiciuokle.dalyba();
        double tikejausi = 4.0;
        tikrinkLygybe(tikejausi, gauta, 0.001);
    }

    @Test
    void tikrinkDalybaIsNulio() {
        Skaiciuokle skaiciuokle = new Skaiciuokle(10, 0);
        assertThrows(ArithmeticException.class, skaiciuokle::dalyba);
    }

    // Pagalbinės funkcijos
    private void tikrinkLygybe(int tikejausi, int gauta) {
        assertEquals(tikejausi, gauta);
    }

    private void tikrinkLygybe(double tikejausi, double gauta, double tolerancija) {
        assertEquals(tikejausi, gauta, tolerancija);
    }
}