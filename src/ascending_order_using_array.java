import java.util.Arrays;
public class ascending_order_using_array {
    public static void main(String[]args){
        int a[]={10,20,3,4,9,1};//6
        System.out.println("before sorted:"+Arrays.toString(a)); //easy way to call Arrays
        int temp;
        for(int i=0;i<a.length;i++){//0<6
            for(int j=i+1;j<a.length;j++){//1<6
                if (a[i]<a[j]){//descending order <  //10<20
                    temp=a[i];//temp=10
                    a[i]=a[j];//10=20
                    a[j]=temp;//20=10
                }

            }
        }
        System.out.println("After shorted:"+Arrays.toString(a));
    }
}
