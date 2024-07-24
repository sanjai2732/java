interface mobile_1{
    void display_1();
    void camera_1();
}
interface car{
    void model();
    void year();
}
class redmi_1 implements mobile_1,car{

    @Override
    public void display_1() {
        System.out.println("15 inch");

    }

    @Override
    public void camera_1() {
        System.out.println("4 camera ");

    }

    @Override
    public void model() {
        System.out.println("ev mi");

    }

    @Override
    public void year() {
        System.out.println("2024");

    }
}

public class interface_implement {
    public static void main(String[]args){
        redmi r=new redmi();
        r.display();

    }
}
