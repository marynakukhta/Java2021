package com.company.entities;

public class Car {
    public enum Transmission { MECHANICAL , AUTOMATIC };
    private Transmission transmission;
    private String model;
    private String number;
    private DriverLicense.Category category;

    public Car() {
    }

    public Car(Transmission transmission, String model, String number, DriverLicense.Category category) {
        this.transmission = transmission;
        this.model = model;
        this.number = number;
        this.category = category;
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

