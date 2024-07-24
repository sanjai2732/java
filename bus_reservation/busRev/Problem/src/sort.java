import java.util.Scanner;

public class sort {
    public  static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=in.nextInt();
        System.out.print("Enter the count in the number:");
        int l=in.nextInt();
        for(int i=0;i<l;i++){
            System.out.println(n);
            n*=2;
        }

        }
    }
