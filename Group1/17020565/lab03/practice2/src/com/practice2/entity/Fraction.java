package com.practice2.entity;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        MinimizeThis();
    }

    public int getDenominator(){
        return denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public void setDenominator(int denominator){
        if(denominator == 0) return;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public Fraction() {
        this(1,1);
    }

    public Fraction Cong(Fraction fraction) {
        int newNumerator = numerator *fraction.denominator + fraction.numerator * denominator;
        int newDenominator = denominator *fraction.denominator;
        return Minimize(newNumerator, newDenominator);
    }

    public Fraction Tru(Fraction fraction){
        int newNumerator = numerator *fraction.denominator - fraction.numerator * denominator;
        int newDenominator = denominator *fraction.denominator;
        return Minimize(newNumerator, newDenominator);
    }

    public Fraction Nhan(Fraction fraction){
        int newNumerator = numerator *fraction.numerator;
        int newDenominator = denominator *fraction.denominator;
        return Minimize(newNumerator, newDenominator);
    }

    public Fraction Chia(Fraction fraction){
        int newNumerator = numerator *fraction.denominator;
        int newDenominator = denominator *fraction.numerator;
        return Minimize(newNumerator, newDenominator);
    }

    private Fraction Minimize(int numerator, int denominator){
        int uc = UCLN(numerator, denominator);
        numerator /= uc;
        denominator /= uc;
        return new Fraction(numerator, denominator);
    }

    private void MinimizeThis(){
        int uc = UCLN(numerator, denominator);
        numerator /= uc;
        denominator /= uc;
    }

    public boolean equals(Object fraction) {
        if(fraction == null) return false;
        if(!(fraction instanceof Fraction)) return false;
        Fraction fraction2 = (Fraction)fraction;
        return numerator * fraction2.denominator == denominator * fraction2.numerator;
    }

    private Fraction Minimize(Fraction fraction){
        return Minimize(fraction.numerator, fraction.denominator);
    }

    private int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            return a + b;
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
}
