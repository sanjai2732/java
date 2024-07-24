package busReservation;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class booking {
    String userName;
    int busNo;
    Date date;

    booking() {
        Scanner in = new Scanner(System.in);
        //user name
        System.out.print("Enter the name: ");
        userName = in.next();
        //bus number
        System.out.print("Enter the busNo: ");
        busNo = in.nextInt();
        //date
        System.out.print("Enter the date (dd-mm-yyyy): ");
        String dateInput = in.next();// string to date conversion using SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isAvailable(ArrayList<booking> bookings, ArrayList<bus> buses) {
        int capacity = 0;
        for (bus bus : buses) {
            if(bus.getBusNo()==busNo){
                capacity=bus.getCapacity();
            }
        }
        int booked=0;
        for(booking b:bookings){
            if(b.busNo==busNo && b.date.equals(date)){
                booked++;
            }

        }
        return booked<capacity?true:false;
    }
}
