package com.bytelegend;

import static java.lang.Double.valueOf;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        return new BigDecimal(valueOf(a)).equals(new BigDecimal(valueOf(b)));
    }
}
