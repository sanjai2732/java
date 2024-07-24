
public class java_Method {
    //recursion  using factorial
    public static int method1(int n) {// 5 4 3 2 1
        if(n==0 ||n==1){
            return 1;
        }
        return n*method1(n-1);
    }
    public static void main(String[]args){
      int result=method1(5);
      System.out.print(result);
    }
}
