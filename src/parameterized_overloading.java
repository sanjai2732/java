//constructor default,parameterized & Overloading
class shape_rec{
    float length,width;
    shape_rec(){        //default constructor
        length=10;
        width=20;
    }
   public shape_rec(float x,float y){   //parameterized constructor
        length=x;
        width=y;
    }
    public shape_rec(float x){
        length=width=x;
    }
    float area(){
        return length*width;
    }


}


public class parameterized_overloading {
    public static void main(String[]args){
        shape_rec o1=new shape_rec();
        System.out.println("Default Constructor: "+o1.area());

        shape_rec o2=new shape_rec(20,20);
        System.out.println("parameterized Constructor: "+o2.area());

        shape_rec o3=new shape_rec(20);
        System.out.println(" Constructor overloading: "+o3.area());




    }
}
