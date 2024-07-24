import java.util.Scanner;
class statement {
    public static void main(String []args){
        int year;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the Year");
        year=in.nextInt();
        //if else statemant   leap year
        if(year%4==0 || (year%100==0 && year%400==0)){
            System.out.println("leap "+year);
        }
        else{
            System.out.println("not leap"+year);
        }
    }
}
