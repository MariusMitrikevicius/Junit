package org.example;

public class Skaiciuokle {
    private final int a;
    private final int b;

    // Konstruktoriumi priskiriamos reikšmės
    public Skaiciuokle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Sudėtis
    public int sudetis() {
        return a + b;
    }

    // Atimtis
    public int atimtis() {
        return a - b;
    }

    // Daugyba
    public int daugyba() {
        return a * b;
    }

    // Dalyba
    public double dalyba() {
        if (b == 0) {
            throw new ArithmeticException("Dalyba iš nulio negalima!");
        }
        return (double) a / b;
    }
}
