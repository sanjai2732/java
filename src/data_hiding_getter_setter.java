class shape_rectangle{
    private int length,width;
    //Getter
    int get_length(){
        return length;
    }
    int get_width(){
        return width;
    }
    void set_length(int l){
        if(l>0)
            length=l;
        else
            length=0;
    }
    void set_width(int w){
        if(w>0)
            width=w;
        else
            width=0;
    }
    int area(){
        int a=length*width;
        return a;
    }
}

public class data_hiding_getter_setter {
    public static void main(String[]args){
        shape_rectangle o=new shape_rectangle();
        o.set_length(10);
        o.set_width(40);
        System.out.println(o.area());

        shape_rectangle o1=new shape_rectangle();
        o1.set_length(-10);
        o1.set_width(60);
        System.out.println("Length :"+o1.get_length());
        System.out.println("Width :"+o1.get_width());
        System.out.println("Area of rectangle :"+o1.area());

    }
}
