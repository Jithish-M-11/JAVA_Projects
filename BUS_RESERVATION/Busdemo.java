package BUS_RESERVATION;
import java.util.*;
public class Busdemo {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int userval=1;
        while(userval==1) {
            System.out.println("Enter 1 to Booking or 2 to exit");
            userval=sc.nextInt();
            if(userval == 1) {
                System.out.println("Booking......");
            }
        }
        sc.close(); 
    }
    
}
