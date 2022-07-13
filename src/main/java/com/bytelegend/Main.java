package com.bytelegend;

public class Main {
    public static Float a;
    public static Float b;
    public static Float c;
    public static Float d;
    public static Float e;

    public static void main(String[] args) {
        c = 0.1;
        d = 0.2;
        e = c + d ;

        System.out.println("0.1+0.2==0.3: " + floatEquals(e, 0.3));
    }

    public static boolean floatEquals(float a, float b) {
        return a == b;
    }
}
