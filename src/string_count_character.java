import java.util.Scanner;

public class string_count_character {
    public static void main(String[]args){
        //program to count uppercase,lowercase,space,number,vowels,symbols
        StringBuffer a=new StringBuffer("Sanjai@27 Guru");
        int uppercase=0,lowercase=0,space=0,number=0,vowels=0,symbols=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=65 && a.charAt(i)<=90 ){
                uppercase++;
            }
            if(a.charAt(i)>=97 && a.charAt(i)<=122 ){
                lowercase++;
            }
            if(a.charAt(i)==32){
                space++;
            }
            if(a.charAt(i)>=48 && a.charAt(i)<=57){
                number++;
            }
            if(a.charAt(i)=='A'||a.charAt(i)=='a' || a.charAt(i)=='E'|| a.charAt(i)=='e'|| a.charAt(i)=='I'|| a.charAt(i)=='i'|| a.charAt(i)=='O'|| a.charAt(i)=='o'|| a.charAt(i)=='u'|| a.charAt(i)=='U'){
                vowels++;
            }

        }
        System.out.println("uppercase:"+uppercase);
        System.out.println("lowercase:"+lowercase);
        System.out.println("space:"+space);
        System.out.println("number:"+number);
        System.out.println("vowels:"+vowels);
        System.out.println("symbol:"+(a.length()-(uppercase+lowercase+space+number)));


    }
}
