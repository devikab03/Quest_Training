package com.quest.weathermonitoringsystem;

import java.util.Scanner;

public class WeatherDetails {
    private Cities[] city;
    private int cityCount;
    Scanner sc = new Scanner(System.in);

    //constructor for initializing
    public WeatherDetails(int count) {
        city = new Cities[count];
        cityCount = 0;
    }

    //add city details
    public void addCity(Scanner sc) {
        if (cityCount < city.length) {
            System.out.println("Add City");
            System.out.println("Enter City Name: ");
            String cityName = sc.nextLine();
            System.out.println("Enter City Humidity: ");
            int cityHumidity = sc.nextInt();
            System.out.println("Enter City Temperature: ");
            int cityTemperature = sc.nextInt();
            System.out.println("Enter City Condition:\tSunny\tRainy\tCloudy ");
            String cityCondition = sc.nextLine();
            Cities city = new Cities(cityName, cityHumidity, cityTemperature, cityCondition);
            cityCount++;
            System.out.println("City Added");
        }

    }

    //Display all city details
    public void displayAllCities() {
        System.out.println("Display All Cities");
        for (int i = 0; i < cityCount; i++) {
            System.out.println(city[i].toString());
        }

    }

    //display city details by name
    public void displayCity(Scanner sc) {
        System.out.println("Display City " );
        String cityName = sc.nextLine();
        for (int i = 0; i < cityCount; i++) {
            if (city[i].getName().equalsIgnoreCase(cityName)) {
                System.out.println(city[i].toString());
                return;
            }
        }
        System.out.println("City not found");
    }

    //Finding highest and lowest temperature
    public void temperatureDetails() {
        System.out.println("TemperatureDetails:");
        Cities highTemp = city[0];
        Cities lowTemp = city[0];
        for (int i = 1; i < cityCount; i++) {
            if (city[i].getTemperature() > highTemp.getTemperature()) {
                highTemp = city[i];
            }
            if (city[i].getTemperature() < lowTemp.getTemperature()) {
                lowTemp = city[i];
            }
        }
        System.out.println("City with High Temperature: " + highTemp.getName() + "(" + highTemp.getTemperature() + "oC)");
        System.out.println("City with Lowest Temperature: " + lowTemp.getName() + "(" + lowTemp.getTemperature() + "oC)");

    }

    //update weather details
    public void updateDetails(Scanner sc) {

        boolean isCity = false;
        System.out.println("Enter City Name to update: ");
        String cityName = sc.nextLine();
        for (int i = 0; i < cityCount; i++) {
            if (city[i].getName().equalsIgnoreCase(cityName)) {
                isCity = true;
            }
            System.out.println("City to update:" + cityName);
            System.out.println("1.Update temp\n2.Update humidity\n3.Update condition");
            System.out.println("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter new Temperature: ");
                    double newTemp = sc.nextInt();
                    city[i].setTemperature(newTemp);
                    System.out.println("Temperature updated");
                    break;
                case 2:
                    System.out.println("Enter new Humidity: ");
                    double newHum = sc.nextInt();
                    city[i].setHumidity(newHum);
                    System.out.println("Humidity updated");
                    break;
                case 3:
                    System.out.println("Enter new Condition: ");
                    String newCondition = sc.nextLine();
                    city[i].setCondition(newCondition);
                    System.out.println("Condition updated");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            return;

        }

    }
    //averageTemperature
    public double averageTemperature() {
        double totalTemp=0;
        for (int i = 0; i < cityCount; i++) {
            totalTemp+=city[i].getTemperature();

        }
        return totalTemp/cityCount;
    }


    //alert
    public void alert(){
        for (int i = 0; i < cityCount; i++) {
            if(city[i].getTemperature()>40){
                System.out.println("Heat wave alert:"+city[i].getName());
            }

            if(city[i].getHumidity()<20){
                System.out.println("Low Humidity alert:"+city[i].getName());
            }
        }



    }
}
