import java.util.Scanner;
class elseifladder {
    public static void main(String[] args) {
        float mark;
        System.out.println("Enter your mark");
        Scanner in = new Scanner(System.in);
        mark = in.nextFloat();
        if (mark >= 90 && mark <= 100) {
            System.out.println("A Grade");
        } else if (mark >= 80 && mark < 89) {
            System.out.println("B Grade");
        } else if (mark >= 70 && mark < 79) {
            System.out.println("c Grade");
        } else if (mark < 70) {
            System.out.println("D Grade");
        }
    }
}

