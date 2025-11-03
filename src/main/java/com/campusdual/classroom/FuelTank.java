package com.campusdual.classroom;

public class FuelTank {


    public int actualFuel = 10;


    public int getActualFuel() {
        return actualFuel;
    }


    public void setActualFuel(int value) {
        if (value < 0) {
            System.out.println("Error: el valor del combustible no puede ser negativo.");
        } else {
            actualFuel = value;
        }
    }


    public void showDetails() {
        System.out.println("Nivel de combustible: " + getActualFuel() + " litros.");
    }
}
