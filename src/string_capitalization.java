public class string_capitalization {
    public static void main(String[] args) {
        //capitalization mean example:"saJaI gUru"  converted to "Sanjai Guru"
        StringBuilder a = new StringBuilder("sanJai GuRu   S all is good");//11
        System.out.println("Original:" + a);
        int b;
        if (a.charAt(0) >= 97 && a.charAt(0) <= 122) {
            b = (int) a.charAt(0) - 32;
            a.setCharAt(0, (char) b);//SanJai Guru
        }
        for (int i = 1; i < a.length(); i++) {//1<11
            if(a.charAt(i)>=65 && a.charAt(i)<=90){
                b=(int)a.charAt(i)+32;
                a.setCharAt(i,(char)b);
            }
            if(a.charAt(i)==32){// space " "
                i++;
                if(a.charAt(i)>=97 &&a.charAt(i)<=122){
                    b=(int)a.charAt(i)-32;
                    a.setCharAt(i,(char)b);
                }
            }
        }
        System.out.println(a);
    }
}



