class Euler9 {
    public static void main(String[] args) {
      int sum, c, count = 0;
        for (int a = 1;; a++){
            for (int b = 1; b < a; b++){
                sum = a*a + b*b;
                for (int k = sum; k > 0; k--){
                    c = k*k;
                    if (c == sum){
                        if (a+b+k == 1000){
                            count++;
                            System.out.println("a is " + a + ", b is " + b + " and k is " + k + " and their product is " + a*b*k);
                            break;
                        }
                    }
                }
            }if (count > 0){break;}
        }
    }
}
