public class opertors {
    public static void main (String []args){
        //arithematic
        int a=20,b=10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //assigment += -= *= /= %= >> <<
        System.out.println(a+=1);

        //logical && ||

        int m1=35,m2=10;
        System.out.println("logical &&:"+(m1<=35 && m2>=35)); //both value are true ans is TRUE
        System.out.println("logical ||:"+(m1<=35 || m2>=35)); //any one value is true ans is TRUE


        //bitwise AND:"&" ,OR:"|", XOR: "^",NOT:"~"

        //4=0100   2=0010
        int c=4,d=2;
        // 4=0100       2=0010          AND:1=1    OR
        System.out.println(c&d);
        System.out.println(c|d);
        System.out.println(c^d);
        System.out.println(~d);

        //ternary  ?:
        String f=c<d?"yes":"no";
        System.out.println(f);

        //unary ++ --

        int i=10;
        System.out.println(i);
        System.out.println(i++);
        // L shape program will be run i++  suffix store the value
        System.out.println(i);
        //but prefix can not be store
        System.out.println(++i);





        //












    }

}
