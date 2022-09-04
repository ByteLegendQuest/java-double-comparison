package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        double ε = a - b;
        if (ε < 0.000000000000001 && ε > -0.000000000000001) {
            return true;
        }
        return false;
    }
}
