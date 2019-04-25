class Euler5 {
    public static void main(String[] args) {
      int count = 0;
      for (int i = 1; ; i++){
        count = 0;
        for (int j = 1; j <=20; j++){
          if (i%j == 0){
            count++;
          }else {break;}
        }if (count == 20){
          System.out.println(i);
          break;
        }
    }
  }
}

// class Euler5 {
//     public static void main(String[] args) {
//         int count = 0;
//         for (int i = 1;; i++){
//           count = 0;
//             for (int j = 1; j <= 20; j++){
//                 if (i % j == 0){
//                     count++;
//                 }if (count == 20){
//                     System.out.println(i);
//                     break;
//                 }
//             }if (count == 20) {
//               break;
//             }
//         }
//     }
// }
