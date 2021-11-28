package org.example;

public class Passenger
{
    private int id;
    private String name;
    private String email;
    private String phone;
    private LocationGPS location;

    public Passenger(String name, String email, String phone,
                     double latitude, double longitude)
    {
        if (name == null )
            throw new IllegalArgumentException("null arguments encountered");

        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.location = new LocationGPS(latitude, longitude);
    }

    public Passenger(int id, String name, String email, String phone,
                     double latitude, double longitude)
    {
        if (name == null)
            throw new IllegalArgumentException("null arguments encountered");

        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.location = new LocationGPS(latitude, longitude);
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhone()
    {
        return phone;
    }

    public LocationGPS getLocation()
    {
        return location;
    }

    public static Passenger createPassenger(int id, String name, String email, String phone, double latitude, double longitude)
    {
        return new Passenger(id, name, email, phone, latitude, longitude);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", location=" + location +
                '}';
    }
}

