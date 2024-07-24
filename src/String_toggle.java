public class String_toggle {
    public static void main(String[]args){
        // toggle mean :uppercase to lowercase and lowercase to uppercase.example: "Sanjai guru"   convert to  "sANJAI GURU"
        StringBuilder a=new StringBuilder("Sanjai Guru");
        System.out.println("Original:"+a);
        int b;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=65 && a.charAt(i)<=90){
                b=(int)a.charAt(i)+32;
                a.setCharAt(i,(char)b);
            }
            else{
                if(a.charAt(i)>=97 && a.charAt(i)<=122){
                    b=(int)a.charAt(i)-32;
                    a.setCharAt(i,(char)b);
                }
            }
        }
        System.out.println("toggle:"+a);
    }
}
