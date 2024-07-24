package bus_res;
import java.util.Scanner;

public class busDemo {
    public static void main(String[]args){
        int userOpt=1;
        Scanner in =new Scanner(System.in);
        while (userOpt==1) {
            System.out.println("Enter 1 to book and 2 to exit.");
            userOpt=in.nextInt();
            if(userOpt==1){
                System.out.println("Booking.....");
            }
        }
    }
}
