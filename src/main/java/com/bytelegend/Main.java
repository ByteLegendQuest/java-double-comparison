package com.bytelegend;

import java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(BigDecimal a, BigDecimal b) {
        return a.compareTo(b) == 0;
    }
}
