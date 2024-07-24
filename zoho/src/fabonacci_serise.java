import java.util.Scanner;

public class fabonacci_serise {
    //n=5    0,1,1,2,3,5,8
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the limit");
        int n=in.nextInt();
        int a=-1,b=1,c;
        for(int i=0;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
