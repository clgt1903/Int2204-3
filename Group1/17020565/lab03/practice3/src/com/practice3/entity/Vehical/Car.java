package com.practice3.entity.Vehical;

public class Car extends Vehicle {

    public Car(int wheel, int numberOfSeat) {
        super(wheel, numberOfSeat);
    }

    public Car() {
        name = "Car";
    }

    @Override
    public void Start() {
        System.out.println("Car is running");
    }

    @Override
    public void Move() {
        System.out.println("Car is moving");
    }

    @Override
    public void Stop() {
        System.out.println("Car is stopping");
    }
}
