package com.company;

public class Ford extends Car {
    private String classOfCar;

    public Ford(String color, int horsepower, String fuel) {
        super(color, horsepower, fuel);
    }

    public Ford() {

    }

    public void Ford(String classOfCar) {
        System.out.println("Мустанг в классе " + "Pony car");
    }

    public final void Ford () {
        System.out.println("Coupe");
    }



    public String getClassOfCar() {
        return classOfCar;
    }


}
