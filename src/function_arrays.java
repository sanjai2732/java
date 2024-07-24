import java.util.Scanner;
import java.util.Arrays;


public class function_arrays {

    public static int[] sort_array(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the number"+i+":");
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        return a;
    }

    public static void main(String[]arg){
        int a[]=sort_array();
        System.out.println(Arrays.toString(a));


    }
}
