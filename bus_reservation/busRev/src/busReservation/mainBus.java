package busReservation;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;


public class mainBus {
    public static void main(String[] args) {
        ArrayList<bus> buses=new ArrayList<bus>();  //collection of bus
        ArrayList<booking> bookings=new ArrayList<booking>();


        buses.add(new bus(1,true,2));
        buses.add(new bus(2,false,55));
        buses.add(new bus(3,true,55));


        int userIn = 1;
        Scanner in = new Scanner(System.in);
        for(bus b:buses){
            b.displayBus();
        }
        while (userIn == 1) {
            System.out.println("Enter 1 to booking and 2 to exit ");
            userIn = in.nextInt();
            if (userIn == 1) {
                booking book=new booking();
                if(book.isAvailable(bookings,buses)){
                    bookings.add(book);
                    System.out.println("Your booking is  confirmed ");
                }
                else {
                    System.out.println("Sorry. Bus is full.you can  change a date are bus ");
                }
            }
        }

    }
}