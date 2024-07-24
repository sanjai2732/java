public class jagged_array {
    public static void main(String[]args){
        // j          0            1             3
        int a[][]={{10,20,30},{40,50,60,70},{80,90,100}};
        //Number of column(j) is different it the jagged arrays.
        for(int i=0;i<a.length;i++){ //  i is a row  0<3
            for(int j=0;j<a[i].length;j++){  // j is a column 0<3
                System.out.print(" "+a[i][j]);// [0][0]=10
            }
            System.out.println();
        }
    }
}
