 class rectangle{
    int length,width;
     void details (int x,int y){
        length=x;
        width=y;
    }
    int area(){
        int a=length*width;
        return a;
    }

}
public class class_object {
    public static void main(String[]args){
        rectangle o1=new rectangle();
        o1.details(10,20);
        System.out.println(o1.area());
        rectangle o2=new rectangle();
        o2.length=10;
        o2.width=40;
        System.out.println(o2.area());


    }
}
