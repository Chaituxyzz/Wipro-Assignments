package HotelBooking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


abstract class Room {
    private int roomNumber;
    private boolean isAvailable;
    private double pricePerNight;

    public Room(int roomNumber, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.isAvailable = true; 
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public abstract void roomDetails();

    @Override
    public String toString() {
        return "Room Number: " + roomNumber + ", Price: $" + pricePerNight + " per night, Available: " + (isAvailable ? "Yes" : "No");
    }
}


class StandardRoom extends Room {
    public StandardRoom(int roomNumber, double pricePerNight) {
        super(roomNumber, pricePerNight);
    }

    @Override
    public void roomDetails() {
        System.out.println("Standard Room - Basic amenities.");
    }
}


class DeluxeRoom extends Room {
    public DeluxeRoom(int roomNumber, double pricePerNight) {
        super(roomNumber, pricePerNight);
    }


    public void roomDetails() {
        System.out.println("Deluxe Room - Premium amenities including a mini-bar and jacuzzi.");
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


class Booking {
    private Room room;
    private Customer customer;
    private String checkInDate;
    private String checkOutDate;

    public Booking(Room room, Customer customer, String checkInDate, String checkOutDate) {
        this.room = room;
        this.customer = customer;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public void displayBookingDetails() {
        System.out.println("Booking Details:");
        System.out.println("Customer: " + customer.getName() + " (" + customer.getEmail() + ")");
        System.out.println("Room: " + room);
        System.out.println("Check-in Date: " + checkInDate);
        System.out.println("Check-out Date: " + checkOutDate);
    }
}


class Hotel {
    private List<Room> rooms = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    public Hotel() {
        
        rooms.add(new StandardRoom(101, 100.00));
        rooms.add(new DeluxeRoom(102, 200.00));
        rooms.add(new StandardRoom(103, 100.00));
        rooms.add(new DeluxeRoom(104, 250.00));
    }

    
    public boolean checkRoomAvailability(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
                return true;
            }
        }
        return false;
    }

    public void bookRoom(int roomNumber, Customer customer, String checkInDate, String checkOutDate) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
                room.setAvailability(false);  // Mark the room as unavailable
                Booking booking = new Booking(room, customer, checkInDate, checkOutDate);
                bookings.add(booking);
                System.out.println("Room booked successfully!");
                booking.displayBookingDetails();
                return;
            }
        }
        System.out.println("Sorry, room not available.");
    }


    public void checkOutRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isAvailable()) {
                room.setAvailability(true);  
                System.out.println("Room " + roomNumber + " is now available.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is already available or invalid room number.");
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                room.roomDetails();
                System.out.println(room);
            }
        }
    }
}


public class HotelRoomBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Hotel hotel = new Hotel();

       
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();
        Customer customer = new Customer(name, email);

   
        hotel.displayAvailableRooms();

        
        System.out.print("Enter room number to book: ");
        int roomNumberToBook = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter check-in date (dd/mm/yyyy): ");
        String checkInDate = scanner.nextLine();
        System.out.print("Enter check-out date (dd/mm/yyyy): ");
        String checkOutDate = scanner.nextLine();
        hotel.bookRoom(roomNumberToBook, customer, checkInDate, checkOutDate);


        hotel.displayAvailableRooms();


        System.out.print("Enter room number to check-out: ");
        int roomNumberToCheckOut = scanner.nextInt();
        hotel.checkOutRoom(roomNumberToCheckOut);

        
        hotel.displayAvailableRooms();
    }
}
