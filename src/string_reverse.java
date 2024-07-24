public class string_reverse {
    public static void main(String[]args){
        StringBuilder a=new StringBuilder("Sanjai guru s");
        System.out.println(a);
        StringBuilder b=new StringBuilder();
        for(int i=a.length()-1;i>=0;i--){//i=13-1=12 it indexes number , up to 0 index
            b.append(a.charAt(i));// a.charAt(12)=S  is append on b ,11 is 'space' add on back,
        }
        System.out.println(b);

    }
}
