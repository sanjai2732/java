//copy constructor
class complex{
    private  int real,img;

    public complex(){  //default constructor
        this.real=0;
        this.img=0;

    }
    public complex( complex o){  // copy constructor
        this.real=o.real;
        this.img=o.img;
    }

    public complex(int r,int i){ //parameterized constructor
        this.real=r;
        this.img=i;
    }

    public String toString(){    // toString is  inbuilt function use to return a string
        return "("+real+"+"+img+"i"+")";
    }
}





public class copy_constructor {
    public static void main(String[]args){
        complex o=new complex(30,3);
        System.out.println(o);

        complex o1=new complex();
        System.out.println(o1);

        complex o3=new complex(o);
        System.out.println(o3);


    }
}
