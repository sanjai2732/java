import java.lang.String;
import java.net.SocketOption;

public class String_concept {
    public static void main(String[]args){
        //String functions
        String a="Sanjai Guru";
        String b="sanjai Guru";
        System.out.println("equals function: "+a.equals(b));
        System.out.println("equalsIgnoreCase:"+a.equalsIgnoreCase(b));
        System.out.println("hashcode :"+a.hashCode());
        System.out.println("hashcode :"+b.hashCode());
        System.out.println("replace :"+a.replace("Guru","S "));
        System.out.println("UpperCase :"+a.toUpperCase());
        System.out.println("lowercase :"+a.toLowerCase());
        System.out.println("charAt:"+a.charAt(5));
        System.out.println("empty:"+a.isEmpty());
        System.out.println("contain:"+a.contains("Guru"));//checking
        System.out.println("start with:"+a.startsWith("San"));
        System.out.println("end with:"+a.endsWith("ru"));
        System.out.println("length:"+a.length());
        System.out.println("subString:"+a.substring(9));//total 11 letter in Sanjai Gu ru
        System.out.println("SubString:"+a.substring(0,11));
        System.out.println("trim:"+a);
        System.out.println("trim:"+a.trim());//trim using to remove fond and backspace.
        char [] carry=a.toCharArray();
        for(char c:carry) {
            System.out.print(c + " ");

        }
    }
}
