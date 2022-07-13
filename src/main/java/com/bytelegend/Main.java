package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static double epsilon = Double.MIN_VALUE;

    public static boolean doubleEquals(double a, double b) {
        return Math.abs ( a - b ) < Math.abs( epsilon );
    }
}
