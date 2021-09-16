package com.company.entities;

public class Car implements CarDriver, CarRefueler {
    public enum Transmission { MECHANICAL , AUTOMATIC };
    private Transmission transmission;
    private String model;
    private String number;
    private DriverLicense.Category category;
    boolean isCarMove = false;
    boolean isFuelTankCoverOpen = false;

    public Car() {
    }

    public Car(Transmission transmission, String model, String number, DriverLicense.Category category) {
        this.transmission = transmission;
        this.model = model;
        this.number = number;
        this.category = category;
    }

    @Override
    public void move() {
        if (isFuelTankCoverOpen)
            System.out.println("We can't move - fuel tank cover is open");
        else {
            isCarMove = true;
            System.out.println("Сar is moving");
        }
    }

    @Override
    public void stop() {
        isCarMove = false;
        System.out.println("Сar stopped");
    }

    @Override
    public void openFuelTankCover() {
        if (isCarMove)
            System.out.println("We can't open fuel tank cover - car is moving");
        else {
            isFuelTankCoverOpen = true;
            System.out.println("The fuel tank cover is open");
        }
    }

    @Override
    public void refuel() {
        if (!isFuelTankCoverOpen)
            System.out.println("Tank cover is close");
        else {
            System.out.println("The car is refueling");
        }
    }

    @Override
    public void closeFuelTankCover() {
        if (isCarMove)
            System.out.println("Car is moving. Stop car and tru open fuel tank cover again.");
        else {
            isFuelTankCoverOpen = false;
            System.out.println("The fuel tank cover is close");
        }
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public DriverLicense.Category getCategory() {
        return category;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCategory(DriverLicense.Category category) {
        this.category = category;
    }
}

