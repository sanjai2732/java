public class pattern_8 {
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");//space
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(i);
            }

            System.out.println();

        }

    }
}
