package org.example;

public class FourXFour extends Vehicle
{
    private double loadSpace;

    public FourXFour(int id, String type, String make, String model, double milesPerKwH,
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
        return "FourXFour{" +
                "loadSpace=" + loadSpace +
                "} " + super.toString();
    }
}
