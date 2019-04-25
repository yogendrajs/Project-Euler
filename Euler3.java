class Euler3 {
    public static void main(String[] args) {
      final long startTime = System.nanoTime();
        long a = 600851475143L;
        long temp=0L;
        for (long i = 2L; i < a; i++){
            if (a % i == 0){
                for(long j=2L;j<i;j++){
                  if(i%j==0){
                    temp++;
                  }
                }
                if(temp==0){
                  System.out.println(i);
                }
                temp=0;
            }
        }
        final long duration = System.nanoTime() - startTime;
        System.out.println(duration);
      }
}
