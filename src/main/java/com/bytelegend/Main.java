package com.bytelegend;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        NumberFormat format = NumberFormat.getNumberInstance();
        String aa = format.format(a);
        String bb = format.format(b);
        return a.equals(b);
    }
}
