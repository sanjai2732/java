public class patern_3 {
    public static void main(String[]args){

        int n=5;
        for(int row=1;row<=n;row++) {
            for (int col = 1; col <= (n+1)-row; col++) {
                System.out.print("+" + " "); // you will print * , col value , row value
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
         int a=64;
         for (int row=1;row<=n;row++ ) {
             for (int col = 1; col <=(n+1)-row; col++) {
                 System.out.print((char)(a+row) + " ");// you can change row to col
             }
             System.out.println();
         }



    }
}
