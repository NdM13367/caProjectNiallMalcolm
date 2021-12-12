package org.example;

public class Passenger
{
    private int id;
    private String name;
    private String email;
    private String phone;
    private LocationGPS location;

    public Passenger(int id, String name, String email, String phone, double latitude, double longitude)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.location = new LocationGPS(latitude, longitude);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocationGPS getLocation() {
        return location;
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

