import java.util.StringJoiner;
public class string_counter {
    public static void main(String[]args){
        StringBuffer a=new StringBuffer("Sanjai27@gmail.com");
        int UpperCase=0,LowerCase=0,Symbol=0,Vowels=0,Number=0,Space=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=65 && a.charAt(i)<=90 ){
                UpperCase++;
            }
            if(a.charAt(i)>=97 && a.charAt(i)<=122){
                LowerCase++;
            }
            if(a.charAt(i)==32){
                Space++;
            }
            if(a.charAt(i)>=48 && a.charAt(i)<=57){
                Number++;
            }
            if(a.charAt(i)=='A' || a.charAt(i)=='a' || a.charAt(i)=='E' ||a.charAt(i)=='e' ||a.charAt(i)=='i' || a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='o'||a.charAt(i)=='u' ||a.charAt(i)=='U'){
                Vowels++;
            }

        }
        System.out.println("Number of LowerCase "+LowerCase);
        System.out.println("Number of UpperCase "+UpperCase);
        System.out.println("Number of Number "+Number);
        System.out.println("Number of Space "+Space);
        System.out.println("Number of vowels "+Vowels);
        System.out.println("symbol:"+(a.length()-(UpperCase+LowerCase+Space+Number)));
    }
}
