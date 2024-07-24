import java.util.Scanner;
class decimal{
    public static void dec(int n){
        int decimal[]=new int[1000];
        int i=0,d,sum=0;//1100
        while (n!=0){//1100
            decimal[i]=n%10;// 0,0,1,1
            n/=10;// 110,11
            i++;
        }for(int j=0;j<decimal.length-1;j++){
            sum+=decimal[j]*Math.pow(2,j);
        }
        System.out.print(sum);
    }
}

public class binary_decimal {
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the binary number");
        int n=in.nextInt();
        System.out.println("Binary:"+n);
        System.out.print("Decimal:");
        decimal.dec(n);

    }
}
