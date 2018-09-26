package com.practice3.entity.Vehical;

public class AirPlane extends Vehicle {
    private boolean status;

    public void setStatus(boolean status) {
        this.status = status;
    }

    public AirPlane() {
        name = "AirPlane";
    }

    @Override
    public void Move() {
        System.out.println("AirPlane is moving");
    }

    @Override
    public void Start() {
        System.out.println("AirPlane is starting");
    }

    @Override
    public void Stop() {
        System.out.println("AirPlane is stopping");
    }

    public boolean IsFlying(){
        return status;
    }
}
