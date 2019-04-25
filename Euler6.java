class Euler6 {
    public static void main(String[] args) {
      int k, sum = 0, sums = 0, var;
        for (int i = 1; i <= 100; i++){
            k = i*i;
            sum = sum + k;
            sums = sums + i;
        }var = sums*sums;
        System.out.println(var - sum);
    }
}
