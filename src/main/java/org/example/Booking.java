package org.example;

import java.util.Scanner;

public class Booking
{
    private int bookingId;
    private int passengerId;
    private int vehicleId;
    private LocationGPS startLocation;
    private LocationGPS endLocation;

    private double cost;

    public int getBookingId() {
        return bookingId;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public LocationGPS getStartLocation() {
        return startLocation;
    }

    public LocationGPS getEndLocation() {
        return endLocation;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter model to rent: ");
        String model = input.nextLine();
        System.out.print("Enter number of latitude: ");
        double latitude = input.nextDouble();
        System.out.print("Enter number of latitude: ");
        double longitude = input.nextDouble();
        System.out.print("Enter rate 2.00 = car, 4.00 = 4x4, 6.00 = van, 10.00 = truck: ");
        double rate = input.nextDouble();
        System.out.println("***************Details*****************");
        double cost = (latitude * 2 + longitude * 2 * rate);
        System.out.println("TotalCost");
        System.out.println(cost);
        System.out.println("Enter Customer Name: ");
        String name = input.next();
        System.out.println("Enter email: ");
        String email = input.next();
        System.out.println("************Receipt*************");
        System.out.println("Name     Email     Model     TotalCost");
        System.out.println(name + "  " + email + "  " + model + "  " + cost);
    }
}
