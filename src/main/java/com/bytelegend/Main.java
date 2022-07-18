package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        double epsilon = 1e-10d;
        double absVal = (a < b) ? (b - a) : (a > b) ? (a - b) : (a - b);
        return (absVal < epsilon) ? true : false;
    }
}
