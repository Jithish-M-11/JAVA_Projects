package BUS_RESERVATION;

import java.util.ArrayList;
import java.util.Scanner;

public class Busdemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>(); // Creating for Bus Management
        ArrayList<Booking> bookings = new ArrayList<>(); // Creating for passenger booking Management

        buses.add(new Bus(1, false, 54));
        buses.add(new Bus(2, true, 2));
        buses.add(new Bus(3, false, 114));

        for (Bus b : buses) {
            b.displayBusInfo();
        }

        Scanner sc = new Scanner(System.in);
        int userval = 1;

        while (true) {
            System.out.println("Enter 1 to Book or 2 to Exit");
            if (sc.hasNextInt()) {
                userval = sc.nextInt();
                if (userval == 1) {
                    Booking booking = new Booking();
                    if (booking.isAvailable(bookings, buses)) {
                        System.out.println("Your Booking is confirmed");
                        bookings.add(booking);
                    } else {
                        System.out.println("Sorry!! Bus is full. Try another Bus or Date");
                    }
                } else if (userval == 2) {
                    System.out.println("Thank you for Booking");
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 1 to Book or 2 to Exit");
                }
            } else {
                System.out.println("Invalid input. Please enter 1 to Book or 2 to Exit");
                sc.nextLine(); // Clear the invalid input
            }
        }
        sc.close();
    }
}
