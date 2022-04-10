package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1f + 0.2f, 0.3f));
    }

    public static boolean doubleEquals(double a, double b) {
        return a == b;
    }
}
