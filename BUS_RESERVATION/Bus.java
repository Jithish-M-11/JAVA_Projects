package BUS_RESERVATION;
//import java.util.*;
public class Bus {
    private int busno;
    private boolean AC;
    private int capacity ; //get and set
    Bus(int busno,boolean AC,int capacity) {
        this.busno=busno;
        this.AC=AC;
        this.capacity=capacity;
    }

    public int getCapacity() {  
        return capacity;
    }
    public void setCapacity(int cap) { 
        this.capacity=cap;
    }
    
    public boolean getAc() {  
        return AC;
    }
    public void setAc(boolean cap) { 
        this.AC=cap;
    }

    public int getBusno() {  
        return busno;
    }
    public void displayBusInfo(){
        System.out.println("Bus No:" +busno+" AC:" +AC+" Total Capacity:"+capacity);
    }
    
}
