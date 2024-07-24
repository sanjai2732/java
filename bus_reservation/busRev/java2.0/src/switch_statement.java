import java.util.*;
public class switch_statement {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 4://it works  arithmetic operation only
                System.out.println("monday");
                break; //not using break condition it will run on next case also.
            case 1:
                System.out.println("Welcome");
                break;
            default:
                System.out.println("Thank you"); //above the cases are not execute the default value is executed.
        }
    }
}
