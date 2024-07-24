import java.util.Scanner;
class group_switch {
    public static void main(String[] args) {
        char ch;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the latter");
        ch=in.next().charAt(0);
//vowel or not is group switch
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("vowels");
                break;
            default:
                System.out.println("not vowel");


        }

    }

}