package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        if ((a - b) > 0) {
            return (a - b) < EPSILON;
        } else {
            return (b - a) < EPSILON;
        }
    }
}
