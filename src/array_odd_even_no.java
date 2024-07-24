import java.util.Scanner;
public class array_odd_even_no {
    public static void main(String[] args) {
        int e=0,o=0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the limit");
        int n=in.nextInt();//5
        int a[]=new int[n];//memory allocation int[5]
        for(int i=0;i<a.length;i++) {
            System.out.println("enter the " + i + " ");
            a[i] = in.nextInt();
            if(a[i]%2==0){
                e++;
            }else{
                o++;
            }
        }
        System.out.println("Number of even in the array is" +e);
        System.out.println("Number of odd in the array is" +o);



    }
}

