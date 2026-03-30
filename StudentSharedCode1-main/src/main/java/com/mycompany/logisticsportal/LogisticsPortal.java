package com.mycompany.logisticsportal;

import java.util.Scanner;

public class LogisticsPortal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 1;

        while (count <= 3) {

            System.out.println("Enter driver name:");
            String name = input.next();

            System.out.println("Enter truck number:");
            String truck = input.next();

            System.out.println("Enter delivery distance:");
            double distance = input.nextDouble();

            System.out.println("Enter number of packages:");
            int packages = input.nextInt();

            Shipment s = new Shipment(name, truck, distance, packages);

            double cost = s.calculateCost(distance, packages);
            boolean longTrip = s.isLongDistance(distance);
            String truckCode = s.getTruckCode(truck);

            if (truck.length() < 3) {
                System.out.println("Truck number is too short.");
            }

            s.displaySummary();

            System.out.println("Delivery Cost: R" + cost);

            if (longTrip == true) {
                System.out.println("Trip Type: Long Distance");
            } else{
                System.out.println("Trip Type: Local");
            }

            System.out.println("Truck Code: " + truckCode);

            count++;
        }

        input.close();
    }
}
