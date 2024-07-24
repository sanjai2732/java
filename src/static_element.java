
import java.util.Scanner;
class mathematical{
    public static int power(int base,int power){
        int result=1;
        for(int i=1;i<=power;i++){//1<=3
            result*=base;//1=*2 =4 =8
        }
        return result;
    }

}


public class static_element {
    public static void main(String[]args){
        int a=mathematical.power(2,3);
        System.out.println("power:"+a);

    }
}

