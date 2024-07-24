public class string_lowercase {
    public static void main(String[]args){
        StringBuilder a=new StringBuilder("Sanjai Guru");
        System.out.println("original:"+a);
        int c;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=65 && a.charAt(i)<=90){//S
                c=(int)a.charAt(i)+32;
                a.setCharAt(i,(char)c);
            }
        }
        System.out.println("lower case:"+a);
    }
}
