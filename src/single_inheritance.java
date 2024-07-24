class father{     //base class
    public void house(){
        System.out.println("father house");
    }
}
class son extends father{ //derived class  inheritance key word is "extends"
    public void car(){
        System.out.println("son car");
    }
}



public class single_inheritance {
    public static void main(String[]args){
        son o=new son();
        o.car();
        o.house();
    }
}
