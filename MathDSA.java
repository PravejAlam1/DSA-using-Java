//*Print digit of a number */

// public class MathDSA {
//   static void printDigits(int num) {
//     while(num != 0) {
//       int digit = num % 10;
//       System.out.println(digit);
//       num /= 10;
//     }
//   }

//   static void main() {
//     int num = 53127;
//     printDigits(num);
//   }
  
// }
//*Sum of digits of a number */

public class MathDSA {
  static int sumOfDigits(int num) {
    int sum = 0;
    while(num != 0){
      int digit = num % 10;
      sum = sum + digit;
      num = num /10;
    }
    return sum;
  }

  public static void main(String[] args) {
    int num = 53127;
    int sum = sumOfDigits(num);
    System.out.println(sum);
  }
  
}


//== Reverse of a number ==//

