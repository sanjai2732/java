import java.util.Scanner;
public class sample {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the Number");
        int n=in.nextInt();
        int temp=n;
        int rem,q,sum=0;
        while (temp!=0){
            rem=temp%10;//153%10  =3
            q=(rem*rem*rem);
            temp=temp/10;//153/10=15
            sum+=q;
        }
        if(sum==n){
            System.out.println("armstrong number");
        }else{
            System.out.println("armstrong not number");
        }

    }
}
