package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Автобус отправляется в путь");

    }

    @Override
    public void passengers(int x) {
        System.out.printf("В автобус село %d человек", x);
    }

    @Override
    public double refill(double x) {
        return x * 64;
    }
}
