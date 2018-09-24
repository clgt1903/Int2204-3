package com.practice3.entity.Vehical;

public abstract class Vehicle {
    int wheel;
    int numberOfSeat;

    String name;

    public Vehicle() {
        name = "Vehical";
    }

    public Vehicle(int wheel, int numberOfSeat) {
        this.wheel = wheel;
        this.numberOfSeat = numberOfSeat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public abstract void Move();

    public abstract void Start();

    public abstract void Stop();
}
