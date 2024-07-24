import java.util.Scanner;

public class pattern {
    public static void main(String []args){
        int n,i,j,m;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        n=in.nextInt();
        m=(n+1)/2;//find the  middle number of the odd number

        for(i=1;i<=n;i++){//row
            for (j=1;j<=n;j++){ //column
                if(i==j){            //main
                    if(i<m){
                        System.out.print(n-i+1); //below middle number
                    }
                    else{
                        System.out.print(i);
                    }
                }
                else if (j+i==n+1) {
                    if(i<m){
                        System.out.print(i);// row
                    }
                    else {
                        System.out.print(j);//column
                    }
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }

}

