package BUS_RESERVATION;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
    String passengername;
    int busno;
    Date date;
    Booking() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of passenger:");
        passengername=sc.next();
        System.out.println("Enter Bus Number:");
        busno=sc.nextInt();
        System.out.println("Enter Date: dd-mm-yyyy");
        String dateInp=sc.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(dateInp);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses) {
        int capacity=0;
        for(Bus bus:buses) {
            if(bus.getBusno() == busno) {
                capacity=bus.getCapacity();
            }
        }
        int booked=0;
        for(Booking b:bookings) {
            if(b.busno==busno && b.date.equals(date)) booked++;
        }
        return (booked<capacity);
    }
}
