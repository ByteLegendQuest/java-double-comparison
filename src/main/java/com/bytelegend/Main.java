package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        int t1 = (int) a * 10000;
        int t2 = (int) b * 10000;
        return t1 == t2;
    }
}
