package com.bytelegend;

public class Main {
    private static final double EPSION =  0.000000000000001;
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        double epsilon = a > b ? a - b : b - a;
        return epsilon < EPSION;
    }
}
