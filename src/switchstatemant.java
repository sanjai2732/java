import java.util.Scanner;
class switchstatemant{
    public static void main(String []args){
        int a,b,c,ch;
        Scanner in=new Scanner(System.in);
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        ch=in.nextInt();
        System.out.println("Enter two number");
        switch(ch){
            case 1:
                a=in.nextInt();
                b=in.nextInt();
                System.out.println("addition"+(c=a+b));
                break;
            case 2:
                a=in.nextInt();
                b=in.nextInt();
                System.out.println("Subtraction"+(c=a-b));
                break;
            case 3:
                a=in.nextInt();
                b=in.nextInt();
                System.out.println(".Multiplication"+(c=a*b));
                break;
            case 4:
                a=in.nextInt();
                b=in.nextInt();
                System.out.println("Division"+(c=a/b));
                break;
            default:

                System.out.println("invalid input");


        }

    }
}