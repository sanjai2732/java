class user{
    int age;String name;
    public user(int a,String n){
        this.age=a;
        this.name=n;
    }
    void display(){  //Method overriding
        System.out.println("user Age "+age);
        System.out.println("user Name "+name);
    }
}
class main_class extends user{
    String com_Name;
    public main_class(int b,String c,String cn){
        super(b,c);         //"super" is a keyword constructor pass to main class
        this.com_Name=cn;
    }
    void display(){                 //Method overriding
        System.out.println("user Age "+age);
        System.out.println("user Name "+name);
        System.out.println("user companyName "+com_Name);
    }
}


public class method_overriding {
    public  static void main(String[]args){
        main_class o=new main_class(20,"Sanjai","SS27");
        o.display();

    }
}
