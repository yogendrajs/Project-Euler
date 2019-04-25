class Euler12 {
    public static void main(String[] args) {
      long sum = 0, count = 0;
        for (long i = 1;; i++){
           count = 0;
            sum = sum + i;
            for (long j = 1; j <= sum; j++){
                if (sum % j == 0){
                  System.out.println(j);
                    count++;
                }
            }System.out.println("---");
            if (count == 501){
              System.out.println(sum);
              break;
            }
        }
    }
}
