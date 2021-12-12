package org.example;

import java.util.ArrayList;

public class Vehicle
{
    private int id;
    private String type;
    private String make;
    private String model;
    private double milesPerKwH;
    private String registration;
    private double costPerMile;
    private int mileage;
    private LocationGPS depotGPSLocation;

    public Vehicle(int id, String type, String make, String model, double milesPerKwH, String registration, double costPerMile, int mileage, double latitude, double longitude)
    {
        this.id = id;
        this.type = type;
        this.make = make;
        this.model = model;
        this.milesPerKwH = milesPerKwH;
        this.registration = registration;
        this.costPerMile = costPerMile;
        this.mileage = mileage;
        this.depotGPSLocation = new LocationGPS(latitude, longitude);
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getMilesPerKwH() {
        return milesPerKwH;
    }

    public String getRegistration() {
        return registration;
    }

    public double getCostPerMile() {
        return costPerMile;
    }

    public int getMileage() {
        return mileage;
    }

    public LocationGPS getDepotGPSLocation() {
        return depotGPSLocation;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", milesPerKwH=" + milesPerKwH +
                ", registration='" + registration + '\'' +
                ", costPerMile=" + costPerMile +
                ", mileage=" + mileage +
                ", depotGPSLocation=" + depotGPSLocation +
                '}';
    }
}
