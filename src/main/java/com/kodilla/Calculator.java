package com.kodilla;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(5, 3);
        int resultSubtract = calculator.subtract(10, 4);
        System.out.println("Wynik dodawania: " + resultAdd);
        System.out.println("Wynik odejmowania: " + resultSubtract);
    }
}
