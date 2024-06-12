package com.tcs.spring;

public class Traveller {
    private String name;
    private int mobile;
    private int age;
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    // Method to display traveller details
    public void travellerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Age: " + age);
        vehicle.move();
    }
}
