package com.bytelegend;

public class Main {
    static final float THRESHOLD = 0.00001f;
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        if (Math.abs(a - b) <= THRESHOLD) {
            return true;
        } else {
            return false;
        }
    }
}
