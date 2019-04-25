class Euler4 {
    public static void main(String[] args) {
      int mul, rem, muls;
      int num1 = 0, num2 = 0, rev = 0;
        for (int i = 999; i >= 100; i--){
            for (int j = 999; j >= 100; j--){
                mul = i*j;
                muls = mul;
                rev = 0;
                while (mul > 0){
                    rem = mul%10;
                    rev = rev*10 + rem;
                    mul = mul/10;
                }if (muls == rev){
                    if (muls > num1){
                        num1 = muls;
                    }
                }
            }
        }System.out.println(num1);
    }
}
