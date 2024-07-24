public class operators {
    public static void main (String[]args){
        int x=100+1;
        System.out.println(x);
        int y=200-211;
        System.out.println(y);
        int z=399/10;
        System.out.println(z/10);
        int a=399%10;
        System.out.println(a);
        int in=+a*10;
        System.out.println(in);
        //left shift
        int b=1;//0001   //8 4 2 1
        int c=1;//1
        System.out.println(b<<c);// 0001<<1 is add 00010 left shift add 0 in the back
        int d=4; //0100
        int e=2;
        System.out.println(d<<e);//010000 -->16         32,[16],8,4,2,1  is 1 in 16 position. this ans is 16
        // Right shift
        int i=1;//0001
        int j=2;
        System.out.println(i>>j);//0001 it  is 00.01  the 01 is removed ans is 00
        i=8;
        System.out.println(i>>2);//1000   10 ans is 2
        System.out.println("--------------------------------------------");
        for(int k=10;k>=1;k--){//10  1010      16 8 4 2 1 = 16+4=22
            int s=+ k<<1; //1010  10100
            if(s%4==0){
                System.out.println(s);
            }
            if(s%10==0){
                System.out.println(s+"is divided by 10");
            }
        }
    }
}
