import java.util.Scanner;
public class array {
    public static void main(String []args){

        //access the array
        int a[]={1,2,3,4,5,6,7};
        System.out.println(a[0]);//index staring 0

        int b[]=new int[10];//memory allocation using for loop
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        // using Scanner class
        int []c;
        c=new int[10];
        for(int i=0;i<3;i++){
            Scanner in=new Scanner(System.in);
            System.out.println("enter the no");
            c[i]=in.nextInt();

        }
        // access the enhance for loop
        for(int element :c){
            System.out.println(element);
        }

    }
}
