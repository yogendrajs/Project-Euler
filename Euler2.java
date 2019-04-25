class Euler2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        int sum = 0;

        while (b < 4000000){
            c = a + b;
            a = b;
            b = c;
            if (b % 2 == 0){
               sum = sum + b;
            }
        }System.out.println(sum);
    }
}
