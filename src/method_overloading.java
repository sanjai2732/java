public class method_overloading {
    public static int multiple(int m){
        return m*m;
    }
    public static int multiple(int m,int a){
        return m*a;
    }
    public static double multiple(double d){
        return d*d;
    }
    public static double multiple(double m,int f){
        return m*f;
    }

    public static void main(String [] arg){
        System.out.println(multiple(2));
        System.out.println(multiple( 3.300000000000));
        System.out.println(multiple(3.0,3));
        System.out.println(multiple(2,7));


    }
}
