package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        double ex = a - b;
        if(ex < 0.0000000000000001 && ex > -0.0000000000000001) {
            return true;
        }
        return false;
    }
}
