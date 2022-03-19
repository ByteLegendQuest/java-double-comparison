package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        double abs;
        if (a > b) {
            abs = a -b;
        }
        if (a < b) {
            abs = b - a;
        }
        if (abs < 0.000001) {
            return true;
        }
        return false;
    }
}
