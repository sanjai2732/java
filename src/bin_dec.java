public class bin_dec {
    public static int dec(int n){
        int decimal=0,power=0,rem;
        while (n!=0){
            rem=n%10;
            decimal+=rem*Math.pow(2,power);
            n/=10;
            power++;
        }
        return decimal;

    }
    public static void main(String[]args){
        System.out.println("1100 -Decimal No's is :"+bin_dec.dec(1100));

    }
}
