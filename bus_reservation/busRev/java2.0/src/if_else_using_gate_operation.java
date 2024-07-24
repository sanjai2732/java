import java.util.Scanner;

public class if_else_using_gate_operation {
    public static void main (String[]args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=in.nextInt();
        if(a>=10 && a<15){
            System.out.println(a+" if");

        }
        else if(a>15 || a<=20){
            System.out.println(a+" elseif");
        }
    }
}
