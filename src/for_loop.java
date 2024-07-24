import java.util.Scanner;
class for_loop{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=in.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println("*");
        }
    }
}