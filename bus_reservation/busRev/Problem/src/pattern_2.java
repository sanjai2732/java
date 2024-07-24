public class pattern_2 {
    public static void main(String[]args){
        for(int row =1;row<=5;row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("+" + " "); // you println "*, or ,row value or, col value"
            }
            System.out.println();
        }
    }
}
