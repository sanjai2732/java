import java.util.Scanner;
public class strong_number {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();//145
        int temp=n;
        int rem,i,fact,sum=0;
        while(temp>0){//145>0
            rem=temp%10;//145%10=5
            fact=1;
            for(i=1;i<=rem;i++){//1<=5
                fact=fact*i;//1*1=1
            }
            sum+=fact;
            temp=temp/10;//145/10=14
        }
       if(sum==n){
           System.out.println(n+"strong number");
       }else{
           System.out.println(n+" not strong number");
       }


        }


    }

