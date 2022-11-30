package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        Float aFloat = new Float(a);
        Float bFloat = new Float(b);
        int i = aFloat.compareTo(bFloat);
        Boolean flag =false;
        if(i == 0){
            flag = true;
        }
        return flag;
    }
}
