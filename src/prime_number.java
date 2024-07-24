import java.util.Scanner;
public class prime_number {
    // find prime number or not.
    /*   if number is  %module by 1 and same number is equal 0  .The 0 count is two it is  prime number*/
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=in.nextInt();//5
        int count=0;
        for(int i=1;i<=n;i++){//1<=5 ,2<=5
            if(n%i==0){   //5%1=0 , 5%2=1 ,5%3=1,5%4=1,5%5=0
                count++;  //1             +         1  =2
            }
        }
        if(count==2){//2==2
            System.out.print(n+"is a prime number");
        }else{
            System.out.print(n+"is not  a prime number");
        }



    }
}
