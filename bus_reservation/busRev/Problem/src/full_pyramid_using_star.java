public class full_pyramid_using_star {
    public static void main (String[]args){
        int n=5,col,row;
        for(row=1;row<=n;row++) {//step4
            for(col=1;col<=n-row;col++){ //step 6
                System.out.print(" ");//step5
            }
            for (col = 1; col <= row; col++) { //step2
                System.out.print("*" + " ");//step1
//                val+=5;
            }
            System.out.println();//step3

        }

        }
    }
