interface interface_demo{
    int a=20;//      static & final value
    public abstract void fun1();
    public static void fun3(){  //using static key word for interface
        System.out.println("fun3");
    }
    default void fun2(){
        System.out.println("fun2");
    }
}
interface interface1 extends interface_demo{
    void fun4();
}
class testinterface implements interface1{

    @Override
    public void fun1() {
        System.out.println("fun1");
    }

    @Override
    public void fun4() {
        System.out.println("fun4");

    }
}






public class interface_methods {
    public static void main(String[]args){
        System.out.println("A :"+interface1.a);
        interface_demo.fun3();

    }
}
