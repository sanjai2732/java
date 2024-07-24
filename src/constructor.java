class rect{
    int length,width;
    rect(){            //constructor  class name and constructor name is same , not using private
        length=20;
        width=40;
    }
    int area(){
        int a=length*width;
        return a;
    }

}
public class constructor {
    public static void main(String[]args){
        rect o1=new rect();
        System.out.println(o1.area());

    }

}
