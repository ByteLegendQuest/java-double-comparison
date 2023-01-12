package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
         if (a > b) {
            if (a - b <= 0.000000001) {
                return true;
            }
        } else {
            if (b - a <= 0.000000001) {
                return true;
            }
        }
        return false;
    }
}
