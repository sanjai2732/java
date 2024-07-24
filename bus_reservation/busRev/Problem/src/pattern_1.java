public class pattern_1 {
    public static void main(String[]args){
        //1.what is the question
        //2. What many times to print the value
        for (int row=1;row<=5;row++) { // step 4 to change the row
            for (int col = 1; col <= 5; col++) { //step 2 no of col to print
                System.out.print("*" + " ");//step 1
            }
            System.out.println();//step 3  go to next line
        }
    }
}
