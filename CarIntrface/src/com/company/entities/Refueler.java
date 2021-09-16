package com.company.entities;

public class Refueler {
    private String name;

    public Refueler(String name) {
        this.name = name;
    }

    public void refuelerCar(CarRefueler carRefueler){
        carRefueler.openFuelTankCover();
        carRefueler.refuel();
        carRefueler.closeFuelTankCover();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
