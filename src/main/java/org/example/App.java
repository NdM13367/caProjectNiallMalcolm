package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner keyboard = new Scanner(System.in);
    private static Passenger myPassenger = new Passenger("Niall", "niall111@gmail.com", "0871111111", 12.3, 26.3 );

    public static void main(String[] args)
    {
        System.out.println("Welcome to the car booking system");
        passengerMenuOptions selectedOption = passengerMenuOptions.PRINT_MENU;

        while(selectedOption != passengerMenuOptions.QUIT)
        {
            System.out.print("\n Enter action: (0 to show available options) > ");
            selectedOption = passengerMenuOptions.values()[Integer.parseInt(keyboard.nextLine().trim())];

            switch(selectedOption)
            {
                case PRINT_MENU:
                    printOptions();
                    break;

                case ADD_PASSENGER:
                    addPassenger();
                    break;
            }
        }
    }

    private static void printOptions()
    {
        System.out.println("\n Available Options");
        System.out.println("0 - to print all options \n"+
                "1 - to add a new contact\n");
    }

    private static void addPassenger()
    {
        System.out.print("Enter new id > ");
        int id = keyboard.nextInt();
        System.out.print("Enter new contact name > ");
        String name = keyboard.next();
        System.out.print("Enter new contact email > ");
        String email = keyboard.next();
        System.out.print("Enter new phone number  > ");
        String phone = keyboard.next();
        System.out.print("Enter new latitude  > ");
        double latitude = keyboard.nextInt();
        System.out.print("Enter new longitude  > ");
        double longitude = keyboard.nextInt();
        Passenger newPassenger = Passenger.createPassenger(id, name, email, phone, latitude, longitude);
        System.out.println(newPassenger);
    }
}
