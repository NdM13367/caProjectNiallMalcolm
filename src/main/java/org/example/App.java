package org.example;

import java.io.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner keyboard = new Scanner(System.in);

    public static void main( String[] args )
    {
        System.out.println("Welcome to the car booking system");
        passengerMenuOptions selectedOption = passengerMenuOptions.PRINT_MENU;
        boolean quit = false;

        while(!quit)
        {
            System.out.print("\n Enter action: (0 to show available options) > ");
            selectedOption = passengerMenuOptions.values()[Integer.parseInt(keyboard.nextLine().trim())];

            switch(selectedOption)
            {
                case PRINT_MENU:
                    printOptions();
                    break;

                case DISPLAY_VEHICLES:
                    displayVehicles();
                    break;

                case DISPLAY_PASSENGERS:
                    displayPassenger();
                    break;

                case ADD_PASSENGER:
                    addPassenger();
                    break;

                case REMOVE_PASSENGER:
                    removePassenger();
                    break;

                case QUIT:
                    quit = true;
                    break;
            }
        }
    }

    private static void printOptions()
    {
        System.out.println("\n Available Options");
        System.out.println("0 - to print all options \n"+
                "1 - to display vehicles\n"+
                "2 - to display passengers\n"+
                "3 - to add passengers\n"+
                "4 - to edit passengers\n"+
                "5 - to remove passengers\n"+
                "6 - to quit \n");
    }

    private static void displayVehicles()
    // code from w3schools
    {
        {
            try {
                File passengerDetails = new File("Vehicles");
                Scanner myReader = new Scanner(passengerDetails);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    private static void displayPassenger()
    // code from w3schools
    {
        {
            try {
                File passengerDetails = new File("Passengers");
                Scanner myReader = new Scanner(passengerDetails);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    private static void addPassenger()
    // code from w3schools
    // it crashes when you enter a passenger but it will work when you re-enter
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Id: ");
        int id = keyboard.nextInt();
        System.out.print("Name: ");
        String name = keyboard.next();
        System.out.print("Email: ");
        String email = keyboard.next();
        System.out.print("Phone: ");
        String phone = keyboard.next();
        System.out.print("Latitude: ");
        double latitude = keyboard.nextDouble();
        System.out.print("Longitude: ");
        double longitude = keyboard.nextDouble();
        System.out.println("Id:" + " " + id + " " + "Name:" + " " + name + "Email:" + " " + email + "Phone:" + " " + phone + "Latitude:" + " " + latitude + "Longitude:" + " " + longitude);
        keyboard.close();

        try(FileWriter fw = new FileWriter("Passengers", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.print(id + ", " + name + ", " + email + ", " + phone + ", " + latitude + ", " + longitude);
        } catch (IOException e) {

        }
    }

    private static void removePassenger()
    // code from w3schools
    {
        try{
            FileWriter fw = new FileWriter("Passengers", false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        }catch(Exception exception){
            System.out.println("Exception have been caught");
        }
    }
}
