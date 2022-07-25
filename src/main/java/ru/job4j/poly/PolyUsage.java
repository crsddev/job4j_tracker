package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle[] vehicles = new Vehicle[]{plane, bus, train};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }

    }
}
