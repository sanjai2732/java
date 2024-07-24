import java.util.Scanner;
public class prefect_number {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){//6
            if(n%i==0){//6%1=0  6%2=0 6%3=0 6%6=0
                sum=sum+i;//sum=1+2+3
            }
        } sum=sum-n;
        if(sum==n){
            System.out.println(n+"is the perfect number");
        }else{
            System.out.println(n+"is the not a perfect number");
        }
    }
}
