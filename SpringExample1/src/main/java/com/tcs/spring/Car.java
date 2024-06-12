package com.tcs.spring;

public class Car implements Vehicle {

    private String carType;
    private int speed;
    
    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Hello! Welcome to Yoyo Travelers. You have chosen the car vehicle.");
        System.out.println("Car type: " + carType);
        System.out.println("Car speed: " + speed);
    }
}
