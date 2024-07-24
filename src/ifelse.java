import java.util.Scanner;
class ifelse{
    public static void main(String[]args){
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        if(n%2==0 && n>=2 && n<=5 && n<20){
            System.out.println("Not Weird");
        }
        else if(n%2==0 && n<=6 && n>=20){
            System.out.println("Weird");
        }
        else{
            System.out.println("weird");
        }

    }
}