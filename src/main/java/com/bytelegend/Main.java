package com.bytelegend;

public class Main {
    public static final double epsilon = 1e-10;
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        return Math.abs(a - b) < epsilon;
    }
}
