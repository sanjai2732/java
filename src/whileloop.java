import java.util.Scanner;
class whileloop{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = in.nextInt();
        int i=10;       //initialization
        while(i>=n){    //condition
            System.out.println(i);
            i++;      //update
        }
        System.out.println("end");


    }
}