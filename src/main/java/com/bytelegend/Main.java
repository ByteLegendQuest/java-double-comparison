package com.bytelegend;

public class Main {
    private static final double EPSILON = 2e-52;
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        return Math.abs(a - b) < EPSILON;
    }
}
