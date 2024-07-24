import java.lang.String;
public class string_buffer_bulider {
    public static void main(String[]args){
         // string buffer and string bulider in java .
        /*
        * string buffer  and string bulider is mutable.
        * both are manipulated method.
        * string buffer is thread save ,but string builder is  "not" thread save.
        * moreover both string are same.
        * */

        StringBuffer buffer=new StringBuffer("Sanjai");  // same StringBuilder buffer=new StringBuilder("Sanjai");  output are same
        System.out.println(buffer);
        System.out.println(buffer.append(" Guru"));
        System.out.println(buffer.length());
        System.out.println(buffer.insert(11," S"));
        System.out.println(buffer.replace(6,7,"@@@"));
        System.out.println(buffer.length());
        System.out.println(buffer.delete(6,9));//
        System.out.println(buffer.substring(0));
        System.out.println(buffer.substring(0,6));
        System.out.println(buffer.append("guru").reverse());// chine role
        System.out.println(buffer.charAt(0));
        buffer.setCharAt(0,'s');
        System.out.println(buffer);
}
}
