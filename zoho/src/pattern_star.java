import java.util.Scanner;
import java.util.*;

public class pattern_star {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number row");
        int a=in.nextInt();
        for(int i=1;i<=a;i++){//i=1 1<5
            for(int j=1;j<=i;j++){//j=1 1<=1
                System.out.print(j);//1
            }
            System.out.println("");

        }

    }
}
