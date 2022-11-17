package com.bytelegend;

public class Main {
    private final static double EPSILON = 0.00001;
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        return Math.abs(a - b) < EPSILON;
    }
}