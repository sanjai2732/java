import java.util.Scanner;
import java.util.Arrays;
public class insert_arrays {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n,input,index,value;
        System.out.println("enter the index limit:");
        n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("enter the value"+i+": ");
            input=in.nextInt();
            a[i]=a[i]+input;

        }
        System.out.println("before insert:"+Arrays.toString(a));
        System.out.println("Enter the index no:");
        index=in.nextInt();
        System.out.println("Enter the index value:");
        value=in.nextInt();
        for(int i=a.length-1;i>index;i--){
            a[i]=a[i-1];
        }
        a[index]=value;
        System.out.println("After insert:"+Arrays.toString(a));

    }
}
