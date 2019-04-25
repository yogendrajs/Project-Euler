class Euler10 {
    public static void main(String[] args) {
      int temp = 0, sum = 0;
        for (int i = 2; i < 2000000; i++){
          temp = 0;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    temp++;
                    if (temp > 0){break;}
                }
            }if (temp == 0){
                System.out.println(i);
                sum = sum + i;
            }
        }System.out.println("the sum is: " + sum);
    }
}
