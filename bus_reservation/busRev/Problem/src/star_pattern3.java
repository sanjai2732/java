public class star_pattern3 {
    public static void main(String[]args){
        /*ASCII -American Standard code for Information Interchange
         *
         *  255 ASCII value.
         *
         * 0-32 not printable.
         *
         * 32-space
         *
         * 48-57 =0-9
         *
         * 65-90 = A-Z
         *
         * 97-122 = a-z
         * */
//        for (int i=65;i<=90;i++){//A -Z
//            System.out.println(i+" "+(char)i);//casing
//        }
        for(int i=65;i<=69;i++){
            for(char j=65 ;j<i;j++){
                System.out.print(j);
            }
            System.out.println("");

        }

    }
}
