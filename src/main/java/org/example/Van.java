package org.example;

public class Van extends Vehicle
{
    private double loadSpace;

    public Van(int id, String type, String make, String model, double milesPerKwH,
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
        return "Van{" +
                "loadSpace=" + loadSpace +
                "} " + super.toString();
    }
}
