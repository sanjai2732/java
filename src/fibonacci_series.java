import java.util.Scanner;
class fabonacci_serise{ //n=5  0,1,1,2,3,5
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=in.nextInt();
        int a=-1,b=1,c;
        for(int i=0;i<=n;i++){              //n=5
            c=a+b;                        //-1+1=0  ,1+0=1 ,1+0=1
            System.out.println(c);        //0  ,1 ,1
            a=b;                          //a=1 ,a=0 a=1
            b=c;                         //b=0  b=1 b=1
        }



    }


}