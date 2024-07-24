import java.util.Scanner;
class reverse{  //reverse number
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int reverse=0,rem;
        while(n!=0){ //n=123  n=12
            rem=n%10;//123%10=3    12%10 =2
            reverse=(reverse*10)+rem; //0*123=0+3 ;  reverse=3  *10=30+2=32 *10=320+1=321
            n=n/10;  //123/10   =12  /10  =1 /10
        }
        System.out.println(reverse);
    }
}