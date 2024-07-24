import java.util.Scanner;

class dowhile{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=0;//initialization
        do{
            System.out.println(i);
            i+=3;             //update
        }while(i<=n);       //condition
    }
}