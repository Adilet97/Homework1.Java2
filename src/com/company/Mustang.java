package com.company;

public final class Mustang extends Ford {
    private double capacity;
    private int year;
    private String model;

    enum model {
        GT,
        EcoBoost,
        Mach
    }

    @Override
    public void Ford(String classOfCar) {
        super.Ford(classOfCar);
    }

    public double getCapacity() {
        return capacity;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public Mustang(){

    }
    public Mustang(double capacity, int year, String model) {
        this.capacity = capacity;
        this.year = year;
        this.model = model;
    }




}
