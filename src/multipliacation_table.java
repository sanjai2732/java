import java.util.Scanner;
public class multipliacation_table {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the table ");
        int t=in.nextInt();
        System.out.println("Enter the limit");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(t+"X"+i+"="+(t*i));
        }

    }
}

