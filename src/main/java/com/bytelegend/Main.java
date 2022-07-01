package com.bytelegend;


public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        double num  = 0.1;
        if (Math.abs(a - b) < num){
            return true;
        }else {
            return false;
        }
    }
}
