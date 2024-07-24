public class string_uppercase {
    public static void main(String[]args){
        // String convented into upper case  without using uppercase function.
        StringBuilder a=new StringBuilder("Sanjai guru");
        System.out.println(a);
        int c;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=97 && a.charAt(i)<=122){//97 to 122 is a lowercase a to z so "-32"   example=a value is 97-32=65 it Upper case of "A".
                c=(int)a.charAt(i)-32;// a character are store in c, c is casing in character to integer.
                a.setCharAt(i,(char)c);//setCharAt is give the (index no:1,push the value:A)
            }
        }
        System.out.println(a);

    }
}
