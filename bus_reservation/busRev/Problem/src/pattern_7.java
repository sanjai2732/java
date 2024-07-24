public class pattern_7 {
    public static void main(String[]args){
        int n=5,row,col,v=0,k=0;
        for(row=1;row<=n;row++) {
            for(col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for (col = 1; col <= row+v; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
            v+=1;
        }

    }
}
