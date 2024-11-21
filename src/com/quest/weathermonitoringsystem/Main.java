package com.quest.weathermonitoringsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WeatherDetails weatherDetails = new WeatherDetails(10);
        System.out.println("Welcome to the Weather Monitoring System");
        while (true) {
            System.out.println("Please enter your weather data:");
            System.out.println("1.Add city");
            System.out.println("2.Display all cities");
            System.out.println("3.Display City details of a city");
            System.out.println("4.Display Temperature details of a city");
            System.out.println("6.Update Weather");
            System.out.println("7.Exit");
            System.out.println("Enter the choice:");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    weatherDetails.addCity(sc);
                    break;
                case "2":
                    weatherDetails.displayAllCities();
                    break;
                case "3":
                    weatherDetails.displayCity(sc);
                    break;
                case "4":
                    weatherDetails.temperatureDetails();
                    break;
                case "6":
                    weatherDetails.updateDetails(sc);
                    break;
                case "7":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");


            }


        }

    }


}
