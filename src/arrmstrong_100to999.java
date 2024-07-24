public class arrmstrong_100to999 {
    public static void main(String[]args){
        //write the program  armstrong number in 100 to 999.
        int d1,d2,d3,temp,result;
        for(int number=100;number<=999;number++){
            temp=number;
            d3=temp%10;//100%10=0
            temp=temp/10;//100/10=10

            d2=temp%10;//10%10=0
            temp=temp/10;//10/10=1

            d1=temp%10;//1%10

            result=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
            if(number==result){
                System.out.println(number+"it is Armstrong number");

            }





        }


    }
}
