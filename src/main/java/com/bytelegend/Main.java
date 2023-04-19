package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        int tem = a -b;
        if(-1 <= tem*1000_000 <= 1) {
            return true;
        }
        return false;
    }
}
