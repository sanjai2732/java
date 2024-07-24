//Hierarchical inheritance
class parameters{       // base
    int length,radius,breath;
}
class rectangle1 extends parameters{
    public rectangle1(int l,int b){
        length=l;
        breath=b;
    }
    int shape_rec(){
        return length*breath;
    }

}
class circle extends parameters{
    public circle(int r){
        radius=r;
    }
    int area(){
        return (int) (radius*Math.PI);
    }
}
class square extends parameters{
    public square(int l){
        length=l;
    }
    int square_area(){
        return length*length;

    }
}

public class hierarchical_inheritances {
    public static void main(String[]arg){
        rectangle1 r=new rectangle1(20,10);
        System.out.println("Rectangle: "+r.shape_rec());

        square a=new square(20);
        System.out.println("Square area:"+a.square_area());

        circle c=new circle(40);
        System.out.println("Area of the circle:"+c.area());

    }

}
