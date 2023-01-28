package com.learn.java.abstractclass;

public class Rational extends Number implements Comparable<Rational> {
    private final long numerator;
    private final long denominator;

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(long numerator, long denominator) throws Exception {
        if (denominator == 0) throw new Exception("denominator cannot be zero");
        this.denominator = denominator / getGcd(numerator, denominator);
        this.numerator = numerator / getGcd(numerator, denominator);
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) throws Exception {
        long SRD = denominator * secondRational.getDenominator();
        long SRN = numerator * secondRational.getDenominator() + secondRational.getNumerator() * denominator;
        Rational rational = new Rational(SRN, SRD);
        return rational;
    }

    public Rational subtract(Rational secondRational) throws Exception {
        long SRD = denominator * secondRational.getDenominator();
        long SRN = numerator * secondRational.getDenominator() - secondRational.getNumerator() * denominator;
        Rational rational = new Rational(SRN, SRD);
        return rational;
    }

    public Rational multiply(Rational secondRational) throws Exception {
        Rational rational = new Rational(numerator * secondRational.getNumerator(), denominator * secondRational.getDenominator());
        return rational;
    }

    public Rational divide(Rational secondRational) throws Exception {
        Rational rational = new Rational(numerator * secondRational.getDenominator(), secondRational.getNumerator() * denominator);
        return rational;
    }

    private static long getGcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        long getGcd = 1;
        for (long i = Math.min(a, b); i >= 1; i++) {
            if (a % i == 0 && b % i == 0) {
                getGcd = i;
                break;
            }
        }
        return getGcd;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        try {
            if (this.subtract(o).getNumerator() > 0) return 1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            if (this.subtract(o).getNumerator() < 0) return -1;
            else return 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        if (numerator * denominator < 0) return "-" + Math.abs(numerator) + "/" + Math.abs(denominator);
        if (numerator == 0) return 0 + "";
        return Math.abs(numerator) + "/" + Math.abs(denominator);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rational) {
            if (compareTo((Rational) obj) == 0) return true;
        }
        return false;
    }
}
