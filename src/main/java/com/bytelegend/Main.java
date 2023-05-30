package com.bytelegend;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        return BigDecimal.valueOf(a).setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue() 
        == BigDecimal.valueOf(b).setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
