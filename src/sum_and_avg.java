import java.util.Scanner;
class sum_avg{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=in.nextInt();
        int sum=0,a;
        for(int i=0;i<=n;i++){
            System.out.println("Enter the number "+i+" ");
            a=in.nextInt();
            sum+=a;

        }
        System.out.println(" The sum of  given number"+n+" is:" +sum);

        System.out.println(" The sum of average "+n+"is " +sum/n);


    }
}

