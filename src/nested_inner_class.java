
class outer{
    int a=1;
    class inner{
        int b=2;
        void inner_display(){
            System.out.println("a:"+a);//calling outer variable
            System.out.println("b"+b);//         inner variable
        }
    }
    void outer_display(){
        inner i=new inner();
        System.out.println("inner b is display outer_display method :"+i.b);
    }
}





public class nested_inner_class {
    public static void main(String[]args){
        outer o=new outer();
        o.outer_display();
        outer.inner i=new outer().new inner();
        i.inner_display();

    }
}
