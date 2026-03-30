package com.mycompany.logisticsportal;

public class Shipment {

    String driverName;
    String truckNumber;
    double distance;
    int packages;

    public Shipment(String driverName, String truckNumber, double distance, int packages) {
        this.driverName = driverName;
        this.truckNumber = truckNumber;
        this.distance = distance;
        this.packages = packages;
    }

    public double calculateCost(double distance, int packages) {
        double cost = (distance * 2.5) + (packages * 10);
        return cost;
    }

    public boolean isLongDistance(double distance) {
        if (distance > 200) {
            return true;
        } else {
            return false;
        }
    }

    public void displaySummary() {
        System.out.println("Driver: " + driverName);
        System.out.println("Truck Number: " + truckNumber);
        System.out.println("Distance: " + distance);
        System.out.println("Packages: " + packages);
    }

    public String getTruckCode(String truckNumber) {
        return truckNumber.substring(0, 3);
    }
}
