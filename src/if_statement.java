import java.util.Scanner;
class if_statement{
    public static void main(String[]args){
        int age;
        Scanner in = new Scanner(System.in);
        age=in.nextInt();
        if(age>=18){
            System.out.println("you are eligible for vote");
        }

    }
}
