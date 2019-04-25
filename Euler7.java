class Euler7 {
    public static void main(String[] args) {
      int temp = 0,count = 0;
        for (int i = 2;; i++){
          temp = 0;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    temp++;
                }
            }if (temp == 0){
                count++;
            }if (count == 10001){
              System.out.println(i);
              break;
            }
        }
    }
}
