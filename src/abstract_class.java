abstract class shape{
    abstract void message();
    void display(){
        System.out.println("This is rectangle shape");
    }
}
class area extends shape{

    @Override
    void message() {
        System.out.println("0");
    }

}

public class abstract_class {
    public static void main(String[]args){
        area a=new area();
        a.message();
        a.display();

    }
}
