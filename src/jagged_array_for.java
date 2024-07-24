public class jagged_array_for {
    public static void main(String[]args){
        int a[][]={{10,20,30},
                   {40,50,60,70},
                   {80,90,100}};
        // using enhance for loop in jagged Array.
        for(int k[]:a){// k[]=a  k=10,20,30
            for(int l:k){//
                System.out.print("   "+l);
            }
            System.out.println();
        }
    }
}
