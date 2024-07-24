import java.util.Scanner;
 class armstrong_no {
     // 3 digit  armstrong or  not
     public static void main(String []args){
         Scanner in=new Scanner(System.in);
         System.out.print("Enter the number:"); //153
         int no=in.nextInt();
         int temp=no;//153
         int digit1,digit2,digit3;

         digit3=temp%10; //153%10 =3
         temp=digit3/10; //15

         digit2=temp%10;//15%10 =5
         temp=digit2/10;  //1

         digit1=temp%10;//1%10 =1

         int result=(digit3*digit3*digit3)+(digit2*digit2*digit2)+(digit1*digit1*digit1);

         if(no==result){
             System.out.print(no+ "is  armstrong number");
         }else {
             System.out.print(no+ "is  not armstrong number");
         }


     }


}
