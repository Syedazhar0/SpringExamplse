package com.tcs.spring;

public class Bus implements Vehicle {

    private String busType;
    private int speed;
    
    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Hello! Welcome to Yoyo Travelers. You have chosen the bus vehicle.");
        System.out.println("Bus type: " + busType);
        System.out.println("Bus speed: " + speed);
    }
}
