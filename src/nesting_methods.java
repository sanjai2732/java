public class nesting_methods {
    public static void main(String[]args){
        demo o=new demo(20,10);
        o.display();
    }
}
class demo {
    private int x, y;

    public demo(int m, int n) {
        x = m;
        y = n;
    }

    int largest() {
        if (x < y)
            return y;
        else
            return x;
    }
    void display(){
        int la=largest();
        System.out.println("The largest number is:"+la);

    }
}