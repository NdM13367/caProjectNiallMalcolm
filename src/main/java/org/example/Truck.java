package org.example;

public class Truck extends Vehicle
{
    private double loadSpace;

    public Truck(int id, String type, String make, String model, double milesPerKwH,
               String registration, double costPerMile,
               int year, int month, int day,
               int mileage, double latitude, double longitude,
               int loadSpace)
    {
        super(id, type, make, model, milesPerKwH, registration, costPerMile, year, month, day);

        this.loadSpace = loadSpace;
    }

    public double getLoadSpace() {
        return loadSpace;
    }


    @Override
    public String toString() {
        return "Truck{" +
                "loadSpace=" + loadSpace +
                "} " + super.toString();
    }
}
