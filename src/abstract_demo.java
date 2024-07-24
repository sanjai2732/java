abstract class mobile{
    public void voice_call(){
        System.out.println("google voice call");
    }
    abstract void camera();
    abstract void display();
}
class redmi extends mobile {
    void camera() {
        System.out.println("20MP");

    }
    void display() {
        System.out.println("7 inc ");
    }
}
class mi extends mobile{
    void camera(){
        System.out.println("108MP");
    }
    void display(){
            System.out.println("6.5 inc");

    }
    }
public class abstract_demo {
    public static void main(String[]args){
        redmi o=new redmi();
        o.camera();
        o.voice_call();

        }
    }
