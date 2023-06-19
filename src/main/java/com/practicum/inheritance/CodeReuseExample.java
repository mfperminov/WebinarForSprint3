package com.practicum.inheritance;

class Vehicle {
    void start() {
        System.out.println("Поехали...");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Машина газует...");
    }
}

class Bike {
    private Vehicle vehicle = new Vehicle();

    void start() {
        vehicle.start();
    }

    void pedal() {
        System.out.println("Педальки крутятся...");
    }
}

public class CodeReuseExample {
    public static void main(String[] args) {
        // Inheritance
        Car car = new Car();
        car.start();
        car.accelerate();

        // Delegation
        Bike bike = new Bike();
        bike.start();
        bike.pedal();
    }
}

