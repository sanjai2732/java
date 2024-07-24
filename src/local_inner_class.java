class outer1{
    void outer_display1(){
        class localClass{
            int a=10;
            void localDisplay(){
                System.out.println("local :"+a);
            }

        }
        localClass i=new localClass();
        i.localDisplay();

    }

}




public class local_inner_class {
    public static void main(String[]args){
        outer o=new outer();
        o.outer_display();

    }
}
