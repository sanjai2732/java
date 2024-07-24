import java.util.Scanner;
class method{
    /*public is the access modifier.
     void is no return type.
      addition is class name.*/
    public void addition(){ // No return type ,without argument
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("Addition: "+(a+b));
    }

    public void subtraction(int a,int b){//No return type ,with argument
        System.out.println("Subtraction :"+(a-b));

    }
    public int multiplication(){ //return type ,without argument
        int a=10,b=20;
        return a*b;

    }
    public double division(double a,double b){
        System.out.println("Division:"+(a/b));
        return a/b;
    }
}



public class function {
    public static void main(String[]args){
        method o=new method();
        o.addition();
        o.subtraction(20,10);
        System.out.println("Multiplication :"+o.multiplication());
        o.division(25,5);
    }
}
