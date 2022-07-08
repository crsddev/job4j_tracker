package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return minus(a) + sum(a) + multiply(a) + divide(a) + minus(a);

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int value = 10;
        System.out.println(sum(value));
        System.out.println(minus(value));
        System.out.println(calculator.multiply(value));
        System.out.println(calculator.divide(value));
        System.out.println(calculator.sumAllOperation(value));

    }
}