package com.demoproject.demo4project;

public class Passenger {
    private int passengerid;
    private int weight;

    public Passenger() {
    }

    public Passenger(int passengerid, int weight) {
        this.passengerid = passengerid;
        this.weight = weight;
    }

    public int getPassengerid() {
        return passengerid;
    }

    public void setPassengerid(int passengerid) {
        this.passengerid = passengerid;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
