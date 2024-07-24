import java.util.Scanner;
class nestedif {
    public static void main(String[] args) {
        /*

        Nested if statement
        A company insures its drivers in the following cases:
           1.if the driver is married.
           2.if the driver is unmarried,male & above 30 year of age.
           3.if the driver is unmarried,female & above 25 year of age.

        */
        Scanner in=new Scanner(System.in);
        System.out.println("Enter married 'M' or unmarried 'U'");
        char marriage=in.next().charAt(0);

        if(marriage=='u' ||  marriage=='U' ){
            System.out.println(" male 'M' or female' F' ");
            char g=in.next().charAt(0);
            System.out.println(" enter your age ");
            int age=in.nextInt();
            if(g=='M'|| g=='m' && age>=30){
                System.out.println("Your are eligible for insures");
            }
            else if(g=='f' || g=='F' && age>25){
                System.out.println("Your are eligible for insures");

            }

        }
        else if(marriage=='m' || marriage=='M'){
            System.out.println("Your are eligible for insures");
        }
        else{
            System.out.println(" incorrect  input ");
        }




    }
}
