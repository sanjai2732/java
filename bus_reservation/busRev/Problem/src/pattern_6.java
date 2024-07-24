public class pattern_6 {
    public static void main(String[]args){
        int val=4;
        for(int i=1;i<=3;i++){ // step 4          i=1 t
            for (int j=1;j<=3;j++){//step 2       1<3
                System.out.print(val+" ");//step 1       1  2  3
                val+=4; // step 5  2
            }
            System.out.println(); //step 3
        }

        }
    }
