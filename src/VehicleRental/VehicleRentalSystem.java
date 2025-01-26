package VehicleRental;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


abstract class Vehicle {
    private String vehicleId;
    private boolean isAvailable;
    private double dailyRentalRate;

    
    public Vehicle(String vehicleId, double dailyRentalRate) {
        this.vehicleId = vehicleId;
        this.isAvailable = true;  
        this.dailyRentalRate = dailyRentalRate;
    }

  
    public String getVehicleId() {
        return vehicleId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public double getDailyRentalRate() {
        return dailyRentalRate;
    }

    
    public abstract void vehicleDetails();

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId + ", Rental Rate: $" + dailyRentalRate + " per day, Available: " + (isAvailable ? "Yes" : "No");
    }
}

class Car extends Vehicle {
    private String carModel;

    public Car(String vehicleId, double dailyRentalRate, String carModel) {
        super(vehicleId, dailyRentalRate);
        this.carModel = carModel;
    }

    @Override
    public void vehicleDetails() {
        System.out.println("Car Model: " + carModel + " - Standard vehicle with air-conditioning.");
    }
}


class Bike extends Vehicle {
    private String bikeType;

    public Bike(String vehicleId, double dailyRentalRate, String bikeType) {
        super(vehicleId, dailyRentalRate);
        this.bikeType = bikeType;
    }

   
    public void vehicleDetails() {
        System.out.println("Bike Type: " + bikeType + " - Ideal for quick city rides.");
    }
}


class Customer {
    private String name;
    private String email;

  
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

  
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}


class Rental {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;
    private double totalCost;
    

    public Rental(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.totalCost = vehicle.getDailyRentalRate() * rentalDays;
    }

    
    
    public void displayRentalDetails() {
        System.out.println("Rental Details:");
        System.out.println("Customer: " + customer.getName() + " (" + customer.getEmail() + ")");
        System.out.println("Vehicle: " + vehicle);
        System.out.println("Rental Duration: " + rentalDays + " days");
        System.out.println("Total Rental Cost: $" + totalCost);
    }

    public double getTotalCost() {
        return totalCost;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}


class VehicleRentalSystem {
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>();



    public VehicleRentalSystem() {
        vehicles.add(new Car("C101", 30.00, "Toyota Camry"));
        vehicles.add(new Bike("B101", 15.00, "Mountain Bike"));
        vehicles.add(new Car("C102", 40.00, "Honda Accord"));
        vehicles.add(new Bike("B102", 20.00, "Road Bike"));
    }

   
    public boolean checkVehicleAvailability(String vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailable()) {
                return true;
            }
        }
        return false;
    }

    public void rentVehicle(String vehicleId, Customer customer, int rentalDays) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailable()) {
                vehicle.setAvailability(false);  
                Rental rental = new Rental(vehicle, customer, rentalDays);
                rentals.add(rental);
                System.out.println("Vehicle rented successfully!");
                rental.displayRentalDetails();
                return;
            }
        }
        System.out.println("Sorry, the vehicle is not available.");
    }


    public void returnVehicle(String vehicleId) {
        for (Rental rental : rentals) {
            if (rental.getVehicle().getVehicleId().equals(vehicleId)) {
                rental.getVehicle().setAvailability(true);  
                System.out.println("Vehicle with ID " + vehicleId + " returned successfully.");
                return;
            }
        }
        System.out.println("No active rental found for vehicle ID " + vehicleId);
    }

    
    public void displayAvailableVehicles() {
        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                vehicle.vehicleDetails();
                System.out.println(vehicle);
            }
        }
    }
}
