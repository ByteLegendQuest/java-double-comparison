package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + floatEquals(0.1 + 0.2, 0.3));
    }

    public static boolean floatEquals(float a, float b) {
        return a == b;
    }
}
