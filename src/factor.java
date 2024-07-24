import java.util.Scanner;
class factor{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int n=in.nextInt();     //5
        for(int i=1;i<=n;i++){  //1<=5  T
            if(n%i==0){//5%1=0  T
                System.out.print(i+" "); //1
            }
        }

    }
}