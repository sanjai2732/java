//Multilevel inheritances
class grandfather{
    public void flat(){
        System.out.println("22 BHA flat");
    }
}
class father1 extends grandfather{
    public void house() {
        System.out.println("2 house");
    }
}
class son1 extends father1{
    public void car(){
        System.out.println("BMW car");
    }
}

public class multilevel_inheritances {
    public static void main(String [] args){
        son1 o=new son1();
        o.flat();
        o.house();
        o.car();

    }

}
