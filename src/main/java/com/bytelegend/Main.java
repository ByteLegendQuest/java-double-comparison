package com.bytelegend;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

   public static boolean doubleEquals(double a, double b) {
        DecimalFormat df =new DecimalFormat("#0.00000000");
        String x =df.format(a);
        double y =Double.parseDouble(x);
        return y==b ;
    }
}
