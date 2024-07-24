class prime_number_1to999 {
    public static void main(String[] args) {
        // find the 1 to 999 prime number.
        int count=0;
        for(int n=1;n<=999;n++){
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(n);
            }
            count=0;
        }

    }
}