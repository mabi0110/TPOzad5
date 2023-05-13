package com.example.zad5;

public class Car {

    private Integer id;
    private String type;
    private String brand;
    private String model;
    private Integer year;
    private Double fuelConsumption;


    public Car(String type, String brand, String model, Integer year, Double fuelConsumption) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelConsumption = fuelConsumption;
    }

    public Car(Integer id, String type, String brand, String model, Integer year, Double fuelConsumption) {
        this(type, brand, model, year, fuelConsumption);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
