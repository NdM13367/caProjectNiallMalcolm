package org.example;

public class LocationGPS
{
    private double latitude;
    private double longitude;


    public LocationGPS(double latitude, double longitude)
    {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    @Override
    public String toString() {
        return "LocationGPS{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}