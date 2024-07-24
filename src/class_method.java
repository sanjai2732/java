public class class_method {
    public static void main(String[]args){
        ret o1=new ret();
        o1.length=10;
        o1.width=20;
        System.out.println("Area of the rectangle :"+o1.area());

        ret o2=new ret();
        o2.get_area(20,30);
        System.out.println("Area of the rectangle :"+o2.area());


    }
}
class ret{
    int length,width;  //global
    void get_area(int x,int y){ //not return method
         length=x;
         width=y;
    }
    int area(){               //return method
        int a=length*width;
        return a;
    }


}
