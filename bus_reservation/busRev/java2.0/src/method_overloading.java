public class method_overloading { // same method name but different  parameter
     static void method1(int n){  //int
         System.out.println("integer:"+n);
    }
    static void method1(String n,int o){  //string and int
        System.out.println("String: "+n+" integer: "+o);
    }
    static void method1(String n){//only string
        System.out.println("String: "+n);

    }
    public static void main(String[]args){
         method1(5);
         method1("5",5);
         method1(5);
    }
}
