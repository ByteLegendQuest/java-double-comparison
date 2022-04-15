package com.bytelegend;

public class Main {
    private static final double EPSILON = Math.pow(2.0, -52.0);
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        return Math.abs(a - b) < EPSILON;
    }
}
