import java.util.Arrays;
public class insert_element_using_arrays {
    public static void main(String[]args){
        //program to insert the element to specific index of an array:-

        /*     before:  index 0   1   2   3   4   5            after insert the index :2            0  1  2  3  4  5
                        value 10 20  30  40  50   60                            value: 35           10 20 35 30 40 50
         */

        int a[]={10,20,30,40,50};
        System.out.println("before insert:"+Arrays.toString(a));
        int index=2;
        int value=35;
        for(int i=a.length-1;i>index;i--){  // i=4 is the total index value 0 1 2 3 4 ; 4>2 3>2  2>2 false
            a[i]=a[i-1];//4 = 3  ;3=2
        }
        a[index]=value;//a[2]=35;
        System.out.println("after insert:"+Arrays.toString(a));

    }
}
