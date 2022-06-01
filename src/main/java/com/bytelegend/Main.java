package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        double comparison = .000000001d;
        if (Math.abs(a - b) < comparison) {
            return true;
        } else {
            return false;
        }
    }
}
