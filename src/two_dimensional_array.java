import java.util.Arrays;
import java.util.Scanner;

public class two_dimensional_array {
    // two-dimensional Array
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*  j  0    1    2    3
         *   i
         *   0  10  20   30   40
         *
         *   1  50  60   70   80
         *
         *   2  90  10   10   10
         *  3X4 matrix  i=row  j=column
         * */

        int a[][] = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 10, 10, 10}};
        for (int i = 0; i < 3; i++) {  // row      0<3
            for (int j = 0; j < 4; j++) {//column  0<4         1<4        2<4          3<4
                System.out.print(" " + a[i][j]);  // [0][0]=10   [0][1]=20  [0][2]=30   [0][3]=40
            }
            System.out.println();// go to next line

        }
    }
}