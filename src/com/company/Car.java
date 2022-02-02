package com.company;

public abstract class Car {
    private String color;
    private int horsepower;
    private String fuel;

    protected Car() {
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getFuel() {
        return fuel;
    }

    public Car(String color, int horsepower, String fuel) {
        this.color = color;
        this.horsepower = horsepower;
        this.fuel = fuel;
    }
}
