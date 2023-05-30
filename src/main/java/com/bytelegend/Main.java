package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        double sum = 0.3;
        double error = 0.0001;
        return Math.abs(sum - (a + b)) < error;
    }
}
