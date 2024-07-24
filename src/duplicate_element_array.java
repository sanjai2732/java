import java.util.Scanner;
import java.util.Arrays;
public class duplicate_element_array {
    public static void main(String[]args){
        //write a program to the duplicate element in an array
        int a[]={1,2,4,2,5,4,5};  // one value is repeated  in  an array  2,4,5 these are duplicate.
        for(int i=0;i<a.length;i++){ //0<7
            for(int j=1+i;j<a.length;j++){//1<7
                if (a[i]==a[j] && i!=j){//1==2 && i=0 != j=1
                    System.out.println("Duplicate element:"+a[j]);

                }


            }
        }

    }
}
