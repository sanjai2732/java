import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=in.nextInt();

        int originalNumber=n,result=0;
        int length=String.valueOf(n).length();
        for (int i=0;i!=n;n/=10){ // i 153
            int remainder=n%10;
            result+=Math.pow(remainder,length);
        }
        if(result==originalNumber){
            System.out.print("Armstrong number");
        }else {
            System.out.print("not Armstrong number");
        }

    }
}
