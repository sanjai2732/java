import java.util.Scanner;
public class decimal_to_binary {
    public static void binary(int n){// 12
        int binaryIndex[]=new int[1000];//created array memory
        int i=0;//index starting
        while(n>0){//12>0 6>0  3>0
            binaryIndex[i]=n%2;//index[0]=12%2=0 6%2=0 3%2=1 1%2=1   0 0 1 1
            n=n/2;//12/=6/2=3/2=1
            i++;//index [1] [2] [3]
        }
        for(int j=i-1;j>=0;j--){ // 0011  use to revers the 1100   // j=4-1=3 ;3>=0
            System.out.print(binaryIndex[j]);// binaryIndex[3]=1


        }


    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the decimal Number: ");
        int n=in.nextInt();
        System.out.println("Decimal no:"+n);//12
        System.out.print("binary no:");
        binary(n);
    }
}
