package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        long al = Double.doubleToLongBits(a);
        long bl = Double.doubleToLongBits(b);
        return al == bl || Math.abs(al - bl) <= 1;
    }
}
