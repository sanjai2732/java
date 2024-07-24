
public class method_varargs {
    public static void getName(String... name){
        for(String names:name){
            System.out.println(names);
        }

    }


    public static void main(String [] arg){
        getName("sanjai","guru","ram");

    }
}
