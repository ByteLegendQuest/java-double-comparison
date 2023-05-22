package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("0.1+0.2==0.3: " + doubleEquals(0.1 + 0.2, 0.3));
    }

    public static boolean doubleEquals(double a, double b) {
        double epsilon = 0.000001; // Valor de epsilon (tolerancia)
        double difference = Math.abs(a - b); // Diferencia absoluta entre a y b
        return difference < epsilon || difference < (epsilon * Math.max(Math.abs(a), Math.abs(b)));
    }
}
